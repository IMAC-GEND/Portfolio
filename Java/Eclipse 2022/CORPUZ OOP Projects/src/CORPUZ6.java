/*
 Write a program of a registration form of a student. The components
are as follows:
	1. User Name (label and text field)
	2. Password (label and password field)
	3. Confirm Password (label and password field)
	4. Name(label and text field)
	5. Year, Course and Section(Drop Down List and label)
	6. Date of Birth(label and text field)
	7. Age (label and text field)
	8. Gender (Radio Button and label)
	9. Citizenship (label and text field)
	10. Religion (label and text field)
	11. Contact Number (label and text field)
	12. Father’s Name and Mother’s Name (label and text field)
	13. Motto (label and text area)
	14. Skills (label and text area)
	15. Seminars Attended (label and text area with scroll)
	16. Submit , Reset and Validate (button)
 */
import java.awt.*;
import javax.swing.*;

public class CORPUZ6 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(); 
		JPanel panel = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		frame.setLayout(new FlowLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("STURDENTS REGISTRATION FORM");
		
		//JTextArea textArea = new JTextArea();
		//JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//frame.add(scroll);
		
		//JScrollBar scrollbar = new JScrollBar();
		//scrollbar.setBounds(200,150,100,150);
		//frame.add(scrollbar);
		
		
		Color c1 = new Color(0,154,0);
		panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(12,900,12,900));
		panel.setBackground(c1);
		frame.add(panel, BorderLayout.NORTH);
		
		JLabel regform = new JLabel("STUDET'S  REGISTRATION  FORM");
		regform.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		panel.add(regform);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(8,900,8,900));
		panel.setBackground(Color.BLACK);
		frame.add(panel, BorderLayout.NORTH);
		
		//USER NAME, PASSWORD, CONFIRM PASSWORD 
		JLabel user_name = new JLabel("User Name: "); 
		JLabel password = new JLabel("Password: ");
		JLabel confirm_password = new JLabel("Confirm Password: "); 
		
		JTextField use_namefield = new JTextField(15);
		TextField passwordfield = new TextField(15);
		passwordfield.setEchoChar('*');
		TextField con_passwordfield = new TextField(15);
		con_passwordfield.setEchoChar('*');
		
		frame.add(user_name);
		frame.add(use_namefield);
		frame.add(password); 
		frame.add(passwordfield);
		frame.add(confirm_password); 
		frame.add(con_passwordfield);
		
		Color c2 = new Color(0,204,0);
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3,2,5,10));
		panel3.setBorder(BorderFactory.createEmptyBorder(20,900,20,900));
		panel3.setBackground(c2);
		frame.add(panel3, BorderLayout.NORTH);
		
		//JScrollPane scroll = new JScrollPane(panel3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//frame.add(scroll);
		
		panel3.add(user_name);
		panel3.add(use_namefield);
		panel3.add(password);
		panel3.add(passwordfield);
		panel3.add(confirm_password);
		panel3.add(con_passwordfield);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(8,900,8,900));
		panel.setBackground(Color.BLACK);
		frame.add(panel, BorderLayout.NORTH);
		
		//NAME
		//*Add comment */ here to view motto, skill, seminars, and button
		JLabel name = new JLabel("Name: ");
		JTextField namefield = new JTextField(19); 
		
		frame.add(name);
		frame.add(namefield);
		
		//YR, COURSE AND SECTION
		JLabel year = new JLabel("Year: "); 
		Choice yearchoice = new Choice(); 
		yearchoice.add("");
		yearchoice.add("1st Year");
		yearchoice.add("2nd Year");
		yearchoice.add("3rd Year");
		yearchoice.add("4th Year");
		
		frame.add(year);
		frame.add(yearchoice);
		
		JLabel course = new JLabel("Course: "); 
		Choice coursechoice = new Choice(); 
		coursechoice.add("");
		coursechoice.add("CPE");
		coursechoice.add("CE");
		coursechoice.add("EE");
		coursechoice.add("IE");
		coursechoice.add("ME");
		coursechoice.add("ECE");
		
		frame.add(course);
		frame.add(coursechoice);
		
		JLabel section = new JLabel("Section "); 
		Choice sectionchoice = new Choice(); 
		sectionchoice.add("");
		sectionchoice.add("GF");
		sectionchoice.add("IF");
		sectionchoice.add("GE");
		sectionchoice.add("IE");
		
		frame.add(section);
		frame.add(sectionchoice);
		
		//DATE OF BIRTH
		JLabel DOB = new JLabel("Date of Birth: "); 
		frame.add(DOB);
		
		JTextField DOBfield = new JTextField(10); 
		frame.add(DOBfield);
		
		//AGE
		JLabel age = new JLabel("Age: "); 
		frame.add(age);
				
		JTextField agefield = new JTextField(10); 
		frame.add(agefield);
		
		//GENDER
		JLabel gender1 = new JLabel("Gender: "); 
		frame.add(gender1);
		
		JRadioButton male = new JRadioButton("Male"); 
		frame.add(male);
		
		JLabel gender2 = new JLabel(" "); 
		frame.add(gender2);
		JRadioButton female = new JRadioButton("Female"); 
		frame.add(female);
		
		//CITIZENSHIP
		JLabel citizenship = new JLabel("Citizenship: "); 
		frame.add(citizenship);
		
		JTextField citizenshipfield = new JTextField(10); 
		frame.add(citizenshipfield);
		
		//RELIGION
		JLabel religion = new JLabel("Religion: "); 
		frame.add(religion);
		
		JTextField religionfield = new JTextField(10); 
		frame.add(religionfield);
		
		//CONTACT NUMBER
		JLabel number = new JLabel("Contact Number: "); 
		frame.add(number);
		
		JTextField numberfield = new JTextField(10); 
		frame.add(numberfield);
		
		//FATHER'S NAME
		JLabel father = new JLabel("Father's Name: "); 
		frame.add(father);
		
		JTextField fatherfield = new JTextField(10); 
		frame.add(fatherfield);
		
		//MOTHER'S NAME
		JLabel mother = new JLabel("Mother's Name: "); 
		frame.add(mother);
		
		JTextField motherfield = new JTextField(10); 
		frame.add(motherfield);
		
		
		Color c3 = new Color(102,255,102);
		panel4 = new JPanel();
		panel4.setLayout(new GridLayout(0,2,5,5));
		panel4.setBorder(BorderFactory.createEmptyBorder(15,900,15,900)); //(15,900,15,900)
		panel4.setBackground(c3);
		frame.add(panel4, BorderLayout.CENTER);
		
		//JScrollPane scroll = new JScrollPane(panel4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//frame.add(scroll);
		
		panel4.add(name);
		panel4.add(name);
		panel4.add(namefield);
		panel4.add(year);
		panel4.add(yearchoice);
		panel4.add(course);
		panel4.add(coursechoice);
		panel4.add(section);
		panel4.add(sectionchoice);
		panel4.add(DOB);
		panel4.add(DOBfield);
		panel4.add(age);
		panel4.add(agefield);
		panel4.add(gender1);
		panel4.add(male);
		panel4.add(gender2);
		panel4.add(female);
		panel4.add(citizenship);
		panel4.add(citizenshipfield);
		panel4.add(religion);
		panel4.add(religionfield);
		panel4.add(number);
		panel4.add(numberfield);
		panel4.add(father);
		panel4.add(fatherfield);
		panel4.add(mother);
		panel4.add(motherfield);
		/*panel4.add(motto);
		panel4.add(motto_textarea);
		panel4.add(skills);
		panel4.add(skills_textarea);
		panel4.add(seminars);
		panel4.add(seminars_textarea);
		//panel4.add(scroll);*/
		//JScrollPane scroll = new JScrollPane(panel4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//frame.add(scroll);
		
		//MOTTO
		Color c4 = new Color(102,255,102);
		panel5 = new JPanel();
		panel5.setLayout(new GridLayout(0,2,5,5));
		panel5.setBorder(BorderFactory.createEmptyBorder(15,900,15,900));
		panel5.setBackground(c4);
		frame.add(panel5, BorderLayout.CENTER);
		
				JLabel motto = new JLabel("Motto: "); 
				frame.add(motto);
				panel5.add(motto);
				
				JTextArea motto_textarea = new JTextArea(5,16); 
				frame.add(motto_textarea);
				frame.add(new JScrollPane(motto_textarea));
				motto_textarea.setFont(new Font("Calibri",Font.PLAIN, 14));
				panel5.add(motto_textarea);
				
				//SKILLS
				JLabel skills = new JLabel("Skills: "); 
				frame.add(skills);
				panel5.add(skills);
						
				JTextArea skills_textarea = new JTextArea(5,10); 
				frame.add(skills_textarea);
				frame.add(new JScrollPane(skills_textarea));
				skills_textarea.setFont(new Font("Calibri",Font.PLAIN, 14));
				panel5.add(skills_textarea);
				
				//SEMINARS ATTEND
				JLabel seminars = new JLabel("Seminars Attend: "); 
				frame.add(seminars);
				panel5.add(seminars);
						
				JTextArea seminars_textarea = new JTextArea(5,10); 
				seminars_textarea.setBackground(Color.LIGHT_GRAY);
				//frame.add(seminars_textarea);
				//frame.add(new JScrollPane(seminars_textarea));
				//seminars_textarea.setFont(new Font("Calibri", Font.BOLD, 14));
				//JScrollPane scroll = new JScrollPane(seminars_textarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				//frame.add(scroll);
				
				//Color c4 = new Color(102,255,102);
				//panel5 = new JPanel();
				//panel5.setLayout(new GridLayout(0,2,5,5));
				//panel5.setBorder(BorderFactory.createEmptyBorder(15,900,15,900));
				//panel5.setBackground(c4);
				//frame.add(panel5, BorderLayout.CENTER);
				
				//panel5.add(motto);
				//panel5.add(motto_textarea);
				//panel5.add(skills);
				//panel5.add(skills_textarea);
				//panel5.add(seminars);
				//panel5.add(seminars_textarea);
				JScrollPane scroll = new JScrollPane(seminars_textarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				frame.add(scroll);
				panel5.add(scroll);
				
		
		//SUBMIT, RESET AND VALIDATE
		JButton submit = new JButton("SUBMIT");
		submit.setBackground(Color.CYAN);
		frame.add(submit);
		
		JButton reset = new JButton("RESET");
		reset.setBackground(Color.CYAN);
		frame.add(reset);
		
		JButton validate = new JButton("VALIDATE");
		validate.setBackground(Color.CYAN);
		frame.add(validate);
		
		
		//JScrollPane scroll2 = new JScrollPane(frame, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//frame.add(scroll2);
		//textArea.setLineWrap(true);
		//textArea.setWrapStyleWord(true);
		//window.add(scroll); 
		frame.setSize(550,700);
		frame.setVisible(true);
		//frame.pack();
		//frame.setLayout(null);
		//frame.setLocationRelativeTo(null);
		
	}
}
