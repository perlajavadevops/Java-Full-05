package com.srinivas.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetBasedDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Srinivas");
		set.add("Siva");
		set.add("Gangi Reddy");
		set.add("Dhatrika");
		set.add("Karthik");
		
		
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Alka");
		set1.add("Sabareesh");
		set1.add("Narmadha");
		set1.add("Dinesh");
		set1.add("Karthik");
		
		//System.out.println(set.size());
		set.addAll(set1);
		for (String name : set) {
			System.out.println(name);
		}
		
		
		
	}
}
