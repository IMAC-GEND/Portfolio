.model small
.stack
.data

.code
start:


mov ah, 07h ; COLOR    
mov bh, 00BBh    
mov ch, 0   ; y axis
mov cl, 0   ; x axis     
mov dh, 24  ; long vertically     
mov dl, 79  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 5   ; y axis
mov cl, 29   ; x axis     
mov dh, 5  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 6   ; y axis
mov cl, 28   ; x axis     
mov dh, 6  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 7   ; y axis
mov cl, 27   ; x axis     
mov dh, 7  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 8   ; y axis
mov cl, 26   ; x axis     
mov dh, 8  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 9   ; y axis
mov cl, 25   ; x axis     
mov dh, 9  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h   

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 10   ; y axis
mov cl, 24   ; x axis     
mov dh, 10  ; long vertically     
mov dl, 56  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 11   ; y axis
mov cl, 25   ; x axis     
mov dh, 11  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 12   ; y axis
mov cl, 26   ; x axis     
mov dh, 12  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 13   ; y axis
mov cl, 27   ; x axis     
mov dh, 13  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 14   ; y axis
mov cl, 28   ; x axis     
mov dh, 14  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 15   ; y axis
mov cl, 29   ; x axis     
mov dh, 15  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 16   ; y axis
mov cl, 30   ; x axis     
mov dh, 16  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 17   ; y axis
mov cl, 31   ; x axis     
mov dh, 17  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 18   ; y axis
mov cl, 32   ; x axis     
mov dh, 18  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 19   ; y axis
mov cl, 33   ; x axis     
mov dh, 19  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 20   ; y axis
mov cl, 34   ; x axis     
mov dh, 20  ; long vertically     
mov dl, 46  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 21   ; y axis
mov cl, 35   ; x axis     
mov dh, 21  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 22   ; y axis
mov cl, 36   ; x axis     
mov dh, 22  ; long vertically     
mov dl, 44  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 7   ; y axis
mov cl, 29   ; x axis     
mov dh, 7  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 8   ; y axis
mov cl, 28   ; x axis     
mov dh, 8  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 9   ; y axis
mov cl, 27   ; x axis     
mov dh, 9  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 10   ; y axis
mov cl, 26   ; x axis     
mov dh, 10  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 11   ; y axis
mov cl, 27   ; x axis     
mov dh, 11  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 12   ; y axis
mov cl, 28   ; x axis     
mov dh, 12  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 13   ; y axis
mov cl, 29   ; x axis     
mov dh, 13  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 14   ; y axis
mov cl, 30   ; x axis     
mov dh, 14  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h   

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 15   ; y axis
mov cl, 31   ; x axis     
mov dh, 15  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16   ; y axis
mov cl, 32   ; x axis     
mov dh, 16  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 17   ; y axis
mov cl, 33   ; x axis     
mov dh, 17  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 18   ; y axis
mov cl, 34   ; x axis     
mov dh, 18  ; long vertically     
mov dl, 46  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 19   ; y axis
mov cl, 35   ; x axis     
mov dh, 19  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20   ; y axis
mov cl, 36   ; x axis     
mov dh, 20  ; long vertically     
mov dl, 44  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 21   ; y axis
mov cl, 37   ; x axis     
mov dh, 21  ; long vertically     
mov dl, 43  ; long horizontally     
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

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 18   ; y axis
mov cl, 37   ; x axis     
mov dh, 18  ; long vertically     
mov dl, 43  ; long horizontally     
int 10h



 


 


mov ah, 4ch
int 21h        

end start