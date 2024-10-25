import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class T1CTACT0E extends JFrame implements ActionListener {

	// constants for the game board
	public static final int ROWS = 3;
	public static final int COLS = 3;

	// variables for the game board
	private JButton[][] board;
	private int currentPlayer;

	// variable for the home screen
	private JPanel homeScreen;
	private JButton startBtn;
	private JButton creditBtn;
	private JButton moreBtn;
	private JButton exitBtn;

	public T1CTACT0E() {
	    // set title and default close operation
	    super("Tic Tac Toe");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // create home screen
	    homeScreen = new JPanel();
	    homeScreen.setLayout(new GridLayout(5, 1));
	    add(homeScreen, BorderLayout.CENTER);

	    // create instructions label
	    JLabel instructions = new JLabel("Welcome to Tic Tac Toe! To play, click on a square to place your number. The first player to get 3 in a row wins!");
	    homeScreen.add(instructions);

	    // create start button
	    startBtn = new JButton("Start");
	    startBtn.addActionListener(this);
	    homeScreen.add(startBtn);

	    // create credit button
	    creditBtn = new JButton("Credit");
	    creditBtn.addActionListener(this);
	    homeScreen.add(creditBtn);

	    // create more button
	    moreBtn = new JButton("More");
	    moreBtn.addActionListener(this);
	    homeScreen.add(moreBtn);

	    // create exit button
	    exitBtn = new JButton("Exit");
	    exitBtn.addActionListener(this);
	    homeScreen.add(exitBtn);

	    // set frame size and make it visible
	    setSize(300, 300);
	    setVisible(true);
	}

	// method to create game board
	private void createBoard() {
	    // remove home screen
	    remove(homeScreen);

	    // create game board panel
	    JPanel gameBoard = new JPanel();
	    gameBoard.setLayout(new GridLayout(ROWS, COLS));
	    add(gameBoard, BorderLayout.CENTER);

	    // create game board array
	    board = new JButton[ROWS][COLS];

	    // create game board buttons and add action listener
	    for (int r = 0; r < ROWS; r++) {
	        for (int c = 0; c < COLS; c++) {
	            board[r][c] = new JButton();
	            board[r][c].addActionListener(this);
	            gameBoard.add(board[r][c]);
	        }
	    }

	    // set current player to 1
	    currentPlayer = 1;

	    // set frame size and make it visible
	    setSize(300, 300);
	    setVisible(true);
	}

	// method to check for a winner
	private boolean checkWinner() {
	    // check rows
	    for (int r = 0; r < ROWS; r++)

	    {
	    	if (board[r][0].getText().equals(board[r][1].getText()) && board[r][1].getText().equals(board[r][2].getText()) && !board[r][0].getText().equals("")) {
	    	return true;
	    	}
	    	}
	    
	    // check columns
	    for (int c = 0; c < COLS; c++) {
	        if (board[0][c].getText().equals(board[1][c].getText()) && board[1][c].getText().equals(board[2][c].getText()) && !board[0][c].getText().equals("")) {
	            return true;
	        }
	    }

	    // check diagonals
	    if (board[0][0].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][2].getText()) && !board[0][0].getText().equals("")) {
	        return true;
	    }
	    if (board[0][2].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][0].getText()) && !board[0][2].getText().equals("")) {
	        return true;
	    }

	    // no winner
	    return false;
	}

	// method to handle button clicks
	public void actionPerformed(ActionEvent e) {
	    // start game if start button is clicked
	    if (e.getSource() == startBtn) {
	        createBoard();
	    }

	    // display credits if credit button is clicked
	    else if (e.getSource() == creditBtn) {
	        JOptionPane.showMessageDialog(this, "This game was created by [Your Name]");
	    }

	    // display additional information if more button is clicked
	    else if (e.getSource() == moreBtn) {
	        JOptionPane.showMessageDialog(this, "This game was created using Java and Swing");
	    }

	    // exit game if exit button is clicked
	    else if (e.getSource() == exitBtn) {
	        System.exit(0);
	    }

	    // handle game board button clicks
	    else {
	        JButton clickedBtn = (JButton) e.getSource();
	        if (currentPlayer == 1) {
	            clickedBtn.setText("1");
	            currentPlayer = 2;
	        } else {
	            clickedBtn.setText("0");
	            currentPlayer = 1;
	        }

	        // check for a winner
	        if (checkWinner()) {
	            JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
	            System.exit(0);
	        }
	    }
	}

	public static void main(String[] args) {
	    new T1CTACT0E();
	}

}
