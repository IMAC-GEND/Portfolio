import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Create extends JFrame {

    private JPanel contentPane;
    private JTextField questionField;
    private JTextField choice1Field;
    private JTextField choice2Field;
    private JTextField choice3Field;
    private JTextField choice4Field;
    private JComboBox<String> correctAnswerComboBox;
    private JButton saveButton;
    private JButton chooseFileButton;
    private JTextField filePathField;
    private JButton editButton;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Create frame = new Create();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Create() {
    	setTitle("CREATE QUIZ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 431, 654); // Adjusted frame bounds
        
     // Set the icon image
        ImageIcon icon = new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png");
        setIconImage(icon.getImage());
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton_11 = new JButton("BACK");
        btnNewButton_11.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ScreenQuiz ScreenQuiz = new ScreenQuiz();
				setVisible(false);
				ScreenQuiz.setVisible(true);
        	}
        });
        btnNewButton_11.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        btnNewButton_11.setBackground(new Color(102, 204, 153));
        btnNewButton_11.setBounds(274, 542, 110, 30);
        contentPane.add(btnNewButton_11);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Untitled (193 × 162 px) (4).png"));
        lblNewLabel_1.setBounds(120, 10, 193, 162);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\Bg for logo.png"));
        lblNewLabel.setBounds(0, 0, 417, 186);
        contentPane.add(lblNewLabel);

        JLabel lblQuestion = new JLabel("Question:");
        lblQuestion.setBackground(new Color(153, 204, 204));
        lblQuestion.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        lblQuestion.setBounds(63, 262, 100, 20);
        contentPane.add(lblQuestion);

        questionField = new JTextField();
        questionField.setBackground(new Color(255, 255, 255));
        questionField.setBounds(138, 264, 246, 20);
        contentPane.add(questionField);
        questionField.setColumns(10);

        JLabel lblChoices = new JLabel("Choices:");
        lblChoices.setBackground(new Color(153, 204, 204));
        lblChoices.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        lblChoices.setBounds(63, 292, 100, 20);
        contentPane.add(lblChoices);

        choice1Field = new JTextField();
        choice1Field.setBounds(138, 292, 246, 20);
        contentPane.add(choice1Field);
        choice1Field.setColumns(10);

        choice2Field = new JTextField();
        choice2Field.setBounds(138, 322, 245, 20);
        contentPane.add(choice2Field);
        choice2Field.setColumns(10);

        choice3Field = new JTextField();
        choice3Field.setBounds(138, 351, 245, 20);
        contentPane.add(choice3Field);
        choice3Field.setColumns(10);

        choice4Field = new JTextField();
        choice4Field.setBounds(138, 381, 245, 20);
        contentPane.add(choice4Field);
        choice4Field.setColumns(10);

        //The user will select the correct answer the he/she inputed in the choices
        JLabel lblCorrectAnswer = new JLabel("Correct Answer:");
        lblCorrectAnswer.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        lblCorrectAnswer.setBounds(30, 411, 135, 20);
        contentPane.add(lblCorrectAnswer);

        correctAnswerComboBox = new JComboBox<>();
        correctAnswerComboBox.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
        correctAnswerComboBox.setBounds(282, 412, 100, 20);
        correctAnswerComboBox.addItem("Choice 1");
        correctAnswerComboBox.addItem("Choice 2");
        correctAnswerComboBox.addItem("Choice 3");
        correctAnswerComboBox.addItem("Choice 4");
        contentPane.add(correctAnswerComboBox);

        //This button will display the file manager of the computer to locate the file to be save or to edit
        chooseFileButton = new JButton("Choose File");
        chooseFileButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 14));
        chooseFileButton.setBackground(new Color(102, 204, 153));
        chooseFileButton.setBounds(29, 441, 110, 30);
        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String filePath = selectedFile.getAbsolutePath();
                    filePathField.setText(filePath);
                }
            }
        });
        contentPane.add(chooseFileButton);

        filePathField = new JTextField();
        filePathField.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 10));
        filePathField.setBounds(150, 440, 232, 30);
        contentPane.add(filePathField);
        filePathField.setColumns(10);
        
        //Once the user inputed the question and all the choices as well as the correct answer, the user will select also the location in the file manager
        //The save button will command to save all the inputed data
        saveButton = new JButton("Save");
        saveButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        saveButton.setBackground(new Color(102, 204, 153));
        saveButton.setBounds(29, 543, 110, 30);
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String question = questionField.getText();
                String choice1 = choice1Field.getText();
                String choice2 = choice2Field.getText();
                String choice3 = choice3Field.getText();
                String choice4 = choice4Field.getText();
                String correctAnswer = (String) correctAnswerComboBox.getSelectedItem();

                // Save the quiz to a text file
                try {
                    String filePath = filePathField.getText();

                    // Open the file for appending
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
                    // Write the quiz data to the file
                    writer.write("Question: " + question + "\n");
                    writer.write("Choice 1: " + choice1 + "\n");
                    writer.write("Choice 2: " + choice2 + "\n");
                    writer.write("Choice 3: " + choice3 + "\n");
                    writer.write("Choice 4: " + choice4 + "\n");
                    writer.write("Correct Answer: " + correctAnswer + "\n");
                    writer.write("------------------------\n");
                    // Close the file
                    writer.close();

                    JOptionPane.showMessageDialog(null, "Quiz saved successfully!");

                    // Clear the fields
                    questionField.setText("");
                    choice1Field.setText("");
                    choice2Field.setText("");
                    choice3Field.setText("");
                    choice4Field.setText("");
                    correctAnswerComboBox.setSelectedIndex(0);

                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error occurred while saving the quiz.");
                }
            }
        });
        contentPane.add(saveButton);

        //The user can also open he.she created quiz
        JButton openQuizButton = new JButton("Open Quiz");
        openQuizButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        openQuizButton.setBackground(new Color(102, 204, 153));
        openQuizButton.setBounds(29, 503, 110, 30);
        openQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = filePathField.getText();
                File file = new File(filePath);

                if (file.exists()) {
                    try {
                        Desktop.getDesktop().open(file);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error occurred while opening the quiz file.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No quiz file found.");
                }

                //dispose(); // Close the current frame
            }
        });
        contentPane.add(openQuizButton);
        
        //There is also an option where the user can edit his.her existing file in the file manager
        editButton = new JButton("Edit");
        editButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        editButton.setBackground(new Color(102, 204, 153));
        editButton.setBounds(274, 503, 110, 30);
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = filePathField.getText();
                File file = new File(filePath);

                if (file.exists()) {
                    try {
                        Desktop.getDesktop().edit(file);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error occurred while editing the quiz file.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No quiz file found.");
                }
            }
        });
        contentPane.add(editButton);

        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\2nd Semester\\CPE18L Software Design Lab\\CORPUZ\\pencil.png"));
        lblNewLabel_2.setBounds(0, 182, 417, 435);
        contentPane.add(lblNewLabel_2);
        
        JButton btnNewButton_10 = new JButton("CREATE YOUR QUIZ");
        btnNewButton_10.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
        btnNewButton_10.setBackground(new Color(51, 204, 102));
        btnNewButton_10.setBounds(14, 197, 393, 32);
        contentPane.add(btnNewButton_10);
    }
}
