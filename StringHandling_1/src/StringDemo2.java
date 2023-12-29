
public class StringDemo2 {

	/*
	 * 1. == operator: based your object reference
	 * 2. equlas() : based your string data(value)
	 * 3. equalsIgnoreCase()( based your string value
	 * 4. compareTo()// will compare based on the ASCII codes
	 */
	
	
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "Hi";
		String s3 = "hi";
		String s4 = new String("Hi");//2 objects
		
		
		System.out.println(s1.length());//false
		
		System.out.println(s1.length());//2
		
		
		/*
		 * String password = "Reddy";
		 * 
		 * String passwordFromDB = "reddy";
		 * 
		 * if(password.equals(passwordFromDB)) {
		 * System.out.println("Welcome Gmail Inbox"); }else {
		 * System.out.println("Invalid username or password"); }
		 * 
		 * System.out.println(s1.equals(s2));//true
		 * System.out.println(s1.equals(s3));//false
		 * System.out.println(s3.equals(s2));// false
		 * System.out.println(s4.equals(s1));//true
		 */
		/*
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode()); System.out.println(s1==s2);//true
		 * System.out.println(s3==s1);//false System.out.println(s4.hashCode()); 
		 * s4 = s4.intern();//re- System.out.println(s4==s1);//false
		 */
		//System.out.println(s4.equalsIgnoreCase(s1));//true
		//System.out.println(s4.equalsIgnoreCase(s3));//true
		
		//0 +positive, -negative
		System.out.println(s1.compareTo(s4));//0  // equal
		System.out.println(s1.compareTo(s3));//72-104=-32 == both are not equal(less than )
		System.out.println(s3.compareTo(s2));//104-72 = 32 -== both are nto 119-72
		
	}
}
