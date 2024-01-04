import java.io.FileInputStream;
import java.io.IOException;


public class ExceptionDemo2 {

	public static void m(){
		//try block
		FileInputStream file = null;
		try{
			file = new FileInputStream("abc1.txt");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally Block will execute always");
			try{
				file.close();//try
			}catch(IOException ioEx){
				ioEx.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		m();
	}
}
