.model small
.data
    hello db 'HELLO', 10,13,'4'
    hello1 db '       ' ,10,13,'$'
    
.code
mov ax, @data
mov ds, ax

main:
    mov si, 04h
    mov cx, 05h
    clc
    
add_loop:
    mov al, [hello+si]
    or al, 20h
    mov [hello1+si], al
    dec si
    loop add_loop
    
    mov ah, 09
    mov dx, offset hello1
    int 21h