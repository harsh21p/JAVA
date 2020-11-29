import java.util.Scanner;
class animal
{
	int ht,wt;
	 
	 void set()
	 {   
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("\nEnter ht =");
		 ht=s.nextInt();
		 System.out.print("\nEnter wt =");
		 wt=s.nextInt();
		 System.out.print("\nht = " +ht+ " wt = " +wt+ "\nSleep\nEat\nrun\n");
			
		 
	 }
	 int getht()
	 {
		 return ht;
	 }
	 int getwt()
	 {
		 return wt;
	 }
	
}