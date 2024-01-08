package com.pgr.innerclasses;

public class LocalInnerClassesDemo {

	private static int i = 90;

	public static void p() {
		System.out.println("static p method: StaticInnerClass ");
	}

	public void m() {

		System.out.println("LocalInnerClassesDemo class m method");
		class Local_Inner {
			public void n() {
				System.out.println("Local Inner class n method");
				p();
			}
		}

		Local_Inner local = new Local_Inner();
		local.n();
	}

	public static void main(String[] args) {
		int i = 90;// local variable

		LocalInnerClassesDemo localInnerClassesDemo = new LocalInnerClassesDemo();
		localInnerClassesDemo.m();
	}

}
