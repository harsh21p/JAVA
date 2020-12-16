import javax.swing.*; 
import java.awt.*;
import java.net.*;
import java.awt.event.*;

class sample extends javax.swing.JFrame implements ActionListener 
{ 
	
	static JFrame f; 
	static JTextField l; 
	String s0, s1, s2; 

	sample() 
	{ 
		s0 = s1 = s2 = ""; 
	} 

	
	public static void main(String[] args) 
	{ 
		

		swingstring x=new swingstring();
		f = new JFrame("JAVAPA2"); 
		
		sample c = new sample(); 
		 
		l = new JTextField(20); 

		
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 

	
		b0 = new JButton("0"); 
		b1 = new JButton("1"); 
		b2 = new JButton("2"); 
		b3 = new JButton("3"); 
		b4 = new JButton("4"); 
		b5 = new JButton("5"); 
		b6 = new JButton("6"); 
		b7 = new JButton("7"); 
		b8 = new JButton("8"); 
		b9 = new JButton("9"); 

		
		beq1 = new JButton("="); 

		ba = new JButton("+"); 
		bs = new JButton("-"); 
		bd = new JButton("/"); 
		bm = new JButton("*"); 
		beq = new JButton("C"); 

		
		be = new JButton("."); 

		JPanel p1 = new JPanel(); 
		JPanel p2 = new JPanel();
       		JPanel p3 = new JPanel();
      	        JPanel p4 = new JPanel();

	
		bm.addActionListener(c); 
		bd.addActionListener(c); 
		bs.addActionListener(c); 
		ba.addActionListener(c); 
		b9.addActionListener(c); 
		b8.addActionListener(c); 
		b7.addActionListener(c); 
		b6.addActionListener(c); 
		b5.addActionListener(c); 
		b4.addActionListener(c); 
		b3.addActionListener(c); 
		b2.addActionListener(c); 
		b1.addActionListener(c); 
		b0.addActionListener(c); 
		be.addActionListener(c); 
		beq.addActionListener(c); 
		beq1.addActionListener(c); 

	
		p1.add(l); 
		p1.add(ba); 
		p1.add(b1); 
		p1.add(b2); 
		p1.add(b3); 
		p1.add(bs); 
		p1.add(b4); 
		p1.add(b5); 
		p1.add(b6); 
		p1.add(bm); 
		p1.add(b7); 
		p1.add(b8); 
		p1.add(b9); 
		p1.add(bd); 
		p1.add(be); 
		p1.add(b0); 
		p1.add(beq); 
		p1.add(beq1);

	
		p3.add(x.lb1);	
		p3.add (x.lb2);
		p3.add(x.ta);
		p3.add(x.b); 
		p3.add(x.pad); 
		p3.add(x.text);
		

		p1.setPreferredSize(new Dimension(240,200));
		p2.setPreferredSize(new Dimension(240,200));
		p3.setPreferredSize(new Dimension(240,200));
		p4.setPreferredSize(new Dimension(240,200));
		
		JSplitPane z1 = new JSplitPane(SwingConstants.HORIZONTAL, p1 ,p2);
       		JSplitPane z2 = new JSplitPane(SwingConstants.HORIZONTAL, p3 ,p4);
     
       		f.setLayout(new FlowLayout());
       		f.add(z1);
       		f.add(z2);
       		f.setSize(1000,1000);
       		f.setVisible(true);
		f.setDefaultCloseOperation (EXIT_ON_CLOSE);



		
	}
	public void actionPerformed (ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 

		
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') 
		{ 
			
			if (!s1.equals("")) 
			{
				s2 = s2 + s;
			} 
			else
			{
				s0 = s0 + s; 
			}
			
			l.setText(s0 + s1 + s2); 
		} 

		else 

			if (s.charAt(0) == 'C') 
			{ 
				s0 = s1 = s2 = ""; 
				l.setText(s0 + s1 + s2); 
			} 
			else 
			
				if (s.charAt(0) == '=') 
				{ 
					double te; 
					if (s1.equals("+"))
					{ 
						te = (Double.parseDouble(s0) + Double.parseDouble(s2));
					} 
					else
					{ 
					
						if (s1.equals("-")) 
						{
							
							te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
						}
						else 
						{	

							if (s1.equals("/")) 
							{
								te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
							}
							else
							{
								te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
							}
						}
					}
					 

					 l.setText(s0 + s1 + s2 + "=" + te); 
			                 s0 = Double.toString(te); 
			                 s1 = s2 = ""; 
		} 
		else 
		{ 
			
			if (s1.equals("") || s2.equals("")) 
			{
				s1 = s; 
			}
			else 
			{ 
				double te; 

				
				if (s1.equals("+")) 
				{
					te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
				}
				else
				{	 if (s1.equals("-")) 
					 {
						te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
					 }
					 else
					 { 
						if (s1.equals("/")) 
						{
							te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
						}
						else
						{
							te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
						}
					 }
				}

				
				s0 = Double.toString(te); 
				s1 = s; 
				s2 = ""; 
				
				
			
			} 

			
			l.setText(s0 + s1 + s2); 
		} 
	} 
} 




public class swingstring extends JFrame implements ActionListener 
{
       	 JLabel lb1,lb2;
	 JTextArea ta; 
	 JButton b; 
	 JButton pad, text; 
	 
	swingstring()
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
}

