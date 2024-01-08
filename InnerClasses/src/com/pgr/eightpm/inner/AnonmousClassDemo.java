package com.pgr.eightpm.inner;

/*abstract class Animal{
	
	public abstract void run();
}*/


interface Animal{
	
	public abstract void run();
}

/*
 * class Dog extends Animal{
 * 
 * @Override public void run() { System.out.println("Run.....");
 * 
 * } }
 */
public class AnonmousClassDemo {

	
	public static void main(String[] args) {
		/*
		 * Dog d = new Dog(); d.run();
		 */
		
		Animal animal = new Animal() {

			@Override
			public void run() {
				System.out.println("AnonmousClassDemo run mme,...");	
			}
			
		};
		
		animal.run();
		
		Animal animal1 = new Animal() {

			@Override
			public void run() {
				System.out.println();	
			}
			
		};
	}
}
