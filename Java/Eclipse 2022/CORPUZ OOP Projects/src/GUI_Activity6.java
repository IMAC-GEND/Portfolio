import java.awt.*; // for dimension
import javax.swing.*; // for GUI components
public class GUI_Activity6
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); // creation of frame
		
		frame.setLayout(new FlowLayout()); // layout manager (flow chart)
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate the GUI after close
		frame.setLocation(10,50); // set initial location
		frame.setSize(300,1500); // set horizontal, vertical length
		frame.setTitle("Frame Name"); // the name of the frame
		
		JCheckBox checkbox = new JCheckBox("Money"); // creation of check box
		frame.add(checkbox); // put the check box in the frame
		
		JRadioButton radiobutton = new JRadioButton("Sun"); // creation of radio button
		frame.add(radiobutton); // put the radio button in the frame
		
		List fruitlist = new List(4,true); // creation of list with 4 possible option
		fruitlist.add("Apple");
		fruitlist.add("Mango");
		fruitlist.add("Grapes");
		fruitlist.add("Starwberry");
		frame.add(fruitlist); // put list in the frame
		
		Choice fruitchoice = new Choice(); // creation of drop down list
		fruitchoice.add("Apple");
		fruitchoice.add("Mango");
		fruitchoice.add("Grapes");
		fruitchoice.add("Starwberry");
		frame.add(fruitchoice); // add the drop down list in the frame
		
		JButton button1 = new JButton("Button1"); // creation of button
		button1.setBackground(Color.YELLOW); // set color
		frame.add(button1); // add  button to the frame
		
		JButton button2 = new JButton("Button2");
		button2.setBackground(Color.GREEN);
		frame.add(button2);
		
		JLabel label = new JLabel("User Name: "); // creation of label
		frame.add(label); // add label to the frame
		
		JTextField field = new JTextField(10); // creation of text field with size 10
		frame.add(field); // add text field to the frame
		
		Label labelp = new Label("Password: "); // creation of label
		frame.add(labelp); //  add label to the frame
		
		TextField passwordfield = new TextField(10);
		passwordfield.setEchoChar('*');
		frame.add(passwordfield);
		
		JTextArea textarea = new JTextArea(5,10); // creation of text area and a dimension of 5 and 10
		frame.add(textarea);
		frame.add(new JScrollPane(textarea));
		textarea.setFont(new Font("Calibri", Font.BOLD, 14));
		
		frame.pack();
		frame.setVisible(true);
	}
}