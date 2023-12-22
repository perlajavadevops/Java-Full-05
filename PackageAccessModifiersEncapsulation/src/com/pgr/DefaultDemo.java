package com.pgr;

public class DefaultDemo {

	int sno = 90;// default variable

	void m() {// default method
		System.out.println("M method is private method in the PrivateDemo class....");
	}

	public static void main(String[] args) {
		DefaultDemo demo = new DefaultDemo();
		demo.m();
		System.out.println(demo.sno);
	}
	
}
