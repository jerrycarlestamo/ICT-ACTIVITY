import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class table {

	public static void main(String[] args) {
		JTable table = new JTable();
		Object[] columns = {"First name", "Last name", "Job Position", "Phone number"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0,0,0));
		f.getContentPane().setForeground(Color.WHITE);
		f.setBounds(100,100,1101,527);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.setLocationRelativeTo(null);
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		table.setSelectionBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Tahoma", Font.PLAIN,17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.red);
		pane.setBackground(Color.white);
		pane.setBounds(10, 28, 1055, 287);
		f.getContentPane().add(pane);
		
		Object[] row = new Object[4];
		
		
		f.setVisible(true);
		

	}

}
