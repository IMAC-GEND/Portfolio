// A simple interface for drawing persistent images.
// Initial version without events.
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class DrawingPanel {
	
	private JFrame frame; // overall window frame
	private JPanel panel; // drawing surface
	private Graphics g; // drawing pen
	private Color c;
	
	public static void main(String[] args) 
	{
		DrawingPanel DRAW= new DrawingPanel(500,500); 
	}
	// constructs a drawing panel of given size
	public DrawingPanel(int width, int height) {
		//sets up the empty image onto which we will draw
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		g = image.getGraphics();
		getGraphics();
				
		// enclose the image in a label inside a panel
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(image));
		panel = new JPanel(new FlowLayout());
		setBackground(c);
		panel.setPreferredSize(new Dimension(650, 500));
		panel.add(label);

		// set up the JFrame
		frame = new JFrame("Drawing Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	//obtains the Graphics object to draw on the panel
	public Graphics getGraphics() {
		Color pgrd = new Color(0,102,0);
		g.setColor(pgrd);
		g.fillRect(93,5,310,340); //g.drawRect
		Color top = new Color(102,255,102);
		g.setColor(top);
		g.fillOval(93,0,310,50);
		Color grayy = new Color(204,204,204);
		g.setColor(grayy);
		g.fillRect(94,338,309,45);
		Color gray1 = new Color(102,102,102);
		g.setColor(gray1);
		g.fillRect(94,374,309,45);
		Color gray2 = new Color(102,102,102);
		g.setColor(gray2);
		g.fillOval(93,390,310,50);
		g.setColor(Color.BLACK);
		g.fillOval(93,348,310,50);
		Color base = new Color(102,102,102);
		g.setColor(base);
		g.fillOval(93,310,310,50);
		Color head = new Color(51,0,0);
		g.setColor(head);
		g.fillOval(200,20,90,90);
		g.setColor(Color.BLUE);
		g.fillRect(203,105,85,150);
		Color shoulder1 = new Color(0,0,204);
		g.setColor(shoulder1);
		g.fillRect(166,105,37,39);
		Color shoulder2 = new Color(0,0,204);
		g.setColor(shoulder2);
		g.fillRect(288,105,37,39);
		Color arm1 = new Color(153,102,0);
		g.setColor(arm1);
		g.fillRect(288,145,37,78);
		Color arm2 = new Color(153,102,0);
		g.setColor(arm2);
		g.fillRect(166,145,37,78);
		Color belt = new Color(0,0,153);
		g.setColor(belt);
		g.fillRect(203,227,85,18);
		Color foot1 = new Color(51,51,51);
		g.setColor(foot1);
		g.fillRect(203,255,40,40);
		Color foot2 = new Color(51,51,51);
		g.setColor(foot2);
		g.fillRect(246,255,40,40);
		Color c6 = new Color(153,102,0);
		g.setColor(c6);
		g.fillRect(246,295,42,45);
		Color c7 = new Color(153,102,0);
		g.setColor(c7);
		g.fillRect(203,295,42,45);
		Color c8 = new Color(0,102,0);
		g.setColor(c8);
		g.setFont(new Font("Arial Black",Font.PLAIN, 22));
		g.drawString("GOOOOODD MORNING!!!!", 100, 480);
		g.setColor(Color.RED);
		for (int i = 1; i <= 7; i++) {
		g.fillRect(16 + 20 * i,
		45 + 20 * i, 30, 30);
		}
		
		/*g.setColor(Color.MAGENTA);
		for (int i = 1; i <= 10; i++) {
		g.drawOval(30, 5,
		20 * i, 20 * i);
		}
		/*for (int i = 1; i <= 10; i++) {
			g.drawRect(20 + 10 * i, 5,
			200 - 20 * i, 200 - 20 * i);
			}*/
		/*g.setColor(Color.RED);
		for (int i = 1; i <= 7; i++) {
		g.fillRect(16 + 20 * i,
		45 + 20 * i, 30, 30);
		}*/
		return g;
	}
	// sets the background color of the drawing panel
	public void setBackground(Color c) {
		Color c1 = new Color(102,255,102);
		g.setColor(c1);
		panel.setBackground(c1);
	}
	// shows or hides the drawing panel on the screen
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}
}
