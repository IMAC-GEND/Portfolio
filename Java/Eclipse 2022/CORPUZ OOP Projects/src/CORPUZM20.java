import java.awt.*;
import javax.swing.*;
public class CORPUZM20 {

	public static void main (String[] args)
	{
		JFrame frame = new JFrame("CONVERTING NUMBER SYSTEM");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,280);
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
		
		
		JPanel centerPanel2 = new JPanel(new GridLayout(4,4,6,7));
		centerPanel2.setBorder(BorderFactory.createEmptyBorder(1,7,1,7));
		
		JButton zero = new JButton("0");
		zero.setBackground(Color.YELLOW);
		zero.setForeground(Color.BLACK);
		JButton one = new JButton("1");
		one.setBackground(Color.YELLOW);
		one.setForeground(Color.BLACK);
		JButton two = new JButton("2");
		two.setBackground(Color.YELLOW);
		two.setForeground(Color.BLACK);
		JButton three = new JButton("3");
		three.setBackground(Color.YELLOW);
		three.setForeground(Color.BLACK);
		JButton four = new JButton("4");
		four.setBackground(Color.YELLOW);
		four.setForeground(Color.BLACK);
		JButton five = new JButton("5");
		five.setBackground(Color.YELLOW);
		five.setForeground(Color.BLACK);
		JButton six = new JButton("6");
		six.setBackground(Color.YELLOW);
		six.setForeground(Color.BLACK);
		JButton seven = new JButton("7");
		seven.setBackground(Color.YELLOW);
		seven.setForeground(Color.BLACK);
		JButton eigth = new JButton("8");
		eigth.setBackground(Color.YELLOW);
		eigth.setForeground(Color.BLACK);
		JButton nine = new JButton("9");
		nine.setBackground(Color.YELLOW);
		nine.setForeground(Color.BLACK);
		JButton A = new JButton("A");
		A.setBackground(Color.YELLOW);
		A.setForeground(Color.BLACK);
		JButton B = new JButton("B");
		B.setBackground(Color.YELLOW);
		B.setForeground(Color.BLACK);
		JButton C = new JButton("C");
		C.setBackground(Color.YELLOW);
		C.setForeground(Color.BLACK);
		JButton D = new JButton("D");
		D.setBackground(Color.YELLOW);
		D.setForeground(Color.BLACK);
		JButton E = new JButton("E");
		E.setBackground(Color.YELLOW);
		E.setForeground(Color.BLACK);
		JButton F = new JButton("F");
		F.setBackground(Color.YELLOW);
		F.setForeground(Color.BLACK);
		
		frame.add(zero);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eigth);
		frame.add(nine);
		frame.add(A);
		frame.add(B);
		frame.add(C);
		frame.add(D);
		frame.add(E);
		frame.add(F);
		
		centerPanel2.add(zero);
		centerPanel2.add(one);
		centerPanel2.add(two);
		centerPanel2.add(three);
		centerPanel2.add(four);
		centerPanel2.add(five);
		centerPanel2.add(six);
		centerPanel2.add(seven);
		centerPanel2.add(eigth);
		centerPanel2.add(nine);
		centerPanel2.add(A);
		centerPanel2.add(B);
		centerPanel2.add(C);
		centerPanel2.add(D);
		centerPanel2.add(E);
		centerPanel2.add(F);
		
		JPanel centerPanel = new JPanel(new GridLayout(2,3,6,7));
		centerPanel.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
		
		
		JButton BO = new JButton("B to O");
		BO.setBackground(Color.BLACK);
		BO.setForeground(Color.YELLOW);
		JButton OB = new JButton("O to B");
		OB.setBackground(Color.BLACK);
		OB.setForeground(Color.YELLOW);
		JButton HB = new JButton("H to B");
		HB.setBackground(Color.BLACK);
		HB.setForeground(Color.YELLOW);
		JButton BH = new JButton("B to H");
		BH.setBackground(Color.BLACK);
		BH.setForeground(Color.YELLOW);
		JButton OH = new JButton("O to H");
		OH.setBackground(Color.BLACK);
		OH.setForeground(Color.YELLOW);
		JButton HC = new JButton("H to C");
		HC.setBackground(Color.BLACK);
		HC.setForeground(Color.YELLOW);
		
		frame.add(BO);
		frame.add(OB);
		frame.add(HB);
		frame.add(BH);
		frame.add(OH);
		frame.add(HC);
		
		centerPanel.add(BO);
		centerPanel.add(OB);
		centerPanel.add(HB);
		centerPanel.add(BH);
		centerPanel.add(OH);
		centerPanel.add(HC);
		
		
		frame.add(centerPanel2, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		frame. setResizable(false);
		frame.setLayout(null);
	}
}
