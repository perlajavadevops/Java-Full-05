import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File file = new File("D:/IOStreams/introudction.text");// 

		//File file = new File("abc2.txt");
		
		//file.delete();
		System.out.println(file.exists());
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		
		System.out.println(file.canWrite());
		System.out.println(file.getFreeSpace());
		System.out.println(file.isDirectory());
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
		
		
	}

}
