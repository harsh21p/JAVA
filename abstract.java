abstract class abstest
{
	abstract void set();
	abstract void display();

}


class test extends abstest
{
	int a,b; 
	void set()
	{
		a = 10;
		b=5;
	 }
	
	 
	void display() 
	{
		System.out.println("a ="+a);
	
		System.out.println("b="+b);
	}
	
}
class test 
{
	public static void main(String[] args)
	{
		abstest t = new test ();
		t.set();
		t.display();
	}
}
