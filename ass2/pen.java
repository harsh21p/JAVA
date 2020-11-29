import java.util.Scanner;
class pen
{
	int ht,wt;
	void set()
	{
		Scanner b=new Scanner(System.in);
		System.out.print("Enter ht of pen = ");
		ht=b.nextInt();
		System.out.print("\nEnter wt of pen = ");
		wt=b.nextInt();
		
	}
	void get()
	{
		System.out.print("\n ht = "+ht+"\n wt = "+wt);
	}
	void write()
	{
		System.out.print("\npen is use for writing");
	}
	
}