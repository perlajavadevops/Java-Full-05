
public class MethodOverloadingDemo {

	// Void -->nothing to return
	// MOverloading--> with in the class. static and instance methods can overloaded
	/*
	 * public static void add(int a, int b) {
	 * System.out.println("(int, int)"+(a+b)); }
	 * 
	 * public static void add(long a, long b) {
	 * System.out.println("(long, long)"+(a+b)); }
	 */

	public static void add(int a, long b) {
		System.out.println("(int, long)" + (a + b));
	}

	public static void add(long a, int b) {
		System.out.println("(long, int)" + (a + b));
	}

	/*
	 * public static void add(double a, double b) { System.out.println(a + b); }
	 */

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {// 10.90+20.80

		add(10, 10L);// static method calling with in the same class
		add(10L, 10);
		// add(10.90,20.80);//31.70
		// add(10,10,10);

	}

}
