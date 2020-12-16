import java.lang.String;
class StringBufferOP
{
	public static void main(String[] args) 
	{
		StringBuffer a=new StringBuffer("Hello");
		int l=a.length();
		int c=a.capacity();
		System.out.println("length of string="+l);
		System.out.println("capacity of string="+c);
		a.append(" World");
		System.out.println("appended string is "+a);
		a.insert(6," T. ");
		System.out.println("inserted string is "+a);
		a.reverse();
		System.out.println("reversed string is "+a);
		a.reverse();
		System.out.println("reversed string is "+a);
		a.delete(6,9);
		System.out.println("deleted string is "+a);

	}
}
