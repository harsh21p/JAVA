class funx
{
	void add()
	{
		System.out.println("add is :"+ (5+6));
	}
	void sub(int x , int y)
	{
		System.out.println("sub is "+(x-y));
	}
	int mul ()
	{
		return 8*9;
	}
	int div(int x , int y)
	{
		return x/y;
	}
	Static void bc ()
		{
			x = 0;
		}
	public static void main(String args[])
	{
		funx o = new funx();
		o.add();
		o.sub(5,3);
		m=o.mul();
		System.out.println(m);
		d = o.div(10/5);
	}
}