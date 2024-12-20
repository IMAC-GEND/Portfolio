#include <Servo.h>

// constants won't change
const int TRIG_PIN  = 2;   // Arduino pin connected to Ultrasonic Sensor's TRIG pin
const int ECHO_PIN  = 24;   // Arduino pin connected to Ultrasonic Sensor's ECHO pin
const int SERVO_PIN = 3;   // Arduino pin connected to Servo Motor's pin
const int LED_PIN_1 = 5;  // Arduino pin connected to the first LED
const int LED_PIN_2 = 4;  // Arduino pin connected to the second LED
const int DISTANCE_THRESHOLD = 50; // centimeters

Servo servo; // create servo object to control a servo

// variables will change
float duration_us, distance_cm;

void setup() {
  Serial.begin(9600);       // initialize serial port
  pinMode(TRIG_PIN, OUTPUT); // set arduino pin to output mode
  pinMode(ECHO_PIN, INPUT);  // set arduino pin to input mode
  pinMode(LED_PIN_1, OUTPUT); // set arduino pin to output mode for LED 1
  pinMode(LED_PIN_2, OUTPUT); // set arduino pin to output mode for LED 2
  servo.attach(SERVO_PIN);   // attaches the servo on pin 9 to the servo object
  servo.write(0);
}

void loop() {
  // generate 10-microsecond pulse to TRIG pin
  digitalWrite(TRIG_PIN, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG_PIN, LOW);

  // measure duration of pulse from ECHO pin
  duration_us = pulseIn(ECHO_PIN, HIGH);
  // calculate the distance
  distance_cm = 0.017 * duration_us;

  // Control the servo based on distance
  if (distance_cm < DISTANCE_THRESHOLD) {
    servo.write(90); // rotate servo motor to 90 degrees
    digitalWrite(LED_PIN_1, HIGH); // turn on the first LED
    digitalWrite(LED_PIN_2, LOW);  // turn off the second LED
  } else {
    servo.write(0);  // rotate servo motor to 0 degrees
    digitalWrite(LED_PIN_1, LOW);  // turn off the first LED
    digitalWrite(LED_PIN_2, HIGH); // turn on the second LED
  }

  // print the value to Serial Monitor
  Serial.print("distance: ");
  Serial.print(distance_cm);
  Serial.println(" cm");

  delay(500);
}
