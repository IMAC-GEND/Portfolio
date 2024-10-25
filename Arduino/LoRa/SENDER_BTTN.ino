#include <LoRa.h>
const int BTTN6 = 6;
const int BTTN7 = 7;

int SyncWord = 0x22;

void setup() {
  Serial.begin(9600);
  pinMode(BTTN6, INPUT_PULLUP);
  pinMode(BTTN7, INPUT_PULLUP);

  while (!Serial);
  Serial.println("LoRa Sender");
  if (!LoRa.begin(433E6)) {
    Serial.println("Starting LoRa failed!");
    while (1);
  }
  LoRa.setSpreadingFactor(12);
  LoRa.setSignalBandwidth(62.5E3);
  LoRa.setCodingRate4(8);
  LoRa.setSyncWord(SyncWord);
}

void loop() {
  static int lastVal6 = HIGH;
  static int lastVal7 = HIGH;

  int val6 = digitalRead(BTTN6);
  if (val6 == LOW && lastVal6 == HIGH) {
    sendData(8);
  }
  lastVal6 = val6;

  int val7 = digitalRead(BTTN7);
  if (val7 == LOW && lastVal7 == HIGH) {
    sendData(7);
  }
  lastVal7 = val7;

  delay(100); // Debouncing delay
}

void sendData(int data) {
  Serial.println(data);
  LoRa.beginPacket();
  LoRa.print(data);
  LoRa.endPacket();
}
