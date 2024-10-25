import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateQuiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					CreateQuiz frame = new CreateQuiz();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public CreateQuiz() {
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
		
		//This is a label where the user can input the question at a time
		JLabel lblNewLabel = new JLabel("Your Questions:");
		lblNewLabel.setBounds(21, 196, 159, 31);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 153));
		panel.setBounds(10, 196, 171, 36);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel_1.setBounds(0, 182, 417, 435);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz calendar = new ScreenQuiz();
				setVisible(false);
				calendar.setVisible(true);
			}
		});
		btnBack.setBackground(new Color(255, 255, 51));
		btnBack.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
		btnBack.setBounds(23, 369, 116, 37);
		panel_1.add(btnBack);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setBackground(new Color(255, 255, 51));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
		btnNewButton.setBounds(277, 369, 116, 37);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("D.");
		lblNewLabel_4_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_2_1.setBounds(218, 228, 27, 30);
		panel_1.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("C.");
		lblNewLabel_4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_2.setBounds(218, 198, 27, 30);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("B.");
		lblNewLabel_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(45, 230, 27, 30);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("A.");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(45, 198, 27, 30);
		panel_1.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(71, 76, 312, 105);
		panel_1.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\pencil.png"));
		lblNewLabel_1.setBounds(0, 0, 417, 435);
		panel_1.add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(255, 255, 255));
		textArea_1.setBounds(71, 204, 128, 22);
		panel_1.add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(71, 236, 128, 22);
		panel_1.add(textArea_1_1);
		
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
	}
}
