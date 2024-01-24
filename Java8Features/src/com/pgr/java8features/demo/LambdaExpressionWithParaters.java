package com.pgr.java8features.demo;

@FunctionalInterface
interface Fun2 {
	public abstract void m(int a, int b);

	// public abstract void n();
	public static void n() {// private, default, public
		System.out.println("ad");
	}

	default void p() {
		System.out.println("ad");
	}
}

public class LambdaExpressionWithParaters {

	public static void main(String[] args) {

		/*
		 * Fun1 fun1 = new Fun1() {
		 * 
		 * @Override public void m() {
		 * System.out.println("Implme is completed by annonmous clss"); } };
		 * 
		 * fun1.m();
		 */
		Fun2 fun2 = (a, b) -> {
			System.out.println("Implme is completed using lambda expression: " + (a + b));
		};
		fun2.m(10, 10);

		// fun1.p();
		// Fun1.n();//

	}
}
