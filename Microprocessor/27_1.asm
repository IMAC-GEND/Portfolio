.model small
.stack 100
.data

    array db 1,2,3,4,5,20h,6,7,8,9,10
    max db 0

.code

mov ax, @data
mov ds, ax

xor di, di
mov cl, 10
lea bx, array
mov al, max

back:
cmp al, [bx+di]
jnc skip

mov dl, [bx+di]
mov al, dl

skip:
inc di
dec cl
jnz back 

mov max, al
mov ch, 02h
mov cl, 04h
mov bh, al

mov ah, 4ch
int 21h
end