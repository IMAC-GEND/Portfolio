import java.util.Scanner;
public class CORPUZ4 {
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("NAME:");
		String name = input.nextLine();
		
		System.out.print("Total number of character: " + name.replace(" ", "").length() + "\n\n");
		
		name = name.toLowerCase();
		vowels (name);
		
		/*
		String vowel = name.replaceAll("(?i)[^aeiou]", "");
		String consonant = name.replaceAll("(?i)[aeiou]", "");
		System.out.print(vowel + "\t\t\t" + consonant.replace(" ", ""));
		
		System.out.print("\nNumber of vowels: " + vowel.length() + "\tNumber of consonants: " + consonant.replace(" ", "").length());
		*/
		
	}

	private static void vowels(String name) {
		// TODO Auto-generated method stub
		int VCount = 0, CCount= 0;
		for (int i = 0; i <= name.replace(" ", "").length(); i++)
		{
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
			{
				System.out.print(name.charAt(i));
				VCount++;
			}
			else if (name.charAt(i) >= 'a' && name.charAt(i) <='z')
			{
				CCount++;
			}    
		}
		String consonant = name.replaceAll("(?i)[aeiou]", "");
		System.out.print("\t\t\t" + consonant.replace(" ", ""));
		
		System.out.print("\nNumber of vowels: " + VCount);    
        System.out.print("\tNumber of consonants: " + CCount);
	}
}
