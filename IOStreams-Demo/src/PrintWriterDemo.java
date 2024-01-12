import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		
		FileOutputStream fos = new FileOutputStream("demo.txt");
		PrintWriter pw = new PrintWriter(fos);
		pw.write("Hello Printwriter demo...");
		pw.flush();
		pw.close();
	}
}
