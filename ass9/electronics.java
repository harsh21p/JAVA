import java.util.Scanner;
class electronics
{
	int ht,wt ,width;
	void set()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter ht  = ");
		ht=s.nextInt();
		System.out.println("\nEnter wt  = ");
		wt=s.nextInt();
		System.out.println("\nEnter a width  = ");
		width=s.nextInt();
		System.out.print("\n ht = "+ht+"\n wt = "+wt+"\n width = "+width+"\n electric current is need to start");
		
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