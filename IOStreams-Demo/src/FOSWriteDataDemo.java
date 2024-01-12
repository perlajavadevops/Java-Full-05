import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWriteDataDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String name = "Dhatrika Sai";
		
		byte[] arr = name.getBytes();
		
		//char val = 92;
		
		//fos.write(arr);
		bos.flush();
		bos.write(arr);
		
		bos.close();
		fos.close();
	}
}
