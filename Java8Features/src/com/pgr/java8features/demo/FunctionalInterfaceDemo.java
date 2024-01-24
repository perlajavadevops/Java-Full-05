package com.pgr.java8features.demo;

@FunctionalInterface
interface Fun1 {
	public abstract void m();

	//public abstract void r();
	public static void n() {// private, default, public
		System.out.println("ad");
	}

	default void p() {
		System.out.println("ad");
	}
}

/*
 * class Fun1SubCl implements Fun1 {
 * 
 * @Override public void m() { System.out.println("Fun1SubCl..."); }
 * 
 * @Override public void p() { }
 * 
 * }
 */

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		/*
		 * Fun1 fun1 = new Fun1() {
		 * 
		 * @Override public void m() {
		 * System.out.println("Implme is completed by annonmous clss"); } };
		 */

		//fun1.m();
		
		Fun1 fun2 = () -> {
			System.out.println("Implme is completed using lambda expression");
		};
		fun2.m();

		//fun1.p();
		//Fun1.n();//

	}
}
