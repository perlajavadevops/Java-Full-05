package com.pgr.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("abc2.txt");
		FileOutputStream fos = new FileOutputStream("abc5.txt");
		//System.out.println((char)fis.read());
		int i = 0;
		while((i = fis.read())!=-1) {
			fos.write(i);
			System.out.print((char)i);
		}
		fis.close();
		fos.close();
	}

}
