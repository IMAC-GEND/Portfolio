import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class CompTechBOOK extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	CompTechBOOK frame = new CompTechBOOK();
        frame.setVisible(true);

    }

    /**
     * Create the frame.
     */
    public CompTechBOOK() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 431, 654);
        
     // Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 255, 153));


        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        
      //The following command for buttons for the given list of books are the same with other class of subjects
        //It is linked to the google chrome to display the online books
        
        JButton btnLink_7 = new JButton("Java Programming for Engineers");
        btnLink_7.setBackground(new Color(153, 204, 153));
        btnLink_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_7.setBounds(59, 524, 300, 29);
        btnLink_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=0jnMBQAAQBAJ&printsec=frontcover&dq=Java+Programming&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwipvonA48f-AhWhqVYBHW3gChgQ6AF6BAgDEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_6 = new JButton("Practical C++ Programming");
        btnLink_6.setBackground(new Color(153, 204, 153));
        btnLink_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_6.setBounds(59, 488, 300, 29);
        btnLink_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=pXDzdJ_1E3oC&printsec=frontcover&dq=C%2B%2B&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwiu9o3c48f-AhUtt1YBHa0qD1wQ6AF6BAgMEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_5 = new JButton("Expert C Programming");
        btnLink_5.setBackground(new Color(153, 204, 153));
        btnLink_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_5.setBounds(59, 451, 300, 29);
        btnLink_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=4vm2xK3yn34C&dq=c+programming&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwiK34zv48f-AhXOsFYBHfSDDM8Q6AF6BAgHEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_4 = new JButton("Hardware Description Languages");
        btnLink_4.setBackground(new Color(153, 204, 153));
        btnLink_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_4.setBounds(59, 414, 300, 29);
        btnLink_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=D6keAQAAIAAJ&q=Hardware+Description+Language&dq=Hardware+Description+Language&hl=en&newbks=1&newbks_redir=1&printsec=frontcover&sa=X&ved=2ahUKEwi-oOKH5Mf-AhWssFYBHb_ED_IQ6AF6BAgKEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_3 = new JButton("Getting Started with Arduino");
        btnLink_3.setBackground(new Color(153, 204, 153));
        btnLink_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_3.setBounds(59, 378, 300, 29);
        btnLink_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com.ph/books?id=1kO1PzsOjbEC&printsec=frontcover&dq=arduino&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwiN6MqZ5Mf-AhUrpVYBHXBkA-kQ6AF6BAgNEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_2 = new JButton("Electronic Logic Circuits");
        btnLink_2.setBackground(new Color(153, 204, 153));
        btnLink_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_2.setBounds(59, 343, 300, 29);
        btnLink_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com.ph/books?id=KHY_b4OnuD0C&printsec=frontcover&dq=logic+circuits&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwiZ7u625Mf-AhVuslYBHWjhBRsQ6AF6BAgHEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnLink_1 = new JButton("MintDuino");
        btnLink_1.setBackground(new Color(153, 204, 153));
        btnLink_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        btnLink_1.setBounds(59, 306, 300, 29);
        btnLink_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=zgCpqJIFdCEC&printsec=frontcover&dq=breadboarding&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwj1iJfO5Mf-AhWfp1YBHe6kCUEQ6AF6BAgEEAI"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
                // Add the button for the link
                JButton btnLink = new JButton("Electronic Circuit Analysis");
                btnLink.setBackground(new Color(153, 204, 153));
                btnLink.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
                btnLink.setBounds(59, 270, 300, 29);
                btnLink.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://books.google.com/books?id=yooVw9u8GMwC&printsec=frontcover&dq=electronics+circuit&hl=en&newbks=1&newbks_redir=1&sa=X&ved=2ahUKEwjM34nv5Mf-AhXZxGEKHUw3AnIQ6AF6BAgBEAI"));
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
