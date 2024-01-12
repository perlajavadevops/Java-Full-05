import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("abc3.txt");
		FileWriter fw = new FileWriter(file);
		
		String message = "Hello FileWriterDemo example";
		fw.write(message);
		fw.flush();
		fw.close();
	}

}
