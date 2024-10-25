import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					StartButton frame = new StartButton();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public StartButton() {
		setTitle("START QUIZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		
		// Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
		
		contentPane = new JPanel();
		

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 182, 417, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//This is a back button to back in the main menu
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz create = new ScreenQuiz();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
		btnBack.setBackground(new Color(255, 255, 51));
		btnBack.setBounds(277, 360, 116, 37);
		panel.add(btnBack);
		
		//Button to call in EnglishCAL class
		JButton btnNewButton = new JButton("ENGLISH");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EnglishCAL create = new EnglishCAL();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(102, 204, 0));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnNewButton.setBounds(100, 20, 220, 38);
		panel.add(btnNewButton);
		
		//This is the background image for this frame
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-15, 0, 432, 425);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(204, 255, 204));
		lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (397 × 413 px) (255 × 204 px) (432 × 425 px).png"));
		
		//A button to call the ScienceCAL class
		JButton btnScience = new JButton("SCIENCE");
		btnScience.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScienceCAL create = new ScienceCAL();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnScience.setBackground(new Color(102, 204, 51));
		btnScience.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnScience.setBounds(100, 68, 220, 38);
		panel.add(btnScience);
		
		//A button to call the TechCAL class
		JButton btnTechnology = new JButton("TECHNOLOGY");
		btnTechnology.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TechCAL create = new TechCAL();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnTechnology.setBackground(new Color(102, 204, 102));
		btnTechnology.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnTechnology.setBounds(100, 116, 220, 38);
		panel.add(btnTechnology);
		
		//A button to call the FilCAL class
		JButton btnFilipino = new JButton("FILIPINO");
		btnFilipino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FilCAL create = new FilCAL();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnFilipino.setBackground(new Color(102, 204, 153));
		btnFilipino.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnFilipino.setBounds(100, 164, 220, 38);
		panel.add(btnFilipino);
		
		//A button to call the CounCAL class
		JButton btnCountry = new JButton("SPORTS");
		btnCountry.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CounCAL create = new CounCAL();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnCountry.setBackground(new Color(102, 204, 204));
		btnCountry.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnCountry.setBounds(100, 212, 220, 38);
		panel.add(btnCountry);
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		//Another image icon/button for terms and condition of the application
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 432, 654);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\background.png"));
	}
}
