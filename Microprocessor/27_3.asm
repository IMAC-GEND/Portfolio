.model small
.stack
.data
    arr1 db 1h,2h,3h,4h,5h,6h,7h,8h,9h,10h,11h
    arr2 db ''
.code
start:
mov ax, @data
mov ds, ax
mov al, 0
mov cx, 11
mov si, 0

labko:
add al, arr1[si]
mov arr2[si], al
inc si
loop labko

end start