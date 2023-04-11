// ESTAMO,JERRY CARL - SECTION SIRIUS - FEB,22 I CODE THIS BUT I DON'T KNOW THIS IS NEEDED IN OUR PROGRAMING

package my_code;

import javax.swing.*;

public class mycode {

	public static void main(String[] args) {
		 JFrame f = new JFrame("YOUR NAME HERE");
		 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(false);
		
		JButton b1 = new JButton("1st button");
		b1.setBounds(130, 120, 250, 70);
		
		JButton b2 = new JButton("2nd button");
		b2.setBounds(130, 200, 250, 70);
		
		JButton b3 = new JButton("3rd button");
		b3.setBounds(130, 285, 250, 70);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		 

	}

}
