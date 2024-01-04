package com.pgr;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Started");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ne) {
			ne.printStackTrace(); //logging
		    System.err.println(ne.getMessage());
		}

		System.out.println("Completed");
	}
}
