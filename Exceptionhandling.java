class Exceptionhandling
{
	public static void main(String[] args) 
	{
		int a=10;
	    	int b=0;
		int r;
		try
		{
			r=(a/b);
			System.out.println("output"+r);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divde by zero Exception");
			
		}

	}
}