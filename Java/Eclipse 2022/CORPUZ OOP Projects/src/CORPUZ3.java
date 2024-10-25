import java.util.Scanner;
public class CORPUZ3 {
	
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = input.nextLine();
		
		int length1 = string1.length();
		System.out.print("\nThe length of the first string is: " + length1);
		int length2 = string2.length();
		System.out.print("\nThe length of the second string is: " + length2);
		
		String concatenate = string1.concat(" ");
		concatenate = concatenate.concat(string2);
		System.out.print("\n\nConcatenate strings: " + concatenate);
		
		System.out.print("\n\n" + string1 + " to: " + string1.toUpperCase());
		System.out.print("\n" + string2 + " to: " + string2.toUpperCase());
		
		System.out.print("\n\n" + string1 + " to: " + string1.toLowerCase());
		System.out.print("\n" + string2 + " to: " + string2.toLowerCase() + "\n\n");

		System.out.print(string2 + " to: ");
		char[] reverse = string2.toCharArray();
		for (int i = reverse.length - 1; i >= 0; i--)
		System.out.print(reverse[i]);
	}

}
