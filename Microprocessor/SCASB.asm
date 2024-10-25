;SCASB
.model samll
.data
string db 'abcde' ,13,10,'$'
found db 'Found' ,13,10,'$'
notfound db 'Not Found' ,13,10,'$'   
.code
mov ax, @data
mov ds, ax
mov es, ax
start:

lea di, string
mov al, 'a'
cld
mov cx, 5
repne scasb
je hi
jne hello

hi:
    mov ah, 09h
    mov dx, offset notfound
    int 21h
    mov ah, 4ch
    int 21h
    
    
hello:
    mov ah, 09h
    mov dx, offset found
    int 21h
    mov ah, 4ch
    int 21h