import java.awt.*;
import javax.swing.*;

public class CORPUZ_M_20 
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Font Test");
		frame.setSize(new Dimension(650, 350));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		JPanel EASTpanel = new JPanel(new GridLayout(1,4,0,0));
		JPanel WESTpanel = new JPanel(new GridLayout(1,4,0,0));
		JPanel SOUTHpanel = new JPanel(new GridLayout(4,1,0,0));
		
		//Label for Font Test title
		JLabel LABEL = new JLabel("Font Test");
		LABEL.setLayout(new FlowLayout());
		
		frame.add(LABEL);
		panel.add(LABEL);
		
		//EAST button or font size.
		JButton EAST1 = new JButton("12");
		EAST1.setFont(new Font("", Font.PLAIN, 12));
		
		JButton EAST2 = new JButton("18");
		EAST2.setFont(new Font("", Font.PLAIN, 18));
		
		JButton EAST3 = new JButton("24");
		EAST3.setFont(new Font("", Font.PLAIN, 24));
		
		JButton EAST4 = new JButton("36");
		EAST4.setFont(new Font("", Font.PLAIN, 36));
		
		EASTpanel.add(EAST1);
		EASTpanel.add(EAST2);
		EASTpanel.add(EAST3);
		EASTpanel.add(EAST4);
		
		//WEST button for font color.
		JButton WEST1 = new JButton("RED");
		WEST1.setForeground(Color.RED);
		
		JButton WEST2 = new JButton("BLUE");
		WEST2.setForeground(Color.BLUE);
		
		JButton WEST3 = new JButton("GREEN");
		WEST3.setForeground(Color.GREEN);
		
		JButton WEST4 = new JButton("YELLOW");
		WEST4.setForeground(Color.YELLOW);
		
		WESTpanel.add(WEST1);
		WESTpanel.add(WEST2);
		WESTpanel.add(WEST3);
		WESTpanel.add(WEST4);
		
		//SOUTH button for font style.
		JButton SOUTH1 = new JButton("Arial");
		SOUTH1.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton SOUTH2 = new JButton("Lucida Console");
		SOUTH2.setFont(new Font("Lucida Console", Font.PLAIN, 16));

		JButton SOUTH3 = new JButton("Times New Roman");
		SOUTH3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton SOUTH4 = new JButton("Calibri");
		SOUTH4.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		SOUTHpanel.add(SOUTH1);
		SOUTHpanel.add(SOUTH2);
		SOUTHpanel.add(SOUTH3);
		SOUTHpanel.add(SOUTH4);
		
		
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(EASTpanel, BorderLayout.EAST);
		frame.add(WESTpanel, BorderLayout.WEST);
		frame.add(SOUTHpanel, BorderLayout.SOUTH);
	
		
		frame.setVisible(true);
	}
}
