package com.pgr.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BISDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("abc2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//System.out.println((char)fis.read());
		System.out.println(fis.available());
		int i = 0;
		while((i = bis.read())!=-1) {
			System.out.print((char)i);
		}
		bis.close();
		fis.close();
	}

}
