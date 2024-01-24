package com.pgr.java8features;

@FunctionalInterface
interface DefaultMethod {

	default void m() {
		System.out.println("m");
	}

	static void n() {
		System.out.println("n");
	}

	public void abstMethod();
}

class A_Sub implements DefaultMethod {

	@Override
	public void abstMethod() {
		System.out.println("Hi");
	}

	@Override
	public void m() {
		System.out.println("Hello Default method");
	}

}

public class DefaultStaticMethods {

	public static void main(String[] args) {
		DefaultMethod d = () -> System.out.println("funcational interface 0 arg method");

		d.abstMethod();
		d.m();
		DefaultMethod.n();

		A_Sub ab = new A_Sub();
		ab.abstMethod();
		ab.m();
	}
}
