#include <SPI.h>
#include <LoRa.h>

const int ledPin = 6; // LED connected to D5
const int buzzerPin = 5; // Buzzer connected to D7

void setup() {
  Serial.begin(9600);
  while (!Serial);

  Serial.println("LoRa Receiver");

  if (!LoRa.begin(433E6)) {
    Serial.println("Starting LoRa failed!");
    while (1);
  }

  pinMode(ledPin, OUTPUT); // set the LED pin as output
  pinMode(buzzerPin, OUTPUT); // set the Buzzer pin as output
}

void loop() {
  // try to parse packet
  int packetSize = LoRa.parsePacket();
  if (packetSize) {
    // received a packet
    Serial.print("Received packet: ");

    String receivedMsg = "";
    // read packet
    while (LoRa.available()) {
      receivedMsg += (char)LoRa.read();
    }

    Serial.println(receivedMsg);

    // if the received message is "ON", turn on the LED and the buzzer
    if (receivedMsg == "ON") {
      digitalWrite(ledPin, HIGH);
      digitalWrite(buzzerPin, HIGH);
    } else if (receivedMsg == "OFF") {
      digitalWrite(ledPin, LOW);
      digitalWrite(buzzerPin, LOW);
    }
  }
}
