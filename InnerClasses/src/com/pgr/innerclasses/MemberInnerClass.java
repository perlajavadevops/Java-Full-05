package com.pgr.innerclasses;

public class MemberInnerClass {

	private int sno = 90;

	private void m() {
		System.out.println("M method is private method in the MemberInnerClass class....");
	}

	class Inner_A {// member inner class or instance inner class

		public void n_inner() {
			System.out.println("Inner_A class n_inner method");
			
			m();
			System.out.println(sno);
		}

	}

	public static void main(String[] args) {
		MemberInnerClass memberInnerClass = new MemberInnerClass();

		memberInnerClass.m();
		// creating object of the inner class
		Inner_A inner_A = memberInnerClass.new Inner_A();
		inner_A.n_inner();
	}

}
