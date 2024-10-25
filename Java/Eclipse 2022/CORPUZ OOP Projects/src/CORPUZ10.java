import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CORPUZ10 extends JFrame
{
	private JLabel CORPUZ10;
	
	public CORPUZ10() 
	{ 
		//Menu Bar of a File in Paint app.
				setTitle("MY PAINT");
				JMenuBar menubar = new JMenuBar();
						
				//The format of my coding process are the following
				/*
				1. Create JMenu.
				2. JMenu is in set in setMnemonic.
				3. Create JMenuItem/JMenu.
				4. Set Image Icon.
				5. The JMenuItem variable name is set in setMnemonic and setAccelerator.
				6. The JMenuItem variable name  is to be added in JMenu.
				*/
		
		//FILE MENU
				JMenu file = new JMenu("File");
				file.setMnemonic(KeyEvent.VK_F);
				
				JMenuItem fileNew = new JMenuItem("New");
				ImageIcon newIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\New.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				fileNew.setIcon(newIcon);
				fileNew.setMnemonic(KeyEvent.VK_N);
				fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
				file.add(fileNew);
				
				JMenuItem fileOpen = new JMenuItem("Open");
				ImageIcon openIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\free-folder-icon-1437-thumb.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				fileOpen.setIcon(openIcon);
				fileOpen.setMnemonic(KeyEvent.VK_O);
				fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
				file.add(fileOpen);
				
				JMenu recent = new JMenu("Recent");
				ImageIcon recentIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\Recent.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				recent.setIcon(recentIcon);
				file.add(recent);
				//Zoom in, Zoom out, and Restore default zoom are the sub menu of JMenu Zoom.
				JMenuItem recent1 = new JMenuItem("");
				recent.add(recent1);
				JMenuItem recent2 = new JMenuItem("");
				recent.add(recent2);
				
				JMenuItem fileSave = new JMenuItem("Save");
				ImageIcon saveIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\Save.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				fileSave.setIcon(saveIcon);
				fileSave.setMnemonic(KeyEvent.VK_S);
				fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
				file.add(fileSave);
				
				JMenu fileSaveAs = new JMenu("Save As");
				ImageIcon saveusIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\saveas.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				fileSaveAs.setIcon(saveusIcon);
				file.add(fileSaveAs);
				JMenuItem PNG = new JMenuItem("PNG Picture");
				fileSaveAs.add(PNG);
				JMenuItem JPEG = new JMenuItem("JPEG Picture");
				fileSaveAs.add(JPEG);
				JMenuItem BMP = new JMenuItem("BMP Picture");
				fileSaveAs.add(BMP);
				JMenuItem GIF = new JMenuItem("GIF Picture");
				fileSaveAs.add(GIF);
				JMenuItem otherformat = new JMenuItem("Other format");
				fileSaveAs.add(otherformat);
				
				
				file.addSeparator();
				
				JMenu print = new JMenu("Print");
				ImageIcon printIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\print.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				print.setIcon(printIcon);
				file.add(print);
				JMenuItem Print = new JMenuItem("Print");
				Print.setMnemonic(KeyEvent.VK_P);
				Print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
				print.add(Print);
				JMenuItem pagesetup = new JMenuItem("Page setup");
				print.add(pagesetup);
				JMenuItem printpreview = new JMenuItem("Print preview");
				print.add(printpreview);
				
				JMenuItem scanner = new JMenuItem("From sacneer or camera");
				ImageIcon cameraIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\camera.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				scanner.setIcon(cameraIcon);
				file.add(scanner);
				
				JMenuItem send = new JMenuItem("Send");
				ImageIcon sendIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\share.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				send.setIcon(sendIcon);
				file.add(send);
				
				file.addSeparator();
				
				JMenu sdb = new JMenu("Set as desktop background");
				ImageIcon backgroundIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\2303929-200.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				sdb.setIcon(backgroundIcon);
				file.add(sdb);
				JMenuItem fill = new JMenuItem("Fill");
				sdb.add(fill);
				JMenuItem tile = new JMenuItem("Tile");
				sdb.add(tile);
				JMenuItem center = new JMenuItem("Center");
				sdb.add(center);
				
				file.addSeparator();
				
				JMenuItem properties = new JMenuItem("Image properties");
				ImageIcon propertiesIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\image prop[erties.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				properties.setIcon(propertiesIcon);
				properties.setMnemonic(KeyEvent.VK_E);
				properties.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
				file.add(properties);
				
				file.addSeparator();
				
				JMenuItem about = new JMenuItem("About paint");
				ImageIcon settingsIcon = new ImageIcon(new ImageIcon("D:\\CPE Files\\BS COMPUTER ENGINEERING\\BSCpE - 3GF\\1st Semester\\CPE13 Object-Oriented Programming\\Activities\\Image Icon\\settings.png").getImage().getScaledInstance(18, 18, Image.SCALE_DEFAULT));
				about.setIcon(settingsIcon);
				file.add(about);
				
				menubar.add(file);
				setJMenuBar(menubar);
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				textArea.setMargin( new Insets(5,5,5,5) );
				JScrollPane scroll = new JScrollPane(textArea);
				//this.add(textArea); // get rid of this
				this.add(scroll);
				
				setSize(500, 500);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CORPUZ10();
	}
}
