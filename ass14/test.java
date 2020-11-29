class test
{
	
	public static void main(String[] args)
	{
		int i;
		dog []d=new dog[5];
		for(i=0;i<5;i++)
		{
			d[i]=new dog();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Enter data for object "+(i+1));
			d[i].set();
			
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Details of object "+(i+1));
			d[i].get();
			d[i].run();
			
		}
		
		
	}
}