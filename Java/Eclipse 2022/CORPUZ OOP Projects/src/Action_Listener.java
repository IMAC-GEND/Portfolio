import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Action_Listener implements ActionListener {
	
	public static void main (String[] args)
	{
		Action_Listener GUI = new Action_Listener();
	}
	
	private JFrame frame;
	private JTextField heightField, weightField;
	private JLabel BMILabel;
	private JButton ComputeButton;
	
	public Action_Listener()
	{
		heightField = new JTextField(5);
		weightField = new JTextField(5);
		BMILabel = new JLabel("Type your height and weight");
		ComputeButton = new JButton("Compute");
		ComputeButton.addActionListener(this);
		
		JPanel north = new JPanel (new GridLayout(2,2));
		north.add(new JLabel("Height: "));
		north.add(heightField);
		
		north.add(new JLabel("Weight: "));
		north.add(weightField);
		frame = new JFrame ("BMI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH);
		frame.add(BMILabel, BorderLayout.CENTER);
		frame.add(ComputeButton, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		String heightText = heightField.getText();
		double height = Double.parseDouble(heightText);
		String weightText = weightField.getText();
		double weight = Double.parseDouble(weightText);
		double BMI = weight / (height*height)*703;
		BMILabel.setText("BMI: " + BMI);
		JOptionPane.showMessageDialog(null, "BMI: " + BMI );
	}
}
