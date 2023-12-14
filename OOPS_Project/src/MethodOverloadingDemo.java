
public class MethodOverloadingDemo {

	// Void -->nothing to return
	// MOverloading--> with in the class. static and instance methods can overloaded
	/*
	 * public void add(int a, int b) {
	 * System.out.println("(int, int)"+(a+b)); }
	 * 
	 * public void add(long a, long b) {
	 * System.out.println("(long, long)"+(a+b)); }
	 */

	MethodOverloadingDemo getInstance(){
		return this;
	}
	
	public void add(int a, long b) {
		System.out.println("(int, long)" + (a + b));
		this.add(b, a);
		add(this);
		System.out.println(getInstance().hashCode());
	}

	public void add(MethodOverloadingDemo demo) {
		System.out.println("Metod ");
	}
	
	public void add(long a, int b) {
		System.out.println("(long, int)" + (a + b));
	}

	/*
	 * public void add(double a, double b) { System.out.println(a + b); }
	 */

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {// 10.90+20.80

		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		
		demo.add(10, 10L);// static method calling with in the same class
		System.out.println(demo.hashCode());
		//add(10L, 10);
		// add(10.90,20.80);//31.70
		// add(10,10,10);

	}

}
