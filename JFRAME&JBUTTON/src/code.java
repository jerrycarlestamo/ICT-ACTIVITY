import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class code {

	public static void main(String[] args) {
		
			JFrame f = new JFrame();
		
		//JPanel PL = new JPanel();
		JLabel l = new JLabel("this is my work");
		//PL.setBounds(40,80,200,200);//
		//PL.setBackground(Color.blue);//
		
		JButton b = new JButton("Click Here");
		
		//BUTTON SETTINGS
		b.setBounds(130,100,100,30);
		b.setBackground(Color.yellow);
		
		JButton q = new JButton("Click Here");
		q.setBounds(100, 70, 100, 30);
		q.setBackground(Color.orange);
		
		JButton e = new JButton("Click Here");
		e.setBounds(150, 150, 100, 30);
		e.setBackground(Color.red);
		
		
		// FRAME SETTINGS V.1
		f.setSize(600,600); //dimensions
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Estamo website");
		
		// LABEL SETTINGS
		l.setBounds(250,100,100,100);
		
		// FRAME SETTINGS V.2
		f.add(q);
		//f.add(PL);//
		f.add(l);
		f.add(e);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true); // true means frame will be visible
		// BUTTON SETTINGS
		f.add(b);

	}

}
