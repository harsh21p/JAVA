

import java.io.*;
//import java.io.FileInputStream;
//import java.io.BufferedInputStream;
 class Rfunew
{
	public static void main(String[]args)
	{
		File file = null;
		if (0<args.length)
		{
			file=new File(args[0]);
		}
		else
		{
			System.err.println("Invalid arguments count:"+ args.length);
		}
		FileInputStream fileInputStream=null;
		BufferedInputStream bis=null;
		try
		{
			fileInputStream = new FileInputStream(file);
			System.out.println("available bytes in file:" + fileInputStream.available());
			//int line;
			bis=new BufferedInputStream(fileInputStream);
			while(bis.available()>0)
			{
				System.out.print((char)bis.read());
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
				if(fileInputStream !=null)
				{
					fileInputStream.close();
				}
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
