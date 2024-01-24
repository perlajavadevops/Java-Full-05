package com.pgr.java8features;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomObjectsArrayList {

	public static void main(String[] args) {
		Student st1 = new Student(101, "Dhatrika", "Euro Kids");
		Student st2 = new Student(102, "Sir", "XYZ colleage");
		Student st3 = new Student(101, "Perla", "Euro Kids");
		Student st4 = new Student(103, "Dhruvi", "ABC Colleage");
		Student st5 = new Student(104, "Mahesh", "PQR Colleage");

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);
		studentList.add(st1);

		studentList.stream().distinct().forEach(a -> System.out.println(a));
		/*
		 * Iterator<Student> itr = studentList.iterator();// forward direction backward
		 * direction System.out.println("==================="); while (itr.hasNext()) {
		 * 
		 * Student student = itr.next(); System.out.println(student.toString());
		 * 
		 * System.out.println(student.getColleageName());
		 * System.out.println(student.getName()); System.out.println(student.getSno());
		 * 
		 * }
		 */
		System.out.println("===================");

	}
}
