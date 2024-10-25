.model SMALL
.stack 100h
.data

CR            db 13,10,'$'
TITLE1        db '                         SOUTHERN LUZON STATE UNIVERSITY',13,10,'$'
TITLE2        db '                           Brgy. Kulapi, Lucban Quezon',13,10,13,10,'$'
DEPARTMENT    db '                         Computer Engineering Department',13,10,'                                 Student Record',13,10,13,10,'$'
STUDENT_NAME  db '              Student Name                :             $'
STUDENT_NUM   db '              Student Number              :             $'
YEAR_LEVEL    db '              Year Level                  :             $'
GENDER        db '              Gender                      :             $'
BIRTHDATE     db '              Birthdate                   :             $'
AGE           db '              Age                         :             $'
;PROGRAMMER    db '                          Programmed by: Reimarc Corpuz',13,10,'$'
BUF           db 64  ; Buffer to store the user input
              db 0   ; Buffer size

.code

BEGIN:
   MOV AX, @data
   MOV DS, AX

   ; Print the title and other information
   MOV DX, OFFSET TITLE1
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET TITLE2
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET DEPARTMENT
   MOV AH, 09h
   INT 21h

   ; Print the student record form
   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET STUDENT_NAME
   MOV AH, 09h
   INT 21h

   ; Read student name input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read string input
   INT 21h

   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET STUDENT_NUM
   MOV AH, 09h
   INT 21h

   ; Read student number input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read string input
   INT 21h

   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET YEAR_LEVEL
   MOV AH, 09h
   INT 21h

   ; Read year level input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read string input
   INT 21h

   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET GENDER
   MOV AH, 09h
   INT 21h

   ; Read gender input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read a string input
   INT 21h

   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET BIRTHDATE
   MOV AH, 09h
   INT 21h

   ; Read birthdate input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read string input
   INT 21h

   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   MOV DX, OFFSET AGE
   MOV AH, 09h
   INT 21h

   ; Read age input
   MOV DX, OFFSET BUF
   MOV AH, 0Ah  ; Function to read a single character
   INT 21h

   ; Print the programmer information
   MOV DX, OFFSET CR
   MOV AH, 09h
   INT 21h

   ;MOV DX, OFFSET PROGRAMMER
   ;MOV AH, 09h
   ;INT 21h

   ; Terminate the program
   MOV AH, 4Ch
   MOV AL, 00
   INT 21h

end BEGIN
