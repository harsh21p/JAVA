import java.util.Scanner;

class car
{
	int ht,wt,width;
	void set()
	{
		Scanner b=new Scanner(System.in);
		System.out.print("/nEnter ht of car = ");
		ht=b.nextInt();
		System.out.print("\nEnter wt of car = ");
		wt=b.nextInt();
		System.out.print("Enter width of car = "); 
		width=b.nextInt();
	}
	void get()
	{	
		System.out.print("\n ht = "+ht+"\n wt = "+wt+"\n width = "+width);
	}
	void traval()
	{
		System.out.print("\n Car is use for travaling");
	}
}