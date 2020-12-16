import java.util.Scanner;

class math{
	int a,b,c;
	void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st and 2nd value");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition="+c);
		
	}
	void sub(int a,int b)
	{
		c=a-b;
		System.out.println("sub="+c);
	}
	int mul()
	{
		
		c=a*b;
		System.out.println("multiplication="+c);
		
		return c;
		
	}
	float div (int a,int b) 
	{
		
		c=a/b;
		System.out.println("division="+c);
		return c;
	}
	static void
	print()
	{
		System.out.println("Yash Mahajan");
	}
	public static void main(String[]args)
	{
		functions x=new functions();
		x.add();
		x.sub(11,6);
		x.mul();
		x.div(12, 2);
		print();
		
		
	}
	
}
