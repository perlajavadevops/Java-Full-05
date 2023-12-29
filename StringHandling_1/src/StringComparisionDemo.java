
public class StringComparisionDemo {

	public static void main(String[] args) {

		String s2 = "Hello";
		String s4 = "Hello";

		String s3 = "hello";

		/*
		 * System.out.println("== examples"); System.out.println(s2 == s3);// false
		 * System.out.println(s2 == s4);// true
		 * 
		 * System.out.println("equals examples"); System.out.println(s2.equals(s3));//
		 * false System.out.println(s2.equals(s4));// true
		 */
		/*System.out.println("equalsIgnoreCase examples");
		System.out.println(s2.equalsIgnoreCase(s3));// true
		System.out.println(s2.equalsIgnoreCase(s4));// true
		
		System.out.println("compareTo examples");
		System.out.println(s2.compareTo(s3));// true //ASCII 72-104 ==> -32 
		System.out.println(s2.compareTo(s4));// true ==>72-72==0
		
		System.out.println(s3.compareToIgnoreCase(s2));//32
*/		
		String password = "xyx@123"; //8 DB -->
		
		String password1 = "xyx@123"; // entered 
			
		/*
		 * System.out.println(password.equals(password1));
		 * 
		 * System.out.println(password.length());
		 */
		
		String emptyStr = " kdsadjksd ";
		
		System.out.println(emptyStr.isEmpty());
		//System.out.println(emptyStr.isBlank());
		
		//startsWith
		//endsWith
		//toUpper
		//toLower
		//s2.indexOf(1)
		//lastIndex()
		
		

		
	}
}
