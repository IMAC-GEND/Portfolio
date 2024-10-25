import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordScramble extends JFrame {
    private JPanel contentPane;
    private JLabel scrambledWordLabel;
    private JTextField answerField;
    private JButton checkButton;
    private JLabel feedbackLabel;

    private String originalWord;
    private String scrambledWord;

    public static void main(String[] args) {
        WordScramble frame = new WordScramble();
        frame.setVisible(true);
    }

    public WordScramble() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        scrambledWordLabel = new JLabel("");
        scrambledWordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        scrambledWordLabel.setBounds(10, 50, 414, 50);
        contentPane.add(scrambledWordLabel);

        answerField = new JTextField();
        answerField.setBounds(10, 120, 200, 30);
        contentPane.add(answerField);
        answerField.setColumns(10);

        checkButton = new JButton("Check");
        checkButton.setBounds(220, 120, 100, 30);
        contentPane.add(checkButton);

        feedbackLabel = new JLabel("");
        feedbackLabel.setBounds(10, 160, 414, 30);
        contentPane.add(feedbackLabel);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        // Set the word and initialize the game
        originalWord = "scramble";
        scrambledWord = scrambleWord(originalWord);
        scrambledWordLabel.setText(scrambledWord);
    }

    private void checkAnswer() {
        String userAnswer = answerField.getText().trim();
        if (userAnswer.equalsIgnoreCase(originalWord)) {
            feedbackLabel.setText("Correct!");
        } else {
            feedbackLabel.setText("Incorrect. Try again.");
        }
    }

    private String scrambleWord(String word) {
        // Scramble the letters of the word
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            int j = (int) (Math.random() * letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}
