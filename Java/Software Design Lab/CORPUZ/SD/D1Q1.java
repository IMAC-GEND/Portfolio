import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1Q1 extends JFrame {

	private int correctAnswers = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					D1Q1 question1Frame = new D1Q1();
					question1Frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 * @param question1Frame 
	 */
	public D1Q1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		contentPane.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		contentPane.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		contentPane.add(lblNewLabel_4_1);
		
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("PERCENTAGE:");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 146, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 97, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		contentPane.add(lblNewLabel);
	}
}
