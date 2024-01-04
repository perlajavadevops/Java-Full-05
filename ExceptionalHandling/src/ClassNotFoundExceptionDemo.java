
public class ClassNotFoundExceptionDemo {

	public static void getCl() throws ClassNotFoundException {
		System.out.println("Statement 1..");

		//try {
			Class.forName("ExceptionDemo1");
			/*
			 * } catch (ClassNotFoundException ne) { ne.printStackTrace(); }
			 */

		System.out.println("Statement 2..");
	}
	public static void main(String[] args) {
		
		ExceptionDemo1 ed = new ExceptionDemo1();
		/*
		 * try { getCl(); } catch (ClassNotFoundException e) { e.printStackTrace(); }
		 */
		System.out.println("Statement 3..");
	}
}
