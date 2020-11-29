import java.util.Scanner;
class dog
{
		int ht,wt;
		Scanner a=new Scanner(System.in);
		void set()
		{
			System.out.println("Enter ht = ");
			ht=a.nextInt();
			System.out.println("Enter wt = ");
			wt=a.nextInt();
		}
		void get()
		{
			System.out.println("ht = "+ht);
			System.out.println("wt = "+wt);
		}
		int getht()
		{
			return ht;
			
		}
		int getwt()
		{
			return wt;
			
		}
		void run()
		{
			System.out.println("Run");
		}
		
	
	
}