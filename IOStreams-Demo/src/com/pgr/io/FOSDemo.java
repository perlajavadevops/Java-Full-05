package com.pgr.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		String name = "Perla Reddy";
		byte[] nameArr = name.getBytes();
		fos.write(nameArr);
		fos.close();
	}
}
