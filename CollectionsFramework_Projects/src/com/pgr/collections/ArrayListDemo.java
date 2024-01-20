package com.pgr.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(19);//0
		al.add("Perla");
		al.add(true);
		al.add(19);
		al.add("Perla");
		al.add(true);
		al.add(19);
		al.add("Perla");
		al.add(true);
		al.add(19);

//		/System.out.println(al.get(3));
		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 */
		
		
		
		for (Object object : al) {
			System.out.println((Integer) object);
		}
		 
	}

}
