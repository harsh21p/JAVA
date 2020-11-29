import java.io.*;
class Addition1
{
	public static void main(String[] args)
	{
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		String s;
		int a,d,c;
		try
		{
			System.out.println("Enter value of first no =");
			s=b.readLine();
			a=Integer.parseInt(s);
			System.out.println("Enter value of second no =");
			s=b.readLine();
			d=Integer.parseInt(s);
			c=a+d;
			System.out.println("Addiion of no ="+c);
			
			
		}
		catch(Exception ex)
		{}
	}
}