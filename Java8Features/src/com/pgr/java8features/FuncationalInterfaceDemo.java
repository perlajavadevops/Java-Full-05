package com.pgr.java8features;


interface FunInter{
	public void m();
	public void n();
}

@FunctionalInterface
interface FunInter1{
	//public void m();
	//public void m(int a);
	public int m(int a);
}

class FunInterSubClass implements FunInter{
	
	@Override
	public void m() {
		System.out.println("M method");
	}
	@Override
	public void n() {
		System.out.println("N method");
	}
}

class FunInterSubClass1 implements FunInter1{
	
	@Override
	public int m(int a) {
		System.out.println("M method");
		return a;
	}
}
public class FuncationalInterfaceDemo {

	public static void main(String[] args) {
		FunInterSubClass sub = new FunInterSubClass();
		sub.m();
		sub.n();
		
		FunInterSubClass1 sub1 = new FunInterSubClass1();
		sub1.m(10);
		
		FunInter1 fun1 = new FunInter1() {
			@Override
			public int m(int a) {
				System.out.println("Method Frm An inner class");
				return a;
			}
		};
		
		fun1.m(10);
		
		FunInter1 fun2 = (a) -> {
			System.out.println("From Lambda Expression "+  a);
			return a;
		};
		fun2.m(10);
	}
}
