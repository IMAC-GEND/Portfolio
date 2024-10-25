;CMPSB

.model small
.data

string1 db 'abcde',13,10,'$' 
string2 db 'abcde',13,10,'$'

equal db 'Equal',13,10,'$'
notequal db 'Not Equal',13,10,'$'

.code

mov ax,@data
mov ds,ax
mov es,ax
start:

lea si,string1
lea di,string2

cld
mov cx,5 
repe cmpsb
je hi
jne hello

hi: 
    mov ah,09h
    mov dx,offset equal
    int 21h
    mov ah,4ch
    int 21h
    
hello:
    mov ah,09h
    mov dx,offset notequal
    int 21h
    mov ah,4ch
    int 21h