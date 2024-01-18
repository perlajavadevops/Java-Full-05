package com.pgr.colle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();//Dyanamic Array
		//Vector<Integer> list1 = new Vector<Integer>();//Double-linkedlist algo
		list1.add(100);//Integer--sort
		list1.add(102);
		list1.add(101);
		list1.add(103);
		/*list1.add("Perla");
		list1.add(99.99);
		list1.add('C');*/		
		//Vector<Integer> al2 = new Vector<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//al2.add(1,105);//Adding based on position (Index based)
		al2.add(106);
		al2.add(107);
		al2.add(104);
		al2.add(100);
		
		//Adding one list to another list
	//	list1.addAll(al2);
		
		//Converting AL to Arrays
		/*Object[] intArr =list1.toArray();
		for (int i = 0; i < intArr.length; i++) {
			int o = (int)intArr[i];
			System.out.println(o);
		}*/
		//Removing one list to another list
		//list1.removeAll(al2);
		//list1.retainAll(al2);
		//list1.clear();
		//System.out.println(list1.isEmpty());//false
		//System.out.println(list1);
		//System.out.println(list1.size());//6
	//	System.out.println(list1.indexOf(102));
		
	/*	System.out.println("======using normal for loop======");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("======using normal for loop======");
*/
		
		/*System.out.println("======using for-each loop======");

		for (Integer object : list1) {
			System.out.println(object);
		}
		System.out.println("======using for-each loop======");*/
		
		//list1.remove(2);
		Collections.sort(list1);
		Iterator<Integer> itr = list1.iterator();//
		while(itr.hasNext()){
			//String s =(String) itr.next();
			//list1.remove(2);
			//list1.add(2,300);
			System.out.println(itr.next());
		}
		
		/*System.out.println("forward direction");
		ListIterator<Integer> itr = list1.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Backward direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}*/
	}

}
