import java.util.Scanner;
public class CORPUZ1 {
	
	public static void main (String args[]) {
		
		Scanner shape_input = new Scanner(System.in);
		//Scanner of which shape is to be identify
		System.out.print("IDENTIFY WETHER THE SHAPE IS A SQUARE OR A RECTANGLE\n1. SQUARE\n2. REACTANGLE\n");
		System.out.print("\nEnter the number of the shape: ");
		int shape = shape_input.nextInt();
		//Input shape
		
		switch(shape) {
		//switch statement depending to what shape is selected
		case(1):
			System.out.print("\nGive the size of the square\n");
			
		    Scanner square_input = new Scanner(System.in);
			System.out.print("Enter the unit: ");
		    String squareunit = square_input.nextLine();
		    //I add a string input for the unit
		    
			squareshape(squareunit);
			//method to assign the size of the side of the square
		break;
		case(2):
			System.out.print("\nGive the length and the width of a rectangle\n");
		
		    Scanner rectangle_input = new Scanner(System.in);
			System.out.print("Enter the unit: ");
			String rectangleunit = rectangle_input.nextLine();
			//I added a string input for the unit
			
			rectangleshape(rectangleunit);
			//method to assign the length and the width of a rectangle
		break;
		default:
			System.out.print("\nWRONG INPUTED NUMBER!");
			//A default statement if the user did not choose 1 or 2 base on the given 2 cases
		}
		System.out.print("\n\n\nPROGRAM FINISHED");
		
	}

	//I used the data type double for the sizes with decimal points
	private static void rectangleshape(String rectangleunit ) {
		// TODO Auto-generated method stub
		//I used the declared string variable rectangleunit for the final result of the program
		Scanner size_input = new Scanner(System.in);
		
		System.out.print("\nLength: ");
		double length = size_input.nextDouble();
		//Input the length
        
        System.out.print("Width: ");
        double width = size_input.nextDouble();
        //Input the width
        
        //I added if statement to make sure that the possible length and width is different
        if (length!=width) {
        	System.out.print("\nShape: \"RECTANGLE with the length of " +length+ " " +rectangleunit+ " and the width of " +width+ " " +rectangleunit+ "\"");
        }else {
        	System.out.print("Your inputed data is not a rectangle!");
        	//Else statement if the inputed data for length and width is similar
		}
	}

	private static void squareshape(String squareunit) {
		// TODO Auto-generated method stub
		//I used the declared string variable squareunit for the final result of the program
		Scanner size_input = new Scanner(System.in);
		
		System.out.print("\nSide: ");
		double sides = size_input.nextDouble();
		
		//Since the square is only asking the side of it and it is equal sides, I just print the final result
		System.out.print("\nShape: \"SQUARE with the equal sides of " +sides+ " " +squareunit+ "\"");
	}
	
}
