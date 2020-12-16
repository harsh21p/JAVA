import javax.swing.*;  
import java.awt.event.*;  
import java.time.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgeCalculator implements ActionListener

{  
    	JTextField t1,t2,t3,t4,t5; 
	JLabel l1,l2,l3,l4,l5; 

	String z;
	int age,age2,age3;
	JFrame f;
	JButton b1;
	

	AgeCalculator()
        {  
    	         f=new JFrame();
   		 t1=new JTextField();  
  		 t1.setBounds(50,100, 200,30);  
    		 t2=new JTextField();  
   		 t2.setBounds(50,150, 200,30); 
		 t3=new JTextField();  
   		 t3.setBounds(50,200, 200,30);  
		 t4=new JTextField(4);  
   		 t4.setBounds(50,300, 200,30);  
		 t5=new JTextField();  
   		 t5.setBounds(50,350, 200,30); 
	       	 b1=new JButton("Calculet");
		 b1.setBounds(130,240,100, 40);
		 b1.addActionListener(this); 

		 l1=new JLabel("ENTER YEAR");
		 l1.setBounds(50,80, 200,30);
   		 l2=new JLabel("ENTER MONTH") ;
		 l2.setBounds(50,130, 200,30);
    		 l3=new JLabel("ENTER DAY");
		 l3.setBounds(50,180, 200,30);
		 l4=new JLabel("YOUR AGE ");
		 l4.setBounds(50,280, 200,30);
		 l5=new JLabel("YOU ARE");
		 l5.setBounds(50,330, 200,30);
    

		
		f.add(b1);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true); 
  
	}         
    
	public void actionPerformed(ActionEvent e) 

	{  
       		
       		 
		if(e.getSource()==b1)
		{  
       		     	
      		  	
			String s1=t1.getText();  
      			String s2=t2.getText(); 
			String s3=t3.getText();
       			int y=Integer.parseInt(s1);  
        		int m=Integer.parseInt(s2); 
			int d=Integer.parseInt(s3);  

			LocalDate pdate = LocalDate.of(y,m,d);
		
       			LocalDate now = LocalDate.now();
        

        		Period diff = Period.between(pdate, now);
 
        		age=diff.getYears();
			age2=diff.getMonths();
			age3=diff.getDays();

			if( age < 18 )
			{
				z="child";
			}
			else
			{
				if( age >= 18 && age <= 40)
				{
					z="young";
				}
				else
				{
					if( age > 40 )
					{
						z="adult";
					}
				}
			} 
      		}
		
       		String result=String.valueOf(age); 
		String result1=String.valueOf(age2);
		String result2=String.valueOf(age3); 
        	t4.setText("YR ="+result+" MO ="+result1+" DA ="+result2);  
		t5.setText(z);
	 }  

	
	public static void main(String[] args) 
	{  
    		new AgeCalculator();  
	} 

}  