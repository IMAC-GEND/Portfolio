import javax.swing.*;
public class CORPUZ5 {
	
	public static void main (String[] args)
	{
		JOptionPane.showMessageDialog(null, "COMPUTING YOUR TWO INPUT NUMBERS\nPress OK to continue!");
		
		String first_num = JOptionPane.showInputDialog(null, "Enter fist number: ");
		String second_num = JOptionPane.showInputDialog(null, "Enter second number: ");
		String operation = JOptionPane.showInputDialog(null, "Enter the operation: \n+ ADDITION\n- SUBTRACTION\n* MULTIPLICATION\n/ DIVISION");
		
		float first_number = Float.parseFloat(first_num);
		float second_number = Float.parseFloat(second_num);
		
		switch (operation)
		{
		case "+":
			JOptionPane.showMessageDialog(null, "Sum: " + (first_number + second_number));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "Difference: " + (first_number - second_number));
			break;	
		case "*":
			JOptionPane.showMessageDialog(null, "Product: " + (first_number * second_number));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "Quotient: " + (first_number / second_number));
			break;
		default:
			JOptionPane.showMessageDialog(null, "UNKNOWN OPERATION!");
		}
	}
}
