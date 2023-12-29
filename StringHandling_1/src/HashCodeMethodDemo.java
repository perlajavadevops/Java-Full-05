
public class HashCodeMethodDemo {

	public static void main(String[] args) {
		HashCodeMethodDemo demo1 = new HashCodeMethodDemo();
		System.out.println(demo1.hashCode());//

		HashCodeMethodDemo demo2 = new HashCodeMethodDemo();
		System.out.println(demo2.hashCode());//

		System.out.println(demo1 == demo2);// false

		String s1 = "Gangadhar";
		
		String s2 = "Hello";
		String s4 = "Hello";
		
		String s3 = "hello";
		System.out.println(s2.hashCode());//
		System.out.println(s3.hashCode());//
		System.out.println(s4.hashCode());//
		System.out.println(s2 == s3);//false
		
		System.out.println(s2==s4);
	}
}
