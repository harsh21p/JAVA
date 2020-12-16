import java.io.File;
import java.io.FileInputStream;
class ReadFileUsingFileInputStream {

	public static void main(String[] args) {
		File file = null;
             if(0<args.length)
{
   file = new File(args[0]);
}
else
{
 System.err.println("Invalid arguments count:" + args.length);
}
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			System.out.println("Available bytes in file: "+fileInputStream.available());
			int line;
			while ((line=fileInputStream.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}