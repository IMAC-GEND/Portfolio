import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TechCAL extends JFrame {

	private JPanel contentPane;
	private int correctAnswers = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TechCAL frame = new TechCAL();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public TechCAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		
		// Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
		
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
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D1Q1();
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton.setBounds(23, 275, 51, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D2Q1();
				setVisible(false);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 204, 0));
		btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_2.setBounds(77, 275, 51, 48);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D3Q1();
				setVisible(false);
			}
		});
		btnNewButton_3.setBackground(new Color(0, 204, 51));
		btnNewButton_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_3.setBounds(131, 275, 51, 48);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D4Q1();
				setVisible(false);
			}
		});
		btnNewButton_4.setBackground(new Color(0, 204, 102));
		btnNewButton_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_4.setBounds(184, 275, 51, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D5Q1();
				setVisible(false);
			}
		});
		btnNewButton_5.setBackground(new Color(0, 204, 153));
		btnNewButton_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_5.setBounds(237, 275, 51, 48);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D6Q1();
				setVisible(false);
			}
		});
		btnNewButton_6.setBackground(new Color(0, 204, 204));
		btnNewButton_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_6.setBounds(290, 275, 51, 48);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D7Q1();
				setVisible(false);
			}
		});
		btnNewButton_7.setBackground(new Color(0, 204, 255));
		btnNewButton_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_7.setBounds(344, 275, 51, 48);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("14");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D14Q1();
				setVisible(false);
			}
		});
		btnNewButton_8.setBackground(new Color(0, 204, 255));
		btnNewButton_8.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8.setBounds(344, 326, 51, 48);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("13");
		btnNewButton_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D13Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(290, 326, 51, 48);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("12");
		btnNewButton_8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D12Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_2.setBounds(237, 326, 51, 48);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("11");
		btnNewButton_8_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D11Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_3.setBounds(184, 326, 51, 48);
		contentPane.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("10");
		btnNewButton_8_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D10Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_4.setBounds(131, 326, 51, 48);
		contentPane.add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("9");
		btnNewButton_8_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D9Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_5.setBounds(77, 326, 51, 48);
		contentPane.add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("8");
		btnNewButton_8_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D8Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_6.setBounds(23, 326, 51, 48);
		contentPane.add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("21");
		btnNewButton_8_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D21Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7.setBackground(new Color(0, 204, 255));
		btnNewButton_8_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7.setBounds(344, 377, 51, 48);
		contentPane.add(btnNewButton_8_7);
		
		JButton btnNewButton_8_7_1 = new JButton("20");
		btnNewButton_8_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D20Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_1.setBounds(290, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_1);
		
		JButton btnNewButton_8_7_2 = new JButton("19");
		btnNewButton_8_7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D19Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_2.setBounds(237, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_2);
		
		JButton btnNewButton_8_7_3 = new JButton("18");
		btnNewButton_8_7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D18Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_7_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_3.setBounds(184, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_3);
		
		JButton btnNewButton_8_7_4 = new JButton("17");
		btnNewButton_8_7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D17Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_7_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_4.setBounds(131, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_4);
		
		JButton btnNewButton_8_7_5 = new JButton("16");
		btnNewButton_8_7_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D16Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_5.setBounds(77, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_5);
		
		JButton btnNewButton_8_7_6 = new JButton("15");
		btnNewButton_8_7_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D15Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_6.setBounds(23, 377, 51, 48);
		contentPane.add(btnNewButton_8_7_6);
		
		JButton btnNewButton_8_7_7 = new JButton("28");
		btnNewButton_8_7_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D28Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7.setBackground(new Color(0, 204, 255));
		btnNewButton_8_7_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7.setBounds(344, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7);
		
		JButton btnNewButton_8_7_7_1 = new JButton("27");
		btnNewButton_8_7_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D27Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_1.setBackground(new Color(0, 204, 204));
		btnNewButton_8_7_7_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_1.setBounds(290, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_1);
		
		JButton btnNewButton_8_7_7_2 = new JButton("26");
		btnNewButton_8_7_7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D26Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_2.setBackground(new Color(0, 204, 153));
		btnNewButton_8_7_7_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_2.setBounds(237, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_2);
		
		JButton btnNewButton_8_7_7_3 = new JButton("25");
		btnNewButton_8_7_7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D25Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_3.setBackground(new Color(0, 204, 102));
		btnNewButton_8_7_7_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_3.setBounds(184, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_3);
		
		JButton btnNewButton_8_7_7_4 = new JButton("24");
		btnNewButton_8_7_7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D24Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_4.setBackground(new Color(0, 204, 51));
		btnNewButton_8_7_7_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_4.setBounds(131, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_4);
		
		JButton btnNewButton_8_7_7_5 = new JButton("23");
		btnNewButton_8_7_7_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D23Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_5.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_7_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_5.setBounds(77, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_5);
		
		JButton btnNewButton_8_7_7_6 = new JButton("22");
		btnNewButton_8_7_7_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D22Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_6.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_7_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6.setBounds(23, 429, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6);
		
		JButton btnNewButton_8_7_7_6_1 = new JButton("29");
		btnNewButton_8_7_7_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D29Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_6_1.setBackground(new Color(0, 153, 0));
		btnNewButton_8_7_7_6_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6_1.setBounds(23, 481, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6_1);
		
		JButton btnNewButton_8_7_7_6_1_1 = new JButton("30");
		btnNewButton_8_7_7_6_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D30Q1();
				setVisible(false);
			}
		});
		btnNewButton_8_7_7_6_1_1.setBackground(new Color(0, 204, 0));
		btnNewButton_8_7_7_6_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
		btnNewButton_8_7_7_6_1_1.setBounds(77, 481, 51, 48);
		contentPane.add(btnNewButton_8_7_7_6_1_1);
		
		JButton btnNewButton_8_7_7_6_1_2 = new JButton("31");
		btnNewButton_8_7_7_6_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				D31Q1();
				setVisible(false);
			}
		});
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
				StartButton create = new StartButton();
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
	private void D1Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Big Four in the tech industry are Google (Alphabet),<br> Apple, Meta (Facebook), and Amazon. Which corporation<br> known for computers, software, and Bill Gates, is<br> sometimes added to form the Big Five (or GAMAF)?</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Windows");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Mac OS");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Microsoft");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Android");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
	            }
	            question1Frame.dispose();
	            D1Q2();
			}
		});*/
		@Override
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	correctAnswers = 0;
                correctAnswers++;
			}
            question1Frame.dispose();
            D1Q2();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D1Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>In the last year more than 250 billion PDFs were opened using products from what highly successful creative software company?</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Adobe");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("PDF");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Microsoft");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Canva");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D1Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option1.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		@Override
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option1.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D1Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D1Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Voice actor Elwood Edwards recorded the famous “You’ve got mail!” announcement (as well as “Welcome,” File’s done,” and others) on a tape deck in his home. You’d know his voice if you had which Internet service provider in the 1990s?</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("ABC");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("AOL");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("LOA");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("PDF");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D1Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		@Override
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D1Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D1Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>What term is used for the most basic level or core of an operating system, responsible for resource allocation, file management and security? In a different context, this word can also mean the seed and hard husk of a cereal.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Kernel");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("HDL");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Software");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Directory");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D1Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option1.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		@Override
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option1.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D1Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D1Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Andy Rubin is known as one of the three founders of what massively popular cell phone operating system?</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Apple");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Android");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Samsung");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Asus");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D1Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		@Override
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q2();
            D1showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D1showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}

	private void D2Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D2Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D2Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D2Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D2Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D2Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D2Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D2Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D2Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D2Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D2Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D2Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D2Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D2showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D2showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D3Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D3Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D3Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D3Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D3Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D3Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D3Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D3Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D3Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D3Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D3Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D3Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D3Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D3showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D3showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D4Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D4Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D4Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D4Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D4Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D4Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D4Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D4Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D4Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D4Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D4Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D4Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D4Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D4showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D4showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D5Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D5Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D5Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D5Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D5Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D5Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D5Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D5Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D5Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D5Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D5Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D5Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D5Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D5showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D5showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D6Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D6Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D6Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D6Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D6Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D6Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D6Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D6Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D6Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D6Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D6Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D6Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D6Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D6showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D6showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D7Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D7Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D7Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D7Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D7Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D7Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D7Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D7Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D7Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D7Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D7Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D7Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D7Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D7showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D7showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D8Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D8Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D8Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D8Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D8Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D8Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D8Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D8Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D8Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D8Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D8Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D8Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D8Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D8showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D8showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D9Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D9Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D9Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D9Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D9Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D9Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D9Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D9Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D9Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D9Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D9Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D9Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D9Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D9showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D9showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D10Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D10Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D10Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D10Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D10Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D10Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D10Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D10Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D10Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D10Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D10Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D10Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D10Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D10showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D10showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D11Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D11Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D11Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D11Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D11Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D11Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D11Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D11Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D11Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D11Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D11Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D11Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D11Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D11showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D11showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D12Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D12Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D12Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D12Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D12Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D12Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D12Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D12Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D12Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D12Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D12Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D12Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D12Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D12showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D12showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D13Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D13Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D13Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D13Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D13Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D13Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D13Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D13Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D13Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D13Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D13Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D13Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D13Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D13showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D13showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D14Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D14Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D14Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D14Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D14Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D14Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D14Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D14Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D14Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D14Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D14Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D14Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D14Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D14showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D14showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D15Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D15Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D15Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D15Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D15Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D15Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D15Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D15Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D15Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D15Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D15Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D15Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D15Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D15showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D15showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D16Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D16Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D16Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D16Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D16Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D16Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D16Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D16Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D16Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D16Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D16Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D16Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D16Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D16showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D16showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D17Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D17Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D17Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D17Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D17Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D17Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D17Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D17Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D17Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D17Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D17Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D17Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D17Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D17showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D17showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D18Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D18Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D18Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D18Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D18Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D18Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D18Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D18Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D18Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D18Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D18Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D18Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D18Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D18showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D18showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D19Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D19Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D19Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D19Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D19Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D19Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D19Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D19Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D19Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D19Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D19Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D19Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D19Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D19showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D19showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D20Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D20Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D20Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D20Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D20Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D20Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D20Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D20Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D20Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D20Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D20Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D20Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D20Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D20showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D20showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D21Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D21Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D21Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D21Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D21Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D21Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D21Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D21Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D21Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D21Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D21Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D21Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D21Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D21showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D21showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D22Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D22Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D22Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D22Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D22Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D22Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D22Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D22Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D22Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D22Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D22Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D22Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D22Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D22showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D22showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D23Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D23Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D23Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D23Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D23Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D23Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D23Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D23Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D23Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D23Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D23Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D23Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D23Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D23showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D23showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D24Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D24Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D24Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D24Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D24Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D24Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D24Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D24Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D24Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D24Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D24Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D24Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D24Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D24showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D24showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D25Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D25Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D25Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D25Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D25Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D25Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D25Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D25Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D25Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D25Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D25Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D25Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D25Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D25showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D25showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D26Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D26Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D26Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D26Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D26Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D26Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D26Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D26Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D26Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D26Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D26Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D26Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D26Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D26showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D26showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D27Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D27Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D27Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D27Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D27Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D27Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D27Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D27Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D27Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D27Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D27Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D27Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D27Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D27showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D27showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D28Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D28Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D28Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D28Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D28Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D28Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D28Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D28Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D28Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D28Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D28Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D28Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D28Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D28showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D28showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D29Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D29Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D29Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D29Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D29Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D29Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D29Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D29Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D29Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D29Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D29Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D29Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D29Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D29showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D29showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D30Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D30Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D30Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D30Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D30Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D30Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D30Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D30Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D30Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D30Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D30Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D30Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D30Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D30showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D30showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
	private void D31Q1() {
	    JFrame question1Frame = new JFrame("Question 1");
	    question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    question1Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question1Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>The Amazon in Brazil is _____ longest river in _____ South America.");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("the / -");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("- / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / the");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("a / the");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				question1Frame.dispose();
				TechCAL.setVisible(true);
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Group.getSelection() != null) {
				if (question1Option1.isSelected()) {
	            	correctAnswers = 0;
	                correctAnswers++;
				}
	            question1Frame.dispose();
	            D31Q2();
				} else {
	                // Prompt the user to select an answer before proceeding
	                JOptionPane.showMessageDialog(question1Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
	            }
			}
		});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question1Frame.setVisible(true);
	    
	}
	private void D31Q2() {
		JFrame question2Frame = new JFrame("Question 2");
		question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question2Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question2Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Last summer we went on _____ cruise in the Caribbean. Among _____ Islands we visited were Bermuda and the Bahamas.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("- / the");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("a / the");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("the / -");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("- / -");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question2Frame.dispose();
				D31Q1();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question2Frame.dispose();
	            D1Q3();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question2Frame.dispose();
            D31Q3();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question2Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question2Frame.setVisible(true);
	    
	}
	private void D31Q3() {
		JFrame question3Frame = new JFrame("Question 3");
		question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question3Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question3Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ teachers prefer a class that is fairly consistent in having pupils of the same level.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Each");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Every");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Neither");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("Most");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question3Frame.dispose();
				D31Q2();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option4.isSelected()) {
	                correctAnswers++;
	            }
				question3Frame.dispose();
	            D1Q4();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option4.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question3Frame.dispose();
            D31Q4();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question3Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question3Frame.setVisible(true);
	    
	}
	
	private void D31Q4() {
		JFrame question4Frame = new JFrame("Question 4");
		question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question4Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question4Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>_____ of what he said was very sensible.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("Many");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("Much");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("Few");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("A few");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question4Frame.dispose();
				D31Q3();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option2.isSelected()) {
	                correctAnswers++;
	            }
				question4Frame.dispose();
	            D1Q5();
				//showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option2.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question4Frame.dispose();
            D31Q5();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question4Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question4Frame.setVisible(true);
	    
	}
	
	private void D31Q5() {
		JFrame question5Frame = new JFrame("Question 5");
		question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		question5Frame.setBounds(100, 100, 431, 654);
	    
	    JPanel question1Panel = new JPanel();
	    question5Frame.setContentPane(question1Panel);
	    question1Panel.setLayout(null);
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		question1Panel.add(btnNewButton_1);
		
		JLabel question1Label = new JLabel("<html>Some people believe vaccines overload our immune system, making it less able to react to other diseases _____ meningitis or AIDS, which are now threatening our health.</html>");
		question1Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Label.setForeground(new Color(255, 255, 255));
		question1Label.setBounds (46, 228, 332, 107);
		question1Panel.add(question1Label);
		
		ButtonGroup question1Group = new ButtonGroup();
		JRadioButton question1Option1 = new JRadioButton("but for");
		question1Option1.setForeground(Color.WHITE);
		question1Option1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option1.setBackground(new Color(0, 0, 0, 0));
		question1Option1.setBounds(199, 395, 103, 21);
		question1Option1.setOpaque(false);
		question1Panel.add(question1Option1);
		question1Group.add(question1Option1);
		
		JRadioButton question1Option2 = new JRadioButton("lest");
		question1Option2.setForeground(Color.WHITE);
		question1Option2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option2.setBackground(new Color(0, 0, 0, 0));
		question1Option2.setBounds(199, 362, 103, 21);
		question1Option2.setOpaque(false);
		question1Panel.add(question1Option2);
		question1Group.add(question1Option2);
		
		JRadioButton question1Option3 = new JRadioButton("such as");
		question1Option3.setForeground(Color.WHITE);
		question1Option3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option3.setBackground(new Color(0, 0, 0, 0));
		question1Option3.setBounds(46, 394, 103, 21);
		question1Option3.setOpaque(false);
		question1Panel.add(question1Option3);
		question1Group.add(question1Option3);
		
		JRadioButton question1Option4 = new JRadioButton("and");
		question1Option4.setForeground(new Color(255, 255, 255));
		question1Option4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		question1Option4.setBackground(new Color(0, 0, 0, 0));
		question1Option4.setBounds(46, 361, 103, 21);
		question1Option4.setOpaque(false);
		question1Panel.add(question1Option4);
		question1Group.add(question1Option4);
		
		JButton question1btnBack = new JButton("BACK");
		question1btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question5Frame.dispose();
				D31Q4();
			}
		});
		question1btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1btnBack.setBackground(new Color(153, 204, 153));
		question1btnBack.setBounds(26, 564, 86, 29);
		question1Panel.add(question1btnBack);
		
		JButton question1NextButton = new JButton("NEXT");
		question1NextButton.setBackground(new Color(153, 204, 153));
		question1NextButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		question1NextButton.addMouseListener(new MouseAdapter() {
		/*	@Override
			public void mouseClicked(MouseEvent e) {
				if (question1Option3.isSelected()) {
	                correctAnswers++;
	            }
				question5Frame.dispose();
	            //D1Q5();
				D1showResults();
			}
		});*/
		public void mouseClicked(MouseEvent e) {
			if (question1Group.getSelection() != null) {
			if (question1Option3.isSelected()) {
            	//correctAnswers = 0;
                correctAnswers++;
			}
            question5Frame.dispose();
            //D1Q5();
            D31showResults();
			} else {
                // Prompt the user to select an answer before proceeding
                JOptionPane.showMessageDialog(question5Frame, "Please select an answer.", "Missing Answer", JOptionPane.WARNING_MESSAGE);
            }
		}
	});
		question1NextButton.setBounds(305, 564, 86, 29);
		question1Panel.add(question1NextButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		question1Panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		question1Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 435 px) (1).png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		question1Panel.add(lblNewLabel);
		
		question5Frame.setVisible(true);
	    
	}
	
	private void D31showResults() {
	    JFrame resultsFrame = new JFrame("Results");
	    resultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    resultsFrame.setBounds(100, 100, 431, 654);
	    
	    JPanel resultsPanel = new JPanel();
	    resultsFrame.setContentPane(resultsPanel);
	    resultsPanel.setLayout(null);
	    
	    
	    JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		resultsPanel.add(btnNewButton_1);
		
		double D1percent;
		D1percent = ((double) correctAnswers / 5) * 100;
		String formattedPercent = String.format("%.1f", D1percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel(formattedPercent + " %");
		lblNewLabel_4_1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_2.setBounds(256, 426, 83, 35);
		resultsPanel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("5");
		lblNewLabel_4_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1_1.setBounds(256, 376, 57, 35);
		resultsPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("" + correctAnswers);
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(256, 331, 57, 35);
		resultsPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>PERCENTAGE:\t</html>");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(28, 426, 305, 35);
		resultsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("<html>SCORE:<br><br>ITEMS:</html>");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(28, 331, 241, 85);
		resultsPanel.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				resultsFrame.dispose();
				ScreenQuiz.setVisible(true);
			}
		});
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnHome.setBounds(242, 487, 97, 35);
		resultsPanel.add(btnHome);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL TechCAL = new TechCAL ();
				setVisible(false);
				resultsFrame.dispose();
				TechCAL.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		btnNewButton.setBounds(28, 487, 97, 35);
		resultsPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		resultsPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		resultsPanel.add(lblNewLabel_3);		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Qresult.png"));
		lblNewLabel.setBounds(0, 182, 417, 435);
		resultsPanel.add(lblNewLabel);
	    
	    resultsFrame.setVisible(true);
	    
	}
}