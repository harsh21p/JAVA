import java.util.Scanner;
import java.lang.String;
class palindrome
{
	public static void main(String[]args)
	{
		

		
		Scanner sc=new Scanner(System.in);
		String a;
                String b="";
		String p="";
		a=sc.nextLine();
		int n=a.length();
		String f="";
		
		
		
				
		for(int j=n-1;j>=0;j--)
		{	char d;
			d=a.charAt(j);
			if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
			{
				p=p+d;
			}
	
		}
		for(int k=0;k<=n-1;k++)
		{
			char l=a.charAt(k);
			if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')
			{
			
			
			f=f+l;
			}
		}
		System.out.println("String="+p);
		if(f.equals(p))
		{	
			System.out.println("The given vowel string is palindrome");
		}
		else
		{	
			System.out.println("The given  vowel string is not palindrome");
		}



		for(int i=n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equals(b))
		{	
			System.out.println("The given string is palindrome");
		}
		else
		{	
			System.out.println("The given string is not palindrome");
		}
		
	
	}	
}

