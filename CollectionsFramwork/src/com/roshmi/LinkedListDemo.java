package com.roshmi;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
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
