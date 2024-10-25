import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class SciBOOK extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	SciBOOK frame = new SciBOOK();
        frame.setVisible(true);

    }

    /**
     * Create the frame.
     */
    public SciBOOK() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 431, 654);
        
     // Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 255, 153));


        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        //The following JButton are the list of books about Science
        JButton btnLink_7 = new JButton("Periodic Table at a Glance");
        btnLink_7.setBackground(new Color(153, 204, 153));
        btnLink_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_7.setBounds(59, 524, 300, 29);
        btnLink_7.addActionListener(new ActionListener() {
            @Override
            //The link provide below once the user click the specific book button will go to google Chrome and will display the provided book
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=QCJJlVm7tGEC&dq=table+of+elements&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwju2JSx4cf-AhX2iVYBHXO9DXkQ6AF6BAgEEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Second book
        JButton btnLink_6 = new JButton("Solar System Evolution");
        btnLink_6.setBackground(new Color(153, 204, 153));
        btnLink_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_6.setBounds(59, 488, 300, 29);
        btnLink_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=R3QKq4K0jIEC&printsec=frontcover&dq=solar+system&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwjhzYLL4cf-AhVzklYBHa0QA7EQ6AF6BAgEEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Third book
        JButton btnLink_5 = new JButton("Atoms in Molecules");
        btnLink_5.setBackground(new Color(153, 204, 153));
        btnLink_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_5.setBounds(59, 451, 300, 29);
        btnLink_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=tyVpQgAACAAJ&dq=atoms&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwjzwMHc4cf-AhXksFYBHfUwCjsQ6AF6BAgIEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Fourth book
        JButton btnLink_4 = new JButton("Physics Essentials for Dummies");
        btnLink_4.setBackground(new Color(153, 204, 153));
        btnLink_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_4.setBounds(59, 414, 300, 29);
        btnLink_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=VjKRDwAAQBAJ&printsec=frontcover&dq=Physics&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwik29jw4cf-AhW8s1YBHamhCA8Q6AF6BAgHEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Fifth book
        JButton btnLink_3 = new JButton("Quantum Mechanics");
        btnLink_3.setBackground(new Color(153, 204, 153));
        btnLink_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_3.setBounds(59, 378, 300, 29);
        btnLink_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=ZzimY9yQSC0C&printsec=frontcover&dq=Quantum+mechanics&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwjG5uSE4sf-AhU1hVYBHeQOBg0Q6AF6BAgDEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Sixth book
        JButton btnLink_2 = new JButton("The Dwarf Planet Pluto");
        btnLink_2.setBackground(new Color(153, 204, 153));
        btnLink_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_2.setBounds(59, 343, 300, 29);
        btnLink_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=eOoC0NjWW6sC&printsec=frontcover&dq=planet&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwilieuT4sf-AhUkqFYBHQcNBfAQ6AF6BAgDEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        //Seventh book
        JButton btnLink_1 = new JButton("Molecular Structural Biology");
        btnLink_1.setBackground(new Color(153, 204, 153));
        btnLink_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_1.setBounds(59, 306, 300, 29);
        btnLink_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com.ph/books?id=ZBapDwAAQBAJ&printsec=frontcover&dq=Biology&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwjygNqu4sf-AhUemFYBHe64CPYQ6AF6BAgOEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
                // Add the button for the link
                JButton btnLink = new JButton("Current Organic Chemistry");
                btnLink.setBackground(new Color(153, 204, 153));
                btnLink.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
                btnLink.setBounds(59, 270, 300, 29);
                btnLink.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://books.google.com.ph/books?id=ue2nHwIQ1lEC&printsec=frontcover&dq=Chemistry&hl=en&sa=X&ved=2ahUKEwjKpcXL4sf-AhUxslYBHZYiDR8Q6AF6BAgHEAI"));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                
                JButton btnNewButton_2 = new JButton("BACK");
                btnNewButton_2.addMouseListener(new MouseAdapter() {
                	@Override
                	public void mouseClicked(MouseEvent e) {
                		ScreenQuiz create = new ScreenQuiz();
        				setVisible(false);
        				create.setVisible(true);
                	}
                });
                btnNewButton_2.setBackground(new Color(102, 204, 153));
                btnNewButton_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
                btnNewButton_2.setBounds(294, 578, 88, 29);
                contentPane.add(btnNewButton_2);
                contentPane.add(btnLink);
        
        JButton btnNewButton = new JButton("LIST OF BOOKS");
        btnNewButton.setBackground(new Color(102, 204, 204));
        btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
        btnNewButton.setBounds(33, 206, 349, 35);
        contentPane.add(btnNewButton);
        contentPane.add(btnLink_1);
        contentPane.add(btnLink_2);
        contentPane.add(btnLink_3);
        contentPane.add(btnLink_4);
        contentPane.add(btnLink_5);
        contentPane.add(btnLink_6);
        contentPane.add(btnLink_7);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 204, 204));
        panel.setBounds(33, 251, 349, 315);
        contentPane.add(panel);

        JButton btnNewButton_1 = new JButton("https://books.google.com.ph/books?id=rJBG8k8kfv8C&pg=PR14&dq=english+books&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwiupfSD3cf-AhVUed4KHaVIAq44ChDoAXoECAYQAg");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Terms terms = new Terms();
                setVisible(false);
                terms.setVisible(true);
            }
        });
        JButton btnNewButton1 = new JButton("");
        btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms terms = new Terms();
				setVisible(false);
				terms.setVisible(true);
			}
		});
        btnNewButton1.setBackground(new Color(153, 204, 153));
        btnNewButton1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (40 × 40 px) (40 × 40 px) (1).png"));
        btnNewButton1.setBounds(367, 29, 40, 35);
		contentPane.add(btnNewButton1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
        lblNewLabel_2.setBounds(120, 10, 193, 162);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
        lblNewLabel_3.setBounds(0, 0, 417, 186);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (417 × 433 px).png"));
        lblNewLabel.setBounds(0, 185, 417, 432);
        contentPane.add(lblNewLabel);
    }
}
