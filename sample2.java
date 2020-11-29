import java.io.*;
class sample2
{
	public static void main(String[] args)
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int x;
		try
		{

			System.out.println("Enter a no =");
			s=b.readLine();
			System.out.println("The givan no is ="+s);
			x=Integer.parseInt(s);
			System.out.println("its converted into int="+x);
		}
		catch(Exception ex)
		{}
	}
}