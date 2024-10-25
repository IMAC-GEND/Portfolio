import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CORPUZ9 extends JFrame
{
	private JLabel CORPUZ9;
	
	public CORPUZ9() 
	{ 
		//Menu bar for file, edit and view menu of a note pad
		setTitle("MY NOTEPAD");
		JMenuBar menubar = new JMenuBar();
		
		//The format of my coding process are the following
		/*
		1. Create JMenu.
		2. JMenu is in set in setMnemonic.
		3. Create JMenuItem.
		4. The JMenuItem variable name is set in setMnemonic and setAccelerator.
		5. The JMenuItem variable name  is to be added in JMenu.
		 */
		
		//FILE MENU
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem fileNew = new JMenuItem("New");
		fileNew.setMnemonic(KeyEvent.VK_N);
		fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		file.add(fileNew);
		JMenuItem fileNewWindow = new JMenuItem("New Window");
		fileNewWindow.setMnemonic(KeyEvent.VK_N);
		fileNewWindow.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK));
		//ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK is used to make a combination of shortcut control and shift.
		file.add(fileNewWindow);
		JMenuItem fileOpen = new JMenuItem("Open");
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		file.add(fileOpen);
		JMenuItem fileSave = new JMenuItem("Save");
		fileSave.setMnemonic(KeyEvent.VK_S);
		fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		file.add(fileSave);
		JMenuItem fileSaveAs = new JMenuItem("Save As");
		fileSaveAs.setMnemonic(KeyEvent.VK_S);
		fileSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK|ActionEvent.SHIFT_MASK));
		file.add(fileSaveAs);
		file.addSeparator();
		JMenuItem filePageSetup = new JMenuItem("Page setup");
		file.add(filePageSetup);
		JMenuItem filePrint = new JMenuItem("Print");
		filePrint.setMnemonic(KeyEvent.VK_P);
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		file.add(filePrint);
		file.addSeparator();
		JMenuItem fileClose = new JMenuItem("Exit");
		file.add(fileClose);
		

		fileClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				System.exit(0);
			}
		});
		
		//EDIT MENU
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		JMenuItem undo = new JMenuItem("Undo");
		undo.setMnemonic(KeyEvent.VK_Z);
		undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		edit.add(undo);
		edit.addSeparator();
		JMenuItem cut = new JMenuItem("Cut");
		cut.setMnemonic(KeyEvent.VK_X);
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		edit.add(cut);
		JMenuItem copy = new JMenuItem("Copy");
		copy.setMnemonic(KeyEvent.VK_C);
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		edit.add(copy);
		JMenuItem paste = new JMenuItem("Paste");
		paste.setMnemonic(KeyEvent.VK_V);
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
		edit.add(copy);
		JMenuItem delete = new JMenuItem("Delete");
		delete.setMnemonic(KeyEvent.VK_DELETE);
		delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		edit.add(delete);
		edit.addSeparator();
		JMenuItem find = new JMenuItem("Find");
		find.setMnemonic(KeyEvent.VK_F);
		find.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		edit.add(find);
		JMenuItem fintnext = new JMenuItem("FinD next");
		fintnext.setMnemonic(KeyEvent.VK_F3);
		fintnext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		edit.add(fintnext);
		JMenuItem findprevious = new JMenuItem("Find previous");
		findprevious.setMnemonic(KeyEvent.VK_F3);
		findprevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,ActionEvent.SHIFT_MASK));
		edit.add(findprevious);
		JMenuItem replace = new JMenuItem("Replace");
		replace.setMnemonic(KeyEvent.VK_H);
		replace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
		edit.add(replace);
		JMenuItem go_to = new JMenuItem("Go to");
		go_to.setMnemonic(KeyEvent.VK_G);
		go_to.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
		edit.add(go_to);
		edit.addSeparator();
		JMenuItem selectall = new JMenuItem("Select all");
		selectall.setMnemonic(KeyEvent.VK_A);
		selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		edit.add(selectall);
		JMenuItem timedate = new JMenuItem("Time/Date");
		timedate.setMnemonic(KeyEvent.VK_F5);
		timedate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		edit.add(timedate);
		edit.addSeparator();
		JMenuItem font = new JMenuItem("Font");
		font.setMnemonic(KeyEvent.VK_E);
		edit.add(font);

		
		//VIEW MENU
		JMenu view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_E);
		JMenu zoom = new JMenu("Zoom");
		view.add(zoom);
		//Zoom in, Zoom out, and Restore default zoom are the sub menu of JMenu Zoom.
		JMenuItem zoomin = new JMenuItem("Zoom in");
		zoomin.setMnemonic(KeyEvent.VK_PLUS);
		zoomin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,ActionEvent.CTRL_MASK));
		zoom.add(zoomin);
		JMenuItem zoomout = new JMenuItem("Zoom out");
		zoomout.setMnemonic(KeyEvent.VK_MINUS);
		zoomout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,ActionEvent.CTRL_MASK));
		zoom.add(zoomout);
		JMenuItem rdz = new JMenuItem("Restore default zoom");
		rdz.setMnemonic(KeyEvent.VK_O);
		rdz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		zoom.add(rdz);
		
		
		JCheckBoxMenuItem statusbar = new JCheckBoxMenuItem("Status bar");
		view.add(statusbar);
		JCheckBoxMenuItem wordwrap = new JCheckBoxMenuItem("Word wrap");
		view.add(wordwrap);
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(view);
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
		new CORPUZ9();
	}
}
