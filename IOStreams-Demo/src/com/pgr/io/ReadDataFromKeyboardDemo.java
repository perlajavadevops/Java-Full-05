package com.pgr.io;

import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromKeyboardDemo {
	
	public static void main(String[] args) throws IOException {
		/*
		 * int i = System.in.read(); System.out.println((char)i);
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		String s = sc.next();// \n
		boolean b = sc.nextBoolean();
		
		sc.close();
		/*
		 * Double d = sc.nextDouble(); System.out.println(d);
		 */
	}

}
