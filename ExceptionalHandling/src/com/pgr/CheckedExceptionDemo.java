package com.pgr;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		//try {
			FileInputStream fis = new FileInputStream("abc1.txt");
			System.out.println("Completed");
			/*
			 * } catch (IOException io) { io.printStackTrace(); }
			 */

	}
}
