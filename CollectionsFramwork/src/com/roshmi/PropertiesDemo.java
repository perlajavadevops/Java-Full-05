package com.roshmi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	/*
	 * Properties 
	 */
	
	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/collections.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("first_name"));
		System.out.println(prop.getProperty("last.name"));
		System.out.println(prop.getProperty("username.password"));
		
		/*Properties pro = System.getProperties();
		Set set = pro.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}*/
	}
}
