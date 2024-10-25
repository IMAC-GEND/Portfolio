module seven_segment_decoder (
	 input CLOCK_50,
    input [3:0] binary_input,
    output reg [6:0] seg_output
);

always @(posedge CLOCK_50)
begin
    case (binary_input)
        4'b0000: seg_output = 7'b0000001; // Displaying 0
        4'b0001: seg_output = 7'b1001111; // Displaying 1
        4'b0010: seg_output = 7'b0010010; // Displaying 2
        4'b0011: seg_output = 7'b0000110; // Displaying 3
        4'b0100: seg_output = 7'b1001100; // Displaying 4
        4'b0101: seg_output = 7'b0100100; // Displaying 5
        4'b0110: seg_output = 7'b0100000; // Displaying 6
        4'b0111: seg_output = 7'b0001111; // Displaying 7
        4'b1000: seg_output = 7'b0000000; // Displaying 8
        4'b1001: seg_output = 7'b0000100; // Displaying 9
        default: seg_output = 7'b1111111; // Displaying nothing for invalid input
    endcase
end

endmodule
