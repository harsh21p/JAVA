import java.util.Scanner;
class array
{
	
	
	public static void main(String[] args)
	{
		int i;
	 int[]a=new int[5];
		
		Scanner b=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.println("Enter a "+i+" value = ");
			a[i]=b.nextInt();
		}
		for(i=0;i<5;i++)
		{

			System.out.println(i +" Element = "+ a[i]);
		}
	}
}