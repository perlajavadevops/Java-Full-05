package com.srinivas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();//we can avoid ClassCastExcpeton
		al.add("Supriya");//0
		al.add("Teja");//1
		al.add("Alka");//2
		al.add("Alka");//3
		
		ArrayList<String> al1 = new ArrayList<String>();//we can avoid ClassCastExcpeton
		al1.add("Reddy");//0
		al1.add("Teja");//1
		al1.add("Srinivas");//2
		al1.add("Sabareesh");//3
		
		al.addAll(al1);
		
		//al.retainAll(al1);
		//al.add(121);
		/*al.add(null);
		al.add(null);*/
		
		
		//System.out.println(al.isEmpty());
		
		/*System.out.println("array list size is :: "+al.size());
		System.out.println(al.get(5));*/
		/*for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}*/
		
		//System.out.println(al.contains("teja"));
		Collections.sort(al);
		for (String object : al) {
			System.out.println(object);
		}
		
		/*Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			//al.remove(0);
			al.add("Srinivas");
			System.out.println(itr.next());
		}*/
		
		/*System.out.println("forward direction");
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Backward direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}*/
		
		/*
		 * Sorting
		 * Custome Objects storing
		 * Map
		 */
	}
}
