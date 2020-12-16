class outer 
{
	int a , b, c;
	void accept ()
	{
		a = 10;
		b = 15;
		c = 30;
	}
class inner 
	{
		void add ()
		{
			int d = a+b+c;
		}
	}
	void display()
		{
			System.out.println(a+b+c+d);
			inner i = new inner();
			i.add();
			
		}
}
class Test
{
	public static void main(String args[])
	{
		outer o = new outer();
		o.accept();
		o.display();
	}
}