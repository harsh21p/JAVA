import java.util.Scanner;
class construct
{
	int a,b,c;
	construct()
	{	
		a=10;
		b=20;
		c=a+b;
		System.out.println("VAlue if c is "+c);
	}
	construct(int x,int y,int z)
	{	
		int w=x+y+z;
		System.out.println("Value of w is "+w);
	}
	public static void main(String[]args)
	{	
		construct c1=new construct();
		construct c2=new construct(10,20,70);
	}
	
}