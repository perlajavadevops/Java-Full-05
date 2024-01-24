package com.pgr.java8features;

@FunctionalInterface
interface Shape {
	//int getSize();
	int getSize(int i);
	//Circle getCircle(int size);
}

public class MethodReferenceDemo2 {

	public static int m(int a) {
		System.out.println("Static Method");
		return a;
	}
	
	public static int n() {
		System.out.println("Static Method");
		return 0;
	}
	
	
	public int p() {
		System.out.println("Instance Method");
		return 0;
	}
	
	public static void main(String[] args) {
		/*
		 * Shape shape = () -> { return 2; };
		 */
		
		//Shape me = MethodReferenceDemo2::n;
		Shape me1 = MethodReferenceDemo2::m;
		System.out.println(me1.getSize(20));
		//Shape shape1 = Shape::getSize;
	}
}
