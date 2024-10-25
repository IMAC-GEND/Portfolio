.model small
.stack 100
.data

    array db 5,1,9,3,8,6,7,4,2,0
    num db 2

.code

mov ax, @data
mov ds, ax

xor di, di
mov cl, 10
lea bx, array
mov al, num
mov si, 0

back:
cmp al, [bx+di]
jnz skip

mov si, di
mov ah, 2
add si, 30h
mov dx, si
int 21h

skip:
inc di
dec cl
jnz back

mov ah, 4ch
int 21h
end