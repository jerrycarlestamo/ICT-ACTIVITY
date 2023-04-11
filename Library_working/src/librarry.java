// ESTAMO,JERRY CARL - SECTION SIRIUS - FEB,22 I CODE THIS BUT I DON'T KNOW THIS IS NEEDED IN OUR PROGRAMING

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.table.DefaultTableModel;

public class librarry {
	//THIS IS MY WORK OF LIBRARY BY ESTAMO,JERRY CARL U DATE- 03-10-2023
	
	
	private static JFrame f;
	private static JLabel LA;
	private static JLabel LS;
	private static DefaultTableModel model;
	private static JLabel LO;
	private static JLabel LX;
	private static JLabel LK;
	private static JLabel LU;
	private static JLabel LM ;
	private static JLabel LC ;
	private static JLabel LQ ;
	private static JTextField TL;
	private static JTextField JE;
	private static JTextField RY;
	private static JTextField TY;
	private static JTextField TG;
	private static JTextField TV;
	private static JTable Table;
	private static JButton b1;
	private static JButton b2;
	private static JTextField textField;

	public static void main(String[] args) {
		
		f = new JFrame("Library System Iinterface");
		f.setSize(1260,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color(192, 192, 192));
		f.getContentPane().setForeground(Color.WHITE);
		f.setBounds(100, 100, 1360, 500);
		f.getContentPane().setLayout(null);
		f.setLocationRelativeTo(null);
		
		
		LA = new JLabel("library borrowers");
		LA.setFont(new Font("Tahoma", Font.BOLD, 16));
		LA.setBounds(220, 21, 167, 40);
		
		Table = new JTable();
		Object[] columns = {"Borrowers", "Book reference", "Student ID", "Borrowing time","Expiration Date","Mobile Number","Whats is you Gender"};
		model = new  DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
		Table.setModel(model);
		
		Table.setBackground(Color.white);
		Table.setForeground(Color.black);
		Table.setSelectionBackground(Color.red);
		Table.setGridColor(Color.red);
		Table.setSelectionForeground(Color.white);
		Table.setFont(new Font("Tahoma", Font.BOLD, 17));
		Table.setRowHeight(30);
		Table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(Table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(416, 25, 836, 310);
		f.getContentPane().add(pane);
		
		JScrollPane scrollPane = new JScrollPane();
		pane.setRowHeaderView(scrollPane);
		
		Object[] row = new Object[7];
		
		
		LS = new JLabel("Registration: ");
		LS.setFont(new Font("Tahoma", Font.BOLD, 14));
		LS.setBounds(52, 49, 100, 40);
		
		LO = new JLabel("Borrowers Name: ");
		LO.setBounds(52, 107, 133, 25);
		TL = new JTextField();
		TL.setBounds(220, 107, 150, 25);
		
		LX = new JLabel("Book Reference NO : ");
		LX.setBounds(52, 146, 116, 25);
		JE = new JTextField();
		JE.setBounds(220, 146, 150, 25);
		
		LU = new JLabel("Student ID NO.: ");
		LU.setBounds(52, 182, 110, 33);
		TY = new JTextField();
		TY.setBounds(220, 186, 150, 25);
		
		LK = new JLabel("Borrowing time: ");
		LK.setBounds(52, 226, 100, 30);
		RY = new JTextField();
		RY.setBounds(220, 222, 150, 25);
		
		LC = new JLabel("Expiration Date: ");
		LC.setBounds(52, 260, 100, 33);
		TG = new JTextField();
		TG.setBounds(220, 258, 150, 25);
		
		LQ = new JLabel("Mobile Number: ");
		LQ.setBounds(52, 300, 82, 35);
		TV = new JTextField();
		TV.setBounds(220, 297, 150, 25);
		
		LM = new JLabel("Whats is you Gender:");
		LM.setBounds(52, 330, 110, 38);
		
		textField = new JTextField();
		textField.setBounds(220, 339, 150, 25);
		f.getContentPane().add(textField);
		
		JButton b1 = new JButton("ADD ");
		b1.setForeground(new Color(0, 0, 0));
		b1.setBackground(new Color(0, 255, 255));
		b1.setBounds(62, 382, 117, 40);
		f.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent erg0) {
				row[0] = TL.getText();
				row[1] = JE.getText();
				row[2] = TY.getText();
				row[3] = RY.getText();
				row[4] = TG.getText();
				row[5] = TV.getText();
				row[6] = textField.getText();
						
				model.addRow(row);
			}
			
		});
		
		JButton b2 = new JButton("DELETE");
		b2.setBackground(new Color(255, 0, 0));
		b2.setBounds(254, 382, 133, 40);
		f.getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent erg0) {
				// TODO Auto-generated method stub
				
			}
			
		}); 
		
		
		f.setVisible(true);
		
		
		//FUCNCTION SYSTEM - JLABEL
		f.getContentPane().add(LA);
		f.getContentPane().add(LS);
		
		
		//f.add(A);
		
		
		f.getContentPane().add(LO);
		f.getContentPane().add(TL);
		
		f.getContentPane().add(LX);
		f.getContentPane().add(JE);
		
		f.getContentPane().add(LU);
		f.getContentPane().add(TY);
		
		f.getContentPane().add(LK);
		f.getContentPane().add(RY);
		
		f.getContentPane().add(LC);
		f.getContentPane().add(RY);
		
		f.getContentPane().add(LQ);
		f.getContentPane().add(TV);
		
		f.getContentPane().add(LM);
		f.getContentPane().add(TG);
		
		
		
		

	}
}
