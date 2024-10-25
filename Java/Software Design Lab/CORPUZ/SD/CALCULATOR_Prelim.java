import java.awt.*;
import javax.swing.*;

public class CALCULATOR_Prelim {
	public static void main(String[] args)
	{
		//Set a frame
		JFrame myFRAME = new JFrame("User Interface");
		myFRAME.setSize(640,440);
		myFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set a text field
		JTextField INPUT = new JTextField(15);
		
		//Set a north panel
		JPanel northPANEL = new JPanel(new FlowLayout());
				
		//Set a west panel
		JPanel westPANEL = new JPanel(new GridLayout(5,3,5,5)); //(row,column,side margin,below margin)
		westPANEL.setBorder(BorderFactory.createEmptyBorder(10,7,10,7));
		
		//Set a west buttons
		JButton nine = new JButton("9");
		JButton eight = new JButton("8");
		JButton seven = new JButton("7");
		JButton six = new JButton("6");
		JButton five = new JButton("5");
		JButton four = new JButton("4");
		JButton three = new JButton("3");
		JButton two = new JButton("2");
		JButton one = new JButton("1");
		JButton zero = new JButton("0");
		JButton equal = new JButton("=");
		JButton caret = new JButton("^");
		JButton period = new JButton(".");
		
		
		//Adding the panels into the frame
		myFRAME.add(northPANEL);
		myFRAME.add(westPANEL);
		myFRAME.add(nine);
		myFRAME.add(eight);
		myFRAME.add(seven);
		myFRAME.add(six);
		myFRAME.add(five);
		myFRAME.add(four);
		myFRAME.add(three);
		myFRAME.add(two);
		myFRAME.add(one);
		myFRAME.add(zero);
		myFRAME.add(equal);
		myFRAME.add(caret);
		myFRAME.add(period);
		
		//Adding components to the panel
		northPANEL.add(INPUT);
		westPANEL.add(nine);
		westPANEL.add(eight);
		westPANEL.add(seven);
		westPANEL.add(six);
		westPANEL.add(five);
		westPANEL.add(four);
		westPANEL.add(three);
		westPANEL.add(two);
		westPANEL.add(one);
		westPANEL.add(zero);
		westPANEL.add(equal);
		westPANEL.add(caret);
		westPANEL.add(period);
		
		//Set the east panel
		JPanel eastPANEL = new JPanel(new GridLayout(5,1,5,5));
		eastPANEL.setBorder(BorderFactory.createEmptyBorder(10,7,10,7));
		
		//Set a east buttons
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");
		JButton percent = new JButton("%");
		
		//Adding the east button to the frame
		myFRAME.add(plus);
		myFRAME.add(minus);
		myFRAME.add(multiply);
		myFRAME.add(divide);
		myFRAME.add(percent);
		
		//Adding the east buttons to the east panel
		eastPANEL.add(plus);
		eastPANEL.add(minus);
		eastPANEL.add(multiply);
		eastPANEL.add(divide);
		eastPANEL.add(percent);
		
		//Set the location of the panel in the frame
		myFRAME.add(northPANEL, BorderLayout.NORTH);
		myFRAME.add(westPANEL, BorderLayout.WEST);
		myFRAME.add(eastPANEL, BorderLayout.EAST);
		
		//Set the frame to be visible
		myFRAME.setVisible(true);
		//Set the frame layout into null
		myFRAME.setLayout(null);
	}
}
