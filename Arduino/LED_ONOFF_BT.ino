#include <SoftwareSerial.h>

int rx = 10, tx = 11;
SoftwareSerial mySerial(rx, tx);
String val;
char data;
int LED = 7;

void setup(){
  pinMode(LED, OUTPUT);
  Serial.begin(9600);
  mySerial.begin(9600);
}

void loop(){
  while (mySerial.available()){
    data = mySerial.read();
    val += data;
  }

  if(val == "ON"){
    digitalWrite(LED, HIGH);
    Serial.println("LED turned ON");
  }
  else if(val == "OFF"){
    digitalWrite(LED, LOW);
    Serial.println("LED turned OFF");
  }

  delay(500);
  val = "";
}
