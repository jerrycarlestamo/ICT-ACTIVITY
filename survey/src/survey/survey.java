// ESTAMO,JERRY CARL - SECTION SIRIUS - FEB,22 I CODE THIS BUT I DON'T KNOW THIS IS NEEDED IN OUR PROGRAMING

package survey;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.ListSelectionModel;

public class survey extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					survey frame = new survey();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public survey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(107, 126, 139, 30);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(107, 185, 139, 30);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(107, 64, 139, 30);
		contentPane.add(textField_2);
		
		Label label = new Label("Name :");
		label.setBounds(30, 64, 60, 30);
		contentPane.add(label);
		
		Label label_1 = new Label("subject: ");
		label_1.setBounds(30, 121, 60, 35);
		contentPane.add(label_1);
		
		Label label_1_1 = new Label("code");
		label_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1_1.setBounds(32, 162, 60, 53);
		contentPane.add(label_1_1);
		
		table = new JTable();
		table.setBounds(655, 162, 1, 1);
		contentPane.add(table);
	}
}
