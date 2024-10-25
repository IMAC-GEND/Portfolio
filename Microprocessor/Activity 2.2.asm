.model small
.stack
.data   
        var1  DB '                        %       %              ',13,10,'$'
        var2  DB '                         \     /               ',13,10,'$'
        var3  DB '                          \   /                ',13,10,'$'
        var4  DB '              .____________\_/________________.',13,10,'$' 
        var5  DB '              |                        |......|',13,10,'$'
        var6  DB '              |    LIST OF TV SHOW:    |......|',13,10,'$'      
        var7  DB '              |                        |.%@@%.|',13,10,'$'
        var8  DB '              |        Avengers        |.@@@@.|',13,10,'$'
        var9  DB '              |      Harry Potter      |.%@@%.|',13,10,'$'
        var10 DB '              |       The Flash        |......|',13,10,'$'
        var11 DB '              |        Lucifer         |......|',13,10,'$'
        var12 DB '              |         Arrow          |.%@@%.|',13,10,'$'
        var13 DB '              |        The 100         |.@@@@.|',13,10,'$'
        var14 DB '              |       Wednesday        |.%@@%.|',13,10,'$'
        var15 DB '              |     Larva Island       |......|',13,10,'$'
        var16 DB '              |                        |......|',13,10,'$'
        var17 DB '              |________________________|______|',13,10,'$'
        var18 DB '              |*******************************|',13,10,'$'                               
        var19 DB '              |*******************************|',13,10,'$'
        var21 DB '                         //       \\           ',13,10,'$'
        var22 DB '                       _//         \\_         ',13,10,'$'
        
.code
start:
        mov ax,@data
        mov ds,ax
        
        mov ah,09h
        mov dx,offset var1
        int 21h 
        
        mov ah,09h
        mov dx,offset var2
        int 21h
        
        mov ah,09h
        mov dx,offset var3
        int 21h
        
        mov ah,09h
        mov dx,offset var4
        int 21h
        
        mov ah,09h
        mov dx,offset var5
        int 21h          
        
        mov ah,09h
        mov dx,offset var6
        int 21h
        
        mov ah,09h
        mov dx,offset var7
        int 21h
        
        mov ah,09h
        mov dx,offset var8
        int 21h
        
        mov ah,09h
        mov dx,offset var9
        int 21h
        
        mov ah,09h
        mov dx,offset var10
        int 21h
        
        mov ah,09h
        mov dx,offset var11
        int 21h
        
        mov ah,09h
        mov dx,offset var12
        int 21h
        
        mov ah,09h
        mov dx,offset var13
        int 21h
        
        mov ah,09h
        mov dx,offset var14
        int 21h
        
        mov ah,09h
        mov dx,offset var15
        int 21h
        
        
        mov ah,09h
        mov dx,offset var16
        int 21h
        
        mov ah,09h
        mov dx,offset var17
        int 21h
        
        mov ah,09h
        mov dx,offset var18
        int 21h
        
        mov ah,09h
        mov dx,offset var19
        int 21h
        
        mov ah,09h
        mov dx,offset var21
        int 21h
        
        mov ah,09h
        mov dx,offset var22
        int 21h
        
        mov ah,4ch
        int 21h
        
end