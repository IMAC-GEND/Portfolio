import java.awt.*;
import javax.swing.*;
public class CORPUZ7 {

	public static void main (String[] args) 
	{
		JFrame frame = new JFrame("Composite Layout");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,900);
		frame.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new FlowLayout());
		
		northPanel.add(new JLabel("BINGO"));
		frame.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel(new GridLayout(16,5,5,5));
		
		String[] buttons = 
			{
					"B", "I", "N", "G", "O",
					"1", "16", "31", "46", "61",
					"2", "17", "32", "47", "62",
					"3", "18", "33", "48", "63",
					"4", "19", "34", "49", "64",
					"5", "20", "35", "50", "65",
					"6", "21", "36", "51", "66",
					"7", "22", "37", "52", "67",
					"8", "23", "38", "53", "68",
					"9", "24", "39", "54", "69",
					"10", "25", "40", "55", "70",
					"11", "26", "41", "56", "71",
					"12", "27", "42", "57", "72",
					"13", "28", "43", "58", "73",
					"14", "29", "44", "59", "74",
					"15", "30", "45", "60", "75"
			};
		for (int i = 0; i < buttons.length; i++)
		{
			centerPanel.add(new JButton(buttons[i]));
		}
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
