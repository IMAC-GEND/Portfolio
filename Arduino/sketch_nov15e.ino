const int leds[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
const int button1 = 12;  // left
const int button2 = 13; // right

int currentLedNum = 3; 
void setup() {
  // put your setup code here, to run once:
  for (int i = 0; i < 10; i++) {
    pinMode(leds[i], OUTPUT);
  }

  pinMode(button1, INPUT);
  pinMode(button2, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
   if (digitalRead(button1) == LOW) {
    // Button is pressed, turn on LEDs 4, 5, and 6
    digitalWrite(leds[3], HIGH);
    digitalWrite(leds[4], HIGH);
    digitalWrite(leds[5], HIGH);
    
    // Wait for the button to be released
    while (digitalRead(button1) == LOW) {
      delay(10);
    }
    
    // Button is released, turn off LED 3
    digitalWrite(leds[3], LOW);
  }
  

}
