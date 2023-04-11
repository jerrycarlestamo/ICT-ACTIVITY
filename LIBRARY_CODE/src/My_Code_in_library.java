import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class My_Code_in_library extends JFrame {
	
	private static JFrame f;
	private static JLabel LA;
	private static JLabel LS;
//	private static DefaultTableModel model;
	private static JPanel contentPane;
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
	private static JTable B;
	private static JRadioButton M;
	private static JRadioButton FM;
	
	public static void main(String[] args) {
		
		f = new JFrame("Library System Iinterface");
		f.setSize(1500,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(null);
		
		f.setLayout(null);
		
		LA = new JLabel("library borrowers");
		LA.setBounds(250, 25, 400, 40);
		
		//Object [] columns = {"Borrowers'Name","Book reference NO","Student ID NO","Borrowing time","Expiration Date	"};
		//model = new DefaultTableModel();
		
		//model.setColumnIdentifiers(columns);
		//A.setModel(model);
		
		//A.setRowHeight(30);
		
		LS = new JLabel("Registration: ");
		LS.setBounds(50, 35, 100, 100);
		
		B = new JTable();
		B.setBounds(655, 162, 200, 350);
		contentPane.add(B);
		
		LO = new JLabel("Borrowers'Name: ");
		LO.setBounds(70, 75, 120, 100);
		TL = new JTextField();
		TL.setBounds(220, 115, 150, 25);
		
		LX = new JLabel("Book reference NO.: ");
		LX.setBounds(70, 100, 160, 135);
		JE = new JTextField();
		JE.setBounds(220, 155, 150, 25);
		
		LU = new JLabel("Student ID NO.: ");
		LU.setBounds(70, 140, 160, 135);
		TY = new JTextField();
		TY.setBounds(220, 190, 150, 25);
		
		LK = new JLabel("Borrowing time: ");
		LK.setBounds(70, 180, 160, 135);
		RY = new JTextField();
		RY.setBounds(220, 230, 150, 25);
		
		LC = new JLabel("Expiration Date: ");
		LC.setBounds(70, 220, 160, 135);
		TG = new JTextField();
		TG.setBounds(220, 270, 150, 25);
		
		LQ = new JLabel("Mobile Number: ");
		LQ.setBounds(68, 255, 160, 135);
		TV = new JTextField();
		TV.setBounds(220, 310, 150, 25);
		
		LM = new JLabel("Whats is you Gender:");
		LM.setBounds(70, 320, 160, 135); 
		
		M = new JRadioButton("MALE");
		M.setBounds(220, 350, 100, 80);
	 
		FM = new JRadioButton("FEMALE");
		FM.setBounds(320, 350, 150, 80);
		
		
		
		//JButton b1 = new JButton("register");
		//b1.setBounds(105, 245, 100, 40);
		//JButton b2 = new JButton("clear");
		//b2.setBounds(225, 245, 100, 40);
		
		
		f.setVisible(true);
		
		
		//FUCNCTION SYSTEM - JLABEL
		f.add(LA);
		f.add(LS);
		
		
		//f.add(A);
		
		f.add(B);
		
		f.add(LO);
		f.add(TL);
		
		f.add(LX);
		f.add(JE);
		
		f.add(LU);
		f.add(TY);
		
		f.add(LK);
		f.add(RY);
		
		f.add(LC);
		f.add(RY);
		
		f.add(LQ);
		f.add(TV);
		
		f.add(LM);
		f.add(TG);
		
		f.add(M);
		f.add(FM);
		
		//f.add(b2);
		//f.add(b1);
		
		
		
		

	}

}
