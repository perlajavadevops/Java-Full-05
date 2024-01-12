import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BAISDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos1 = new FileOutputStream("abc1.txt");
		FileOutputStream fos2 = new FileOutputStream("abc2.txt");

		String name = "Dhatrika Sai";

		byte[] arr = name.getBytes();

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		bout.write(arr);

		bout.writeTo(fos1);
		bout.writeTo(fos2);

		bout.flush();

		bout.close();

		FileInputStream fis1 = new FileInputStream("abc1.txt");
		FileInputStream fis2 = new FileInputStream("abc2.txt");

		int i = 0;

		byte[] arr1 = new byte[fis1.available()];
		while ((i = fis1.read()) != -1) {
			// System.out.print((char)i);
			byte b = (byte) i;
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = b;
			}

		}

		ByteArrayInputStream bois = new ByteArrayInputStream(arr1);
		System.out.println(bois.available());

		int ii = 0;

		while ((ii = bois.read()) != -1) {
			System.out.print((char) ii);
		}

		fos1.close();
		fos2.close();

	}
}
