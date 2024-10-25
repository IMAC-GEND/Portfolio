;Loop - Sample 2a
;.model small
;.data
;var1 db 'x', '$'   
;var2 db ' ', 13, 10, '$'   
;.code
;mov ax, @data
;mov ds, ax
;mov cx, 10
;ulit2:
;    mov bl,cl
;    mov cl,5
;ulit:
;mov ah, 09h
;mov dx, offset var1
;int 21h
;loop ulit
;mov ah, 09h
;mov dx, offset var2
;int 21h
;    mov cl, bl
;loop ulit2
;mov ah, 4ch
;int 21h

;Loop - Sample 2b
.model small
.data
var1 db 'x', '$'   
var2 db ' ', 13, 10, '$'   
.code
mov ax, @data
mov ds, ax
mov cx, 10

ulit2:
push cx

    mov cl,5
    ulit:
        mov ah, 09h
        mov dx, offset var1;
        int 21h
    loop ulit
    
mov ah, 09h
mov dx, offset var2
int 21h

pop cx
loop ulit2

mov ah, 4ch
int 21h