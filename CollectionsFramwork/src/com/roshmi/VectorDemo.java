package com.roshmi;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Integer> al = new Vector<Integer>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(12);
		al.add(null);
		al.add(null);

		//System.out.println(al);
		Iterator<Integer>  itr = al.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
		
	}

}
