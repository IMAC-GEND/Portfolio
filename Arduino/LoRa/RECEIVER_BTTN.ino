#include <LoRa.h>

const int LED6 = 6;
const int buzzer = 5;

String inString = "";
int val = 0;

int SyncWord = 0x22;

void setup() {
  Serial.begin(9600);

  pinMode(LED6, OUTPUT);
  pinMode(buzzer, OUTPUT);

  digitalWrite(LED6, LOW);
  digitalWrite(buzzer, LOW);

  while (!Serial);
  Serial.println("LoRa Receiver");
  if (!LoRa.begin(433E6)) {
    Serial.println("Staring LoRa failed!");
    while (1);
  }
  LoRa.setSpreadingFactor(12);
  LoRa.setSignalBandwidth(62.5E3);
  LoRa.setCodingRate4(8);
  LoRa.setSyncWord(SyncWord);
}

void loop() {
  int packetSize = LoRa.parsePacket();
  if (packetSize) {
    while (LoRa.available())
    {
      int inChar = LoRa.read();
      inString += (char)inChar;
      val = inString.toInt();
    }
    inString = "";
    LoRa.packetRssi();
  }
  Serial.println(val);

  if (val == 6)
  {
    digitalWrite(LED6, HIGH);
    digitalWrite(buzzer, HIGH);
  }
}
