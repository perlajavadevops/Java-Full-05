package com.pgr.sevenam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(null);
		
		list.removeLast();
		/*
		 * System.out.println(list.pop()); System.out.println(list.pop());
		 * System.out.println(list.pop()); System.out.println(list.pop());
		 */
		//System.out.println(list.size());
		
		/*
		 * for(int i = 0; i< list.size(); i++){ //++i --pre incrment ,i++ post increment
		 * ,--i preincremnt ,i-- postdecremnt System.out.println(list.get(i));//0 }
		 */
		
		/*
		 * for(Integer id : list) { System.out.println(id); }
		 */
		
		
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		 
	}
}
