import java.util.Scanner;
class dog
{	
	int ht,wt;
	void set()
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter ht =");
		ht=b.nextInt();
		System.out.println("Enter wt =");
		wt=b.nextInt();
		
		
	}
	void get()
	{	
		
		System.out.println("ht ="+ht);
		System.out.println("wt ="+wt);
	}
		
}