.model small
.stack
.data
     var1 db 'R E S I S T O R 54.7 KOHMS', 13,10,'$'
     var2 db '04', 13,10,'$'
     var3 db '07', 13,10,'$' 
     var4 db '2%', 13,10,'$'
     var5 db 'tmp', 13,10,'$'
     var6 db '05', 13,10,'$'

.code
start:

mov ax, @data
mov ds, ax

mov ah, 07h     
mov bh, 00FFh    
mov ch, 0
mov cl, 0      
mov dh, 79      
mov dl, 79      
int 10h 

mov ah, 07h     
mov bh, 11h    
mov ch, 4
mov cl, 15       
mov dh, 16      
mov dl, 65      
int 10h 

mov ah, 07h     
mov bh, 99h    
mov ch, 5
mov cl, 15       
mov dh, 15      
mov dl, 66      
int 10h
 
; head left  
mov ah, 07h     
mov bh, 11h    
mov ch, 3
mov cl, 15       
mov dh, 17      
mov dl, 20      
int 10h 
mov ah, 07h     
mov bh, 11h    
mov ch, 4
mov cl, 14       
mov dh, 16      
mov dl, 20      
int 10h 
mov ah, 07h     
mov bh, 11h    
mov ch, 5
mov cl, 13       
mov dh, 15      
mov dl, 20      
int 10h
mov ah, 07h     
mov bh, 11h    
mov ch, 6
mov cl, 12       
mov dh, 14      
mov dl, 20      
int 10h
mov ah, 07h     
mov bh, 11h    
mov ch, 7
mov cl, 11       
mov dh, 13      
mov dl, 20      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 4
mov cl, 15       
mov dh, 16      
mov dl, 20      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 5
mov cl, 14       
mov dh, 15      
mov dl, 20      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 6
mov cl, 13       
mov dh, 14      
mov dl, 20      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 7
mov cl, 12       
mov dh, 13      
mov dl, 20      
int 10h 

mov ah, 07h     
mov bh, 99h    
mov ch, 8
mov cl, 11       
mov dh, 12      
mov dl, 20      
int 10h
;head left

;head right
mov ah, 07h     
mov bh, 11h    
mov ch, 3
mov cl, 60       
mov dh, 17      
mov dl, 65      
int 10h
mov ah, 07h     
mov bh, 11h    
mov ch, 4
mov cl, 59       
mov dh, 16      
mov dl, 66      
int 10h 
mov ah, 07h     
mov bh, 11h    
mov ch, 5
mov cl, 60       
mov dh, 15      
mov dl, 67      
int 10h
mov ah, 07h     
mov bh, 11h    
mov ch, 6
mov cl, 57       
mov dh, 14      
mov dl, 68      
int 10h 
mov ah, 07h     
mov bh, 11h    
mov ch, 7
mov cl, 56       
mov dh, 13      
mov dl, 69      
int 10h 

mov ah, 07h     
mov bh, 99h    
mov ch, 4
mov cl, 60       
mov dh, 16      
mov dl, 65      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 5
mov cl, 59       
mov dh, 15      
mov dl, 66      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 6
mov cl, 58       
mov dh, 14      
mov dl, 67      
int 10h 

mov ah, 07h     
mov bh, 99h    
mov ch, 7
mov cl, 57       
mov dh, 13      
mov dl, 68      
int 10h

mov ah, 07h     
mov bh, 99h    
mov ch, 8
mov cl, 56       
mov dh, 12      
mov dl, 69      
int 10h  

mov ah, 07h ; band green    
mov bh, 20h    
mov ch, 1  ; y axis
mov cl, 16 ; x axis     
mov dh, 2 ; long vertically     
mov dl, 19 ; long horizontally     
int 10h 
mov ah, 02h
mov bh, 00h
mov dh, 2
mov dl, 17
int 10h
mov ah, 09h
mov dx, offset var6
int 21h 
mov ah, 07h ; band green    
mov bh, 20h    
mov ch, 4  ; y axis
mov cl, 16 ; x axis     
mov dh, 16 ; long vertically     
mov dl, 19 ; long horizontally     
int 10h 

mov ah, 07h ; band yellow    
mov bh, 60h    
mov ch, 1  ; y axis
mov cl, 25 ; x axis     
mov dh, 2 ; long vertically     
mov dl, 28 ; long horizontally 
int 10h 
mov ah, 02h
mov bh, 00h
mov dh, 2
mov dl, 26
int 10h
mov ah, 09h
mov dx, offset var2
int 21h     
mov ah, 07h ; band yellow    
mov bh, 60h    
mov ch, 5  ; y axis
mov cl, 25 ; x axis     
mov dh, 15 ; long vertically     
mov dl, 28 ; long horizontally     
int 10h 

mov ah, 07h ; band green    
mov bh, 20h    
mov ch, 1  ; y axis
mov cl, 32 ; x axis     
mov dh, 2 ; long vertically     
mov dl, 35 ; long horizontally     
int 10h
mov ah, 02h
mov bh, 00h
mov dh, 2
mov dl, 33
int 10h
mov ah, 09h
mov dx, offset var3
int 21h 
mov ah, 07h ; band green    
mov bh, 20h    
mov ch, 5  ; y axis
mov cl, 32 ; x axis     
mov dh, 15 ; long vertically     
mov dl, 35 ; long horizontally     
int 10h 

mov ah, 07h ; band red    
mov bh, 40h    
mov ch, 1  ; y axis
mov cl, 39 ; x axis     
mov dh, 2 ; long vertically     
mov dl, 42 ; long horizontally     
int 10h 
mov ah, 02h
mov bh, 00h
mov dh, 2
mov dl, 40
int 10h
mov ah, 09h
mov dx, offset var4
int 21h 
mov ah, 07h ; band red    
mov bh, 40h    
mov ch, 5  ; y axis
mov cl, 39 ; x axis     
mov dh, 15 ; long vertically     
mov dl, 42 ; long horizontally     
int 10h 

mov ah, 07h ; band violet    
mov bh, 50h    
mov ch, 1  ; y axis
mov cl, 46 ; x axis     
mov dh, 2 ; long vertically     
mov dl, 49 ; long horizontally     
int 10h 
mov ah, 02h
mov bh, 00h
mov dh, 2
mov dl, 46
int 10h
mov ah, 09h
mov dx, offset var5
int 21h 
mov ah, 07h ; band violet    
mov bh, 50h    
mov ch, 5  ; y axis
mov cl, 46 ; x axis     
mov dh, 15 ; long vertically     
mov dl, 49 ; long horizontally     
int 10h

mov ah, 07h ; left grey    
mov bh, 11h    
mov ch, 8  ; y axis
mov cl, 0 ; x axis     
mov dh, 12 ; long vertically     
mov dl, 10 ; long horizontally     
int 10h

mov ah, 07h ; left grey    
mov bh, 70h    
mov ch, 9  ; y axis
mov cl, 0 ; x axis     
mov dh, 11 ; long vertically     
mov dl, 10 ; long horizontally     
int 10h 

mov ah, 07h ; right grey    
mov bh, 11h    
mov ch, 8  ; y axis
mov cl, 70 ; x axis     
mov dh, 12 ; long vertically     
mov dl, 79 ; long horizontally     
int 10h 
 
mov ah, 07h ; right grey    
mov bh, 70h    
mov ch, 9  ; y axis
mov cl, 70 ; x axis     
mov dh, 11 ; long vertically     
mov dl, 79 ; long horizontally     
int 10h

mov ah, 07h ; base text    
mov bh, 70h    
mov ch, 20  ; y axis
mov cl, 0 ; x axis     
mov dh, 22 ; long vertically     
mov dl, 79 ; long horizontally     
int 10h 

mov ah, 02h
mov bh, 00h
mov dh, 21
mov dl, 28
int 10h 

mov ah, 09h
mov dx, offset var1
int 21h

mov ah, 4ch
int 21h        

end start