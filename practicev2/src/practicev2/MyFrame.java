package practicev2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JRadioButton M = new JRadioButton("MALE");
		JRadioButton FM = new JRadioButton("FEMALE");
		
		this.add(M);
		this.add(FM);
		this.pack();
		this.setVisible(false);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
