package com.pgr;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo2 {

	public static void readFile() throws IOException {
		FileInputStream fis = new FileInputStream("abc1.txt");
	}

	public static void main(String[] args) throws IOException {

		//try {
			readFile();
			/*
			 * } catch (IOException io) { io.printStackTrace(); }
			 */
		System.out.println("Completed");

	}
}
