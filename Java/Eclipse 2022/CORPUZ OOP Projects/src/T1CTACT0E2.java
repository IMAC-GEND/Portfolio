import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class T1CTACT0E2 extends JFrame {
	
	
	public T1CTACT0E2() {
		
		/*
		JFrame frame = new JFrame("t1c tac t0e"); //creation of frame with the name of "t1c tac t0e"
		frame.setContentPane(new JLabel(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\backround.png")));//image implementation for frame background
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate when closed
		frame.setLocation(550,250); //set initial location: x-axis, y-axis
		frame.setSize(400,600);//size or dimension: horizontal and vertical
		frame.setLayout(new FlowLayout());//layout manager used in whole frame, values in parenthesis: horizontal gap and vertical gap
		*/
		JFrame frame = new JFrame();
		
		frame.setTitle("T1C TAC T0E");
		//frame.setContentPane(new JLabel(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\backround.png")));
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel panel = new JPanel();
		//ImagePanel Panel = new ImagePanel(new ImageIcon("D:\\\\CPE Files\\\\BS COMPUTER ENGINEERING\\\\BSCpE - 3GF\\\\1st Semester\\\\CPE13 Object-Oriented Programming\\\\Project\\\\backround.png").getImage());
		panel.setBackground(Color.BLACK);
		panel.setLayout(new GridLayout(5, 1, 10, 20)); // added 10 pixel border between buttons
		panel.setBorder(BorderFactory.createEmptyBorder(50, 40, 50, 40));
		
		
		JButton instructionBtn = new JButton("Start");
		JButton startBtn = new JButton("Instruction");
		JButton creditBtn = new JButton("Credit");
		JButton moreBtn = new JButton("More");
		JButton exitBtn = new JButton("Exit");
		
		instructionBtn.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		startBtn.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		creditBtn.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		moreBtn.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		exitBtn.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		
		
		instructionBtn.setForeground(Color.BLACK);
		instructionBtn.setBackground(Color.YELLOW);
		startBtn.setForeground(Color.BLACK);
		startBtn.setBackground(Color.YELLOW);
		creditBtn.setForeground(Color.BLACK);
		creditBtn.setBackground(Color.YELLOW);
		moreBtn.setForeground(Color.BLACK);
		moreBtn.setBackground(Color.YELLOW);
		exitBtn.setForeground(Color.BLACK);
		exitBtn.setBackground(Color.YELLOW);
		
		instructionBtn.setBounds(100, 100, 100, 100);
		instructionBtn.setBorder(new RoundedBorder(70));
		startBtn.setBorder(new RoundedBorder(70));
		creditBtn.setBorder(new RoundedBorder(70));
		moreBtn.setBorder(new RoundedBorder(70));
		exitBtn.setBorder(new RoundedBorder(70));
		
		panel.add(instructionBtn);
		panel.add(startBtn);
		panel.add(creditBtn);
		panel.add(moreBtn);
		panel.add(exitBtn);
		
		/*
		frame.add(instructionBtn);
		frame.add(startBtn);
		frame.add(creditBtn);
		frame.add(moreBtn);
		frame.add(exitBtn);
		*/
		
	
		// Add panel to JFrame
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
	new T1CTACT0E2();
	}
	
	private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
}
