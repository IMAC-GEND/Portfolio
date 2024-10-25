.model small
.stack
.data
DATA1 DB 00H,01H,02H,03H,04H,05H,06H,07H,08H,09H,0AH,0BH,0CH,0DH,0EH,0FH
DATA2 DB 0FH,0EH,0DH,0CH,0BH,0AH,09H,08H,07H,06H,05H,04H,03H,02H,01H,00H 
.code

;Register Addressing
;MOV AX, 1234h
;MOV BX, 5678h
;MOV AX, BX

;Immediate Addressing 
;MOV CX,0ABCDh

;Direct Addressing
;MOV AX,@DATA
;MOV DS,AX

;MOV BX,1234H
;MOV CX,0H
;MOV [1000H],BX
;MOV CX,[1000H] 

;Register Indirect
;MOV AX,@DATA
;MOV DS,AX

;MOV CX,0000H

;MOV BX,1000h
;MOV [BX],0ABCDH
;MOV CL,[BX]
;MOV DX,[BX]  

;Base-plus-index
;MOV AX,@DATA
;MOV DS, AX

;MOV CX,0000H

;MOV BX,1000h
;MOV DI,01H
;MOV [BX+DI],0EF01H
;MOV CL,[BX+DI]
;MOV DX,[BX+DI]

;Base relative-plus-index
MOV AX,@DATA
MOV DS,AX

MOV BX,OFFSET DATA1
MOV DI,0

MOV CX,0FH
LOOP1:
    MOV DH,[BX+DI]
    MOV DL,[BX+10H+DI]
    INC DI
    LOOP LOOP1
