import javax.swing.*; 
import java.awt.*;
import java.net.*;
import java.awt.event.*;
public class sample2 extends JFrame implements ActionListener 
{
       	 JLabel lb1,lb2;
	 JTextArea ta; 
	 JButton b; 
	 JButton pad, text; 
	 
	sample2()
	{ 
		
		lb1=new JLabel("Characters: "); 
		lb1.setBounds (50,50,100,20) ; 
		lb2=new JLabel("Words: "); 
	        lb2.setBounds (50,80,100,20) ; 
		ta=new JTextArea(5,5); 
		ta.setBounds (50,110,400,100) ; 
		b=new JButton("W Count");

		b.setBounds( 50,230,110,30 );

		b.addActionListener(this); 
		pad=new JButton("Color"); 
		pad.setBounds (180,230,110,30) ;
		pad.addActionListener(this);	
		text=new JButton("F_Color"); 
		text.setBounds (310,230,110,30) ;
		text.addActionListener(this);
		
		

		add(lb1);
		add(lb2);
		add(ta);
		add(b);
		add(pad);
		add(text);
		 
		setSize(550,400);
		setLayout(null);
		setVisible(true); 
		setDefaultCloseOperation (EXIT_ON_CLOSE);

	}

	public void actionPerformed (ActionEvent e) 
	{ 
		if(e.getSource()==b)
		{

			String text=ta.getText(); 
			lb1.setText("Characters: "+text.length()); 
			String words[]=text.split("\\s"); 
			lb2.setText("Words: "+words.length);
		}

		else if(e.getSource()==pad)
			{
				Color c =JColorChooser.showDialog(this, "Choose Color",Color.BLACK); ta.setBackground (c);
			}
			
			else if(e.getSource()==text)
				{
					Color c =JColorChooser.showDialog(this, "Choose Color",Color.BLACK);
					ta.setForeground(c);
				}
	
	}

	public static void main(String [] args)

	{
		sample2 z= new sample2();	
	}
}
