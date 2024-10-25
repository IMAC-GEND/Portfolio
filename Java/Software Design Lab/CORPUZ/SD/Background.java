import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.List;
import java.awt.TextArea;

public class Background extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Background frame = new Background();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Background() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 560, 397, 21);
		contentPane.add(progressBar);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setText("Terms and Conditions for Screen Quiz App\r\n\r\nPlease read these Terms and Conditions carefully before using the Screen Quiz App (\"the App\") developed by [Developer Name] (\"the Developer\").\r\n\r\nBy using the App, you agree to be bound by these Terms and Conditions. If you do not agree to these Terms and Conditions, please do not use the App.\r\n\r\nPurpose of the App\r\nThe Screen Quiz App is designed for educational purposes only and is not intended to be used for entertainment or gaming purposes. It is only developed to fulfill the requirements of a software development project.\r\n\r\nAge Limit\r\nThere is no age limit for using the App. However, the App is designed for users who have a basic understanding of English language and possess general knowledge.\r\n\r\nIntellectual Property\r\nThe App and all content contained within the App, including but not limited to text, graphics, images, logos, and software, are the intellectual property of the Developer and are protected by copyright and trademark laws.\r\n\r\nUse of the App\r\nThe App is provided for personal, non-commercial use only. You may not modify, distribute, transmit, display, perform, reproduce, publish, license, create derivative works from, transfer or sell any information, software, products or services obtained from the App.\r\n\r\nDisclaimer of Warranties\r\nThe Developer makes no representations or warranties of any kind, express or implied, as to the operation of the App or the information, content, materials, or products included within the App. You expressly agree that your use of the App is at your sole risk.\r\n\r\nLimitation of Liability\r\nThe Developer shall not be liable for any direct, indirect, incidental, special, consequential, or punitive damages arising out of or in connection with the use or inability to use the App, even if the Developer has been advised of the possibility of such damages.\r\n\r\nIndemnification\r\nYou agree to indemnify and hold the Developer harmless from any claim or demand, including reasonable attorneys' fees, made by any third party due to or arising out of your use of the App, your violation of these Terms and Conditions, or your violation of any rights of another.\r\n\r\nTermination\r\nThe Developer reserves the right to terminate your use of the App at any time, with or without notice, for any reason whatsoever.\r\n\r\nGoverning Law\r\nThese Terms and Conditions shall be governed by and construed in accordance with the laws of [Country/State], without regard to its conflict of law provisions.\r\n\r\nChanges to Terms and Conditions\r\nThe Developer reserves the right to change these Terms and Conditions at any time, without prior notice. Your continued use of the App following any changes to these Terms and Conditions constitutes your acceptance of those changes.\r\n\r\nBy using the Screen Quiz App, you acknowledge that you have read these Terms and Conditions and agree to be bound by them. If you do not agree to these Terms and Conditions, please do not use the App.");
		textArea.setBounds(10, 28, 397, 515);
		contentPane.add(textArea);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
