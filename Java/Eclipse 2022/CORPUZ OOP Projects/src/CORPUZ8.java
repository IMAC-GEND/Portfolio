import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CORPUZ8 implements ActionListener
{
	public static void main(String args[])
	{  
	       new CORPUZ8();  
	}
	
	private JFrame frame;
	private JTextField input_equation;
	private JButton zero,one,two,three,four,five,six,seven,eight,nine;
	private JButton asterisk,slash,minus,plus,CE,Backspace,percent,posneg,point,equal;
	double xd;
	double num1,num2,check;
	
	public CORPUZ8()
	{
		frame = new JFrame("CALCULATOR");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,254);
		frame.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new FlowLayout());
		
		frame.add(northPanel, BorderLayout.NORTH);
		
		input_equation = new JTextField(24);
		input_equation.setFont(new Font("Serif", Font.PLAIN, 19));
		input_equation.setHorizontalAlignment(JTextField.RIGHT);
		input_equation.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
		input_equation.setBackground(Color.LIGHT_GRAY);
		frame.add(input_equation);
		northPanel.add(input_equation);
		
		JPanel centerPanel2 = new JPanel(new GridLayout(1,3,6,7));
		centerPanel2.setBorder(BorderFactory.createEmptyBorder(1,7,1,7));
		
		 Backspace = new JButton("Backspace");
		Backspace.setForeground(Color.RED);
		Backspace.addActionListener(this);
		 CE = new JButton("CE");
		CE.setForeground(Color.RED);
		CE.addActionListener(this);
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
		
		JButton MC = new JButton("MC");
		MC.setForeground(Color.RED);
		
		 seven = new JButton("7");
		seven.setForeground(Color.BLUE);
		seven.addActionListener(this);
		
		 eight = new JButton("8");
		eight.setForeground(Color.BLUE);
		eight.addActionListener(this);
		
		 nine = new JButton("9");
		nine.setForeground(Color.BLUE);
		nine.addActionListener(this);
		
		 slash = new JButton("/");
		slash.setForeground(Color.RED);
		slash.addActionListener(this);
		
		JButton sqrt = new JButton("sqrt");
		sqrt.setForeground(Color.BLUE);
		
		JButton MR = new JButton("MR");
		MR.setForeground(Color.RED);
		
		 four = new JButton("4");
		four.setForeground(Color.BLUE);
		four.addActionListener(this);
		
		 five = new JButton("5");
		five.setForeground(Color.BLUE);
		five.addActionListener(this);
		
		 six = new JButton("6");
		six.setForeground(Color.BLUE);
		six.addActionListener(this);
		
		 asterisk = new JButton("*");
		asterisk.setForeground(Color.RED);
		asterisk.addActionListener(this);
		
		 percent = new JButton("%");
		percent.setForeground(Color.BLUE);
		percent.addActionListener(this);
		
		JButton MS = new JButton("MS");
		MS.setForeground(Color.RED);
		
		 one = new JButton("1");
		one.setForeground(Color.BLUE);
		one.addActionListener(this);
		
		 two = new JButton("2");
		two.setForeground(Color.BLUE);
		two.addActionListener(this);
		
		 three = new JButton("3");
		three.setForeground(Color.BLUE);
		three.addActionListener(this);
		
		 minus = new JButton("-");
		minus.setForeground(Color.RED);
		minus.addActionListener(this);
		
		JButton oneoverx = new JButton("1/x");
		oneoverx.setForeground(Color.BLUE);
		
		JButton Mplus = new JButton("M+");
		Mplus.setForeground(Color.RED);
		
		 zero = new JButton("0");
		zero.setForeground(Color.BLUE);
		zero.addActionListener(this);
		
			posneg= new JButton("+/-");
		posneg.setForeground(Color.BLUE);
		posneg.addActionListener(this);
		
		 point = new JButton(".");
		point.setForeground(Color.RED);
		point.addActionListener(this);
		
		 plus = new JButton("+");
		plus.setForeground(Color.RED);
		plus.addActionListener(this);
		
		 equal = new JButton("=");
		equal.setForeground(Color.RED);
		equal.addActionListener(this);
		
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
		frame.add(posneg);
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
		centerPanel.add(posneg);
		centerPanel.add(point);
		centerPanel.add(plus);
		centerPanel.add(equal);
		
		frame.add(centerPanel2, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		//frame. setResizable(false);
		frame.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String z,zt;
		
		if(e.getSource()==one){
			 zt=input_equation.getText();
			  z=zt+"1";
			  input_equation.setText(z);
			}
			if(e.getSource()==two){
			zt=input_equation.getText();
			z=zt+"2";
			input_equation.setText(z);
			}
			if(e.getSource()==three){
			  zt=input_equation.getText();
			  z=zt+"3";
			  input_equation.setText(z);
			}
			if(e.getSource()==four){
			  zt=input_equation.getText();
			  z=zt+"4";
			  input_equation.setText(z);
			}
			if(e.getSource()==five){
			  zt=input_equation.getText();
			  z=zt+"5";
			  input_equation.setText(z);
			}
			if(e.getSource()==six){
			  zt=input_equation.getText();
			  z=zt+"6";
			  input_equation.setText(z);
			}
			if(e.getSource()==seven){
			  zt=input_equation.getText();
			  z=zt+"7";
			  input_equation.setText(z);
			}
			if(e.getSource()==eight){
			  zt=input_equation.getText();
			  z=zt+"8";
			  input_equation.setText(z);
			}
			if(e.getSource()==nine){
			  zt=input_equation.getText();
			  z=zt+"9";
			  input_equation.setText(z);
			}
			if(e.getSource()==zero){
			  zt=input_equation.getText();
			  z=zt+"0";
			  input_equation.setText(z);
			}
			
			if(e.getSource()==point){  //ADD DECIMAL PTS
				  zt=input_equation.getText();
				  z=zt+".";
				  input_equation.setText(z);
				}
			if(e.getSource()==posneg){ //FOR NEGATIVE
				  zt=input_equation.getText();
				  z="-"+zt;
				  input_equation.setText(z);
				}
			if(e.getSource()==Backspace){  // FOR  BACKSPACE
				  zt=input_equation.getText();
				  try{
				    z=zt.substring(0, zt.length()-1);
				    }
				  catch(StringIndexOutOfBoundsException f)
				  {
				    	return;
				  }
				  input_equation.setText(z);
				}
			
            //AIRTHMETIC BUTTON
			if(e.getSource()==plus)
			{                     //FOR ADDITION
				try
				{
						num1=Double.parseDouble(input_equation.getText());
				}
				catch(NumberFormatException f)
				{
					input_equation.setText("Invalid Format");
				  return;
				}
				z="";
				input_equation.setText(z);
				check=1;
			}
			
			if(e.getSource()==minus)
			{                    //FOR SUBTRACTION
				try
				{
					num1=Double.parseDouble(input_equation.getText());
				}
				catch(NumberFormatException f)
				{
					input_equation.setText("Invalid Format");
				  return;
				}
				z="";
				input_equation.setText(z);
				check=2;
			}
			
			if(e.getSource()==asterisk)
			{                   //FOR MULTIPLICATION
				try
				{
					num1=Double.parseDouble(input_equation.getText());
				}
				catch(NumberFormatException f)
				{
					input_equation.setText("Invalid Format");
				  return;
				}
				z="";
				input_equation.setText(z);
				check=3;
			}
			
			if(e.getSource()==slash)
			{                   //FOR DIVISION
				try
				{
					num1=Double.parseDouble(input_equation.getText());
				}
				catch(NumberFormatException f)
				{
					input_equation.setText("Invalid Format");
				  return;
				}
				z="";
				input_equation.setText(z);
				check=4;
			}
			if(e.getSource()==percent)
			{                  //FOR MOD/REMAINDER
				try
				{
					num1=Double.parseDouble(input_equation.getText());
				}
				catch(NumberFormatException f)
				{
					input_equation.setText("Invalid Format");
				  return;
				}
				z="";
				input_equation.setText(z);
				check=5;
			}
			
			if(e.getSource()==equal){          
				try
				{
					num2=Double.parseDouble(input_equation.getText());
				}
				catch(Exception f)
				{
				    	input_equation.setText("ENTER NUMBER FIRST ");
				      return;
				}
				  if(check==1)
				    xd =num1+num2;
				  if(check==2)
				    xd =num1-num2;
				  if(check==3)
				    xd =num1*num2;
				  if(check==4)
				    xd =num1/num2; 
				  if(check==5)
				    xd =num1%num2;    
				  input_equation.setText(String.valueOf(xd));
				}
				                        //FOR CLEARING THE LABEL and Memory
				if(e.getSource()==CE){
				  num1=0;
				  num2=0;
				  check=0;
				  xd=0;
				   z="";
				   input_equation.setText(z);
				   } 

	}
}
