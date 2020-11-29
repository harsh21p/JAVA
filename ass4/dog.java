import java.util.Scanner;
class dog
{
	private int ht,wt;
	void set ()
	{
		Scanner b=new Scanner(System.in);
		int x,y;
		System.out.println("Enter value of ht = ");
		x=b.nextInt();
		System.out.println("Enter value of wt = ");
		y=b.nextInt();
		if(x>0 && x<10)
		{
			
			ht=x;
			
			
		}
		else
		{
			ht=1;
			System.out.println("Entered value is worng so we set a value of ht=1");
		}
		if(y>0 && y<10)
		{
			wt=y;
		}
		else
		{
			wt=5;
			System.out.println("Entered value is worng so we set a value of wt=5");
		}
		
	}
	int get()
	{	
			return ht;
			
	}
	int getwt()
	{
		return wt;
	}
}