`timescale 1ns / 1ps
 

`define oper_type IR[31:27]
`define rdst      IR[26:22]
`define rsrc1     IR[21:17]
`define imm_mode  IR[16]
`define rsrc2     IR[15:11]
`define isrc      IR[15:0]
 
 
`define movsgpr        5'b00000
`define mov            5'b00001
`define add            5'b00010
`define sub            5'b00011
`define mul            5'b00100

module tb;
 
 
integer i = 0;

top top_inst(); 
//top dut();
 
///////////////updating value of all GPR to 2
initial begin
for( i = 0; i < 32; i = i + 1)
begin
top_inst.GPR[i] = 2;
end
end
 
 
 
initial begin
//////// immediate add op
$display("-----------------------------------------------------------------");
top_inst.IR = 0;
top_inst.`imm_mode = 1;
top_inst.`oper_type = 2;
top_inst.`rsrc1 = 2;///gpr[2] = 2
top_inst.`rdst  = 0;///gpr[0]
top_inst.`isrc = 4;
#10;
$display("OP:ADI Rsrc1:%0d  Rsrc2:%0d Rdst:%0d",top_inst.GPR[2], top_inst.`isrc, top_inst.GPR[0]);
$display("-----------------------------------------------------------------");
////////////register add op
top_inst.IR = 0;
top_inst.`imm_mode = 0;
top_inst.`oper_type = 2;
top_inst.`rsrc1 = 4;
top_inst.`rsrc2 = 5;
top_inst.`rdst  = 0;
#10;
$display("OP:ADD Rsrc1:%0d  Rsrc2:%0d Rdst:%0d",top_inst.GPR[4], top_inst.GPR[5], top_inst.GPR[0] );
$display("-----------------------------------------------------------------");
 
//////////////////////immediate mov op
top_inst.IR = 0;
top_inst.`imm_mode = 1;
top_inst.`oper_type = 1;
top_inst.`rdst = 4;///gpr[4]
top_inst.`isrc = 55;
#10;
$display("OP:MOVI Rdst:%0d  imm_data:%0d",top_inst.GPR[4],top_inst.`isrc  );
$display("-----------------------------------------------------------------");
 
//////////////////register mov
top_inst.IR = 0;
top_inst.`imm_mode = 0;
top_inst.`oper_type = 1;
top_inst.`rdst = 4;
top_inst.`rsrc1 = 7;//gpr[7]
#10;
$display("OP:MOV Rdst:%0d  Rsrc1:%0d",top_inst.GPR[4],top_inst.GPR[7] );
$display("-----------------------------------------------------------------");
 
 
end
 
endmodule