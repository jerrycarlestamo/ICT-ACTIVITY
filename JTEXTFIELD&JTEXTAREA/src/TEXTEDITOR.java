// ESTAMO,JERRY CARL - SECTION SIRIUS - FEB,22 I CODE THIS BUT I DON'T KNOW THIS IS NEEDED IN OUR PROGRAMING


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class TEXTEDITOR extends JFrame implements ActionListener{
	
	JTextArea TA;//TextArea
	JScrollPane SP;//ScrollPane
	JLabel FL;//FONTLABEL
	JSpinner FSS;//FONT SIZE SPINER
	JButton FCB;//FONTCOLORBUTTON
	JComboBox FB;//FONTBOX
	
	
	TEXTEDITOR(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("estamo text editor"); 
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		TA = new JTextArea();
		TA.setLineWrap(true);
		TA.setWrapStyleWord(true);
		TA.setFont(new Font("Arial",Font.PLAIN,20));
		
		
		SP = new JScrollPane(TA);
		SP.setPreferredSize(new Dimension(450,450));
		SP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);	
		
		FL = new JLabel("Font: ");
		
		FSS = new JSpinner();
		FSS.setPreferredSize(new Dimension(50,25));
		FSS.setValue(20);
		FSS.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				TA.setFont(new Font(TA.getFont().getFamily(),Font.PLAIN,(int)FSS.getValue()));
				
			}
			
		});
		
		FCB = new JButton("Color");
		FCB.addActionListener(this);
		
		String[] Fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		FB = new JComboBox(Fonts);
		FB.addActionListener(this);
		FB.setSelectedItem("Arial");
		
		this.add(FL);
		this.add(FSS);
		this.add(FCB);
		this.add(FB);
		this.add(SP);
		this.setVisible(false);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==FCB) {
			JColorChooser ColorChooser = new JColorChooser();
			
			Color color = ColorChooser.showDialog(null, "Choose a Color", Color.black);
			
			TA.setForeground(color);
			
		}
		if(e.getSource()==FB) {
			TA.setFont(new Font((String)FB.getSelectedItem(),Font.PLAIN,TA.getFont().getSize()));
		}
		
	}

}
