import java.util.Scanner;
public class Corpuz_PE_20 {
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		char c;
        char alph1;
        
        System.out.print("Input a letter: ");
        char letter = input.next().charAt(0);
		
       System.out.print("\n\n");
        
			for (alph1 = 'A'; alph1 <= letter; alph1++)
			{
				if (alph1 <= 'E'||alph1 == 'e') 
				{
					System.out.print(alph1 + "\t");
				}
				if (alph1 == 'F')
				{
					System.out.print("\n\n");
				}
				if (alph1 > 'E'||alph1 == 'e')
				{
					System.out.print(alph1 + "\t");
				}
				if (alph1 == 'J')
				{
					System.out.print("\n\n");
				}
				if (alph1 == 'O')
				{
					System.out.print("\n\n");
				}
				if (alph1 == 'T')
				{
					System.out.print("\n\n");
				}
				if (alph1 == 'Y')
				{
					System.out.print("\n\n");
				}
				
			}
			
		System.out.print("\n\n\n\nOutput Printed!!");
	}
}
