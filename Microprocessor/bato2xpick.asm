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
    ROCK               db 'ROCK',13,10,'$' 
    SCISSOR            db 'SCISSORS',13,10,'$' 
    PAPER              db 'PAPER',13,10,'$'
    VERSUS             db 'VS.',13,10,'$'
    TIE                db 'N O   O N E   W I N S!!',13,10,'$' 
    WIN1               db 'P L A Y E R  1  W I N S!!',13,10,'$'
    WIN2               db 'P L A Y E R  2  W I N S!!',13,10,'$'
    invalidInput       db 'Invalid input! Please enter a valid choice (R, P, or S)',13, 10, '$'
    play_Again         db 'Play again? (Y/N): ',13, 10, '$'
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

equalRock:

  

    ;== Background ==  
   
    mov ah, 07h ; COLOR    
    mov bh, 99h    
    mov ch, 0   ; y axis
    mov cl, 0   ; x axis     
    mov dh, 24  ; long vertically     
    mov dl, 79  ; long horizontally     
    int 10h
                         
   ;== White Outline Rock ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 10
    mov dh, 10
    mov dl, 12
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 13
    mov dh, 4
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 24
    mov dh, 9
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 21
    mov dh, 10
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 20
    mov dh, 9
    mov dl, 20
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 28
    mov dh, 6
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 25
    mov dh, 7
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 28
    mov dh, 8
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 25
    mov dh, 9
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 28
    mov dh, 10
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 23
    mov dh, 11
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 28
    mov dh, 12
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 22
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 15
    mov dh, 12
    mov dl, 17
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 14
    mov dh, 11
    mov dl, 14
    int 10h  

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

    ;Text  
    
    mov ax, @data
    mov ds, ax

    mov ah, 02h
    mov bh, 70h
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 70h
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 70h
    mov dh, 16
    mov dl, 25
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h    

    mov ah, 02h
    mov bh, 70h
    mov dh, 16
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 70h
    mov dh, 16
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h 

    mov ah, 02h
    mov bh, 70h
    mov dh, 18
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset TIE
    int 21h     
    
    JMP AskPlayAgain
    JMP Final

equalPaper:   
    ;== Background ==  
   
    mov ah, 07h ; COLOR    
    mov bh, 00AAh    
    mov ch, 0   ; y axis
    mov cl, 0   ; x axis     
    mov dh, 24  ; long vertically     
    mov dl, 79  ; long horizontally     
    int 10h

    ;== White Outline Paper ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 8
    mov dh, 14
    mov dl, 10
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 11
    mov dh, 7
    mov dl, 11
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 12
    mov dh, 6
    mov dl, 13
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 14
    mov dh, 5
    mov dl, 15
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 16
    mov dh, 4
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 25
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 22
    mov dh, 6
    mov dl, 28
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 29
    mov dh, 7
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 31
    mov dh, 9
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 22
    mov dh, 10
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 29
    mov dh, 11
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 26
    mov dh, 13
    mov dl, 26
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 22
    mov dh, 14
    mov dl, 25
    int 10h
        
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 11
    mov dh, 15
    mov dl, 21
    int 10h

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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 20
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset TIE
    int 21h 

    JMP AskPlayAgain
    JMP Final 

rockVPaper:
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 20h
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 20h
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h
                         
   ;== White Outline Rock ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 10
    mov dh, 10
    mov dl, 12
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 13
    mov dh, 4
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 24
    mov dh, 9
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 21
    mov dh, 10
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 20
    mov dh, 9
    mov dl, 20
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 28
    mov dh, 6
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 25
    mov dh, 7
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 28
    mov dh, 8
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 25
    mov dh, 9
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 28
    mov dh, 10
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 23
    mov dh, 11
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 28
    mov dh, 12
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 22
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 15
    mov dh, 12
    mov dl, 17
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 14
    mov dh, 11
    mov dl, 14
    int 10h  
    
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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 23
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 28
    int 10h  

    mov ah, 09h
    mov dx, offset WIN2
    int 21h
     
    JMP AskPlayAgain  
    JMP Final

paperVRock:
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 30h
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 30h
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h

    ;== White Outline Paper ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 8
    mov dh, 14
    mov dl, 10
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 11
    mov dh, 7
    mov dl, 11
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 12
    mov dh, 6
    mov dl, 13
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 14
    mov dh, 5
    mov dl, 15
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 16
    mov dh, 4
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 25
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 22
    mov dh, 6
    mov dl, 28
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 29
    mov dh, 7
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 31
    mov dh, 9
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 22
    mov dh, 10
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 29
    mov dh, 11
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 26
    mov dh, 13
    mov dl, 26
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 22
    mov dh, 14
    mov dl, 25
    int 10h
        
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 11
    mov dh, 15
    mov dl, 21
    int 10h
       
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

    ;Text  
    
    mov ax, @data
    mov ds, ax

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 25
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 18
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset WIN1
    int 21h
    
    JMP AskPlayAgain
    JMP Final 

equalScissors:

;== Background ==  
   
    mov ah, 07h
    mov bh, 40h
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 40h
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h

    ;== White Outline Scissors ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 6
    mov dh, 13
    mov dl, 8
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 9
    mov dh, 5
    mov dl, 19
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 20
    mov dh, 11
    mov dl, 20
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 21
    mov dh, 5
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 31
    mov dh, 6
    mov dl, 31
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 23
    mov dh, 7
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 22
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 23
    mov dh, 9
    mov dl, 31
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 32
    mov dh, 10
    mov dl, 32
    int 10h     

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 20
    mov dh, 11
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 23
    mov dh, 12
    mov dl, 23
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 22
    mov dl, 13
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 17
    mov dh, 12
    mov dl, 17
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 18
    mov dh, 11
    mov dl, 19
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 16
    mov dh, 11
    mov dl, 16
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 17
    mov dh, 14
    mov dl, 17
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 12
    mov dh, 15
    mov dl, 22
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 9
    mov dh, 14
    mov dl, 11
    int 10h

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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 20
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset TIE
    int 21h    
    
    JMP AskPlayAgain
    JMP Final
    ;JMP equalScissors 

rockVScissors:
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 50h
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 50h
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h
                         
   ;== White Outline Rock ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 10
    mov dh, 10
    mov dl, 12
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 13
    mov dh, 4
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 24
    mov dh, 9
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 21
    mov dh, 10
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 20
    mov dh, 9
    mov dl, 20
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 28
    mov dh, 6
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 25
    mov dh, 7
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 28
    mov dh, 8
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 25
    mov dh, 9
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 28
    mov dh, 10
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 23
    mov dh, 11
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 28
    mov dh, 12
    mov dl, 28
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 27
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 22
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 15
    mov dh, 12
    mov dl, 17
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 14
    mov dh, 11
    mov dl, 14
    int 10h  

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

    ;Text  
    
    mov ax, @data
    mov ds, ax

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 25
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 37
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 16
    mov dl, 52
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 18
    mov dl, 29
    int 10h  

    mov ah, 09h
    mov dx, offset WIN1
    int 21h 
    
    JMP AskPlayAgain
    JMP Final 
    
paperVScissors:
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 60h
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 60h
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h

    ;== White Outline Paper ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 8
    mov dh, 14
    mov dl, 10
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 11
    mov dh, 7
    mov dl, 11
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 12
    mov dh, 6
    mov dl, 13
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 14
    mov dh, 5
    mov dl, 15
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 4
    mov cl, 16
    mov dh, 4
    mov dl, 24
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 25
    mov dh, 5
    mov dl, 25
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 22
    mov dh, 6
    mov dl, 28
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 29
    mov dh, 7
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 31
    mov dh, 9
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 22
    mov dh, 10
    mov dl, 30
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 29
    mov dh, 11
    mov dl, 29
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 22
    mov dh, 12
    mov dl, 28
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 26
    mov dh, 13
    mov dl, 26
    int 10h 
    
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 22
    mov dh, 14
    mov dl, 25
    int 10h
        
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 11
    mov dh, 15
    mov dl, 21
    int 10h

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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 20
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset WIN2
    int 21h
    
    JMP AskPlayAgain 
    JMP Final     

scissorsVRock: 
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 00EEh
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 00EEh
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h
    
    ;== White Outline Scissors ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 6
    mov dh, 13
    mov dl, 8
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 9
    mov dh, 5
    mov dl, 19
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 20
    mov dh, 11
    mov dl, 20
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 21
    mov dh, 5
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 31
    mov dh, 6
    mov dl, 31
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 23
    mov dh, 7
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 22
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 23
    mov dh, 9
    mov dl, 31
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 32
    mov dh, 10
    mov dl, 32
    int 10h     

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 20
    mov dh, 11
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 23
    mov dh, 12
    mov dl, 23
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 22
    mov dl, 13
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 17
    mov dh, 12
    mov dl, 17
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 18
    mov dh, 11
    mov dl, 19
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 16
    mov dh, 11
    mov dl, 16
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 17
    mov dh, 14
    mov dl, 17
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 12
    mov dh, 15
    mov dl, 22
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 9
    mov dh, 14
    mov dl, 11
    int 10h

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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 20
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset ROCK
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset WIN2
    int 21h
           
    JMP AskPlayAgain       
    JMP Final

scissorsVPaper: 
    ;== Background ==  
   
    mov ah, 07h
    mov bh, 00DDh
    mov ch, 1
    mov cl, 0
    mov dh, 1
    mov dl, 79
    int 10h
    
    mov ah, 07h
    mov bh, 00DDh
    mov ch, 3
    mov cl, 0
    mov dh, 4
    mov dl, 11
    int 10h
    
    ;== White Outline Scissors ==
    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 6
    mov dh, 13
    mov dl, 8
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 9
    mov dh, 5
    mov dl, 19
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 20
    mov dh, 11
    mov dl, 20
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 5
    mov cl, 21
    mov dh, 5
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 6
    mov cl, 31
    mov dh, 6
    mov dl, 31
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 23
    mov dh, 7
    mov dl, 30
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 8
    mov cl, 22
    mov dh, 8
    mov dl, 22
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 9
    mov cl, 23
    mov dh, 9
    mov dl, 31
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 10
    mov cl, 32
    mov dh, 10
    mov dl, 32
    int 10h     

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 20
    mov dh, 11
    mov dl, 31
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 23
    mov dh, 12
    mov dl, 23
    int 10h  

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 22
    mov dl, 13
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 13
    mov cl, 18
    mov dh, 13
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 12
    mov cl, 17
    mov dh, 12
    mov dl, 17
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 11
    mov cl, 18
    mov dh, 11
    mov dl, 19
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 7
    mov cl, 16
    mov dh, 11
    mov dl, 16
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 23
    mov dh, 14
    mov dl, 23
    int 10h 

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 17
    mov dh, 14
    mov dl, 17
    int 10h

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 15
    mov cl, 12
    mov dh, 15
    mov dl, 22
    int 10h   

    mov ah, 07h
    mov bh, 0xffh
    mov ch, 14
    mov cl, 9
    mov dh, 14
    mov dl, 11
    int 10h

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

    ;Text
    mov ax, @data
    mov ds, ax  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 14
    int 10h  

    mov ah, 09h
    mov dx, offset P1DISPLAY
    int 21h  

    mov ah, 02h
    mov bh, 00
    mov dh, 2
    mov dl, 57
    int 10h  

    mov ah, 09h
    mov dx, offset P2DISPLAY
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 20
    int 10h  

    mov ah, 09h
    mov dx, offset SCISSOR
    int 21h    

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 38
    int 10h  

    mov ah, 09h
    mov dx, offset VERSUS
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 17
    mov dl, 53
    int 10h  

    mov ah, 09h
    mov dx, offset PAPER
    int 21h 

    mov ah, 02h
    mov bh, 00
    mov dh, 19
    mov dl, 30
    int 10h  

    mov ah, 09h
    mov dx, offset WIN1
    int 21h
    
    JMP AskPlayAgain
    JMP Final

AskPlayAgain:
   MOV DX, offset play_Again
   MOV AH, 09h
   INT 21h

   MOV AH, 01h              ; Function to read a character from the keyboard (Input for play again)
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
          
          
          
          
          
     
