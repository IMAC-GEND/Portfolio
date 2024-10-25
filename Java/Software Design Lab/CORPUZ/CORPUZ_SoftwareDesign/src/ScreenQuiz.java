import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScreenQuiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			ScreenQuiz frame = new ScreenQuiz();
			frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public ScreenQuiz() {
		setTitle("SCREEN QUIZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		
		// Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());

		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		

		setContentPane(contentPane);
		
		//Button to start the quiz it will call the StartButton class
		JButton btnNewButton = new JButton("START QUIZ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			StartButton start = new StartButton();
			setVisible(false);
			start.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		btnNewButton.setBackground(new Color(102, 255, 102));
		btnNewButton.setBounds(83, 404, 269, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		//This is an icon for terms and condition of the application 
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
		btnNewButton_1.setBounds(367, 29, 40, 35);
		contentPane.add(btnNewButton_1);
		
		//This is the header background image
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 153));
		panel_1.setBounds(83, 231, 269, 45);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("FREE BOOKS");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 26));
		contentPane.add(btnNewButton);
		
		//This is a button for creating a notes for quiz, it will call the Create class
		JButton btnCreateQuiz = new JButton("QUIZ BANK");
		btnCreateQuiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Create Create = new Create();
				setVisible(false);
				Create.setVisible(true);
			}
		});
		btnCreateQuiz.setBackground(new Color(102, 255, 102));
		btnCreateQuiz.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		btnCreateQuiz.setBounds(83, 467, 269, 52);
		contentPane.add(btnCreateQuiz);
		
		/*
		JButton btnCalendar = new JButton("CLOCK");
		btnCalendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SPINNER SPINNER = new SPINNER();
				setVisible(false);
				SPINNER.setVisible(true);
			}
		});
		btnCalendar.setBackground(new Color(102, 255, 102));
		btnCalendar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		btnCalendar.setBounds(83, 529, 269, 52);
		contentPane.add(btnCalendar);
		*/
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 254, 417, 140);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//This is an image button for for Science book
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SciBOOK calendar = new SciBOOK();
				setVisible(false);
				calendar.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(204, 255, 204));
		btnNewButton_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (85 × 79 px).png"));
		btnNewButton_2.setBounds(22, 36, 85, 79);
		panel.add(btnNewButton_2);
		
		//This is an image button for English book 
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EngBOOK calendar = new EngBOOK();
				setVisible(false);
				calendar.setVisible(true);
			}
		});
		btnNewButton_2_1.setBackground(new Color(204, 255, 204));
		btnNewButton_2_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\english.png"));
		btnNewButton_2_1.setBounds(118, 36, 85, 79);
		panel.add(btnNewButton_2_1);
		
		//This is an image button for Computer Technology button
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CompTechBOOK calendar = new CompTechBOOK();
				setVisible(false);
				calendar.setVisible(true);
			}
		});
		btnNewButton_2_2.setBackground(new Color(204, 255, 204));
		btnNewButton_2_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\computer.png"));
		btnNewButton_2_2.setBounds(213, 36, 85, 79);
		panel.add(btnNewButton_2_2);

		//This is an image button for Filipino book
		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FilBOOOK calendar = new FilBOOOK();
				setVisible(false);
				calendar.setVisible(true);
			}
		});
		btnNewButton_2_3.setBackground(new Color(204, 255, 204));
		btnNewButton_2_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\tagalog.png"));
		btnNewButton_2_3.setBounds(308, 36, 85, 79);
		panel.add(btnNewButton_2_3);
		
		//This is the insertion of the logo of the application given its position boundary
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		contentPane.add(lblNewLabel_3);
		
		//This is the overall background the main page or framez
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 432, 654);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\background.png"));
	}
}