module elevator(CLOCK_50, KEY, SW, HEX0, HEX1, HEX2, HEX3, LEDG);
	input CLOCK_50;
	input [3:0] KEY;
	input [1:0] SW;
	output [6:0] HEX0, HEX1, HEX2, HEX3;
	output [7:0] LEDG;
	
	reg [30:0] counter;
	reg [6:0] number0;
	reg [7:0] state;	
	reg [2:0] CURRENTFLOOR = 3'b001;
	reg [2:0] INPUTFLOOR = 3'b001; 
	
assign HEX0 = {1'b1, number0};
assign HEX1 = {1'b1, number0};
assign HEX2 = {1'b1, number0};
assign HEX3 = {1'b1, number0};
assign LEDG = state;
	 
parameter n1 = 7'b1111001; // DISPLAY 1
parameter n2 = 7'b0100100; // DISPLAY 2
parameter n3 = 7'b0110000; // DISPLAY 3
parameter n4 = 7'b0011001; // DISPLAY 4
	
always @(posedge CLOCK_50)
begin
if (SW[0] == 1 || SW[1] == 1) 
	begin
   if (KEY[3] == 0) 
		INPUTFLOOR = 3'b100; // 4th floor
   else if (KEY[2] == 0) 
		INPUTFLOOR = 3'b011; // 3rd floor
   else if (KEY[1] == 0) 
		INPUTFLOOR = 3'b010; // 2nd floor
   else if (KEY[0] == 0) 
		INPUTFLOOR = 3'b001; // 1st floor
   end		  
if(counter == 50000000)
begin
	if (SW[0] == 1 && SW[1] == 1) 
	begin
		
	end
	else if (CURRENTFLOOR < INPUTFLOOR && SW[0] == 1)
		CURRENTFLOOR = CURRENTFLOOR + 1;
	else if (CURRENTFLOOR > INPUTFLOOR && SW[1] == 1)
		CURRENTFLOOR = CURRENTFLOOR - 1;
end

else
	counter <= counter + 1;	
		case (CURRENTFLOOR)
			3'b100: number0 <= n4; // 4th floor
			3'b011: number0 <= n3; // 3rd floor
			3'b010: number0 <= n2; // 2nd floor
         3'b001: number0 <= n1; // 1st floor
         default: ; 
      endcase
        
if (CURRENTFLOOR == INPUTFLOOR) 
begin
	if (counter == 0)
		state <= 8'b00000000;
   else if (counter == 150000000) 
		state <= 8'b11111111;
	else if (counter > 150000000)
		state <= 8'b00000000;
end
else 
	state <= 8'b00000000;
end				
endmodule
