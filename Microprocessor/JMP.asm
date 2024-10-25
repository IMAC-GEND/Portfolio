; JMP Instruction

; Sample #1
;mov ax, 1234h
;jmp hello
;mov bx, 4567h

;hello:
;    inc ax
;mov ah, 4ch
;int 21h


; Sample #2
;mov ax, 1234h
;mov bx, 4567h
;cmp ax, bx
;ja hello
;jb hi

;hello:
;    inc ax
;    mov ah, 4ch
;    int 21h

;hi:
;    dec ax
;    mov ah, 4ch
;    int 21h


; Sample #3
;mov ax, 1234h
;mov bx, 1235h
;cmp ax, bx
;je hello
;jne hi

;hello:
;    inc ax
;mov ax, 4c00h
;int 21h

;hi:
;    dec ax
;mov ax, 4c00h
;int 21h


; Sample #4
mov ax, 1234h
mov bx, 1235h
cmp ax, bx
jg hello
jl hi

hello:
    inc ax
    
mov ax, 4c00h
int 21h

hi:
    dec ax

mov ax, 4c00h
int 21h