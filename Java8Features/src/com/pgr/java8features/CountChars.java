package com.pgr.java8features;

public class CountChars {

	public static void main(String[] args) {
		String name = "Perla Reddy";
		System.out.println(name.chars().count());
	}
}


//abcabcad
//a = 3
//b = c = 2
//d = 1