import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calendar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					Calendar frame = new Calendar();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Calendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		contentPane = new JPanel();

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton.setBounds(23, 275, 51, 48);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel_1.setBounds(169, 29, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(241, 204, 128, 22);
		panel_1.add(textArea_1_2);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(241, 236, 128, 22);
		panel_1.add(textArea_1_3);
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(new Color(0, 204, 0));
		btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_2.setBounds(77, 275, 51, 48);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBackground(new Color(0, 204, 51));
		btnNewButton_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_3.setBounds(131, 275, 51, 48);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(0, 204, 102));
		btnNewButton_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_4.setBounds(184, 275, 51, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBackground(new Color(0, 204, 153));
		btnNewButton_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_5.setBounds(237, 275, 51, 48);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(new Color(0, 204, 204));
		btnNewButton_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_6.setBounds(290, 275, 51, 48);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(new Color(0, 204, 255));
		btnNewButton_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_7.setBounds(344, 275, 51, 48);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("14");
		btnNewButton_8.setBackground(new Color(0, 204, 255));
		btnNewButton_8.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8.setBounds(344, 326, 51, 48);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("13");
		btnNewButton_8_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(290, 326, 51, 48);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("12");
		btnNewButton_8_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_2.setBounds(237, 326, 51, 48);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("11");
		btnNewButton_8_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_3.setBounds(184, 326, 51, 48);
		contentPane.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("10");
		btnNewButton_8_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_4.setBounds(131, 326, 51, 48);
		contentPane.add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("9");
		btnNewButton_8_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_5.setBounds(77, 326, 51, 48);
		contentPane.add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("8");
		btnNewButton_8_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_6.setBounds(23, 326, 51, 48);
		contentPane.add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("21");
		btnNewButton_8_7.setBackground(new Color(0, 204, 255));
		btnNewButton_8_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7.setBounds(344, 377, 51, 48);
		contentPane.add(btnNewButton_8_7);
		
		JButton btnNewButton_8_7_1 = new JButton("20");
		btnNewButton_8_7_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_1.setBounds(290, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_1);
		
		JButton btnNewButton_8_7_2 = new JButton("19");
		btnNewButton_8_7_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_2.setBounds(237, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_2);
		
		JButton btnNewButton_8_7_3 = new JButton("18");
		btnNewButton_8_7_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_7_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_3.setBounds(184, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_3);
		
		JButton btnNewButton_8_7_4 = new JButton("17");
		btnNewButton_8_7_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_7_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_4.setBounds(131, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_4);
		
		JButton btnNewButton_8_7_5 = new JButton("16");
		btnNewButton_8_7_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_5.setBounds(77, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_5);
		
		JButton btnNewButton_8_7_6 = new JButton("15");
		btnNewButton_8_7_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_6.setBounds(23, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_6);
		
		JButton btnNewButton_8_7_7 = new JButton("28");
		btnNewButton_8_7_7.setBackground(new Color(0, 204, 255));
		btnNewButton_8_7_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7.setBounds(344, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7);
		
		JButton btnNewButton_8_7_7_1 = new JButton("27");
		btnNewButton_8_7_7_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_7_7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_1.setBounds(290, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_1);
		
		JButton btnNewButton_8_7_7_2 = new JButton("26");
		btnNewButton_8_7_7_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_7_7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_2.setBounds(237, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_2);
		
		JButton btnNewButton_8_7_7_3 = new JButton("25");
		btnNewButton_8_7_7_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_7_7_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_3.setBounds(184, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_3);
		
		JButton btnNewButton_8_7_7_4 = new JButton("24");
		btnNewButton_8_7_7_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_7_7_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_4.setBounds(131, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_4);
		
		JButton btnNewButton_8_7_7_5 = new JButton("23");
		btnNewButton_8_7_7_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_7_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_5.setBounds(77, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_5);
		
		JButton btnNewButton_8_7_7_6 = new JButton("22");
		btnNewButton_8_7_7_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_7_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6.setBounds(23, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6);
		
		JButton btnNewButton_8_7_7_6_1 = new JButton("29");
		btnNewButton_8_7_7_6_1.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_7_6_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6_1.setBounds(23, 481, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6_1);
		
		JButton btnNewButton_8_7_7_6_1_1 = new JButton("30");
		btnNewButton_8_7_7_6_1_1.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_7_6_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6_1_1.setBounds(77, 481, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6_1_1);
		
		JButton btnNewButton_8_7_7_6_1_2 = new JButton("31");
		btnNewButton_8_7_7_6_1_2.setBackground(new Color(0, 204, 51));
		btnNewButton_8_7_7_6_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6_1_2.setBounds(131, 481, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6_1_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 182, 417, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("BACK");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz create = new ScreenQuiz();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnNewButton_11.setBackground(new Color(255, 255, 0));
		btnNewButton_11.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		btnNewButton_11.setBounds(311, 373, 85, 26);
		panel.add(btnNewButton_11);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(-15, 0, 432, 425);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(51, 204, 102));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (397 × 413 px) (255 × 204 px) (432 × 425 px).png"));
		
		JButton btnNewButton_9 = new JButton("SUN");
		btnNewButton_9.setBackground(new Color(255, 255, 0));
		btnNewButton_9.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9.setBounds(23, 62, 51, 20);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("MON");
		btnNewButton_9_1.setBackground(new Color(204, 255, 0));
		btnNewButton_9_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_1.setBounds(76, 62, 51, 20);
		panel.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("TUE");
		btnNewButton_9_2.setBackground(new Color(204, 255, 51));
		btnNewButton_9_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_2.setBounds(131, 62, 51, 20);
		panel.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_2_1 = new JButton("WED");
		btnNewButton_9_2_1.setBackground(new Color(204, 255, 102));
		btnNewButton_9_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_2_1.setBounds(185, 62, 51, 20);
		panel.add(btnNewButton_9_2_1);
		
		JButton btnNewButton_9_2_2 = new JButton("THU");
		btnNewButton_9_2_2.setBackground(new Color(204, 255, 153));
		btnNewButton_9_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_2_2.setBounds(238, 62, 51, 20);
		panel.add(btnNewButton_9_2_2);
		
		JButton btnNewButton_9_2_2_1 = new JButton("FRI");
		btnNewButton_9_2_2_1.setBackground(new Color(204, 255, 204));
		btnNewButton_9_2_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_2_2_1.setBounds(292, 62, 51, 20);
		panel.add(btnNewButton_9_2_2_1);
		
		JButton btnNewButton_9_2_2_2 = new JButton("SAT");
		btnNewButton_9_2_2_2.setBackground(new Color(204, 255, 255));
		btnNewButton_9_2_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 7));
		btnNewButton_9_2_2_2.setBounds(345, 62, 51, 20);
		panel.add(btnNewButton_9_2_2_2);
		
		JButton btnNewButton_10 = new JButton("QUIZ CALENDAR");
		btnNewButton_10.setBackground(new Color(51, 204, 102));
		btnNewButton_10.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		btnNewButton_10.setBounds(26, 20, 370, 32);
		panel.add(btnNewButton_10);
	}
}
