package com.pgr;

public class PublicDemo {

	public int sno = 90;// default variable
 
	public void m() {// default method
		System.out.println("M method is protected method in the ProtectedDemo class....");
	}

	public static void main(String[] args) {
		PublicDemo demo = new PublicDemo();
		demo.m();
		System.out.println(demo.sno);
	}
	
}
