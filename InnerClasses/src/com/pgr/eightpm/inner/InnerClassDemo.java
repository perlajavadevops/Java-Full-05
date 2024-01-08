package com.pgr.eightpm.inner;

import com.pgr.eightpm.inner.Outer.Inner;

class Outer {

	class Inner {// Instance inner class
		public void n() {
			System.out.println("Inner class n method()");
		}

		/*
		 * public static void p() { System.out.println("Inner static method"); }
		 */
	}

	static class StaticClass {// static inner class

		public static void s() {
			System.out.println("Inner class s method()");
		}
	}

	public void m() {

		class LocalInner {// local class
			public void l() {
				System.out.println("Local L method of LocalInner Class....");
			}
			
			/*
			 * public static void o() {
			 * System.out.println("Local L method of LocalInner Class...."); }
			 */
		}
		
		LocalInner localInner = new LocalInner();
		localInner.l();
		//LocalInner.o();
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.n();
		//Outer.Inner.p();

		Outer.StaticClass.s();
		
		outer.m();
	}
}
