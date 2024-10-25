import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class homescreen {
	
	public static void main(String[] args) {//main method
		JFrame frame = new JFrame("t1c tac t0e"); //creation of frame with the name of "t1c tac t0e"
		frame.setContentPane(new JLabel(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\backround.png")));//image implementation for frame background
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate when closed
		frame.setLocation(550,250); //set initial location: x-axis, y-axis
		frame.setSize(400,600);//size or dimension: horizontal and vertical
		frame.setLayout(new FlowLayout());//layout manager used in whole frame, values in parenthesis: horizontal gap and vertical gap
		
		ImageIcon tttIcon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\icon2.png");//Image implementations for frame label
		frame.setIconImage(tttIcon.getImage());//set label icon
		
		//north panel, title
	    JPanel northPanel = new JPanel(new FlowLayout());//layout  manager for center panel: number of rows, number of columns, horizontal gap, vertical gap
	    //northPanel.setBackground(new Color(240,54,18));//set custom background color: red, green, blue
	    northPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//set border: top, left, bottom, right
	    northPanel.setOpaque(false);//set panel background as transparent
	    
	    ImageIcon bg = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\title.png");
	    JLabel forbg = new JLabel("");
	    forbg.setIcon(bg);
	    northPanel.add(forbg);
		
		//center panel, buttons
	    JPanel centerPanel = new JPanel(new GridLayout(5,1,0,25));//layout  manager for center panel: number of rows, number of columns, horizontal gap, vertical gap
	    centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 120, 55, 120));//set border: top, left, bottom, right
	    centerPanel.setOpaque(false);//set panel background as transparent

	    JButton startBTN = new JButton(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\S.png"));    
	    setJButtonFeatures(startBTN); //set features from the method created
	    centerPanel.add(startBTN); //adding of start button to the center panel
	    
	    JButton instructionsBTN = new JButton(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\I.png"));    
	    setJButtonFeatures(instructionsBTN); //set features from the method created
	    centerPanel.add(instructionsBTN); //adding of instructions button to the center panel

	    JButton creditsBTN = new JButton(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\C.png"));    
	    setJButtonFeatures(creditsBTN); //set features from the method created
	    centerPanel.add(creditsBTN); //adding of credits button to the center panel

	    JButton moreBTN = new JButton(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\M.png"));    
	    setJButtonFeatures(moreBTN); //set features from the method created
	    centerPanel.add(moreBTN); //adding of more button to the center panel
	    
	    JButton exitBTN = new JButton(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Project\\E.png"));    
	    setJButtonFeatures(exitBTN); //set features from the method created
	    centerPanel.add(exitBTN); //adding of exit button to the center panel

       	frame.add(northPanel, BorderLayout.NORTH);//adding of north panel to the frame
       	frame.add(centerPanel, BorderLayout.CENTER); //adding of center panel to the frame
		frame.setVisible(true); //set visibility
	}
	
	public static void setJButtonFeatures(JButton btn) {
		btn.setPreferredSize(new Dimension (165,25));  
	    btn.setContentAreaFilled(false);
	    btn.setBorderPainted(false);
	}
}