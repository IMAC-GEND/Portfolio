import java.util.Scanner;
public class BasicArithmitic {
		Scanner input = new Scanner(System.in);
		
		int variable1, variable2;
		
		public int Addition(){
		
				int sum;
				
				System.out.print("Input First Number:");
				variable1 = input.nextInt();
				
				System.out.print("Input Second Number:");
				variable2 = input.nextInt();
				
				sum = variable1 + variable2;
				
				return sum;
		}
		
		public int Subtraction(){
		
			int difference;
			
			difference = variable1 - variable2;
			
			return difference;
		}
		
		public int Multiplication(){
		
			int product;
			
			product = variable1 * variable2;

			return product;
		}

		public int Division(){
		
			int quotient;
			
			quotient = variable1 / variable2;
			
			return quotient;
		}
		
		public static void main (String[]args){
			
			System.out.println("Arithmetic Operation");
			
			BasicArithmitic arithmetic = new BasicArithmitic();
			
			System.out.println("Sum:" + arithmetic.Addition());
			System.out.println("Difference:" + arithmetic.Subtraction());
			System.out.println("Product:" + arithmetic.Multiplication());
			System.out.println("Quotient:" + arithmetic.Division());
		}
}