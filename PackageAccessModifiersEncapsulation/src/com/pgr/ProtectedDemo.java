package com.pgr;

public class ProtectedDemo {

	protected int sno = 90;// default variable

	protected void m() {// default method
		System.out.println("M method is protected method in the ProtectedDemo class....");
	}

	public static void main(String[] args) {
		ProtectedDemo demo = new ProtectedDemo();
		demo.m();
		System.out.println(demo.sno);
	}
	
}
