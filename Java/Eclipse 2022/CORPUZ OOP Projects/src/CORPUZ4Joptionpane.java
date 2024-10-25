import javax.swing.*;
public class CORPUZ4Joptionpane {
	
	public static void main(String[] args){
		
		int Choice = JOptionPane.showConfirmDialog(null, "Please Enter your Personal Information");
		
		if (Choice == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, " Kindly Enter your Information after pressing OK!");
			
			String fullname = JOptionPane.showInputDialog(null, "What is your Full Name? ");
			String nickname = JOptionPane.showInputDialog(null, "What is your Nickname? ");
			String birthday = JOptionPane.showInputDialog(null, "What is your Birth Day? ");
			String hometown = JOptionPane.showInputDialog(null, "What is your Home Town? ");
			String CYS = JOptionPane.showInputDialog(null, "What is your Course, Year and Section? ");
			
			JOptionPane.showMessageDialog(null, "Name: " + fullname + "\nNickname: " + nickname
											+ "\nBirthday: " + birthday + "\nHometown: " + hometown
											+ "\nCourse, Year and Section: " + CYS);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Its just for sample XD");
		}
		
		}
}
