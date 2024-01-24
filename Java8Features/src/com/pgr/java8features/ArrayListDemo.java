package com.pgr.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	//	al.ensureCapacity(2);
		al.add(12);//new Integer(12)
		al.add(13);
		al.add(14);//2*2 = 4
		al.add(12);//Dyaanamic array 
		al.stream().skip(2).forEach(ab -> System.out.println(ab));
		/*
		 * al.add(null); al.add(null); al.add(null);
		 */
		
		//HashSet<Integer> hashSet = new HashSet<Integer>(al);
		//System.out.println(al.stream().distinct());
		/*
		 * Iterator<Integer> itr1 = al.stream().iterator();
		 * 
		 * while(itr1.hasNext()){//12 System.out.println(itr1.next()); }
		 */
		

		System.out.println( al.stream().max(Comparator.comparingInt(a ->a)));
		al.stream().filter(a -> a<14).forEach(ab -> System.out.println(ab));
		//System.out.println( al.stream().anyMatch(a -> a==12));
		//System.out.println( al.stream().count());
		/*
		 * HashSet<Integer> set = (HashSet<Integer>)
		 * al.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.
		 * toSet()); set.forEach(a -> System.out.println(a));
		 */
		
		System.out.println("================");
		
		//3rd position
		/*al.add(3, 90);
		al.remove(2);*/
		
		/*ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(40);
		al1.add(50);*/
		
		//al.addAll(al1);//adding al1 collection into al collection.
		
		//remove one collection from 
		//al.removeAll(al1);
			
		
		//System.out.println(al.contains(18));//true
		//System.out.println(al.isEmpty());
		/*al.add("Roshmi");
		al.add("Dhatrika");
		al.add('c');
		al.add(12.00);*/
		
		//System.out.println(al);
		//4 ways
		//with normal for loop
		/*for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}*/
		
		//enhanced for loop (for-each loop)
		/*for(Integer obj : al){
			System.out.println(obj);
		}*/
		//by using iterator interface
		Iterator<Integer> itr = al.iterator();//cursor interface //we can display the data from collection
		
		while(itr.hasNext()){//12
			System.out.println(itr.next());
		}
		
		//by using ListIterator // will only for list based collection
		/*forward direction and backward direction
		 * 
		 */
		
		/*System.out.println("Printing data in forward direction using ListIterator");
		ListIterator listItr = al.listIterator();
		while(listItr.hasNext()){//12
			System.out.println(listItr.next());
		}
		System.out.println("Printing data in backward direction using ListIterator");
		while(listItr.hasPrevious()){//12
			System.out.println(listItr.previous());
		}*/
		//System.out.println(al.size());
		
		
		
	}
}
