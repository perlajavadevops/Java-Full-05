import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("D:/IOStreams/abc.txt");//

		// File file = new File("abc2.txt");

		//file.deleteOnExit();
		 //file.delete();
		 
		 //System.out.println(file.exists());

		/*
		 * System.out.println(file.getName()); System.out.println(file.getPath());
		 * System.out.println(file.getParent());
		 * 
		 * System.out.println(file.canWrite()); System.out.println(file.getFreeSpace());
		 * System.out.println(file.isDirectory());
		 * 
		 * System.out.println(file.setReadOnly()); System.out.println(file.canWrite());
		 */
		
		file.createNewFile();
		/*
		 * File[] files = file.listFiles(); for (int i = 0; i < files.length; i++) {
		 * System.out.println(files[i]); }
		 */

	}

}
