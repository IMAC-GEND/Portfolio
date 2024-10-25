.model small
.stack 100
.data
.code

MOV AX,1234H ;1
CALL ADDP
MOV BX,5678H ;5
MOV AH,4CH
INT 21H

ADDP PROC NEAR
     INC AX      ;2
     CALL SUBP
     NEG AX     ;4     
     RET
ADDP ENDP


SUBP PROC NEAR
      DEC AX    ;3
      RET
SUBP  ENDP

;----------------
;POWER

;MOV BX, 02
;MOV AX, 01
;MOV CX, 03H
;CALL POWER

;MOV AH, 4CH
;INT 21H

;POWER PROC NEAR
 ;   HI:
  ;      MUL BX
   ;     LOOP HI:
    ;    RET
;POWER ENDP