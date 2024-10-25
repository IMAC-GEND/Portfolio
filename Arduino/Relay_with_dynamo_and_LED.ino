int in1 = 7;
int in2 = 6;
int in3 = 5;
int in4 = 4;

void setup() {
  // put your setup code here, to run once:
  pinMode(in1, OUTPUT);
  pinMode(in2, OUTPUT);
  pinMode(in3, OUTPUT);
  pinMode(in4, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(in1, LOW);
  digitalWrite(in4, LOW);
  delay(2000);
  digitalWrite(in2, HIGH);
  digitalWrite(in3, HIGH);

  digitalWrite(in2, LOW);
  digitalWrite(in4, LOW);
  delay(2000);
  digitalWrite(in1, HIGH);
  digitalWrite(in3, HIGH);

  digitalWrite(in3, LOW);
  -
  delay(2000);
  digitalWrite(in1, HIGH);
  digitalWrite(in2, HIGH);


}
