class pen 
{
	int ht,wt,width;
	void write ()
	{
		System.out.println("use for writing");
		
	}
	
	public static void main(String[] args)
	{
		pen p= new pen();
		p.ht=3;
		p.wt=4;
		p.width=5;
		System.out.println("ht="+p.ht+"wt="+p.wt+"width="+p.width);
		p.write();
	}

}