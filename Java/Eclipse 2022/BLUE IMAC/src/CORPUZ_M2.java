import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CORPUZ_M2 implements ActionListener{

	public static void main(String args[])
	{  
		new CORPUZ_M2();  
	}
	
	private JLabel Current = new JLabel("CURRENT: ");
	private JLabel Resistance = new JLabel("RESISTANCE: ");
	private JLabel Voltage = new JLabel("VOLTAGE: ");
	private JTextField CURRENT = new JTextField(20);
	private JTextField RESISTANCE = new JTextField(20);
	private JTextField VOLTAGE = new JTextField(20);
	private JFrame frame;
	private JButton COMPUTE = new JButton("COMPUTE");
	
	public CORPUZ_M2()
	{
		frame = new JFrame ("OHM'S LAW");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(0,0);
		frame.setLayout(new BorderLayout());
		
		JPanel newPanel = new JPanel(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(Current, constraints);
        
        constraints.gridx = 1;
        newPanel.add(CURRENT, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(Resistance, constraints);
         
        constraints.gridx = 1;
        newPanel.add(RESISTANCE, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(Voltage, constraints);
         
        constraints.gridx = 1;
        newPanel.add(VOLTAGE, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.EAST;
        newPanel.add(COMPUTE, constraints);
		
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Calculating Ohm's Law"));
         
        
        COMPUTE.setForeground(Color.YELLOW);
        COMPUTE.setBackground(Color.GRAY);
        newPanel.setBackground(Color.BLACK);
        Current.setForeground(Color.YELLOW);
        Resistance.setForeground(Color.YELLOW);
        Voltage.setForeground(Color.YELLOW);
        
        COMPUTE.addActionListener(this);
        
        
        frame.add(newPanel); 
        frame.pack();
        frame.setLocationRelativeTo(null);
        
		frame.setVisible(true);
		//frame. setResizable(false);
		frame.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if(e.getSource()==CURRENT&&e.getSource()==CURRENT)
		//{
				String inputCURRENT = CURRENT.getText();
				double I = Double.parseDouble(inputCURRENT);
				String inputRESISTANCE = RESISTANCE.getText();
				double R = Double.parseDouble(inputRESISTANCE);
				String inputVOLTAGE = VOLTAGE.getText();
				double V = Double.parseDouble(inputVOLTAGE);
		
				if(V == 0)
				{
					double VV = I*R;
					VOLTAGE.setText(VV + " V");
				}
				else if(I == 0)
				{
					double II = V/R;
					CURRENT.setText(II + " I");
				}
				else if(R == 0)
				{
					double RR = V/I;
					RESISTANCE.setText(RR + " R");
				}
				
		//}
		
	}
}
