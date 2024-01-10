package com.pgr.thread;

class Student{
	String name;

	public Student(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hi");
	}
}
public class GarbageCollectionDemo {

	public static void main(String[] args) {
		Student st1 = new Student("Dhatrika");
		Student st2 = st1;
		st1 = null;
		st2 = null;
		System.gc();
	}
}
