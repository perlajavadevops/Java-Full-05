package com.pgr.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("abc2.txt");
		//System.out.println((char)fis.read());
		int i = 0;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
