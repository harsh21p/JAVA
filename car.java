class car 
{
	int ht,wt;
	String clr;
	void traval()
	{
		System.out.println("use for Travaling");
	}
	void carrer()
	{
		System.out.println("use for carry objects");
	}
	public static void main (String[] args)
	{
		car c=new car();
		c.ht=3;
		c.wt=5;
		c.clr="BLACK";
		System.out.println("ht"+c.ht +" wt="+c.wt +" clr="+c.clr);
	}
	
}