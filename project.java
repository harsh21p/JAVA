import java.util.Scanner;
class project
{
	int a,b,c;
	void accept()
	{
		System.out.println("Enyter value of a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
	}
	void display()
	{
		System.out.println("Value of a and b is"+a+","+b);
                
	}
	int addition()
	{
		c=a+b;
		return c;
	}
	public static void main(String[]args)
	{
		project p=new project();
		p.accept();
		p.display();
		p.addition();
		System.out.println("Value of c"+p.c);
	}
}