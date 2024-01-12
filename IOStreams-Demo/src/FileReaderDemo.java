import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(new File("abc3.txt"));
		
		int i = 0;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
