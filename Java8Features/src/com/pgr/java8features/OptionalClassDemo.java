package com.pgr.java8features;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		//String name = "Dhruvika";
		 String name = null;
		//System.out.println(name.length());

		Optional op = Optional.ofNullable(name);
		//System.out.println(op);
	//	System.out.println(Optional.of(name).isPresent());
		//System.out.println(op.get());
		
		Optional.ofNullable(name).ifPresent(a -> System.out.println(a));
		
		/*
		 * if(name!=null || name.isEmpty()) { System.out.println(name); }
		 */
		/*
		 * System.out.println(op.isPresent()); System.out.println(op.get());
		 */

	}
}
