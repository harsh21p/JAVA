import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.*;
import java.net.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener 
{ 
	
	static JFrame f; 

	static JTextField l; 

	String s0, s1, s2; 

	calculator() 
	{ 
		s0 = s1 = s2 = ""; 
	} 

	
	public static void main(String args[]) 
	{ 
		f = new JFrame("calculator"); 
		
		calculator c = new calculator(); 
		   TextArea ta; 
          	Label l1; 
         	 Label l2; 
          	Button b; 
	

           
            ta = new TextArea(10,10); 
          
             b = new Button("Count"); 
          
             l1 = new Label(""); 
 
             l2 = new Label(""); 
           

		
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

		p2.add(b);
             	p2.add(ta);
                p2.add(l1);
                p2.add(l2);

		 
		
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

		b.addActionListener(new ActionListener()
	     {
             	  public void actionPerformed(ActionEvent e) 
		  {
                  	int s = ta.getText().split("\\s+").length;
                  	int c = ta.getText().length();
                  	l1.setText("Words " + s);
                  	l2.setText("Characters " + c);
               	  }
             });

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

