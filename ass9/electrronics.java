
class electronics
{
	int ht,wt ,width;
	void set()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ht of vehicle = ");
		ht=s.nextInt();
		System.out.println("Enter wt of vehicle = ");
		wt=s.nextInt();
		System.out.println("Enter a width of vehicle = ");
		width=s.nextInt();
		System.out.print("\n ht = "+ht+"\n wt = "+wt+"\n width = "+width+"\n use for travaling");
		
	}
	int getht()
	{
		return ht;
	}
	int  getwt()
	{
		return wt;
	
	}
	int getwidth()
	{
		return width;
	}
}