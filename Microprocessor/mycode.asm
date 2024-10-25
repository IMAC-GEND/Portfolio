;MOV AX,123H
;MOV BX,5678H
;PUSH AX ;store data in stack
;PUSH BX
;POP CX  ;store data from stack to register
;POP DX  

.MODEL SMALL
.DATA
VAR1 DB '12345'
VAR2 DB '67890'
.CODE
MOV AX,@DATA
MOV DS,AX  ;init DS
MOV ES,AX ;init ES
LEA SI, var2 ;offset (Load Effective Addressing) 

;MOV DI,1000H
;MOV [DI],1234H
;LEA BX,[DI]

;MOV AX,1000H
;MOV DS,AX
;MOV DI,1000H
;MOV [DI],7A12H
;MOV [DI+2],0030H
;LDS BX,[DI] ;(Load Data Storage)

;.MODEL SMALL
;.DATA
;STRING1 DB 'ABCDE'
;STRING2 DB '12345'
;.CODE  
;MOV AX,@DATA
;MOV ES,AX ;initialize ES
;MOV DS,AX
;LEA SI,STRING1
;LEA DI,STRING2
;CLD ;read from locationn 0
;MOV CX,5 ;counter
;ULIT:
;    LODSB ;load AX pointed by SI (memory to register)
;    INC AX
;    STOSB ;strore mem loc pointed by DI (register to memory)
;    LOOP ULIT 

;.MODEL SMALL
;.DATA
;STRING1 DB 'ABCDE'
;STRING DB '12345'
;.CODE
;MOV AX,@DATA
;MOV ES,AX 
;MOV DS,AX
;LEA SI,STRING1+4
;LEA DI,STRING+4
;STD ;DF=1
;MOV CX,5
;ULIT:
;    LODSB
;    STOSB
;    LOOP ULIT

;.MODEL SMALL
;.DATA
;VAR1 DB '12345'
;VAR2 DB 3 DUP(9)
;.CODE
;MOV AX,@DATA
;MOV DS,AX ;init DS
;MOV ES,AX ;init ES
;LEA SI,VAR1 ;source
;LEA DI,VAR2 ;destination
;CLD ;DF=0 (Clear the Direction Flag)
;MOV CX,3
;REP MOVSB  

;.MODEL SMALL
;.DATA
;VAR1 DB '12345'
;VAR2 DB 3 DUP(0)
;.CODE
;MOV AX,@DATA
;MOV DS,AX ;init DS
;MOV ES,AX ;init ES
;LEA SI,VAR1 ;source
;LEA DI,VAR2 ;destination
;CLD ;DF=0
;MOV CX,3
;REP MOVSB  