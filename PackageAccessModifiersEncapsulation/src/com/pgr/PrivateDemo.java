package com.pgr;

public class PrivateDemo {

	private int sno = 90;

	private void m() {
		System.out.println("M method is private method in the PrivateDemo class....");
	}

	public static void main(String[] args) {
		PrivateDemo demo = new PrivateDemo();
		demo.m();
		System.out.println(demo.sno);
	}
}
