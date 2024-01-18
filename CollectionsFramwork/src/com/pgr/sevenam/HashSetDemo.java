package com.pgr.sevenam;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class HashSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Perla");
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("dhatrika");
		
		//set.add(null);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
