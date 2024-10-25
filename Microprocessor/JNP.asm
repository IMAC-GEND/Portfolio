.model SMALL
.stack 100h
.data

    START              db 13,10,'$' 
    GAMETITLE          db '                    J  A   C   K    E N     P  O   Y',13, 10, '$'
    RULES              db '                Instruction:Rock=R, Paper=P, Scissors=S',13, 10, '$'
    P1                 db 'Player 1: $', 0
    P2                 db 'Player 2: $', 0
    P1DISPLAY          db 'PLAYER 1',13,10,'$' 
    P2DISPLAY          db 'PLAYER 2',13,10,'$' 
    PLEQ               db 'Player 1 = Player 2 ',13, 10, '$'
    ROCK               db 'ROCK',13,10,'$' 
    SCISSOR            db 'SCISSORS',13,10,'$' 
    PAPER              db 'PAPER',13,10,'$'
    VERSUS             db 'VS.',13,10,'$'
    TIE                db 'N O   O N E   W I N S!!',13,10,'$' 
    WIN1               db 'P L A Y E R  1  W I N S!!',13,10,'$'
    WIN2               db 'P L A Y E R  2  W I N S!!',13,10,'$'
    invalidInput       db 'Invalid input! Please enter a valid choice (R, P, or S)',13, 10, '$'
    PLAY_AGAIN         db 'Play again? (Y/N): ',13, 10, '$'
    buffer             db ?           ; buffer to store the input
                       db 0           ; buffer size

.code 



BEGIN:
   MOV AX, @data
   MOV DS, AX
   MOV ES, AX 
   
   MOV DX, offset GAMETITLE
   MOV AH, 09h
   INT 21h

   MOV DX, offset RULES      ; Game Instruction
   MOV AH, 09h
   INT 21h

   MOV DX, offset START       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

PlayAgain: 
   
   MOV DX, offset P1      ; Prompt of Player 1
   MOV AH, 09h
   INT 21h

   MOV AH, 08h              ; Function to read a character from the keyboard (Input by Player 1)
   INT 21h                  ; The character is saved in AL
   MOV BH, AL               ; Save the character in BH
   MOV DL, '*'              ; Display '*' instead of the input character
   MOV AH, 02h              ; Function to display a character
   INT 21h

   MOV DX, offset START       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

   MOV DX, offset P2      ; Prompt of Player 2
   MOV AH, 09h
   INT 21h

   MOV AH, 08h              ; Function to read a character from the keyboard (Input by Player 2)
   INT 21h                  ; The character is saved in AL
   MOV BL, AL               ; Save the character in BL
   MOV DL, '*'              ; Display '*' instead of the input character
   MOV AH, 02h              ; Function to display a character
   INT 21h

   MOV DX, offset START       ; Print Carrier Return
   MOV AH, 09h
   INT 21h

   ; Convert input to uppercase
   AND BH, 0DFh  ; Convert Player 1 input to uppercase
   AND BL, 0DFh  ; Convert Player 2 input to uppercase


   ;=======================================
   CMP BH, 'R' 
   JE  EQ1
   CMP BH, 'P'
   JE  EQ2
   CMP BH, 'S'
   JE  EQ3
   JMP INVALID 

EQ1: 
   CMP BL, 'R'
   JE  equalRock
   CMP BL, 'P'
   JE  rockVPaper
   CMP BL, 'S'
   JE  rockVScissors
   JMP INVALID

EQ2:
   CMP BL, 'P'
   JE  equalPaper
   CMP BL, 'R'
   JE  paperVRock
   CMP BL, 'S'
   JE  paperVScissors
   JMP INVALID

EQ3: 
   CMP BL, 'S'
   JE  equalScissors
   CMP BL, 'R'
   JE  scissorsVRock
   CMP BL, 'P'
   JE  scissorsVPaper
   JMP INVALID

;=======================================
INVALID:
   MOV DX, offset invalidInput
   MOV AH, 09h
   INT 21h
   JMP PlayAgain
;=======================================
equalRock:
   MOV DX, OFFSET PLEQ
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain
equalPaper:
   MOV DX, OFFSET PLEQ
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain
equalScissors:
   MOV DX, OFFSET PLEQ
   MOV AH, 09h
   INT 21h
   JMP AskPlayAgain
;======================================= 

rockVPaper:

    ;== Background ==
    
    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h  
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
 
   MOV DX, OFFSET WIN2
   MOV AH, 09h
   INT 21h

    ;== White Outline Paper ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 70
    mov dh, 14
    mov dl, 72
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 69
    mov dh, 7
    mov dl, 69
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 67
    mov dh, 6
    mov dl, 68
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 65
    mov dh, 5
    mov dl, 66
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 56
    mov dh, 4
    mov dl, 64
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 55
    mov dh, 5
    mov dl, 55
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 55
    mov dh, 5
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 52
    mov dh, 6
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 51
    mov dh, 7
    mov dl, 51
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 50
    mov dh, 8
    mov dl, 58
    int 10h    

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 49
    mov dh, 9
    mov dl, 49
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 50
    mov dh, 10
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 51
    mov dh, 11
    mov dl, 51
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 52
    mov dh, 12
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 53
    mov dh, 13
    mov dl, 53
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 54
    mov dh, 14
    mov dl, 58
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 59
    mov dh, 15
    mov dl, 69
    int 10h   

   JMP AskPlayAgain 

rockVScissors:
;== Background == 

    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h  
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
    
    MOV DX, OFFSET WIN1
    MOV AH, 09h
    INT 21h 
    
    ;== White Outline Rock2 ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 68
    mov dh, 10
    mov dl, 70
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 57
    mov dh, 4
    mov dl, 67
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 56
    mov dh, 9
    mov dl, 56
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 53
    mov dh, 5
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 52
    mov dh, 6
    mov dl, 52
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 53
    mov dh, 7
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 52
    mov dh, 8
    mov dl, 52
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 53
    mov dh, 9
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 52
    mov dh, 10
    mov dl, 52
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 57
    mov dh, 10
    mov dl, 59
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 53
    mov dh, 11
    mov dl, 57
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 52
    mov dh, 12
    mov dl, 52
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 53
    mov dh, 13
    mov dl, 62
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 63
    mov dh, 12
    mov dl, 65
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 66
    mov dh, 11
    mov dl, 66
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 58
    mov dh, 12
    mov dl, 58
    int 10h                   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 60
    mov dh, 9
    mov dl, 60
    int 10h
   
   
   JMP AskPlayAgain
     
paperVRock:
;== Background == 

    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h  
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
 
   MOV DX, OFFSET WIN1
   MOV AH, 09h
   INT 21h

    ;== White Outline Paper ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 70
    mov dh, 14
    mov dl, 72
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 69
    mov dh, 7
    mov dl, 69
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 67
    mov dh, 6
    mov dl, 68
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 65
    mov dh, 5
    mov dl, 66
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 56
    mov dh, 4
    mov dl, 64
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 55
    mov dh, 5
    mov dl, 55
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 55
    mov dh, 5
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 52
    mov dh, 6
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 51
    mov dh, 7
    mov dl, 51
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 50
    mov dh, 8
    mov dl, 58
    int 10h    

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 49
    mov dh, 9
    mov dl, 49
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 50
    mov dh, 10
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 51
    mov dh, 11
    mov dl, 51
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 52
    mov dh, 12
    mov dl, 58
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 53
    mov dh, 13
    mov dl, 53
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 54
    mov dh, 14
    mov dl, 58
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 59
    mov dh, 15
    mov dl, 69
    int 10h   

   JMP AskPlayAgain
paperVScissors:
;== Background ==

    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h   
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
    
    MOV DX, OFFSET WIN2
    MOV AH, 09h
    INT 21h 
    
    ;== White Outline Scissors2 ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 72
    mov dh, 13
    mov dl, 74
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 61
    mov dh, 5
    mov dl, 71
    int 10h
       
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 60
    mov dh, 11
    mov dl, 60
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 50
    mov dh, 5
    mov dl, 59
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 49
    mov dh, 6
    mov dl, 49
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 50
    mov dh, 7
    mov dl, 57
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 58
    mov dh, 8
    mov dl, 58
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 49
    mov dh, 9
    mov dl, 57
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 48
    mov dh, 10
    mov dl, 48
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 49
    mov dh, 11
    mov dl, 60
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 57
    mov dh, 12
    mov dl, 57
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 57
    mov dh, 13
    mov dl, 62
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 63
    mov dh, 12
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 61
    mov dh, 11
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 63
    mov dh, 14
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 58
    mov dh, 15
    mov dl, 68
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 69
    mov dh, 14
    mov dl, 71
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 57
    mov dh, 14
    mov dl, 57
    int 10h
    
    
    JMP AskPlayAgain

scissorsVRock:
;== Background ==

    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h   
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
 
   MOV DX, OFFSET WIN2
   MOV AH, 09h
   INT 21h 
           
;== White Outline Rock2 ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 68
    mov dh, 10
    mov dl, 70
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 57
    mov dh, 4
    mov dl, 67
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 56
    mov dh, 9
    mov dl, 56
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 53
    mov dh, 5
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 52
    mov dh, 6
    mov dl, 52
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 53
    mov dh, 7
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 52
    mov dh, 8
    mov dl, 52
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 53
    mov dh, 9
    mov dl, 55
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 52
    mov dh, 10
    mov dl, 52
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 57
    mov dh, 10
    mov dl, 59
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 53
    mov dh, 11
    mov dl, 57
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 52
    mov dh, 12
    mov dl, 52
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 53
    mov dh, 13
    mov dl, 62
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 63
    mov dh, 12
    mov dl, 65
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 66
    mov dh, 11
    mov dl, 66
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 58
    mov dh, 12
    mov dl, 58
    int 10h                   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 60
    mov dh, 9
    mov dl, 60
    int 10h
   
   
   JMP AskPlayAgain

scissorsVPaper:
;== Background == 

    mov ah, 07h ; COLOR    
    mov bh, 22h    
    mov ch, 19   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 22  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h  
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 3   ; y axis
    mov cl, 45   ; x axis     
    mov dh, 17  ; long vertically     
    mov dl, 76  ; long horizontally     
    int 10h
    
    MOV DX, OFFSET WIN1
    MOV AH, 09h
    INT 21h 
    
    ;== White Outline Scissors2 ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 72
    mov dh, 13
    mov dl, 74
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 61
    mov dh, 5
    mov dl, 71
    int 10h
       
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 60
    mov dh, 11
    mov dl, 60
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 50
    mov dh, 5
    mov dl, 59
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 49
    mov dh, 6
    mov dl, 49
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 50
    mov dh, 7
    mov dl, 57
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 58
    mov dh, 8
    mov dl, 58
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 49
    mov dh, 9
    mov dl, 57
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 48
    mov dh, 10
    mov dl, 48
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 49
    mov dh, 11
    mov dl, 60
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 57
    mov dh, 12
    mov dl, 57
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 57
    mov dh, 13
    mov dl, 62
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 63
    mov dh, 12
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 61
    mov dh, 11
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 63
    mov dh, 14
    mov dl, 63
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 58
    mov dh, 15
    mov dl, 68
    int 10h
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 69
    mov dh, 14
    mov dl, 71
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 57
    mov dh, 14
    mov dl, 57
    int 10h
    
    
    JMP AskPlayAgain

;=======================================

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












;=======================================

Final:
   MOV AH, 4Ch             ; Function to exit
   MOV AL, 00              ; Return 00
   INT 21h

end BEGIN