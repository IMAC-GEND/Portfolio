import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Terms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					Terms frame = new Terms();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Terms() {
		setTitle("TERMS AND CONDITION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		
		// Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
		
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 153));
		panel.setBounds(11, 228, 396, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//In this text area it includes all the text included in the terms and conditions it is separated by new line
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(153, 204, 204));
		textArea.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		textArea.setText("\r\n   Terms and Conditions:\r\n\r\n   Please read these Terms and Conditions carefully before using the \r\n   Screen Quiz  App (\"the \tApp\")  developed  by    Reimarc    Corpuz\r\n   (\"the Developer\").\r\n\r\n   By using    the App, you   agree to   be  bound by these Terms and \r\n   Conditions.   If you do not agree to these   Terms and   Conditions, \r\n   please do not use the App.\r\n\r\n   1. Purpose of the App\r\n\r\n   The Screen Quiz App  is  designed  for  educational purposes only \r\n   and  is  not   intended  to  be  used for  entertainment  or  gaming \r\n   purposes.  It  is  only  developed  to  fulfill  the  requirements  of a \r\n   software development project.\r\n\r\n   2. Age Limit\r\n\r\n   There is  no  age  limit  for  using  the  App.  However,  the  App is \r\n   designed  for  users  who  have  a  basic  understanding of English \r\n   language and possess general knowledge.\r\n\r\n   3. Intellectual Property\r\n\r\n   The  App  and  all content contained within the App, including but\r\n   not  limited  to text, graphics, images, logos, and software, are the \r\n   intellectual   property   of  the   Developer  and  are  protected  by \r\n   copyright and trademark laws.\r\n\r\n   4. Use of the App\r\n\r\n   The App is  provided  for  personal, non-commercial use only. You \r\n   may not modify, distribute, transmit, display,  perform,  reproduce, \r\n   publish, license, create  derivative  works  from, transfer or sell any \r\n   information,  software,   products  or  services  obtained  from  the \r\n   App.\r\n\r\n   5. Disclaimer of Warranties\r\n\r\n   The  Developer  makes  no  representations  or  warranties  of any \r\n   kind,  express  or  implied,  as to  the  operation of the App or the \r\n   information,  content,  materials,  or products  included within the \r\n   App. You expressly agree that your use of the  App  is at your sole \r\n   risk.\r\n\r\n   6. Limitation of Liability\r\n\r\n   The   Developer   shall   not   be   liable  for  any  direct,  indirect, \r\n   incidental,  special,  consequential,  or  punitive  damages arising \r\n   out of  or in  connection  with  the use or inability to use the App, \r\n   even if the Developer has been advised of the possibility of  such \r\n   damages.\r\n\r\n   7. Indemnification\r\n\r\n   You  agree  to  indemnify  an  hold the Developer harmless from \r\n   any   claim   or  demand,  including  reasonable  attorneys'  fees, \r\n   made  by  any third party due to or arising out of your use of the \r\n   App,  your  violation  of  these  Terms  and   Conditions,  or  your \r\n   violation of any rights of another.\r\n\r\n   8. Termination\r\n\r\n   The  Developer  reserves  the  right  to terminate your use of the \r\n   App   at   any   time,   with   or   without  notice,  for  any  reason \r\n   whatsoever.\r\n\r\n   9. Governing Law\r\n\r\n   These Terms and Conditions shall be governed by and construed \r\n   in  accordance  with the laws of [Country/State],  without  regard \r\n   to its conflict of law provisions.\r\n\r\n   10. Changes to Terms and Conditions\r\n\r\n   The  Developer  reserves  the  right  to  change  these  Terms and \r\n   Conditions  at  any time, without prior notice. Your continued use \r\n   of the App following any changes to these Terms and Conditions \r\n   constitutes your acceptance of those changes.\r\n\r\n   By  using  the  Screen  Quiz App,  you acknowledge that you have \r\n   read these Terms and Conditions and agree to be bound by them. \r\n   If you do not agree to these Terms and Conditions, please do not \r\n   use the App.\r\n\r\n");
		textArea.setBounds(0, 0, 447, 334);
		panel.add(textArea);
		
		//A HOME button to return in the home page
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScreenQuiz create = new ScreenQuiz();
				setVisible(false);
				create.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(102, 204, 102));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
		btnNewButton.setBounds(10, 572, 397, 35);
		
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 153));
		panel_1.setBounds(10, 193, 397, 36);
		contentPane.add(panel_1);
		
		//This is the label to know what the frame is for
		JLabel lblNewLabel = new JLabel("Terms and Condition");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(120, 10, 193, 162);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 417, 186);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-3, 10, 480, 654);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\background.png"));
	}
}
