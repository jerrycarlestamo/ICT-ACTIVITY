// ESTAMO,JERRY CARL - SECTION SIRIUS - FEB,22 I CODE THIS BUT I DON'T KNOW THIS IS NEEDED IN OUR PROGRAMING
// STRAND SO I WILL SHERE IT TO YOU MAAM MY CREATE CODE I FINISH THIS IN FEB 26 AND MY PARTNER HERE IS ALEXIS LOLONG 


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener {
	
	JFrame f;
	JTextField tf; 
	JButton[] NB = new JButton[10];
	JButton[] FB = new JButton[9];
	JButton AB,SB,MB,DB; 
	JButton db, EB, dB, CB, NGB;
	JPanel PL;
	
	Font MF = new Font("Ink Free",Font.BOLD,30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	calculator(){
				// FRAME SETTINGS V.1
				f = new JFrame("Calculator");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(420,550);
				f.setLayout(null);
				
				// TEXTFIELD SETTINGS
				tf = new JTextField();
				tf.setBounds(50,25,300,50);
				tf.setFont(MF);
				tf.setEditable(false);
				
				//BUTTON SETTINGS V.1
				AB = new JButton("+");
				SB = new JButton("-");
				MB = new JButton("*");
				DB = new JButton("/");
				db = new JButton(".");
				EB = new JButton("=");
				dB = new JButton("Delete");
				CB = new JButton("clear");
				NGB = new JButton("(-)");
				
				//FUNTION SETTINGS
				FB[0] = AB;
				FB[1] = SB;
				FB[2] = MB;
				FB[3] = DB;
				FB[4] = db;
				FB[5] = EB;
				FB[6] = dB;
				FB[7] = CB;
				FB[8] = NGB;
				
				//FOR SETTINGS (FOR FB)
				for(int i =0;i<9;i++) {
					FB[i].addActionListener(this);
					FB[i].setFont(MF);
					FB[i].setFocusable(false);
				}
				//FOR SETTINGS (FOR NB)
				for(int i =0;i<10;i++) {
					NB[i] = new JButton(String.valueOf(i));
					NB[i].addActionListener(this);
					NB[i].setFont(MF);
					NB[i].setFocusable(false);
					
				}
				     //BOUNDS SETTINGS 
				NGB.setBounds(50,430,100,50);
				dB.setBounds(150,430,100,50);
				CB.setBounds(250,430,100,50);
				
				//PANEL SETTINGS 
				PL = new JPanel();
				PL.setBounds(50,100,300,300);
				PL.setLayout(new GridLayout(4,4,10,10));
				
				
				PL.add(NB[7]);
				PL.add(NB[8]);
				PL.add(NB[9]);
				PL.add(DB);
				PL.add(NB[4]);
				PL.add(NB[5]);
				PL.add(NB[6]);
				PL.add(MB);
				PL.add(NB[1]);
				PL.add(NB[2]);
				PL.add(NB[3]);
				PL.add(SB);
				PL.add(db);
				PL.add(NB[0]);
				PL.add(EB);
				PL.add(AB);
				
				//FRAME SETTINGS V.2
				f.add(PL);
				f.add(NGB);
				f.add(dB);
				f.add(CB);
				f.add(tf);
				f.setVisible(false);
			}
				public static void main(String[] args) {
		
					calculator CAL = new calculator();
	}

	public void actionPerformed(ActionEvent e)	 {
		for(int i=0;i<10;i++) {
			if(e.getSource() == NB[i]) {
				tf.setText(tf.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==db) {
			tf.setText(tf.getText().concat("."));
		}
		if(e.getSource()==AB) {
			num1 = Double.parseDouble(tf.getText());
			operator = '+';
			tf.setText("");
		}
		if(e.getSource()==SB) {
			num1 = Double.parseDouble(tf.getText());
			operator = '-';
			tf.setText("");
		}
		if(e.getSource()==MB) {
			num1 = Double.parseDouble(tf.getText());
			operator = '*';
			tf.setText("");
		}
		if(e.getSource()==DB) {
			num1 = Double.parseDouble(tf.getText());
			operator = '/';
			tf.setText("");
		}
		if(e.getSource()==EB) {
			num2 = Double.parseDouble(tf.getText());
			
			switch(operator) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			}
			tf.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==CB) {
			num1 = Double.parseDouble(tf.getText());
			tf.setText("");
		}
		if(e.getSource()==dB) {
			String s = tf.getText();
			tf.setText("");
			for(int i=0;i<s.length()-1;i++) {
				tf.setText(tf.getText()+s.charAt(i));
			}
		}
		if(e.getSource()==NGB) {
			double tp = Double.parseDouble(tf.getText());
			tp*=-1;
			tf.setText(String.valueOf(tp));
			}
		
	}

}
