import java.util.Scanner;
class animal extends living
{
	int ht,wt;
	void seta()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ht =");
		ht=s.nextInt();
		System.out.print("Enter wt =");
		wt=s.nextInt();
		System.out.print("\nht = "+ht+"\n wt = "+wt+"\n two eyes\n eat");
	}
	int getaht()
	{
		return ht;
	}
	int getawt()
	{
		return wt;
	}
}