package com.innerclass;

public class InnerClassDemo1 {

	private int a = 90;
	class Inner{//Instance calss
		public void innerM(){
			System.out.println("Inner m method");
			System.out.println("Outer class private varialbe values is ? "+a);
		}
		
	}
	
	public void m(){
		 class Local{
			public void localMethod(){
				System.out.println("Local Method");
			}
			
		}
		
		Local local = new Local();
		
		local.localMethod();
	}
	
	public static void n(){
		 class D{
			public void localMethod(){
					System.out.println("Local Method");
			}
		 }
	}
	
	static class StaticInner{
		public void staticInnerM(){
			System.out.println("static inner m method");
		}
		
		public static void staticInnerStaticM(){
			System.out.println("static inner static m method");
		}
	}
	
	public static void main(String[] args) {
		InnerClassDemo1 demo = new InnerClassDemo1();
		demo.m();
		InnerClassDemo1.Inner innerObj = demo.new Inner();
		innerObj.innerM();
		
		InnerClassDemo1.StaticInner staticInner = new StaticInner();
		staticInner.staticInnerM();
		
		InnerClassDemo1.StaticInner.staticInnerStaticM();
		
		
		
	}
}
