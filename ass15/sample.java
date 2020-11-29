import javax.swing.*;
class sample
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JButton b= new JButton("ok");
		JTextField t=new JTextField("username");
		JCheckBox c=new JCheckBox("harsh");
		JRadioButton r=new JRadioButton("close");
		
		f.getContentPane().add(p);
		
		p.add(b);
		p.add(t);
		p.add(c);
		p.add(r);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
	}
}