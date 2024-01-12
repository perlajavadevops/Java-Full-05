package com.pgr.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BOSDemo {

public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("abc.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String name = "Perla Reddy";
		byte[] nameArr = name.getBytes();
		bos.write(nameArr);
		
		bos.close();
		fos.close();
	}
}
