import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("employee3.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee emp1 = new Employee(101, "PerlaReddy", 2000.3, 8908908900l);
		
		ContractEmployee em = new ContractEmployee(111);

		String s = "Hello";

		//oos.writeUTF(s);

		oos.writeObject(em);

		oos.close();
		fos.close();
	}
}
