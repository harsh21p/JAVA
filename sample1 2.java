import javax.swing.*; 
import java.awt.*;
import java.net.*;
import java.awt.event.*;

class sample1 extends javax.swing.JFrame implements ActionListener 
{ 
	
	static JFrame f; 
	static JTextField l; 
	String s0, s1, s2; 

	sample1() 
	{ 
		s0 = s1 = s2 = ""; 
	} 

	
	public static void main(String[] args) 
	{ 
		

	
		f = new JFrame("JAVAPA2"); 
		
		sample1 c = new sample1(); 
		 
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
		

		
       		
     
       		f.setLayout(new FlowLayout());
       		f.add(p1);
		p1.setPreferredSize(new Dimension(240,200));
       				
		
		f.setSize(250,210);
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

