
public class ExceptionDemo7 {

	public static void main(String[] args) {
		System.out.println("Hi Before Exception");
		
		ExceptionDemo7 ex7 =  new ExceptionDemo7();
		try {
			
			int a  = 10/0;//~Art
			//System.out.println(a);
			try {

				String s = null;
				//System.out.println(s.length());//NullPointerException
			}catch (NullPointerException e) {
				System.out.println("Handled NullPointer Exception");
			}
			
			try {
				System.out.println(args[0]);//ArrayIndexOutOfException
			}catch(Exception e) {//
				System.out.println("Exception handle Ex");
			}		
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		finally {
				ex7 = null;
				System.out.println("Finally block executed always...");
		}
		System.out.println("Hello, After Exception");
	}
}
