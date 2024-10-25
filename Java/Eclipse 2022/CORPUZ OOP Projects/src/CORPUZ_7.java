import java.awt.*;
import javax.swing.*;
public class CORPUZ_7 {
	
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("CALCULATOR");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,254);
		frame.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new FlowLayout());
		
		frame.add(northPanel, BorderLayout.NORTH);
		
		JTextField input_equation = new JTextField(24);
		input_equation.setFont(new Font("Serif", Font.PLAIN, 19));
		input_equation.setHorizontalAlignment(JTextField.RIGHT);
		input_equation.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
		input_equation.setBackground(Color.LIGHT_GRAY);
		frame.add(input_equation);
		northPanel.add(input_equation);
		
		JPanel centerPanel2 = new JPanel(new GridLayout(1,3,6,7));
		centerPanel2.setBorder(BorderFactory.createEmptyBorder(1,7,1,7));
		
		JButton Backspace = new JButton("Backspace");
		Backspace.setForeground(Color.RED);
		JButton CE = new JButton("CE");
		CE.setForeground(Color.RED);
		JButton C = new JButton("C");
		C.setForeground(Color.RED);
		
		
		
		frame.add(Backspace);
		frame.add(CE);
		frame.add(C);
		
		centerPanel2.add(Backspace);
		centerPanel2.add(CE);
		centerPanel2.add(C);
		
		JPanel centerPanel = new JPanel(new GridLayout(4,6,6,7));
		centerPanel.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
		
		//uncomment this for shorter code then comment the long process
		/*String[] buttons =
			{
				"MC", "7", "8", "9", "/", "sqrt",
				"MR", "4", "5", "6", "*", "%",
				"MS", "1", "2", "3", "-", "1/x",
				"M+", "0", "+/-", ".", "+", "="
			};
		for (int i = 0; i < buttons.length; i++)
		{
			centerPanel.add(new JButton(buttons[i]));
		}*/
		
		//this long process indicate the specific text color of each button
		JButton MC = new JButton("MC");
		MC.setForeground(Color.RED);
		JButton seven = new JButton("7");
		seven.setForeground(Color.BLUE);
		JButton eight = new JButton("8");
		eight.setForeground(Color.BLUE);
		JButton nine = new JButton("9");
		nine.setForeground(Color.BLUE);
		JButton slash = new JButton("/");
		slash.setForeground(Color.RED);
		JButton sqrt = new JButton("sqrt");
		sqrt.setForeground(Color.BLUE);
		JButton MR = new JButton("MR");
		MR.setForeground(Color.RED);
		JButton four = new JButton("4");
		four.setForeground(Color.BLUE);
		JButton five = new JButton("5");
		five.setForeground(Color.BLUE);
		JButton six = new JButton("6");
		six.setForeground(Color.BLUE);
		JButton asterisk = new JButton("*");
		asterisk.setForeground(Color.RED);
		JButton percent = new JButton("%");
		percent.setForeground(Color.BLUE);
		JButton MS = new JButton("MS");
		MS.setForeground(Color.RED);
		JButton one = new JButton("1");
		one.setForeground(Color.BLUE);
		JButton two = new JButton("2");
		two.setForeground(Color.BLUE);
		JButton three = new JButton("3");
		three.setForeground(Color.BLUE);
		JButton minus = new JButton("-");
		minus.setForeground(Color.RED);
		JButton oneoverx = new JButton("1/x");
		oneoverx.setForeground(Color.BLUE);
		JButton Mplus = new JButton("M+");
		Mplus.setForeground(Color.RED);
		JButton zero = new JButton("0");
		zero.setForeground(Color.BLUE);
		JButton plusorminus = new JButton("+/-");
		plusorminus.setForeground(Color.BLUE);
		JButton point = new JButton(".");
		point.setForeground(Color.RED);
		JButton plus = new JButton("+");
		plus.setForeground(Color.RED);
		JButton equal = new JButton("=");
		equal.setForeground(Color.RED);
		
		frame.add(MC);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(slash);
		frame.add(sqrt);
		frame.add(MR);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(asterisk);
		frame.add(percent);
		frame.add(MS);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(minus);
		frame.add(oneoverx);
		frame.add(Mplus);
		frame.add(zero);
		frame.add(plusorminus);
		frame.add(point);
		frame.add(plus);
		frame.add(equal);
		
		centerPanel.add(MC);
		centerPanel.add(seven);
		centerPanel.add(eight);
		centerPanel.add(nine);
		centerPanel.add(slash);
		centerPanel.add(sqrt);
		centerPanel.add(MR);
		centerPanel.add(four);
		centerPanel.add(five);
		centerPanel.add(six);
		centerPanel.add(asterisk);
		centerPanel.add(percent);
		centerPanel.add(MS);
		centerPanel.add(one);
		centerPanel.add(two);
		centerPanel.add(three);
		centerPanel.add(minus);
		centerPanel.add(oneoverx);
		centerPanel.add(Mplus);
		centerPanel.add(zero);
		centerPanel.add(plusorminus);
		centerPanel.add(point);
		centerPanel.add(plus);
		centerPanel.add(equal);
		
		frame.add(centerPanel2, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		//frame. setResizable(false);
		frame.setLayout(null);
	}
}