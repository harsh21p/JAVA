import java.lang.reflect.Field;
public  class test1
{
	public void getClassName()
	{
		String className = this.getClass().getSimpleName();
		System.out.println("Name : "+className);
	}
	public static void main(String[] args) 
	{
 		 test1 t = new test1();
 		 t.getClassName();
 	}
}