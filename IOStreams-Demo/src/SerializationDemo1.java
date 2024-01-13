import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("employee6.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee emp1 = new Employee(101, "PerlaReddy", 2000.3, 8908908900l);

		String s = "Hello";

		//oos.writeUTF(s);

		oos.writeObject(emp1);

		oos.close();
		fos.close();
	}
}
