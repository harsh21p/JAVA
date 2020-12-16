import java.io.File;
import java.io.FileInputStream;
class sunil
{
	public static void main(String[]agrs)
	{
		File a=null;
		if(0<args.length)
		{
			a=new File(args[0]);
		}
		else
		{
			System.err.println("Invalid arguments count:"+args.length);
		}
		FileInputStream z=null;
		try
		{
			z=new FileInputStream(a);
			System.out.println("Available bytes in file:"+z.available);
			int line;
			while((line=z.read())!=-1)
			{
				System.out.println((char)line);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(z!=null)
				{
					z.close();
				}	
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
}