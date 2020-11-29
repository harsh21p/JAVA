import java.util.Scanner;
class Factorialscanner
{
	public static void main(String[] args)
	{
		Scanner b=new Scanner(System.in);
		int c=1,a,i;
		System.out.println("Enter a no = ");
		a=b.nextInt();
		for(i=1;i<=a;i++)
		{
			c=i*c;
	
		}
		System.out.println("factorial ="+c);
	}
}
class forloop
{
    public static void main (String[] args)
    {
        int i,a=3,b=10,c;
        for(i=a;i<=b;i++)
        {
            c=i;
            System.out.println(i);
        }
    }
}
class harshad
{
    public static void main(String[]args)
    {
        int c,a=2,b=2;
        
        System.out.println("                                Hello, world!");
        
        System.out.println("                                  I AM FREE");
        
        
        
        
    }
    class ifelse
    {
        public static void main(String[] args)
        {
            int a=2;
            if(a%2==0)
            {
                System.out.println(a+" is even no.");
                
            }
            else
            {
                
                System.out.println(a+" is odd no");
            }
        }
    }

}
