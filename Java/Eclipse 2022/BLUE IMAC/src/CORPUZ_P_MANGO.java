import java.util.Scanner;

public class CORPUZ_P_MANGO {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows of the hour glass: ");
		int rows = input.nextInt();
	    
		/*for(int i=1; i<=rows; i++)
	     {
	         for(int space=1; space<=i-1; space++)
	         {
	             System.out.print("   ");
	         } 
	         for(int j=1; j<=rows-i+1; j++)
	         {
	             System.out.print("@     ");
	         } 
	         System.out.println("\n");
	     }
	     for(int i=rows-1; i>=1; i--)  
	     {
	         for(int space=1; space<=i-1; space++)
	         {
	             System.out.print("   ");
	         } 
	         for(int j=i; j<=rows; j++)
	         {
	             System.out.print("@     ");
	         } 
	         System.out.println("\n");
	     }*/
		
		
		for (int initial = 1; initial <= rows; initial++)
		{
			for (int space = 1; space <= initial - 1; space++)
			{
				System.out.print(" ");
			}
			for (int display = 1; display <= rows-initial+1; display++)
			{
				System.out.print("@ ");
			}
			System.out.println();
		}
	  }
}
