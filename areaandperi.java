import java.io.*;
class areaandperi
{
	public static void main(String[] args)
	{
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a,d,c;
		try
		{
			System.out.println("Enter length of rectangle = ");
			s=b.readLine();
			a=Integer.parseInt(s);
			System.out.println("Enter a width of reactangle =");
			s=b.readLine();
			d=Integer.parseInt(s);
			c=a*d;
			System.out.println("Area of reactangle ="+c);
			c=2*(a+d);
			System.out.println("Area of reactangle ="+c);
		}	
		catch(Exception ex)
		{}
	}	
}