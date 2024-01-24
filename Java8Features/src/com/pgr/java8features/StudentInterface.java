package com.pgr.java8features;

import java.util.function.Predicate;

@FunctionalInterface
interface A {
	void m();
	/*
	 * void n(); void p();
	 */
}

@FunctionalInterface
interface B {
	void n(int a, int b);
	/*
	 * void n(); void p();
	 */
}

@FunctionalInterface
interface C {
	int n(int a, int b);
	/*
	 * void n(); void p();
	 */
}

/*
 * class A_Sub implements A{
 * 
 * @Override public void m() { System.out.println("A method"); } }
 */
public class StudentInterface {

	public static void main(String[] args) {
		/*
		 * A_Sub aS = new A_Sub(); aS.m();
		 */

		/*
		 * A a = new A() {
		 * 
		 * @Override public void m() { System.out.println("A method"); } };
		 * 
		 * a.m();
		 */

		/*
		 * new A() {
		 * 
		 * @Override public void m() { System.out.println("A method"); } }.m();
		 */

		// A a = () -> System.out.println("Hello Lambda expression");
		/*
		 * A a = () -> { System.out.println("Hello Lambda expression");
		 * 
		 * 
		 * System.out.println("Hello Lambda expression");
		 * System.out.println("Hello Lambda expression");
		 * System.out.println("Hello Lambda expression");
		 * System.out.println("Hello Lambda expression");
		 * System.out.println("Hello Lambda expression");
		 * System.out.println("Hello Lambda expression");
		 * 
		 * }; a.m();
		 */

		/*
		 * B b = (c, d) -> { System.out.println(c+d); };
		 * 
		 * b.n(10, 10);
		 */

		C c = (d, f) -> {
			return d + f;
		};

		// C c = (d, f) -> return d+f;

		System.out.println(c.n(10, 10));
		
		Predicate<Integer> pre = a ->(a>18);
		System.out.println(pre.test(19));
	}

}
