package com.pgr;

public class ProtectedDemoWithinSamePackage {

	public static void main(String[] args) {
		ProtectedDemo demo = new ProtectedDemo();
		demo.m();
		System.out.println(demo.sno);
	}

}
