package com.pgr.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemoStream2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(12);
		al.add(11);
		al.add(10);
		al.add(15);
		
		
		System.out.println(al.stream().count());
		
		System.out.println(al.stream().min(Comparator.comparingInt(a ->a)));
		System.out.println(al.stream().max(Comparator.comparingInt(a ->a)));

		System.out.println(al.stream().max(Comparator.comparingInt(a ->a)));
		
		//ArrayList<Integer> al1 = (ArrayList<Integer>) al.stream().filter(a -> a<14).collect(Collectors.toSet());
		//HashSet<Integer> al1 = (HashSet<Integer>) al.stream().filter(a -> a<14).collect(Collectors.toSet());

		//al1.forEach(aaa -> System.out.println(aaa));
		//al.stream().skip(1).forEach(ab -> System.out.println(ab));
		
		//al.stream().limit(2).forEach(ab -> System.out.println(ab));
		
		//al.stream().distinct().parallel().forEachOrdered(a -> System.out.println(a));
		//
		/*
		 * Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println(
		 * "Output:"+s)); System.out.println("===========");
		 * Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println(
		 * "Output:"+s));
		 */
		
		/*
		 * Iterator<Integer> itr = al.iterator();// cursor interface //we can display
		 * the data from collection
		 * 
		 * while (itr.hasNext()) {// 12 System.out.println(itr.next()); }
		 */

		/*
		 * al.forEach(alData -> { System.out.println(alData); });
		 */

	}
}
