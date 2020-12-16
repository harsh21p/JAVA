import java.util.Scanner;
class method
{
	int a,b,c;
	
	void add()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Value of c is"+c);
		
	}
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Value of z is"+z);

	}
	public static void main(String[]args)
	{
		method m=new method();
		m.add();
		m.add(10,90);
	}
}