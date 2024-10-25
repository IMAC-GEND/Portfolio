#include <Servo.h>

const int trigPin = 10;
const int echoPin = 11;
const int led1 = 2; // LED1 pin
const int led2 = 3; // LED2 pin
long duration;
int distance;
int detectionRange = 10; // Set the detection range to 200 cm
Servo myServo;

void setup() {
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(led1, OUTPUT); // Set the LED1 pin as output
  pinMode(led2, OUTPUT); // Set the LED2 pin as output
  Serial.begin(9600);
  myServo.attach(12);
  digitalWrite(led1, HIGH); // Turn on LED1 upon bootup
}

void loop() {
  for(int i=1;i<=180;i++){  
    myServo.write(i);
    delay(30);
    distance = calculateDistance();
    if (distance <= detectionRange) { // If an object is detected within the range
      digitalWrite(led2, HIGH); // Turn on LED2
      Serial.print("Object detected at: ");
      Serial.print(distance);
      Serial.println(" cm");
      delay(2000); // Pause for 2 seconds
      digitalWrite(led2, LOW); // Turn off LED2
    }
    Serial.print(i);
    Serial.print(",");
    Serial.print(distance);
    Serial.print(".");
  }

  for(int i=180;i>1;i--){  
    myServo.write(i);
    delay(30);
    distance = calculateDistance();
    if (distance <= detectionRange) {
      digitalWrite(led2, HIGH);
      Serial.print("Object detected at: ");
      Serial.print(distance);
      Serial.println(" cm");
      delay(2000);
      digitalWrite(led2, LOW);
    }
    Serial.print(i);
    Serial.print(",");
    Serial.print(distance);
    Serial.print(".");
  }
}

int calculateDistance(){ 
  digitalWrite(trigPin, LOW); 
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH); 
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  duration = pulseIn(echoPin, HIGH);
  distance= duration*0.034/2;
  return distance;
}
