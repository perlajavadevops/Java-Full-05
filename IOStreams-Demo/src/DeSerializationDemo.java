import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("employee3.ser");
		ObjectInputStream bis = new ObjectInputStream(fis);
		
		Employee emp = (Employee) bis.readObject();
		System.out.println(emp.getEmpNo());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getPhoneNumber());
		
		bis.close();
		fis.close();
	}
}
