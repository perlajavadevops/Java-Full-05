package com.pgr;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hi"; //
		String s2 = "Hi";
		String s3 = "hi";
		String s4 = new String("Hi");
		/*
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode()); System.out.println(s4.hashCode());
		 */
		System.out.println(s1.indexOf("H"));
		System.out.println("===== == =====");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		System.out.println("=====Equals Method=====");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		
		System.out.println("=====equalsIgnoreCase Method=====");
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		System.out.println("=====compareTo Method=====");
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//-32
		System.out.println(s1.compareTo(s4));//0
		
		System.out.println("=====compareToIgnoreCase Method=====");
		System.out.println(s1.compareToIgnoreCase(s2));//0
		System.out.println(s1.compareToIgnoreCase(s3));//0
		System.out.println(s1.compareToIgnoreCase(s4));//0
		
	}
}
