
public class StaticPolyDemo {

	public static void add(int a, long b) {
		System.out.println("(int, long)" + (a + b));
	}

	public static void add(long a, int b) {
		System.out.println("(long, int)" + (a + b));
	}

	private static void add(long a, long b) {
		System.out.println("(long, int)" + (a + b));
	}
	/*
	 * public static void add(double a, double b) { System.out.println(a + b); }
	 */
	public static void main(String[] args) {// 10.90+20.80

		add(10, 10L);// static method calling with in the same class
		//static mehtod, private method 

		
	}

}
