#include <SPI.h>
#include <LoRa.h>

const int switchPin = 6; // switch connected to D6
//const int ledPin = 7; // LED connected to D7

void setup() {
  Serial.begin(9600);
  while (!Serial);

  Serial.println("LoRa Sender");

  if (!LoRa.begin(433E6)) {
    Serial.println("Starting LoRa failed!");
    while (1);
  }

  pinMode(switchPin, INPUT_PULLUP); // set the switch pin as input
  //pinMode(ledPin, OUTPUT); // set the LED pin as output
}

void loop() {
  int switchState = digitalRead(switchPin); // read the state of the switch

  Serial.print("Sending packet: ");

  // send packet
  LoRa.beginPacket();
  if (switchState == HIGH) {
    Serial.println("OFF");
    LoRa.print("OFF");
    //digitalWrite(ledPin, LOW); // turn the LED off
  } else {
    Serial.println("ON");
    LoRa.print("ON");
    //digitalWrite(ledPin, HIGH); // turn the LED on
  }
  LoRa.endPacket();

  delay(100);
}
