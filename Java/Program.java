import java.util.Scanner;

public class Program 
{
	public static void main( String[] args ) 
    	{
		int num, digit1, digit2, digit3; 
		Scanner reader = new Scanner(System.in);       
       	 	System.out.print("\nEnter a 3 digit whole number : ");
               	num = reader.nextInt();  
        		digit3 = (num % 10); 
               	num = num / 10;    
        		digit2 = (num % 10 ); 
               	num = num / 10;
        		digit1 = (num % 10);   
   		System.out.print("\n" + digit1 + " " + digit2 + " " + digit3 + "\n");	
    	}
}