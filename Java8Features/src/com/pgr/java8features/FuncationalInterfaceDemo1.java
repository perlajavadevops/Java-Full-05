package com.pgr.java8features;

@FunctionalInterface
interface Fun1 {

	/* public abstract void cal(); */
	/* public abstract void cal(int a, int b); */
	 public abstract int cal(int a, int b); 
}

/*
 * class Fun1SubClass implements Fun1 {
 * 
 * @Override public void cal() { System.out.println("Cal method"); } }
 */

public class FuncationalInterfaceDemo1 {

	public static void main(String[] args) {
		/*
		 * Fun1SubClass demo = new Fun1SubClass(); demo.cal();
		 */
		/*
		 * Fun1 f = new Fun1() {
		 * 
		 * @Override public void cal() { System.out.println("Anon"); } };
		 * 
		 * f.cal();
		 */

		// Fun1 fun1 = () -> System.out.println("Hello Lambda exp cal method");
		
		//if void method
		/*
		 * Fun1 fun1 = (a, b) -> {
		 * System.out.println("Hello Lambda exp cal method: = "+(a+b));
		 * 
		 * };
		 */
		
		//if method has return type
		/*
		 * Fun1 fun1 = (var a, var b) -> {
		 * System.out.println("Hello Lambda exp cal method: ="); return a+b;
		 * 
		 * };
		 */
		
		//System.out.println(fun1.cal(10,10));
		
		

	}
}
