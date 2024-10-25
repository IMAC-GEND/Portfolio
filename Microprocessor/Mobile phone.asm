.model small
.stack
.code

start:

;BACKGROUND
;========================
mov ah, 07h      
mov bh, 22h
mov ch, 0
mov cl, 0
mov dh, 24
mov dl, 79
int 10h 
;OUTLINE
;========================
mov ah, 07h      
mov bh, 00
mov ch, 1
mov cl, 8
mov dh, 1
mov dl, 71
int 10h

mov ah, 07h      
mov bh, 00
mov ch, 2
mov cl, 7
mov dh, 2
mov dl, 8
int 10h

mov ah, 07h      
mov bh, 00
mov ch, 3
mov cl, 6
mov dh, 3
mov dl, 7
int 10h

mov ah, 07h      
mov bh, 00
mov ch, 4
mov cl, 6
mov dh, 19
mov dl, 6
int 10h 

mov ah, 07h      
mov bh, 0
mov ch, 20
mov cl, 6
mov dh, 20
mov dl, 7
int 10h 

mov ah, 07h      
mov bh, 00
mov ch, 21
mov cl, 7
mov dh, 21
mov dl, 8
int 10h  

mov ah, 07h      
mov bh, 00
mov ch, 22
mov cl, 8
mov dh, 22
mov dl, 71
int 10h   

mov ah, 07h      
mov bh, 00
mov ch, 21
mov cl, 71
mov dh, 21
mov dl, 72
int 10h   

mov ah, 07h      
mov bh, 00
mov ch, 20
mov cl, 72
mov dh, 20
mov dl, 73
int 10h   

mov ah, 07h      
mov bh, 00
mov ch, 4
mov cl, 73
mov dh, 19
mov dl, 73
int 10h   

mov ah, 07h      
mov bh, 00
mov ch, 3
mov cl, 72
mov dh, 3
mov dl, 73
int 10h   

mov ah, 07h      
mov bh, 00
mov ch, 2
mov cl, 71
mov dh, 2
mov dl, 72
int 10h  
;FRAME
;========================
mov ah, 07h      
mov bh, 77h
mov ch, 2
mov cl, 9
mov dh, 2
mov dl, 70
int 10h  

mov ah, 07h      
mov bh, 77h
mov ch, 3
mov cl, 8
mov dh, 3
mov dl, 11
int 10h  

mov ah, 07h      
mov bh, 77h
mov ch, 21
mov cl, 9
mov dh, 21
mov dl, 70
int 10h  

mov ah, 07h      
mov bh, 77h
mov ch, 20
mov cl, 8
mov dh, 20
mov dl, 11
int 10h   

mov ah, 07h      
mov bh, 77h
mov ch, 20
mov cl, 68
mov dh, 20
mov dl, 71
int 10h   

mov ah, 07h      
mov bh, 77h
mov ch, 3
mov cl, 68
mov dh, 3
mov dl, 71
int 10h   

mov ah, 07h      
mov bh, 77h
mov ch, 4
mov cl, 68
mov dh, 19
mov dl, 72
int 10h   

mov ah, 07h      
mov bh, 77h
mov ch, 4
mov cl, 7
mov dh, 19
mov dl, 11
int 10h   

;SPEAKER
mov ah, 07h      
mov bh, 00h
mov ch, 9
mov cl, 7
mov dh, 14
mov dl, 7
int 10h 

;CAMERA
mov ah, 07h      
mov bh, 0xEEh
mov ch, 5
mov cl, 8
mov dh, 6
mov dl, 9
int 10h  

;BUTTON
mov ah, 07h      
mov bh, 00
mov ch, 10
mov cl, 69
mov dh, 13
mov dl, 71
int 10h   

mov ah, 07h      
mov bh, 0xFFh
mov ch, 11
mov cl, 70
mov dh, 12
mov dl, 70
int 10h

;SCREEN
mov ah, 07h      
mov bh, 0xFFh
mov ch, 3
mov cl, 12
mov dh, 20
mov dl, 67
int 10h
 
;Logo bg
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 4   ; y axis
mov cl, 18   ; x axis     
mov dh, 19  ; long vertically     
mov dl, 63  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 0xCCh    
mov ch, 4   ; y axis
mov cl, 13   ; x axis     
mov dh, 6  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 99h    
mov ch, 8   ; y axis
mov cl, 13   ; x axis     
mov dh, 10  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 0xAAh    
mov ch, 12   ; y axis
mov cl, 13   ; x axis     
mov dh, 14  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 0xEEh    
mov ch, 16   ; y axis
mov cl, 13   ; x axis     
mov dh, 19  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h

;LOGO
mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 6   ; y axis
mov cl, 31   ; x axis     
mov dh, 6  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h
  
mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 8   ; y axis
mov cl, 30   ; x axis     
mov dh, 8  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h   

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 8   ; y axis
mov cl, 36   ; x axis     
mov dh, 8  ; long vertically     
mov dl, 43  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 8   ; y axis
mov cl, 48   ; x axis     
mov dh, 8  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 9   ; y axis
mov cl, 29   ; x axis     
mov dh, 9  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 9   ; y axis
mov cl, 35   ; x axis     
mov dh, 9  ; long vertically     
mov dl, 44  ; long horizontally     
int 10h
        
mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 9   ; y axis
mov cl, 51   ; x axis     
mov dh, 9  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 10   ; y axis
mov cl, 28   ; x axis     
mov dh, 10  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 10   ; y axis
mov cl, 35   ; x axis     
mov dh, 10  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 11   ; y axis
mov cl, 29   ; x axis     
mov dh, 11  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 11   ; y axis
mov cl, 50   ; x axis     
mov dh, 11  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 13   ; y axis
mov cl, 32   ; x axis     
mov dh, 13  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 14   ; y axis
mov cl, 33   ; x axis     
mov dh, 14  ; long vertically     
mov dl, 34  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 14   ; y axis
mov cl, 41   ; x axis     
mov dh, 14  ; long vertically     
mov dl, 46  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 17   ; y axis
mov cl, 35   ; x axis     
mov dh, 17  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h 

;mov ah, 07h ; COLOR    
;mov bh, 00EEh    
;mov ch, 18   ; y axis
;mov cl, 37   ; x axis     
;mov dh, 18  ; long vertically     
;mov dl, 43  ; long horizontally     
;int 10h


end start 