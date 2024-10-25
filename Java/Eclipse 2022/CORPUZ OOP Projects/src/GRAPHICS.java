import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class GRAPHICS {
	private JFrame frame; // overall window frame
	private JPanel panel; // drawing surface
	private Graphics g; // drawing pen
	private Color c;
	public GRAPHICS(int width, int height) {
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
	public Graphics getGraphics() {
		g.setColor(Color.BLACK);
		g.fillRect(10, 30, 60, 35);
		g.setColor(Color.BLACK);
		g.fillOval(80, 40, 50, 70);
		return g;
	}
	// sets the background color of the drawing panel
		public void setBackground(Color c) {
			panel.setBackground(Color.WHITE);
		}
		// shows or hides the drawing panel on the screen
		public void setVisible(boolean visible) {
			frame.setVisible(visible);
		}
		public static void main(String[] args) 
		{
			GRAPHICS ShapesLines = new GRAPHICS(500,500); 
		}
}