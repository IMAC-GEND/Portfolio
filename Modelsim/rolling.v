module rolling (CLOCK_50, SW, HEX0, HEX1, HEX2, HEX3);

input CLOCK_50;
input [2:0] SW;
output HEX0, HEX1, HEX2, HEX3;

reg [7:0] num0, num1, num2, num3;
reg [2:0] state;

always @ (posedge CLOCK_50) begin
if (SW [0] = 1)

num0 <= num3;
num1 <= num2;
num2 <= num1;
num3 <= num0;

if (SW[1] = 1)

num0 <= num2;
num1 <= num1;
num2 <= num0;
num3 <= num3;

if (SW[2] = 1)

num0 <= num1;
num1 <= num0;
num2 <= num3;
num3 <= num2;

end
endmodule