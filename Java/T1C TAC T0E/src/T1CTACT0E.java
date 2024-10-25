import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class T1CTACT0E implements ActionListener {
  private JFrame mainFrame;
  private JButton startButton;
  private JButton instructionsButton;
  private JButton creditButton;
  private JButton moreButton;
  private JButton exitButton;
  private JButton backButton;
  private JButton resumeButton;
  private JButton newGameButton;
  private JButton exitGameButton;
  private JButton[][] gameButtons;
  private int size;
  private boolean player1Turn;
  private int player1Wins;
  private int player2Wins;
  private boolean player1Computer;
  private boolean player2Computer;
  private boolean gameOver;

  public T1CTACT0E() {
    mainMenu();
  }

  public void mainMenu() {
    mainFrame = new JFrame("T1C TAC T0E");
    ImageIcon Icon = new ImageIcon("icon.png"); //Image implementations for frame label
    mainFrame.setIconImage(Icon.getImage()); //set label icon
    mainFrame.setContentPane(new JLabel(new ImageIcon("menuBg.gif"))); //image implementation for mainFrame background
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate when closed
    mainFrame.setLocation(550, 100); //set initial location: x-axis, y-axis
    mainFrame.setSize(400, 600); //size or dimension: horizontal and vertical
    mainFrame.setLayout(new FlowLayout()); //layout manager used in whole mainFrame, values in parenthesis: horizontal gap and vertical gap
    mainFrame.setResizable(false);
    
    JPanel titlePanel = new JPanel(new FlowLayout()); //layout  manager for center panel: number of rows, number of columns, horizontal gap, vertical gap
    titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); //set border: top, left, bottom, right
    titlePanel.setOpaque(false); //set panel background as transparent

    ImageIcon title = new ImageIcon("menuLabel.png");
    JLabel fortitle = new JLabel("");
    fortitle.setIcon(title);
    titlePanel.add(fortitle);
    mainFrame.add(titlePanel, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 0, 0)); //layout  manager for center panel: number of rows, number of columns, horizontal gap, vertical gap
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 120, 55, 120)); //set border: top, left, bottom, right
    buttonPanel.setOpaque(false); //set panel background as transparent

    startButton = new JButton(new ImageIcon("StartBTN.png"));
    setJButtonFeatures(startButton);
    startButton.addActionListener(this);

    instructionsButton = new JButton(new ImageIcon("InstructionsBTN.png"));
    setJButtonFeatures(instructionsButton);
    instructionsButton.addActionListener(this);

    creditButton = new JButton(new ImageIcon("CreditsBTN.png"));
    setJButtonFeatures(creditButton);
    creditButton.addActionListener(this);

    moreButton = new JButton(new ImageIcon("MoreBTN.png"));
    setJButtonFeatures(moreButton);
    moreButton.addActionListener(this);

    exitButton = new JButton(new ImageIcon("ExitBTN.png"));
    setJButtonFeatures(exitButton);
    exitButton.addActionListener(this);

    buttonPanel.add(startButton);
    buttonPanel.add(instructionsButton);
    buttonPanel.add(creditButton);
    buttonPanel.add(moreButton);
    buttonPanel.add(exitButton);

    mainFrame.add(buttonPanel, BorderLayout.CENTER);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(true);
  }
  private void showInstructionFrame() {
    mainFrame.dispose();
    JFrame instructionsFrame = new JFrame("T1C TAC T0E - INSTRUCTIONS");
    instructionsFrame.setContentPane(new JLabel(new ImageIcon("InstructionsBG.png"))); //image implementation for mainFrame background
    Container cntt = instructionsFrame.getContentPane();
    commonFrameSetup(instructionsFrame);
    SpringLayout sprLayout = new SpringLayout();
    instructionsFrame.setLayout(sprLayout);
    instructionsFrame.pack();
    instructionsFrame.setLocationRelativeTo(mainFrame);
    instructionsFrame.setResizable(false);

    Component backButton = new JButton(new ImageIcon("BackBTN.png"));
    instructionsFrame.add(backButton);

    sprLayout.putConstraint(SpringLayout.WEST, backButton, 270, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, backButton, 0, SpringLayout.NORTH, cntt);
    backButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) backButton).setContentAreaFilled(false);
    ((AbstractButton) backButton).setBorderPainted(false);
    ((AbstractButton) backButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        instructionsFrame.dispose();
        mainMenu();
      }
    });

    instructionsFrame.setVisible(true);
  }

  private void showMoreFrame() {
    mainFrame.dispose();
    JFrame moreFrame = new JFrame("T1C TAC T0E - MORE");
    moreFrame.setContentPane(new JLabel(new ImageIcon("morePart1.png"))); //image implementation for mainFrame background
    Container cntt = moreFrame.getContentPane();
    moreFrame.setLayout(new FlowLayout());
    commonFrameSetup(moreFrame);
    SpringLayout sprLayout = new SpringLayout();
    moreFrame.setLayout(sprLayout);
    moreFrame.pack();
    moreFrame.setLocationRelativeTo(mainFrame);
    moreFrame.setResizable(false);

    Component backButton = new JButton(new ImageIcon("BackBTN.png"));
    moreFrame.add(backButton);

    Component nextButton = new JButton(new ImageIcon("NextBTN.png"));
    moreFrame.add(nextButton);

    sprLayout.putConstraint(SpringLayout.WEST, backButton, 5, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, backButton, 0, SpringLayout.NORTH, cntt);
    backButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) backButton).setContentAreaFilled(false);
    ((AbstractButton) backButton).setBorderPainted(false);
    ((AbstractButton) backButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        mainMenu();
      }
    });
    sprLayout.putConstraint(SpringLayout.WEST, nextButton, 270, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, nextButton, 0, SpringLayout.NORTH, cntt);
    nextButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) nextButton).setContentAreaFilled(false);
    ((AbstractButton) nextButton).setBorderPainted(false);
    ((AbstractButton) nextButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        showMoreFrame1();
      }
    });

    moreFrame.pack();
    moreFrame.setVisible(true);
  }

  private void showMoreFrame1() {
    mainFrame.dispose();
    JFrame moreFrame = new JFrame("T1C TAC T0E - MORE");
    moreFrame.setContentPane(new JLabel(new ImageIcon("morePart2.png"))); //image implementation for mainFrame background
    Container cntt = moreFrame.getContentPane();
    moreFrame.setLayout(new FlowLayout());
    commonFrameSetup(moreFrame);
    SpringLayout sprLayout = new SpringLayout();
    moreFrame.setLayout(sprLayout);
    moreFrame.pack();
    moreFrame.setLocationRelativeTo(mainFrame);
    moreFrame.setResizable(false);

    Component backButton = new JButton(new ImageIcon("BackBTN.png"));
    moreFrame.add(backButton);

    Component nextButton = new JButton(new ImageIcon("NextBTN.png"));
    moreFrame.add(nextButton);

    sprLayout.putConstraint(SpringLayout.WEST, backButton, 5, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, backButton, 0, SpringLayout.NORTH, cntt);
    backButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) backButton).setContentAreaFilled(false);
    ((AbstractButton) backButton).setBorderPainted(false);
    ((AbstractButton) backButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        showMoreFrame();
      }
    });
    sprLayout.putConstraint(SpringLayout.WEST, nextButton, 270, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, nextButton, 0, SpringLayout.NORTH, cntt);
    nextButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) nextButton).setContentAreaFilled(false);
    ((AbstractButton) nextButton).setBorderPainted(false);
    ((AbstractButton) nextButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        showMoreFrame2();
      }
    });

    moreFrame.pack();
    moreFrame.setVisible(true);
  }

  private void showMoreFrame2() {
    mainFrame.dispose();
    JFrame moreFrame = new JFrame("T1C TAC T0E - MORE");
    moreFrame.setContentPane(new JLabel(new ImageIcon("morePart3.png"))); //image implementation for mainFrame background
    Container cntt = moreFrame.getContentPane();
    moreFrame.setLayout(new FlowLayout());
    commonFrameSetup(moreFrame);
    SpringLayout sprLayout = new SpringLayout();
    moreFrame.setLayout(sprLayout);
    moreFrame.pack();
    moreFrame.setLocationRelativeTo(mainFrame);
    moreFrame.setResizable(false);

    Component backButton = new JButton(new ImageIcon("BackBTN.png"));
    moreFrame.add(backButton);

    Component toMainButton = new JButton(new ImageIcon("toMainMenu.png"));
    moreFrame.add(toMainButton);

    Component toGameButton = new JButton(new ImageIcon("toGame.png"));
    moreFrame.add(toGameButton);

    sprLayout.putConstraint(SpringLayout.WEST, backButton, 5, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, backButton, 0, SpringLayout.NORTH, cntt);
    backButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) backButton).setContentAreaFilled(false);
    ((AbstractButton) backButton).setBorderPainted(false);
    ((AbstractButton) backButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        showMoreFrame1();
      }
    });

    sprLayout.putConstraint(SpringLayout.WEST, toMainButton, 30, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.SOUTH, toMainButton, -30, SpringLayout.SOUTH, cntt);
    toMainButton.setPreferredSize(new Dimension(150, 150));
    ((AbstractButton) toMainButton).setContentAreaFilled(false);
    ((AbstractButton) toMainButton).setBorderPainted(false);
    ((AbstractButton) toMainButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        mainMenu();
      }
    });

    sprLayout.putConstraint(SpringLayout.WEST, toGameButton, 190, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.SOUTH, toGameButton, -30, SpringLayout.SOUTH, cntt);
    toGameButton.setPreferredSize(new Dimension(150, 150));
    ((AbstractButton) toGameButton).setContentAreaFilled(false);
    ((AbstractButton) toGameButton).setBorderPainted(false);
    ((AbstractButton) toGameButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moreFrame.dispose();
        showOptionFrame();
      }
    });

    moreFrame.pack();
    moreFrame.setVisible(true);
  }

  private void showCreditFrame() {
    mainFrame.dispose();
    JFrame creditsFrame = new JFrame("T1C TAC T0E - CREDITS");
    creditsFrame.setContentPane(new JLabel(new ImageIcon("CreditsBG.png"))); //image implementation for mainFrame background
    Container cntt = creditsFrame.getContentPane();
    commonFrameSetup(creditsFrame);
    SpringLayout sprLayout = new SpringLayout();
    creditsFrame.setLayout(sprLayout);
    creditsFrame.pack();
    creditsFrame.setLocationRelativeTo(mainFrame);
    creditsFrame.setResizable(false);

    Component backButton = new JButton(new ImageIcon("BackBTN.png"));
    creditsFrame.add(backButton);

    sprLayout.putConstraint(SpringLayout.WEST, backButton, 270, SpringLayout.WEST, cntt);
    sprLayout.putConstraint(SpringLayout.NORTH, backButton, 0, SpringLayout.NORTH, cntt);
    backButton.setPreferredSize(new Dimension(100, 100));
    ((AbstractButton) backButton).setContentAreaFilled(false);
    ((AbstractButton) backButton).setBorderPainted(false);
    ((AbstractButton) backButton).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        creditsFrame.dispose();
        mainMenu();
      }
    });

    creditsFrame.setVisible(true);
  }

  private void showOptionFrame() {
    mainFrame.dispose();
    JFrame optionFrame = new JFrame("T1C TAC T0E - BOARD OPTIONS");
    optionFrame.setContentPane(new JLabel(new ImageIcon("OptionBoardBG.png"))); //image implementation for background
    commonFrameSetup(optionFrame);
    optionFrame.setLayout(new BorderLayout());

    JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    textPanel.setBorder(BorderFactory.createEmptyBorder(35, 0, 0, 0)); //set border: top, left, bottom, right
    textPanel.setOpaque(false);

    ImageIcon bgBoard = new ImageIcon("boardTitle.png");
    JLabel forbgBoard = new JLabel("");
    forbgBoard.setIcon(bgBoard);
    textPanel.add(forbgBoard);
    optionFrame.add(textPanel, BorderLayout.NORTH);

    JPanel sizePanel = new JPanel();
    sizePanel.setLayout(new GridLayout(3, 1, 0, 0));
    sizePanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 50, 50)); //set border: top, left, bottom, right
    sizePanel.setOpaque(false);

    JButton size3Button = new JButton(new ImageIcon("Board3x3BTN.png"));
    setJButtonFeatures(size3Button); //set features from the method created

    size3Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        size = 3;
        optionFrame.dispose();
        showPlayerOptionFrame();
      }
    });
    JButton size5Button = new JButton(new ImageIcon("Board5x5BTN.png"));
    setJButtonFeatures(size5Button); //set features from the method created
    size5Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        size = 5;
        optionFrame.dispose();
        showPlayerOptionFrame();
      }
    });
    JButton size7Button = new JButton(new ImageIcon("Board7x7BTN.png"));
    setJButtonFeatures(size7Button); //set features from the method created
    size7Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        size = 7;
        optionFrame.dispose();
        showPlayerOptionFrame();
      }
    });

    sizePanel.add(size3Button);
    sizePanel.add(size5Button);
    sizePanel.add(size7Button);

    optionFrame.add(textPanel, BorderLayout.NORTH);
    optionFrame.add(sizePanel, BorderLayout.CENTER);

    optionFrame.pack();
    optionFrame.setLocationRelativeTo(mainFrame);
    optionFrame.setVisible(true);
  }

  private void showPlayerOptionFrame() {
    JFrame playerOptionFrame = new JFrame("T1C TAC T0E - PLAYER OPTIONS");
    playerOptionFrame.setContentPane(new JLabel(new ImageIcon("CharacterBG.png"))); //image implementation for mainFrame background
    commonFrameSetup(playerOptionFrame);
    playerOptionFrame.setLayout(new FlowLayout());

    JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    textPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); //set border: top, left, bottom, right
    textPanel.setOpaque(false);

    ImageIcon character = new ImageIcon("characterTitle.png");
    JLabel forcharacter = new JLabel("");
    forcharacter.setIcon(character);
    textPanel.add(forcharacter);
    playerOptionFrame.add(textPanel, BorderLayout.NORTH);

    JPanel playerOptionPanel = new JPanel();
    playerOptionPanel.setLayout(new GridLayout(2, 1, 0, 0));
    playerOptionPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 48)); //set border: top, left, bottom, right
    playerOptionPanel.setOpaque(false);

    JButton player1Button = new JButton(new ImageIcon("characterFor1.png"));
    setJButtonFeatures(player1Button);

    player1Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        player1Turn = true;
        playerOptionFrame.dispose();
        startGame();
      }
    });

    JButton player2Button = new JButton(new ImageIcon("characterFor0.png"));
    setJButtonFeatures(player2Button);
    player2Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        player1Turn = false;
        playerOptionFrame.dispose();
        startGame();
      }
    });
    playerOptionPanel.add(player1Button);
    playerOptionPanel.add(player2Button);

    playerOptionFrame.add(textPanel);
    playerOptionFrame.add(playerOptionPanel);

    playerOptionFrame.add(textPanel, BorderLayout.NORTH);
    playerOptionFrame.add(playerOptionPanel, BorderLayout.CENTER);

    playerOptionFrame.pack();
    playerOptionFrame.setLocationRelativeTo(mainFrame);
    playerOptionFrame.setVisible(true);
  }

  private void startGame() {
    mainFrame.dispose();

    JFrame gameFrame = new JFrame("T1C TAC T0E - GAME BOARD");
    gameFrame.setContentPane(new JLabel(new ImageIcon("GameBoardBG.png"))); //image implementation for mainFrame background
    gameFrame.setLayout(new FlowLayout());
    commonFrameSetup(gameFrame);

    JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0)); //layout  manager, set alignment, horizontal gap, vertical gap  
    northPanel.setPreferredSize(new Dimension(400, 90)); //size of north panel: width and height
    northPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); //set border: top, left, bottom, right
    northPanel.setOpaque(false); //set panel background as transparent

    backButton = new JButton(new ImageIcon("BackBTN.png"));
    setJButtonFeatures(backButton); //set features from the method created

    backButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        gameFrame.dispose();
        showResumeFrame();
      }
    });
    northPanel.add(backButton);
    gameFrame.add(northPanel, BorderLayout.NORTH);

    JPanel labelPanel = new JPanel();
    labelPanel.setLayout(new FlowLayout());
    labelPanel.setPreferredSize(new Dimension(400, 110));
    labelPanel.setOpaque(false);

    ImageIcon gameboardLabel = new ImageIcon("gameboardLabel.png");
    JLabel gameBoardLabel = new JLabel(gameboardLabel);

    labelPanel.add(gameBoardLabel);
    gameFrame.add(labelPanel, BorderLayout.CENTER);

    JPanel gamePanel = new JPanel();
    gamePanel.setLayout(new GridLayout(size, size, 10, 10));
    gamePanel.setBackground(new Color(235, 221, 215));
    gamePanel.setPreferredSize(new Dimension(290, 290));

    gamePanel.setBorder(BorderFactory.createLineBorder(new Color(235, 221, 215), 15, true));
    gameFrame.add(gamePanel, BorderLayout.CENTER);

    gameButtons = new JButton[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        gameButtons[i][j] = new JButton();
        gameButtons[i][j].setPreferredSize(new Dimension(80, 80));
        gameButtons[i][j].setBackground(Color.red);
        gameButtons[i][j].setBorder(BorderFactory.createLineBorder(new Color(235, 221, 215), 1, false));
        gameButtons[i][j].addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("")) {
              if (player1Turn) {
                button.setText("1");
              } else {
                button.setText("0");
              }
              if (size == 3) {
                checkForWin3x3();
                button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
                button.setForeground(new Color(255, 200, 34));

                if (gameOver) {

                  if (player1Turn) {
                    player1Wins++;
                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P1Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  } else {
                    player2Wins++;

                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P2Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  }
                } else {
                  checkBoard3x3();
                }
              }
              if (size == 5) {
                checkForWin5x5();
                button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
                button.setForeground(new Color(255, 200, 34));
                if (gameOver) {
                  if (player1Turn) {
                    player1Wins++;
                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P1Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  } else {
                    player2Wins++;

                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P2Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  }
                } else {
                  checkBoard5x5();
                }
              }
              if (size == 7) {
                checkForWin7x7();
                button.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
                button.setForeground(new Color(255, 200, 34));
                if (gameOver) {
                  if (player1Turn) {
                    player1Wins++;
                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P1Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  } else {
                    player2Wins++;

                    JFrame TBT = new JFrame("T1C TAC T0E - WINNER!");
                    TBT.setContentPane(new JLabel(new ImageIcon("P2Win.png")));
                    setFrameIcon(TBT);
                    TBT.setLayout(new BorderLayout());
                    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    TBT.setResizable(false);

                    JPanel scorePanel = new JPanel();
                    scorePanel.setLayout(new GridLayout(5, 0, 0, -80));
                    scorePanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 40)); //set border: top, left, bottom, right
                    scorePanel.setOpaque(false);
                    JLabel player1Label = new JLabel("  " + player1Wins);
                    JLabel emptyLabel = new JLabel("  ");
                    JLabel player2Label = new JLabel("  " + player2Wins);
                    player1Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player2Label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 60));
                    player1Label.setForeground(new Color(255, 0, 0));
                    player2Label.setForeground(new Color(255, 0, 0));

                    ImageIcon scoreboardP1 = new ImageIcon("scoreboardP1.png");
                    JLabel scoreboardP1Label = new JLabel(scoreboardP1);

                    ImageIcon scoreboardP2 = new ImageIcon("scoreboardP2.png");
                    JLabel scoreboardP2Label = new JLabel(scoreboardP2);

                    scorePanel.add(scoreboardP1Label);
                    scorePanel.add(player1Label);
                    scorePanel.add(emptyLabel);
                    scorePanel.add(scoreboardP2Label);
                    scorePanel.add(player2Label);

                    JPanel option = new JPanel();
                    option.setLayout(new GridLayout(1, 2, 0, 0));
                    option.setBorder(BorderFactory.createEmptyBorder(215, 30, 0, 10)); //set border: top, left, bottom, right
                    option.setOpaque(false);

                    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
                    setJButtonFeatures(YES);

                    YES.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        TBT.dispose();
                        resetGame();
                      }
                    });

                    JButton NO = new JButton(new ImageIcon("noBTN.png"));
                    setJButtonFeatures(NO);

                    NO.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                        gameFrame.dispose();
                        TBT.dispose();
                        resetGame();
                        player1Wins = 0;
                        player2Wins = 0;
                        mainMenu();
                      }
                    });

                    option.add(YES);
                    option.add(NO);

                    TBT.add(scorePanel, BorderLayout.WEST);
                    TBT.add(option, BorderLayout.CENTER);

                    TBT.pack();
                    TBT.setLocationRelativeTo(null);
                    TBT.setVisible(true);

                  }
                } else {
                  checkBoard7x7();
                }
              }
              player1Turn = !player1Turn;
              if (player1Computer && !player1Turn) {
                computerMove();
              }
              if (player2Computer && player1Turn) {
                computerMove();
              }
            }
          }
        });
        gamePanel.add(gameButtons[i][j]);
      }
    }
    gameFrame.add(gamePanel, BorderLayout.CENTER);

    gameFrame.pack();
    gameFrame.setLocationRelativeTo(null);
    gameFrame.setVisible(true);
  }

  private void checkForWin3x3() {
    // check rows
    for (int i = 0; i < size; i++) {
      if (gameButtons[i][0].getText().equals(gameButtons[i][1].getText()) &&
        gameButtons[i][1].getText().equals(gameButtons[i][2].getText()) &&
        !gameButtons[i][0].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check columns
    for (int i = 0; i < size; i++) {
      if (gameButtons[0][i].getText().equals(gameButtons[1][i].getText()) &&
        gameButtons[1][i].getText().equals(gameButtons[2][i].getText()) &&
        !gameButtons[0][i].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check diagonals
    if (gameButtons[0][0].getText().equals(gameButtons[1][1].getText()) &&
      gameButtons[1][1].getText().equals(gameButtons[2][2].getText()) &&
      !gameButtons[0][0].getText().equals("")) {
      gameOver = true;
    }
    if (gameButtons[0][2].getText().equals(gameButtons[1][1].getText()) &&
      gameButtons[1][1].getText().equals(gameButtons[2][0].getText()) &&
      !gameButtons[0][2].getText().equals("")) {
      gameOver = true;
    }
  }
  private void checkForWin5x5() {
    // check rows
    for (int i = 0; i < size; i++) {
      if (gameButtons[i][0].getText().equals(gameButtons[i][1].getText()) &&
        gameButtons[i][1].getText().equals(gameButtons[i][2].getText()) &&
        gameButtons[i][2].getText().equals(gameButtons[i][3].getText()) &&
        gameButtons[i][3].getText().equals(gameButtons[i][4].getText()) &&
        !gameButtons[i][0].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check columns
    for (int i = 0; i < size; i++) {
      if (gameButtons[0][i].getText().equals(gameButtons[1][i].getText()) &&
        gameButtons[1][i].getText().equals(gameButtons[2][i].getText()) &&
        gameButtons[2][i].getText().equals(gameButtons[3][i].getText()) &&
        gameButtons[3][i].getText().equals(gameButtons[4][i].getText()) &&
        !gameButtons[0][i].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check diagonals
    if (gameButtons[0][0].getText().equals(gameButtons[1][1].getText()) &&
      gameButtons[1][1].getText().equals(gameButtons[2][2].getText()) &&
      gameButtons[2][2].getText().equals(gameButtons[3][3].getText()) &&
      gameButtons[3][3].getText().equals(gameButtons[4][4].getText()) &&
      !gameButtons[0][0].getText().equals("")) {
      gameOver = true;
    }

    if (gameButtons[0][4].getText().equals(gameButtons[1][3].getText()) &&
      gameButtons[1][3].getText().equals(gameButtons[2][2].getText()) &&
      gameButtons[2][2].getText().equals(gameButtons[3][1].getText()) &&
      gameButtons[3][1].getText().equals(gameButtons[4][0].getText()) &&
      !gameButtons[4][0].getText().equals("")) {
      gameOver = true;
    }

  }
  private void checkForWin7x7() {
    // check rows
    for (int i = 0; i < size; i++) {
      if (gameButtons[i][0].getText().equals(gameButtons[i][1].getText()) &&
        gameButtons[i][1].getText().equals(gameButtons[i][2].getText()) &&
        gameButtons[i][2].getText().equals(gameButtons[i][3].getText()) &&
        gameButtons[i][3].getText().equals(gameButtons[i][4].getText()) &&
        gameButtons[i][4].getText().equals(gameButtons[i][5].getText()) &&
        gameButtons[i][5].getText().equals(gameButtons[i][6].getText()) &&
        !gameButtons[i][0].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check columns
    for (int i = 0; i < size; i++) {
      if (gameButtons[0][i].getText().equals(gameButtons[1][i].getText()) &&
        gameButtons[1][i].getText().equals(gameButtons[2][i].getText()) &&
        gameButtons[2][i].getText().equals(gameButtons[3][i].getText()) &&
        gameButtons[3][i].getText().equals(gameButtons[4][i].getText()) &&
        gameButtons[4][i].getText().equals(gameButtons[5][i].getText()) &&
        gameButtons[5][i].getText().equals(gameButtons[6][i].getText()) &&
        !gameButtons[0][i].getText().equals("")) {
        gameOver = true;
        break;
      }
    }
    // check diagonals
    if (gameButtons[0][0].getText().equals(gameButtons[1][1].getText()) &&
      gameButtons[1][1].getText().equals(gameButtons[2][2].getText()) &&
      gameButtons[2][2].getText().equals(gameButtons[3][3].getText()) &&
      gameButtons[3][3].getText().equals(gameButtons[4][4].getText()) &&
      gameButtons[4][4].getText().equals(gameButtons[5][5].getText()) &&
      gameButtons[5][5].getText().equals(gameButtons[6][6].getText()) &&
      !gameButtons[0][0].getText().equals("")) {
      gameOver = true;
    }
    if (gameButtons[0][6].getText().equals(gameButtons[1][5].getText()) &&
      gameButtons[1][5].getText().equals(gameButtons[2][4].getText()) &&
      gameButtons[2][4].getText().equals(gameButtons[3][3].getText()) &&
      gameButtons[3][3].getText().equals(gameButtons[4][2].getText()) &&
      gameButtons[4][2].getText().equals(gameButtons[5][1].getText()) &&
      gameButtons[5][1].getText().equals(gameButtons[6][0].getText()) &&
      !gameButtons[0][6].getText().equals("")) {
      gameOver = true;
    }

  }

  private void checkBoard3x3() {
    if ((gameButtons[0][0].getText().equals("1") || gameButtons[0][0].getText().equals("0")) &&
      (!gameButtons[0][0].getText().equals("") || !gameButtons[0][0].getText().equals("")) &&
      (gameButtons[0][1].getText().equals("1") || gameButtons[0][1].getText().equals("0")) &&
      (!gameButtons[0][1].getText().equals("") || !gameButtons[0][1].getText().equals("")) &&
      (gameButtons[0][2].getText().equals("1") || gameButtons[0][2].getText().equals("0")) &&
      (!gameButtons[0][2].getText().equals("") || !gameButtons[0][2].getText().equals(""))

      &&
      (gameButtons[1][0].getText().equals("1") || gameButtons[1][0].getText().equals("0")) &&
      (!gameButtons[1][0].getText().equals("") || !gameButtons[1][0].getText().equals("")) &&
      (gameButtons[1][1].getText().equals("1") || gameButtons[1][1].getText().equals("0")) &&
      (!gameButtons[1][1].getText().equals("") || !gameButtons[1][1].getText().equals("")) &&
      (gameButtons[1][2].getText().equals("1") || gameButtons[1][2].getText().equals("0")) &&
      (!gameButtons[1][2].getText().equals("") || !gameButtons[1][2].getText().equals(""))

      &&
      (gameButtons[2][0].getText().equals("1") || gameButtons[2][0].getText().equals("0")) &&
      (!gameButtons[2][0].getText().equals("") || !gameButtons[2][0].getText().equals("")) &&
      (gameButtons[2][1].getText().equals("1") || gameButtons[2][1].getText().equals("0")) &&
      (!gameButtons[2][1].getText().equals("") || !gameButtons[2][1].getText().equals("")) &&
      (gameButtons[2][2].getText().equals("1") || gameButtons[2][2].getText().equals("0")) &&
      (!gameButtons[2][2].getText().equals("") || !gameButtons[2][2].getText().equals(""))

    ) {
      gameOver = false;

      {
        NOBOX();
      }
    }
  }

  private void checkBoard5x5() {
    if ((gameButtons[0][0].getText().equals("1") || gameButtons[0][0].getText().equals("0")) &&
      (!gameButtons[0][0].getText().equals("") || !gameButtons[0][0].getText().equals("")) &&
      (gameButtons[0][1].getText().equals("1") || gameButtons[0][1].getText().equals("0")) &&
      (!gameButtons[0][1].getText().equals("") || !gameButtons[0][1].getText().equals("")) &&
      (gameButtons[0][2].getText().equals("1") || gameButtons[0][2].getText().equals("0")) &&
      (!gameButtons[0][2].getText().equals("") || !gameButtons[0][2].getText().equals("")) &&
      (gameButtons[0][3].getText().equals("1") || gameButtons[0][3].getText().equals("0")) &&
      (!gameButtons[0][3].getText().equals("") || !gameButtons[0][3].getText().equals("")) &&
      (gameButtons[0][4].getText().equals("1") || gameButtons[0][4].getText().equals("0")) &&
      (!gameButtons[0][4].getText().equals("") || !gameButtons[0][4].getText().equals(""))

      &&
      (gameButtons[1][0].getText().equals("1") || gameButtons[1][0].getText().equals("0")) &&
      (!gameButtons[1][0].getText().equals("") || !gameButtons[1][0].getText().equals("")) &&
      (gameButtons[1][1].getText().equals("1") || gameButtons[1][1].getText().equals("0")) &&
      (!gameButtons[1][1].getText().equals("") || !gameButtons[1][1].getText().equals("")) &&
      (gameButtons[1][2].getText().equals("1") || gameButtons[1][2].getText().equals("0")) &&
      (!gameButtons[1][2].getText().equals("") || !gameButtons[1][2].getText().equals("")) &&
      (gameButtons[1][3].getText().equals("1") || gameButtons[1][3].getText().equals("0")) &&
      (!gameButtons[1][3].getText().equals("") || !gameButtons[1][3].getText().equals("")) &&
      (gameButtons[1][4].getText().equals("1") || gameButtons[1][4].getText().equals("0")) &&
      (!gameButtons[1][4].getText().equals("") || !gameButtons[1][4].getText().equals(""))

      &&
      (gameButtons[2][0].getText().equals("1") || gameButtons[2][0].getText().equals("0")) &&
      (!gameButtons[2][0].getText().equals("") || !gameButtons[2][0].getText().equals("")) &&
      (gameButtons[2][1].getText().equals("1") || gameButtons[2][1].getText().equals("0")) &&
      (!gameButtons[2][1].getText().equals("") || !gameButtons[2][1].getText().equals("")) &&
      (gameButtons[2][2].getText().equals("1") || gameButtons[2][2].getText().equals("0")) &&
      (!gameButtons[2][2].getText().equals("") || !gameButtons[2][2].getText().equals("")) &&
      (gameButtons[2][3].getText().equals("1") || gameButtons[2][3].getText().equals("0")) &&
      (!gameButtons[2][3].getText().equals("") || !gameButtons[2][3].getText().equals("")) &&
      (gameButtons[2][4].getText().equals("1") || gameButtons[2][4].getText().equals("0")) &&
      (!gameButtons[2][4].getText().equals("") || !gameButtons[2][4].getText().equals(""))

      &&
      (gameButtons[3][0].getText().equals("1") || gameButtons[3][0].getText().equals("0")) &&
      (!gameButtons[3][0].getText().equals("") || !gameButtons[3][0].getText().equals("")) &&
      (gameButtons[3][1].getText().equals("1") || gameButtons[3][1].getText().equals("0")) &&
      (!gameButtons[3][1].getText().equals("") || !gameButtons[3][1].getText().equals("")) &&
      (gameButtons[3][2].getText().equals("1") || gameButtons[3][2].getText().equals("0")) &&
      (!gameButtons[3][2].getText().equals("") || !gameButtons[3][2].getText().equals("")) &&
      (gameButtons[3][3].getText().equals("1") || gameButtons[3][3].getText().equals("0")) &&
      (!gameButtons[3][3].getText().equals("") || !gameButtons[3][3].getText().equals("")) &&
      (gameButtons[3][4].getText().equals("1") || gameButtons[3][4].getText().equals("0")) &&
      (!gameButtons[3][4].getText().equals("") || !gameButtons[3][4].getText().equals(""))

      &&
      (gameButtons[4][0].getText().equals("1") || gameButtons[4][0].getText().equals("0")) &&
      (!gameButtons[4][0].getText().equals("") || !gameButtons[4][0].getText().equals("")) &&
      (gameButtons[4][1].getText().equals("1") || gameButtons[4][1].getText().equals("0")) &&
      (!gameButtons[4][1].getText().equals("") || !gameButtons[4][1].getText().equals("")) &&
      (gameButtons[4][2].getText().equals("1") || gameButtons[4][2].getText().equals("0")) &&
      (!gameButtons[4][2].getText().equals("") || !gameButtons[4][2].getText().equals("")) &&
      (gameButtons[4][3].getText().equals("1") || gameButtons[4][3].getText().equals("0")) &&
      (!gameButtons[4][3].getText().equals("") || !gameButtons[4][3].getText().equals("")) &&
      (gameButtons[4][4].getText().equals("1") || gameButtons[4][4].getText().equals("0")) &&
      (!gameButtons[4][4].getText().equals("") || !gameButtons[4][4].getText().equals(""))

    ) {
      gameOver = false;

      {
        NOBOX();
      }
    }
  }

  private void checkBoard7x7() {
    if ((gameButtons[0][0].getText().equals("1") || gameButtons[0][0].getText().equals("0")) &&
      (!gameButtons[0][0].getText().equals("") || !gameButtons[0][0].getText().equals("")) &&
      (gameButtons[0][1].getText().equals("1") || gameButtons[0][1].getText().equals("0")) &&
      (!gameButtons[0][1].getText().equals("") || !gameButtons[0][1].getText().equals("")) &&
      (gameButtons[0][2].getText().equals("1") || gameButtons[0][2].getText().equals("0")) &&
      (!gameButtons[0][2].getText().equals("") || !gameButtons[0][2].getText().equals("")) &&
      (gameButtons[0][3].getText().equals("1") || gameButtons[0][3].getText().equals("0")) &&
      (!gameButtons[0][3].getText().equals("") || !gameButtons[0][3].getText().equals("")) &&
      (gameButtons[0][4].getText().equals("1") || gameButtons[0][4].getText().equals("0")) &&
      (!gameButtons[0][4].getText().equals("") || !gameButtons[0][4].getText().equals("")) &&
      (gameButtons[0][5].getText().equals("1") || gameButtons[0][5].getText().equals("0")) &&
      (!gameButtons[0][5].getText().equals("") || !gameButtons[0][5].getText().equals("")) &&
      (gameButtons[0][6].getText().equals("1") || gameButtons[0][6].getText().equals("0")) &&
      (!gameButtons[0][6].getText().equals("") || !gameButtons[0][6].getText().equals(""))

      &&
      (gameButtons[1][0].getText().equals("1") || gameButtons[1][0].getText().equals("0")) &&
      (!gameButtons[1][0].getText().equals("") || !gameButtons[1][0].getText().equals("")) &&
      (gameButtons[1][1].getText().equals("1") || gameButtons[1][1].getText().equals("0")) &&
      (!gameButtons[1][1].getText().equals("") || !gameButtons[1][1].getText().equals("")) &&
      (gameButtons[1][2].getText().equals("1") || gameButtons[1][2].getText().equals("0")) &&
      (!gameButtons[1][2].getText().equals("") || !gameButtons[1][2].getText().equals("")) &&
      (gameButtons[1][3].getText().equals("1") || gameButtons[1][3].getText().equals("0")) &&
      (!gameButtons[1][3].getText().equals("") || !gameButtons[1][3].getText().equals("")) &&
      (gameButtons[1][4].getText().equals("1") || gameButtons[1][4].getText().equals("0")) &&
      (!gameButtons[1][4].getText().equals("") || !gameButtons[1][4].getText().equals("")) &&
      (gameButtons[1][5].getText().equals("1") || gameButtons[1][5].getText().equals("0")) &&
      (!gameButtons[1][5].getText().equals("") || !gameButtons[1][5].getText().equals("")) &&
      (gameButtons[1][6].getText().equals("1") || gameButtons[1][6].getText().equals("0")) &&
      (!gameButtons[1][6].getText().equals("") || !gameButtons[1][6].getText().equals(""))

      &&
      (gameButtons[2][0].getText().equals("1") || gameButtons[2][0].getText().equals("0")) &&
      (!gameButtons[2][0].getText().equals("") || !gameButtons[2][0].getText().equals("")) &&
      (gameButtons[2][1].getText().equals("1") || gameButtons[2][1].getText().equals("0")) &&
      (!gameButtons[2][1].getText().equals("") || !gameButtons[2][1].getText().equals("")) &&
      (gameButtons[2][2].getText().equals("1") || gameButtons[2][2].getText().equals("0")) &&
      (!gameButtons[2][2].getText().equals("") || !gameButtons[2][2].getText().equals("")) &&
      (gameButtons[2][3].getText().equals("1") || gameButtons[2][3].getText().equals("0")) &&
      (!gameButtons[2][3].getText().equals("") || !gameButtons[2][3].getText().equals("")) &&
      (gameButtons[2][4].getText().equals("1") || gameButtons[2][4].getText().equals("0")) &&
      (!gameButtons[2][4].getText().equals("") || !gameButtons[2][4].getText().equals("")) &&
      (gameButtons[2][5].getText().equals("1") || gameButtons[2][5].getText().equals("0")) &&
      (!gameButtons[2][5].getText().equals("") || !gameButtons[2][5].getText().equals("")) &&
      (gameButtons[2][6].getText().equals("1") || gameButtons[2][6].getText().equals("0")) &&
      (!gameButtons[2][6].getText().equals("") || !gameButtons[2][6].getText().equals(""))

      &&
      (gameButtons[3][0].getText().equals("1") || gameButtons[3][0].getText().equals("0")) &&
      (!gameButtons[3][0].getText().equals("") || !gameButtons[3][0].getText().equals("")) &&
      (gameButtons[3][1].getText().equals("1") || gameButtons[3][1].getText().equals("0")) &&
      (!gameButtons[3][1].getText().equals("") || !gameButtons[3][1].getText().equals("")) &&
      (gameButtons[3][2].getText().equals("1") || gameButtons[3][2].getText().equals("0")) &&
      (!gameButtons[3][2].getText().equals("") || !gameButtons[3][2].getText().equals("")) &&
      (gameButtons[3][3].getText().equals("1") || gameButtons[3][3].getText().equals("0")) &&
      (!gameButtons[3][3].getText().equals("") || !gameButtons[3][3].getText().equals("")) &&
      (gameButtons[3][4].getText().equals("1") || gameButtons[3][4].getText().equals("0")) &&
      (!gameButtons[3][4].getText().equals("") || !gameButtons[3][4].getText().equals("")) &&
      (gameButtons[3][5].getText().equals("1") || gameButtons[3][5].getText().equals("0")) &&
      (!gameButtons[3][5].getText().equals("") || !gameButtons[3][5].getText().equals("")) &&
      (gameButtons[3][6].getText().equals("1") || gameButtons[3][6].getText().equals("0")) &&
      (!gameButtons[3][6].getText().equals("") || !gameButtons[3][6].getText().equals(""))

      &&
      (gameButtons[4][0].getText().equals("1") || gameButtons[4][0].getText().equals("0")) &&
      (!gameButtons[4][0].getText().equals("") || !gameButtons[4][0].getText().equals("")) &&
      (gameButtons[4][1].getText().equals("1") || gameButtons[4][1].getText().equals("0")) &&
      (!gameButtons[4][1].getText().equals("") || !gameButtons[4][1].getText().equals("")) &&
      (gameButtons[4][2].getText().equals("1") || gameButtons[4][2].getText().equals("0")) &&
      (!gameButtons[4][2].getText().equals("") || !gameButtons[4][2].getText().equals("")) &&
      (gameButtons[4][3].getText().equals("1") || gameButtons[4][3].getText().equals("0")) &&
      (!gameButtons[4][3].getText().equals("") || !gameButtons[4][3].getText().equals("")) &&
      (gameButtons[4][4].getText().equals("1") || gameButtons[4][4].getText().equals("0")) &&
      (!gameButtons[4][4].getText().equals("") || !gameButtons[4][4].getText().equals("")) &&
      (gameButtons[4][5].getText().equals("1") || gameButtons[4][5].getText().equals("0")) &&
      (!gameButtons[4][5].getText().equals("") || !gameButtons[4][5].getText().equals("")) &&
      (gameButtons[4][6].getText().equals("1") || gameButtons[4][6].getText().equals("0")) &&
      (!gameButtons[4][6].getText().equals("") || !gameButtons[4][6].getText().equals(""))

      &&
      (gameButtons[5][0].getText().equals("1") || gameButtons[5][0].getText().equals("0")) &&
      (!gameButtons[5][0].getText().equals("") || !gameButtons[5][0].getText().equals("")) &&
      (gameButtons[5][1].getText().equals("1") || gameButtons[5][1].getText().equals("0")) &&
      (!gameButtons[5][1].getText().equals("") || !gameButtons[5][1].getText().equals("")) &&
      (gameButtons[5][2].getText().equals("1") || gameButtons[5][2].getText().equals("0")) &&
      (!gameButtons[5][2].getText().equals("") || !gameButtons[5][2].getText().equals("")) &&
      (gameButtons[5][3].getText().equals("1") || gameButtons[5][3].getText().equals("0")) &&
      (!gameButtons[5][3].getText().equals("") || !gameButtons[5][3].getText().equals("")) &&
      (gameButtons[5][4].getText().equals("1") || gameButtons[5][4].getText().equals("0")) &&
      (!gameButtons[5][4].getText().equals("") || !gameButtons[5][4].getText().equals("")) &&
      (gameButtons[5][5].getText().equals("1") || gameButtons[5][5].getText().equals("0")) &&
      (!gameButtons[5][5].getText().equals("") || !gameButtons[5][5].getText().equals("")) &&
      (gameButtons[5][6].getText().equals("1") || gameButtons[5][6].getText().equals("0")) &&
      (!gameButtons[5][6].getText().equals("") || !gameButtons[5][6].getText().equals(""))

      &&
      (gameButtons[6][0].getText().equals("1") || gameButtons[6][0].getText().equals("0")) &&
      (!gameButtons[6][0].getText().equals("") || !gameButtons[6][0].getText().equals("")) &&
      (gameButtons[6][1].getText().equals("1") || gameButtons[6][1].getText().equals("0")) &&
      (!gameButtons[6][1].getText().equals("") || !gameButtons[6][1].getText().equals("")) &&
      (gameButtons[6][2].getText().equals("1") || gameButtons[6][2].getText().equals("0")) &&
      (!gameButtons[6][2].getText().equals("") || !gameButtons[6][2].getText().equals("")) &&
      (gameButtons[6][3].getText().equals("1") || gameButtons[6][3].getText().equals("0")) &&
      (!gameButtons[6][3].getText().equals("") || !gameButtons[6][3].getText().equals("")) &&
      (gameButtons[6][4].getText().equals("1") || gameButtons[6][4].getText().equals("0")) &&
      (!gameButtons[6][4].getText().equals("") || !gameButtons[6][4].getText().equals("")) &&
      (gameButtons[6][5].getText().equals("1") || gameButtons[6][5].getText().equals("0")) &&
      (!gameButtons[6][5].getText().equals("") || !gameButtons[6][5].getText().equals("")) &&
      (gameButtons[6][6].getText().equals("1") || gameButtons[6][6].getText().equals("0")) &&
      (!gameButtons[6][6].getText().equals("") || !gameButtons[6][6].getText().equals(""))

    ) {
      gameOver = false;

      {
        NOBOX();
      }
    }
  }
  private void NOBOX() {
    JFrame TBT = new JFrame("T1C TAC T0E - DRAW!");
    TBT.setLayout(new BorderLayout());
    TBT.getContentPane().setBackground(Color.black);
    TBT.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    TBT.setResizable(false);

    JPanel winner = new JPanel();
    winner.setLayout(new FlowLayout());
    winner.setOpaque(false);

    ImageIcon setDrawLabel = new ImageIcon("drawLabel.png");
    JLabel setIconDrawLabel = new JLabel(setDrawLabel);
    winner.add(setIconDrawLabel);

    JPanel option = new JPanel();
    option.setLayout(new GridLayout(1, 2, 0, 20));
    option.setBorder(BorderFactory.createEmptyBorder(0, 10, 20, 10)); //set border: top, left, bottom, right
    option.setOpaque(false);

    JButton YES = new JButton(new ImageIcon("yesBTN.png"));
    setJButtonFeatures(YES);

    YES.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        TBT.dispose();
        resetGame();
      }
    });

    JButton NO = new JButton(new ImageIcon("noBTN.png"));
    setJButtonFeatures(NO);

    NO.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        TBT.dispose();
        resetGame();
        player1Wins = 0;
        player2Wins = 0;
        mainMenu();
      }
    });

    option.add(YES);
    option.add(NO);

    TBT.add(winner, BorderLayout.NORTH);
    TBT.add(option, BorderLayout.SOUTH);

    TBT.pack();
    TBT.setLocationRelativeTo(null);
    TBT.setVisible(true);

  }
  private void resetGame() {

    gameOver = false;
    player1Turn = true;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        gameButtons[i][j].setText("");
      }
    }

  }

  private void showResumeFrame() {
    JFrame resumeFrame = new JFrame("T1C TAC T0E - RESUME");
    resumeFrame.setContentPane(new JLabel(new ImageIcon("resumeBG.png"))); //image implementation for background
    commonFrameSetup(resumeFrame);
    resumeFrame.setLayout(new FlowLayout());

    JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 20)); //layout  manager for center panel: number of rows, number of columns, horizontal gap, vertical gap
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(170, 120, 0, 120)); //set border: top, left, bottom, right
    buttonPanel.setOpaque(false); //set panel background as transparent

    resumeButton = new JButton(new ImageIcon("resumeBTN.png"));
    setJButtonFeatures(resumeButton); //set features from the method created

    resumeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        resumeFrame.dispose();
        player1Wins = 0;
        player2Wins = 0;
        startGame();
      }
    });
    newGameButton = new JButton(new ImageIcon("newGameBTN.png"));
    setJButtonFeatures(newGameButton); //set features from the method created

    newGameButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        resumeFrame.dispose();
        player1Wins = 0;
        player2Wins = 0;
        showOptionFrame();
      }
    });
    exitGameButton = new JButton(new ImageIcon("exitGameBTN.png"));
    setJButtonFeatures(exitGameButton); //set features from the method created

    exitGameButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        resumeFrame.dispose();
        mainMenu();
      }
    });

    buttonPanel.add(resumeButton);
    buttonPanel.add(newGameButton);
    buttonPanel.add(exitGameButton);

    resumeFrame.add(buttonPanel, BorderLayout.CENTER);

    resumeFrame.pack();
    resumeFrame.setLocationRelativeTo(null);
    resumeFrame.setVisible(true);
  }

  private void computerMove() {
    while (true) {
      int row = (int)(Math.random() * size);
      int col = (int)(Math.random() * size);
      if (gameButtons[row][col].getText().equals("")) {
        if (player1Turn) {
          gameButtons[row][col].setText("1");
        } else {
          gameButtons[row][col].setText("0");
        }
        if (size == 3) {
          checkForWin3x3();
        }
        if (size == 5) {
          checkForWin5x5();
        }
        if (size == 7) {
          checkForWin7x7();
        }
        player1Turn = !player1Turn;
        break;
      }
    }
  }
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == startButton) {
      // Code to handle the start button being clicked
      showOptionFrame();
    } else if (source == instructionsButton) {
      showInstructionFrame();
      // Code to handle the instructions button being clicked
    } else if (source == creditButton) {
      showCreditFrame();
      // Code to handle the credit button being clicked
    } else if (source == moreButton) {
      showMoreFrame();
      // Code to handle the more button being clicked
    } else if (source == exitButton) {
      mainFrame.dispose();
      // Code to handle the exit button being clicked
    }
  }

  public static void commonFrameSetup(JFrame frame_name) {
    setFrameIcon(frame_name);
    frame_name.setResizable(false);
    frame_name.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame_name.setPreferredSize(new Dimension(400, 600));
  }

  public static void setFrameIcon(JFrame frameName) {
    ImageIcon Icon = new ImageIcon("icon.png"); //Image implementations for frame label
    frameName.setIconImage(Icon.getImage()); //set label icon
  }

  public static void setJButtonFeatures(JButton btn) {
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
  }

  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    File file = new File("kado_tic_tac_toe_instrumental.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();
    clip.loop(Clip.LOOP_CONTINUOUSLY);
    new T1CTACT0E();
  }

}