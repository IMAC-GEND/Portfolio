import java.util.Scanner;
public class CORPUZ2 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int var_input, row, Nprint;
        int output = 1;
		int Sum = 0, Product = 1;
		double Average = 0;


		System.out.print("Enter the number of rows of Floyd's triangle you want: ");
		var_input = input.nextInt();

		System.out.println("Floyd's Triangle: ");

		for (row = 0; row < var_input; row++) 
		{
			for (int space = var_input - row; space > 1; space--)
			{
				System.out.print("\t");
			}
			for (Nprint = 0; Nprint <= row; Nprint++)
			{
				System.out.print(output + "\t\t");
				Product *= output;
				output++;
				
				Sum += output;
				Average += output;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		output--;
		System.out.print("SUM: " + (Sum - output));
		System.out.println("\nAVERAGE: " + ((Average-output)/output));
		
		if (Product <= 2147483647&&Product >= 1)
		{
			System.out.print("PRODUCT: " + Product);
		}
		else
		{
			System.out.print("THE PRODUCT EXCEED TO THE MAX VALUE OF INTEGER!");
		}
		
		System.out.println();
		}
    
}
