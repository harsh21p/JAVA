class A
{
	void area()
	{
		int x=10;
		int y=10;
		int c = x*y;
		System.out.println("Hello "+ c);
	}
}
class B extends A
{
	void area()
	{
		int x=20;
		int y=40;
		int d = x*y;
		System.out.println("World "+ d);
		super.area();
	}


	public static void main(String[]args)
	{
		
		B ol=new B();
		ol.area();
	}

}