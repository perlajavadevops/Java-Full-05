package com.pgr;

public class StringDemo2 {

	public static void main(String[] args) {
		String username = null;
		String password = "xyx@123";
		
		//System.out.println(username.contains("Raja"));
		//System.out.println(username);
		//System.out.println(username.trim());
		//System.out.println(username.length());
		System.out.println(username.isEmpty());
		
		//covert string to char array...
		
		char[] chArray = username.toCharArray();
		for (int i = 0; i < chArray.length; i++) {
			System.out.println(chArray[i]);
		}

		//covert string to byte array...

		/*
		 * byte[] bytArray = username.getBytes(); for (int i = 0; i < bytArray.length;
		 * i++) { System.out.print((char)bytArray[i]); }
		 */

		//covert string to string array...
		/*
		 * String space =
		 * "ASCII,stands,for,American Standard Code for Information Interchange";
		 * String[] strArray = space.split("\\,"); for (int i = 0; i < strArray.length;
		 * i++) { System.out.println(strArray[i]); }
		 */
		

		
	}

}
