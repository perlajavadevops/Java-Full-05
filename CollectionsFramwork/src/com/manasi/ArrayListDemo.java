package com.manasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<String>();
		/*list.add(12);
		list.add('c');
		list.add(12.0f);*/
		
		boolean t= list.add("Reddy");
		System.out.println(t);
		list.add("Siri");
		//list.add("Manasi");
		list.add("Dhatrika");
		boolean f = list.add("Dhatrika");
		System.out.println(f);
		list.add("Dhatrika");
	/*	list.add(null);
		list.add(null);*/
		
		System.out.println("Using Iterator object");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Supriya");
		list1.add("Teja");
		list1.add("Alka");
		list1.add("Alka");

		list.addAll(list1);
		
		//System.out.println(list.containsAll(list1));
		/*for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for (String object : list) {
		//	list.remove(4);
			System.out.println(object);
		}*/
		
		//cursor interface
		//Iterator iterate the data in forward direction
		//System.out.println(list.isEmpty());//true
		//list.remove(3);
		//list.removeAll(list1);
		//System.out.println(list.contains("Manasi"));//true
		
		ArrayList<String> list2 = new ArrayList<String>(list);
		Collections.sort(list2);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			//list.add("Naga");
			//list.remove(4);
			System.out.println(itr.next());
		}
		
	}
}
