; Sample 3b
.model small
.data
var1 db '*', '$'
var2 db '',10,13,'$'
.code
mov ax, @data
mov ds, ax
mov cx, 3
mov bx, 1
ulit2:
    push cx
    push bx
        pop cx
        ulit:
        mov ah, 09h
        mov dx, offset var1
        int 21h
        loop ulit
        inc bx
        
    mov ah, 09h
    mov dx, offset var2
    int 21h
    pop cx
loop ulit2

mov ah, 4ch
int 21h