import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GUI implements ActionListener {
	private static JLabel UL;
	private static JTextField UT;
	private static JLabel PL;
	private static JPasswordField PT;
	private static JButton B;
	private static JLabel S;

	public static void main(String[] args) {
		
		JPanel P = new JPanel();
		JFrame f = new JFrame();
		f.setSize(350,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(P);
		
		P.setLayout(null);
		
		UL = new JLabel("Username"); // USER LABEL
		UL.setBounds(10,20,80,25);
		P.add(UL);
		
		UT = new JTextField(20); // USER TEXT 
		UT.setBounds(100,20,165,25);
		P.add(UT);
		
		PL = new JLabel("Password"); // PASSWORD LABEL
		PL.setBounds(10,50,80,25);
		P.add(PL);
		
		PT = new JPasswordField(); // PASSWORD TEXT 
		PT.setBounds(100,50,165,25);
		P.add(PT);
		
		B = new JButton("Login"); // BUTTON
		B.setBounds(10,80,80,25);
		B.addActionListener(new GUI());
		P.add(B);
		
		S = new JLabel(""); // SUCCESS 
		S.setBounds(10,110,300,25);
		P.add(S);
	
		
		
		f.setVisible(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = UT.getText();
		String Password = PT.getText();
		
		if(user.equals("JOHNCARL") && Password.equals("john123")) {
			S.setText("login successfully!");
		}
		
	}

}
