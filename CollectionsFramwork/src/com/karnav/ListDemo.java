package com.karnav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);//new Integer(100);
		list.add(102);
		list.add(101);
		list.add(103);
		list.add(103); 
		list.add(103);
		/*
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(106);//new Integer(100);
		list1.add(107);
		list1.add(108);*/
		
	/*	Object[] convertedList = list1.toArray();
				
		for (int i = 0; i < convertedList.length; i++) {
			System.out.println(convertedList[i]);
		}*/
		
		//System.out.println(list.isEmpty());
		
		//System.out.println(list.contains(103));//true
		
		//list.addAll(list1);
		//System.out.println(list.containsAll(list1));//true
		//list.remove(6);
		//list.retainAll(list1);
		//list.removeAll(list1);
		/*System.out.println("======using normal for loop======");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======using normal for loop======");
		*/
		/*System.out.println("======using for-each loop======");

		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("======using for-each loop======");
		*/
		
		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()){
			//list.add(900);
			System.out.println(itr.next());
		}

	}
}
