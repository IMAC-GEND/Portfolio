.model small
.stack
.data

.code
start:


mov ah, 07h ; COLOR    
mov bh, 11h    
mov ch, 0   ; y axis
mov cl, 0  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 79  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 0   ; y axis
mov cl, 38  ; x axis     
mov dh, 0  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 1   ; y axis
mov cl, 35  ; x axis     
mov dh, 1  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 1   ; y axis
mov cl, 49  ; x axis     
mov dh, 1  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 1   ; y axis
mov cl, 49  ; x axis     
mov dh, 1  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 2   ; y axis
mov cl, 35  ; x axis     
mov dh, 3  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 2   ; y axis
mov cl, 51  ; x axis     
mov dh, 3  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 4   ; y axis
mov cl, 35  ; x axis     
mov dh, 7  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 4   ; y axis
mov cl, 51  ; x axis     
mov dh, 7  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 1   ; y axis
mov cl, 41  ; x axis     
mov dh, 1  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 2   ; y axis
mov cl, 41  ; x axis     
mov dh, 2  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 3   ; y axis
mov cl, 41  ; x axis     
mov dh, 3  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 4   ; y axis
mov cl, 42  ; x axis     
mov dh, 4  ; long vertically     
mov dl, 44  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 5   ; y axis
mov cl, 42  ; x axis     
mov dh, 5  ; long vertically     
mov dl, 44  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 3   ; y axis
mov cl, 34  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 34  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 40h    
mov ch, 3   ; y axis
mov cl, 52  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 8   ; y axis
mov cl, 35  ; x axis     
mov dh, 8  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 9   ; y axis
mov cl, 35  ; x axis     
mov dh, 9  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 7  ; y axis
mov cl, 36  ; x axis     
mov dh, 7  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 6  ; y axis
mov cl, 36  ; x axis     
mov dh, 6  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 5  ; y axis
mov cl, 36  ; x axis     
mov dh, 5  ; long vertically     
mov dl, 41  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 5  ; y axis
mov cl, 45  ; x axis     
mov dh, 5  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 4  ; y axis
mov cl, 36  ; x axis     
mov dh, 4 ; long vertically     
mov dl, 41  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 4  ; y axis
mov cl, 45  ; x axis     
mov dh, 4  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 3  ; y axis
mov cl, 36  ; x axis     
mov dh, 3  ; long vertically     
mov dl, 40  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 3  ; y axis
mov cl, 46  ; x axis     
mov dh, 3  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 2  ; y axis
mov cl, 36  ; x axis     
mov dh, 2  ; long vertically     
mov dl, 40  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 2  ; y axis
mov cl, 46  ; x axis     
mov dh, 2  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 1  ; y axis
mov cl, 38  ; x axis     
mov dh, 1 ; long vertically     
mov dl, 40  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 1  ; y axis
mov cl, 46  ; x axis     
mov dh, 1 ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 70h    
mov ch, 10  ; y axis
mov cl, 36  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 39  ; long horizontally     
int 10h   
mov ah, 07h ; COLOR    
mov bh, 70h    
mov ch, 10  ; y axis
mov cl, 47  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 70h    
mov ch, 11  ; y axis
mov cl, 36  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 40  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 70h    
mov ch, 11  ; y axis
mov cl, 46  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 10  ; y axis
mov cl, 40  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 46  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 11  ; y axis
mov cl, 41  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 45  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 11  ; y axis
mov cl, 34  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 34  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 11  ; y axis
mov cl, 52  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 10  ; y axis
mov cl, 35  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 10  ; y axis
mov cl, 51  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 12  ; y axis
mov cl, 36  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 13  ; y axis
mov cl, 36  ; x axis     
mov dh, 13  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h   

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 14  ; y axis
mov cl, 37  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 15  ; y axis
mov cl, 38  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h   

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 16  ; y axis
mov cl, 39  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 17  ; y axis
mov cl, 39  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 13   ; y axis
mov cl, 35  ; x axis     
mov dh, 14  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 15   ; y axis
mov cl, 35  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h  
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 13   ; y axis
mov cl, 51  ; x axis     
mov dh, 14  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 15   ; y axis
mov cl, 51  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 14   ; y axis
mov cl, 36  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 36  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 16   ; y axis
mov cl, 36  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 36  ; long horizontally     
int 10h  
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 14   ; y axis
mov cl, 50  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 16   ; y axis
mov cl, 50  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 15   ; y axis
mov cl, 37  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 17   ; y axis
mov cl, 37  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h  
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 15   ; y axis
mov cl, 49  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 17   ; y axis
mov cl, 49  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16   ; y axis
mov cl, 38  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 38  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18   ; y axis
mov cl, 38  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 38  ; long horizontally     
int 10h  
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16   ; y axis
mov cl, 48  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18   ; y axis
mov cl, 48  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18  ; y axis
mov cl, 39  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 19  ; y axis
mov cl, 38  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 18  ; y axis
mov cl, 49  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 17  ; y axis
mov cl, 50  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16  ; y axis
mov cl, 51  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 40h    
mov ch, 16  ; y axis
mov cl, 52  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 40h    
mov ch, 17  ; y axis
mov cl, 53  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 40h    
mov ch, 18  ; y axis
mov cl, 55  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 17  ; y axis
mov cl, 52  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 52  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 52  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 52  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 18  ; y axis
mov cl, 53  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 53  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 53  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 53  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 18  ; y axis
mov cl, 54  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 20  ; y axis
mov cl, 54  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 21  ; y axis
mov cl, 54  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 54  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 19  ; y axis
mov cl, 55  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 55  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 55  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 55  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 24  ; y axis
mov cl, 50  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 51  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 23  ; y axis
mov cl, 34  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 24  ; y axis
mov cl, 39  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 24  ; y axis
mov cl, 36  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 38  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 20  ; y axis
mov cl, 39  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 47  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 21  ; y axis
mov cl, 39  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 20  ; y axis
mov cl, 48  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 22  ; y axis
mov cl, 38  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 48  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 49  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 50  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 21  ; y axis
mov cl, 49  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 49  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 35  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 38  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 20  ; y axis
mov cl, 35  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20  ; y axis
mov cl, 36  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 36  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 20  ; y axis
mov cl, 37  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 38  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 34  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 19  ; y axis
mov cl, 34  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 18  ; y axis
mov cl, 34  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 36  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 18  ; y axis
mov cl, 37  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 37  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 17  ; y axis
mov cl, 34  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 17  ; y axis
mov cl, 36  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 36  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 20  ; y axis
mov cl, 34  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 34  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16  ; y axis
mov cl, 29  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 17  ; y axis
mov cl, 30  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18  ; y axis
mov cl, 32  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 19  ; y axis
mov cl, 32  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 20  ; y axis
mov cl, 33  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20  ; y axis
mov cl, 32  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 32  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 22  ; y axis
mov cl, 32  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 32  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 23  ; y axis
mov cl, 31  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 22  ; y axis
mov cl, 31  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20  ; y axis
mov cl, 31  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 24  ; y axis
mov cl, 31  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 35  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 24  ; y axis
mov cl, 29  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 22  ; y axis
mov cl, 29  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 22  ; y axis
mov cl, 28  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 28  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 27  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 27  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 27  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 20  ; y axis
mov cl, 30  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 21  ; y axis
mov cl, 30  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18  ; y axis
mov cl, 32  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 33  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 19  ; y axis
mov cl, 31  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 40h    
mov ch, 18  ; y axis
mov cl, 30  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 16  ; y axis
mov cl, 29  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 15  ; y axis
mov cl, 29  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 31  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 18  ; y axis
mov cl, 27  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 16  ; y axis
mov cl, 28  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 28  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 24  ; y axis
mov cl, 26  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 23  ; y axis
mov cl, 26  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 24  ; y axis
mov cl, 25  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 25  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 24  ; y axis
mov cl, 20  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 24  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 23  ; y axis
mov cl, 19  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 25  ; long horizontally     
int 10h 
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 22  ; y axis
mov cl, 19  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 21  ; y axis
mov cl, 25  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 11  ; y axis
mov cl, 26  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 20  ; y axis
mov cl, 27  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 19  ; y axis
mov cl, 27  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 30  ; long horizontally     
int 10h
mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 16  ; y axis
mov cl, 27  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 27  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 13  ; y axis
mov cl, 27  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 27  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 9  ; y axis
mov cl, 27  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 27  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 8  ; y axis
mov cl, 28  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 28  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 8  ; y axis
mov cl, 29  ; x axis     
mov dh, 9  ; long vertically     
mov dl, 29  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 13  ; y axis
mov cl, 25  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 25  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 8  ; y axis
mov cl, 24  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 24  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 6  ; y axis
mov cl, 23  ; x axis     
mov dh, 8  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 14  ; y axis
mov cl, 23  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 12  ; y axis
mov cl, 22  ; x axis     
mov dh, 16  ; long vertically     
mov dl, 22  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 9  ; y axis
mov cl, 20  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 20  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 8  ; y axis
mov cl, 19  ; x axis     
mov dh, 9  ; long vertically     
mov dl, 19  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 8  ; y axis
mov cl, 18  ; x axis     
mov dh, 8  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 11  ; y axis
mov cl, 21  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 21  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 21  ; y axis
mov cl, 21  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 21  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 15  ; y axis
mov cl, 20  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 20  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 14  ; y axis
mov cl, 19  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 19  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 13  ; y axis
mov cl, 18  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 18  ; y axis
mov cl, 18  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 12  ; y axis
mov cl, 17  ; x axis     
mov dh, 13  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 19  ; y axis
mov cl, 17  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 11  ; y axis
mov cl, 16  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 16  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20  ; y axis
mov cl, 16  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 16  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 44h    
mov ch, 11  ; y axis
mov cl, 15  ; x axis     
mov dh, 11  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 16  ; y axis
mov cl, 18  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 14  ; y axis
mov cl, 17  ; x axis     
mov dh, 15  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 13  ; y axis
mov cl, 16  ; x axis     
mov dh, 14  ; long vertically     
mov dl, 16  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 12  ; y axis
mov cl, 15  ; x axis     
mov dh, 13  ; long vertically     
mov dl, 15  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 12  ; y axis
mov cl, 20  ; x axis     
mov dh, 14  ; long vertically     
mov dl, 20  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 10  ; y axis
mov cl, 19  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 19  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 9  ; y axis
mov cl, 18  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 9  ; y axis
mov cl, 23  ; x axis     
mov dh, 13  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 6  ; y axis
mov cl, 22  ; x axis     
mov dh, 8  ; long vertically     
mov dl, 22  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 11  ; y axis
mov cl, 25  ; x axis     
mov dh, 12  ; long vertically     
mov dl, 25  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 9   ; y axis
mov cl, 26  ; x axis     
mov dh, 10  ; long vertically     
mov dl, 26  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 8  ; y axis
mov cl, 27  ; x axis     
mov dh, 8  ; long vertically     
mov dl, 27  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 7  ; y axis
mov cl, 28  ; x axis     
mov dh, 7  ; long vertically     
mov dl, 28  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 21  ; y axis
mov cl, 17  ; x axis     
mov dh, 22  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 22  ; y axis
mov cl, 18  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00h    
mov ch, 24  ; y axis
mov cl, 19  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 19  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 20  ; y axis
mov cl, 17  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 23  ; y axis
mov cl, 17  ; x axis     
mov dh, 23  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 24  ; y axis
mov cl, 17  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 17  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 60h    
mov ch, 24  ; y axis
mov cl, 18  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 18  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 18  ; y axis
mov cl, 21  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 21  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 20  ; y axis
mov cl, 22  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 22  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 17  ; y axis
mov cl, 22  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 22  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 17  ; y axis
mov cl, 23  ; x axis     
mov dh, 17  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 21  ; y axis
mov cl, 23  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 20  ; y axis
mov cl, 24  ; x axis     
mov dh, 21  ; long vertically     
mov dl, 24  ; long horizontally     
int 10h 

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 17  ; y axis
mov cl, 24  ; x axis     
mov dh, 18  ; long vertically     
mov dl, 24  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00EEh    
mov ch, 18  ; y axis
mov cl, 25  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 25  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00FFh    
mov ch, 18  ; y axis
mov cl, 23  ; x axis     
mov dh, 20  ; long vertically     
mov dl, 23  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00FFh    
mov ch, 19  ; y axis
mov cl, 22  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 22  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00FFh    
mov ch, 19  ; y axis
mov cl, 24  ; x axis     
mov dh, 19  ; long vertically     
mov dl, 24  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 19  ; y axis
mov cl, 56  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 56  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 20  ; y axis
mov cl, 57  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 57  ; long horizontally     
int 10h  

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 21  ; y axis
mov cl, 58  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 58  ; long horizontally     
int 10h

mov ah, 07h ; COLOR    
mov bh, 00CCh    
mov ch, 22  ; y axis
mov cl, 59  ; x axis     
mov dh, 24  ; long vertically     
mov dl, 59  ; long horizontally     
int 10h
 


 


mov ah, 4ch
int 21h        

end start