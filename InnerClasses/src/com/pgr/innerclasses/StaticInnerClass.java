package com.pgr.innerclasses;

public class StaticInnerClass {

	private static int i = 90;

	public static void p() {
		System.out.println("static p method: StaticInnerClass ");
	}

	static class Static_Inner_A {// static inner class

		public void n_inner() {
			System.out.println("Inner_A class n_inner method");
			/*
			 * p(); System.out.println(i);
			 */
		}

	}

	public static void main(String[] args) {
		//StaticInnerClass staticInnerClass = new StaticInnerClass();
		StaticInnerClass.p();
		
		StaticInnerClass.Static_Inner_A inner_A = new Static_Inner_A();
		inner_A.n_inner();
	}
}
