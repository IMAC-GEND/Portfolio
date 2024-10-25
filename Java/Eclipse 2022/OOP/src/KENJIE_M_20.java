import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;

public class KENJIE_M_20 {

	public static void main(String[] args) {
		// Initializing the Frame for the program
		JFrame frame = new JFrame("Font Test");
		frame.setSize(500, 350);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		// Adding East Panels for Font Size buttons
				JPanel EastPanel = new JPanel();
				frame.getContentPane().add(EastPanel, BorderLayout.EAST);
				EastPanel.setLayout(new GridLayout(1, 4, 0, 0));
				
				JButton btnNewButton_4 = new JButton("12");
				btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
				EastPanel.add(btnNewButton_4);
				
				JButton btnNewButton_5 = new JButton("18");
				btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
				EastPanel.add(btnNewButton_5);
				
				JButton btnNewButton_6 = new JButton("24");
				btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
				EastPanel.add(btnNewButton_6);
				
				JButton btnNewButton_7 = new JButton("36");
				btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
				EastPanel.add(btnNewButton_7);
		
		// Adding West Panels for Font Color buttons
		JPanel WestPanel = new JPanel();
		frame.getContentPane().add(WestPanel, BorderLayout.WEST);
		WestPanel.setLayout(new GridLayout(1, 4, 0, 0));
		
		JButton Red = new JButton("RED");
		Red.setForeground(new Color(255, 0, 0));
		Red.setFont(new Font("Tahoma", Font.PLAIN, 10));
		WestPanel.add(Red);
		
		JButton Green = new JButton("GREEN");
		Green.setForeground(new Color(0, 128, 64));
		Green.setFont(new Font("Tahoma", Font.PLAIN, 10));
		WestPanel.add(Green);
		
		JButton Blue = new JButton("BLUE");
		Blue.setForeground(new Color(0, 128, 255));
		Blue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		WestPanel.add(Blue);
		
		JButton Yellow = new JButton("YELLOW");
		Yellow.setForeground(new Color(255, 255, 0));
		Yellow.setFont(new Font("Tahoma", Font.PLAIN, 10));
		WestPanel.add(Yellow);
		
		
		
		// Adding South Panels for Font Style Buttons
		JPanel SouthPanel = new JPanel();
		frame.getContentPane().add(SouthPanel, BorderLayout.SOUTH);
		SouthPanel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JButton btnNewButton_8 = new JButton("Calibri");
		btnNewButton_8.setFont(new Font("Calibri", Font.PLAIN, 11));
		SouthPanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Arial");
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 11));
		SouthPanel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Times New Roman");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		SouthPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Lucida Console");
		btnNewButton_11.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		SouthPanel.add(btnNewButton_11);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("LABEL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
	
		
		
		frame.setVisible(true);
	}
}
