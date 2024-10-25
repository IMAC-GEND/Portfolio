;mov ax, 1234h
;mov bx, 0xABCD
;add ax, bx 
    
;mov ax, 1234H
;mov bx, 0xABCD
;sub ax, bx 

;mov ax, 1234H
;inc ax  

;mov ax, 1234H
;dec ax

;mov al, 10h
;mov ah, 20h
;mul ah

;mov ax, 1234h
;mov bx, 5678h
;mul bx

;mov al, 20h
;mov bl, 7h
;div bl

;mov ax, 1000
;mov bx, 13
;div bx

;stc 
;mov ax, 1234H
;mov bx, 0xABCD
;adc ax, bx

;stc
;mov ax, 1234H
;mov bx, 0xABCD
;sbb bx, ax

;mov ax, 1234H
;mov bx, 0xABCD
;and ax, bx

;mov ax, 1234H
;mov bx, 0xABCD
;or ax, bx

;mov ax, 1234H
;mov bx, 0xABCD
;xor ax, bx

;mov ax, 1234H
;not ax

;mov ax, 1234H
;neg ax

.model small
.data

hello db 'The sum of the numbers is', 10,13,'$'
num1 db '2345', 10,13,'$'
num2 db '5678', 10,13,'$'
sum  db '                      ', 10,13,'$'

.code
mov ax,@data
mov ds,ax

main:
    mov si,03h
    mov cx,05h
    clc
    
add_loop:
    mov al,[num1+si]
    adc al,[num2+si]  ;reg flag
    aaa    ;reg flag
    pushf  ;stack
    or al,30h
    popf   ;stack
    mov [sum+si],al
    dec si
    loop add_loop
    
    mov ah,09
    mov dx, offset hello
    int 21h
    
    mov ah,09
    mov dx, offset sum
    int 21h