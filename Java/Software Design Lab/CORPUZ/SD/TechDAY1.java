import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class TechDAY1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechDAY1 frame = new TechDAY1();
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
	public TechDAY1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnNewButton.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			      // Create a new frame for the quiz questions
			      JFrame quizFrame = new JFrame("Quiz");
			      quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			      quizFrame.setSize(500, 300);
			      
			      // Create the quiz questions and their multiple choice options
			      JLabel question1 = new JLabel("1. What is the capital of France?");
			      JRadioButton option1a = new JRadioButton("A. London");
			      JRadioButton option1b = new JRadioButton("B. Paris");
			      JRadioButton option1c = new JRadioButton("C. Madrid");
			      
			      JLabel question2 = new JLabel("2. Which planet is known as the Red Planet?");
			      JRadioButton option2a = new JRadioButton("A. Venus");
			      JRadioButton option2b = new JRadioButton("B. Mars");
			      JRadioButton option2c = new JRadioButton("C. Jupiter");
			      
			      JLabel question3 = new JLabel("3. Who wrote the Harry Potter series?");
			      JRadioButton option3a = new JRadioButton("A. J.K. Rowling");
			      JRadioButton option3b = new JRadioButton("B. Stephen King");
			      JRadioButton option3c = new JRadioButton("C. Suzanne Collins");
			      
			      JLabel question4 = new JLabel("4. Which of the following is not a primary color?");
			      JRadioButton option4a = new JRadioButton("A. Red");
			      JRadioButton option4b = new JRadioButton("B. Blue");
			      JRadioButton option4c = new JRadioButton("C. Green");
			      
			      JLabel question5 = new JLabel("5. What is the largest animal on Earth?");
			      JRadioButton option5a = new JRadioButton("A. Elephant");
			      JRadioButton option5b = new JRadioButton("B. Blue whale");
			      JRadioButton option5c = new JRadioButton("C. Giraffe");
			      
			      // Create a button to submit the answers and check for correctness
			      JButton submitBtn = new JButton("Submit");
			      submitBtn.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			            int correctAnswers = 0;
			            if (option1b.isSelected()) correctAnswers++;
			            if (option2b.isSelected()) correctAnswers++;
			            if (option3a.isSelected()) correctAnswers++;
			            if (option4c.isSelected()) correctAnswers++;
			            if (option5b.isSelected()) correctAnswers++;
			            
			            // Display a message with the number of correct answers
			            JOptionPane.showMessageDialog(quizFrame, "You got " + correctAnswers + " out of 5 correct!");
			         }
			      });
			      
			      // Create a panel to hold the quiz questions and options
			      JPanel quizPanel = new JPanel();
			      quizPanel.setLayout(new GridLayout(10, 1));
			      quizPanel.add(question1);
			      quizPanel.add(option1a);
			      quizPanel.add(option1b);
			      quizPanel.add(option1c);
			      quizPanel.add(question2);
			      quizPanel.add(option2a);
			      quizPanel.add(option2b);
			      quizPanel.add(option2c);
			      quizPanel.add(question3);
			      quizPanel.add(option3a);
			      quizPanel.add(option3b);
			      quizPanel.add(option3c);
			      quizPanel.add(question4);
			      quizPanel.add(option4a);
			      quizPanel.add(option4b);
			      quizPanel.add(option4c);
			      quizPanel.add(question5);
			      quizPanel.add(option5a);
			      quizPanel.add(option5b);
			      quizPanel.add(option5c);
			      
			   // Create a panel to hold the submit button
			      JPanel submitPanel = new JPanel();
			      submitPanel.add(submitBtn);
			      
			      // Add the quiz panel and submit panel to the quiz frame
			      quizFrame.add(quizPanel, BorderLayout.CENTER);
			      quizFrame.add(submitPanel, BorderLayout.SOUTH);
			      quizFrame.setVisible(true);
			   }
		});
	}

}

private void createQuestion1() {
    JFrame question1Frame = new JFrame("Question 1");
    question1Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    question1Frame.setBounds(100, 100, 450, 300);

    JPanel question1Panel = new JPanel();
    question1Frame.setContentPane(question1Panel);
    question1Panel.setLayout(null);

    JLabel question1Label = new JLabel("What is the capital of France?");
    question1Label.setBounds(10, 11, 414, 14);
    question1Panel.add(question1Label);

    ButtonGroup question1Group = new ButtonGroup();
    JRadioButton question1Option1 = new JRadioButton("New York");
    question1Option1.setBounds(21, 42, 109, 23);
    question1Panel.add(question1Option1);
    question1Group.add(question1Option1);

    JRadioButton question1Option2 = new JRadioButton("London");
    question1Option2.setBounds(21, 68, 109, 23);
    question1Panel.add(question1Option2);
    question1Group.add(question1Option2);

    JRadioButton question1Option3 = new JRadioButton("Paris");
    question1Option3.setBounds(21, 94, 109, 23);
    question1Panel.add(question1Option3);
    question1Group.add(question1Option3);

    JButton question1NextButton = new JButton("Next");
    question1NextButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (question1Option3.isSelected()) {
                correctAnswers++;
            }
            question1Frame.dispose();
            createQuestion2();
        }
    });
    question1NextButton.setBounds(335, 227, 89, 23);
    question1Panel.add(question1NextButton);

    question1Frame.setVisible(true);
}

private void createQuestion2() {
    JFrame question2Frame = new JFrame("Question 2");
    question2Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    question2Frame.setBounds(100, 100, 450, 300);

    JPanel question2Panel = new JPanel();
    question2Frame.setContentPane(question2Panel);
    question2Panel.setLayout(null);

    JLabel question2Label = new JLabel("Which of the following is NOT a programming language?");
    question2Label.setBounds(10, 11, 414, 14);
    question2Panel.add(question2Label);

    ButtonGroup question2Group = new ButtonGroup();
    JRadioButton question2Option1 = new JRadioButton("Java");
    question2Option1.setBounds(21, 42, 109, 23);
    question2Panel.add(question2Option1);
    question2Group.add(question2Option1);

    JRadioButton question2Option2 = new JRadioButton("Python");
    question2Option2.setBounds(21, 68, 109, 23);
    question2Panel.add(question2Option2);
    question2Group.add(question2Option2);

    JRadioButton question2Option3 = new JRadioButton("HTML");
    question2Option3.setBounds(21, 94, 109, 23);
    question2Panel.add(question2Option3);
    question2Group.add(question2Option3);

    JButton question2NextButton = new JButton("Next");
    question2NextButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (question2Option3.isSelected()) {
                correctAnswers++;
            }
            question2Frame.dispose();
            createQuestion3();
            
        }
    });
    question2NextButton.setBounds(335, 227, 89, 23);
    question2Panel.add(question2NextButton);

    question2Frame.setVisible(true);
}

private void createQuestion3() {
    JFrame question3Frame = new JFrame("Question 3");
    question3Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    question3Frame.setBounds(100, 100, 450, 300);

    JPanel question3Panel = new JPanel();
    question3Frame.setContentPane(question3Panel);
    question3Panel.setLayout(null);

    JLabel question3Label = new JLabel("What is the largest planet in our solar system?");
    question3Label.setBounds(10, 11, 414, 14);
    question3Panel.add(question3Label);

    ButtonGroup question3Group = new ButtonGroup();
    JRadioButton question3Option1 = new JRadioButton("Venus");
    question3Option1.setBounds(21, 42, 109, 23);
    question3Panel.add(question3Option1);
    question3Group.add(question3Option1);

    JRadioButton question3Option2 = new JRadioButton("Mars");
    question3Option2.setBounds(21, 68, 109, 23);
    question3Panel.add(question3Option2);
    question3Group.add(question3Option2);

    JRadioButton question3Option3 = new JRadioButton("Jupiter");
    question3Option3.setBounds(21, 94, 109, 23);
    question3Panel.add(question3Option3);
    question3Group.add(question3Option3);

    JButton question3FinishButton = new JButton("Finish");
    question3FinishButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (question3Option3.isSelected()) {
                correctAnswers++;
            }
            question3Frame.dispose();
            showResults();
            
        }
    });
    question3FinishButton.setBounds(335, 227, 89, 23);
    question3Panel.add(question3FinishButton);

    question3Frame.setVisible(true);
}

private void showResults() {
    JFrame resultsFrame = new JFrame("Results");
    resultsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    resultsFrame.setBounds(100, 100, 450, 300);
    JPanel resultsPanel = new JPanel();
    resultsFrame.setContentPane(resultsPanel);
    resultsPanel.setLayout(null);
    
    JLabel resultsLabel = new JLabel("You got " + correctAnswers + " out of 3 questions correct.");
    resultsLabel.setBounds(10, 11, 414, 14);
    resultsPanel.add(resultsLabel);

    JLabel correctAnswersLabel = new JLabel("The correct answers are:");
    correctAnswersLabel.setBounds(10, 36, 414, 14);
    resultsPanel.add(correctAnswersLabel);

    JLabel question1Answer = new JLabel("Question 1: " + "Paris");
    question1Answer.setBounds(10, 61, 414, 14);
    resultsPanel.add(question1Answer);

    JLabel question2Answer = new JLabel("Question 2: " + "HTML");
    question2Answer.setBounds(10, 86, 414, 14);
    resultsPanel.add(question2Answer);

    JLabel question3Answer = new JLabel("Question 3: " + "Jupiter");
    question3Answer.setBounds(10, 111, 414, 14);
    resultsPanel.add(question3Answer);

    JButton resultsOkButton = new JButton("OK");
    resultsOkButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            resultsFrame.dispose();
        }
    });
    resultsOkButton.setBounds(335, 227, 89, 23);
    resultsPanel.add(resultsOkButton);

    resultsFrame.setVisible(true);
}
