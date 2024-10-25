.model SMALL
.stack 100h
.data

CR         db 13,10,'$' 
MSGG       db '                             PAPER, ROCK, SCISSOR GAME',13, 10, '$'
MSG        db '                  GAME Instruction: Rock=R, Paper=P, Scissors=S',13, 10, '$'
PL1        db 'Player 1: $', 0
PL2        db 'Player 2: $', 0
PL1_Win    db 'Player 1 is the winner! ',13, 10, '$'
PL2_Win    db 'Player 2 is the winner! ',13, 10, '$'
PLEQ       db 'Player 1 = Player 2 ',13, 10, '$'
ERR_MSG    db 'Invalid input! Please enter a valid choice (R, P, or S)',13, 10, '$'
PLAY_AGAIN db 'Play again? (Y/N): ',13, 10, '$'
BUF        db ?                 ; Buffer to store the input
           db 0                 ; Buffer size

.code

BEGIN:
   MOV AX, @data
   MOV DS, AX
   MOV ES, AX 
   
   MOV DX, OFFSET MSGG
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET MSG      ; Game Instruction
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET CR       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

PlayAgain:
   MOV DX, OFFSET PL1      ; Prompt of Player 1
   MOV AH, 09h
   INT 21h

   MOV AH, 08h              ; Function to read a character from the keyboard (Input by Player 1)
   INT 21h                  ; The character is saved in AL
   MOV BH, AL               ; Save the character in BH
   MOV DL, '*'              ; Display '*' instead of the input character
   MOV AH, 02h              ; Function to display a character
   INT 21h

   MOV DX, OFFSET CR       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET PL2      ; Prompt of Player 2
   MOV AH, 09h
   INT 21h

   MOV AH, 08h              ; Function to read a character from the keyboard (Input by Player 2)
   INT 21h                  ; The character is saved in AL
   MOV BL, AL               ; Save the character in BL
   MOV DL, '*'              ; Display '*' instead of the input character
   MOV AH, 02h              ; Function to display a character
   INT 21h

   MOV DX, OFFSET CR       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

   ; Convert input to uppercase
   AND BH, 0DFh  ; Convert Player 1 input to uppercase
   AND BL, 0DFh  ; Convert Player 2 input to uppercase

   CMP BH, BL
   JE  EQUAL

   ;=======================================
   CMP BH, 'R'
   JE  EQ1
   CMP BH, 'P'
   JE  EQ2
   CMP BH, 'S'
   JE  EQ3
   JMP INVALID

EQ1:
   CMP BL, 'P'
   JE  P2_Win
   CMP BL, 'S'
   JE  P1_Win
   JMP INVALID

EQ2:
   CMP BL, 'R'
   JE  P1_Win
   CMP BL, 'S'
   JE  P2_Win
   JMP INVALID

EQ3:
   CMP BL, 'R'
   JE  P2_Win
   CMP BL, 'P'
   JE  P1_Win
   JMP INVALID

;=======================================

INVALID:
   MOV DX, OFFSET ERR_MSG
   MOV AH, 09h
   INT 21h
   JMP PlayAgain

P1_Win:                     ; Player 1 is the winner
   MOV DX, OFFSET PL1_Win
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain

EQUAL:                      ; Player 1 == Player 2
   MOV DX, OFFSET PLEQ
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain

P2_Win:                     ; Player 2 is the winner
   MOV DX, OFFSET PL2_Win
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain

AskPlayAgain:
   MOV DX, OFFSET PLAY_AGAIN
   MOV AH, 09h
   INT 21h

   MOV AH, 08h              ; Function to read a character from the keyboard (Input for play again)
   INT 21h                  ; The character is saved in AL

   CMP AL, 'Y'
   JE  PlayAgain
   CMP AL, 'y'
   JE  PlayAgain
   JMP Final

;=======================================

Final:
   MOV AH, 4Ch             ; Function to exit
   MOV AL, 00              ; Return 00
   INT 21h

end BEGIN
