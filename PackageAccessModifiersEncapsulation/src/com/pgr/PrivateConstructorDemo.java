package com.pgr;

class Singleton{
	
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("private constructor");
	}
	
	public static Singleton getInstance() {
		
		return singleton;
	}
	
}
public class PrivateConstructorDemo {

	public static void main(String[] args) {
		
		//Singleton singleton3 = new Singleton()
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();

		System.out.println(singleton);
		System.out.println(singleton1);

	}
}
