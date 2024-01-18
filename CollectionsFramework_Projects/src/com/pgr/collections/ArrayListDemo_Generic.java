package com.pgr.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo_Generic {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(19);
		al.add(19);
		al.add(20);
		al.add(30);
		al.add(19);

		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 */

		/*
		 * for (Integer obj : al) { System.out.println(obj); }
		 */

		/*
		 * Iterator<Integer> itr = al.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

		ListIterator<Integer> listItr = al.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("============");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}
}
