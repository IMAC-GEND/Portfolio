.model small
.data
num1 db 2
num2 db 1
num3 db 5
lar db '0',13,10,'$'
.code

start:
mov ax, @data
mov ds, ax
mov al, [num1] ;save num1 sa al
mov bl, [num2] ;save num1 sa bl
mov cl, [num3] ;save num1 sa cl 

cmp al, bl      ;compare 1 and 2
jg checkthird   ;jump para compare
jmp checksecond ;jump para compare

checksecond:
cmp bl, cl        ;compare 2 and 3
jg secondlargest  ;jump para print second as largest 
jmp thirdlargest   ;jump para print third as largest  

checkthird:
cmp al, cl        ;compare 1 and 3
jg firstlargest  ;jump para print first as largest 
jmp thirdlargest   ;jump pag mas mali third as largest 

firstlargest:
mov al, [num1]      ;save sa AL ung laman ng variable na num1
or al, 30h          ;use OR para maging ascii
lea bx, lar         ;kukunin address ng variable na LAR at isave sa BX   
mov [bx], al        ;isave sa memory location ng LAR ung value ng AL
jmp print

secondlargest:
mov al, [num2]
or al, 30h
lea bx, lar
mov [bx], al
jmp print  

thirdlargest:
mov al, [num3]
or al, 30h
lea bx, lar
mov [bx], al
jmp print 

print:
mov ah, 09
mov dx, offset lar
int 21h

mov ah, 4ch
int 21h