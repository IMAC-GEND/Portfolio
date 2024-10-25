;Loop Sample #3a
.model small
.data
var1 db '*','$'
var2 db '',10,13,'$'
.code
mov ax, @data
mov ds, ax
mov cl, 3
mov bl, 1h
mov bh, 0

ulit2:
mov bh, cl
mov cl, bl
ulit:
mov ah, 09h
mov dx, offset var1
int 21h
loop ulit

inc bl
mov ah, 09h
mov dx, offset var2
int 21h
mov cl, bh
loop ulit2

mov ah, 4ch
int 21h