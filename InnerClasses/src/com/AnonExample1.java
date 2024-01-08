package com;

interface A {
	public abstract void m();
	public abstract void n();

}

/*class B extends A{
	
	@Override
	public void m() {
		System.out.println("ajdfljd");
	}
}*/

public class AnonExample1 {

	public static void main(String[] args) {
		//A a = new A();
		//a.m();
		
		A newA = new A(){
			@Override
			public void m() {
				System.out.println("Hi");
			} 
			
			@Override
			public void n() {
				System.out.println("N method HI Message");
			}
			
		};
		
		newA.n();
		newA.m();
		
		/*new A(){
			@Override
			public void m() {
				System.out.println("hi");
			}
			
		}.m();*/
		
	 /*	A a = new A(){
			@Override
			public void m() {
				System.out.println("hi");
			}
			
			@Override
			public void n() {
				System.out.println("N method of abstract class");
			}
		};
		
		a.m();
		a.n();*/
		
		
	}
}
