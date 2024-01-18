package com.roshmi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();//HashMap
		al.add("Perla");//101
		al.add("Roshmi");//102
		al.add("Dhatrika");
		al.add("Siri");
		al.add("Karthik");

        //al.removeIf(str->str.contains("Perla"));    

		Iterator<String>  itr = al.iterator();
		while (itr.hasNext()) {
			String integer = (String) itr.next();
			System.out.println(integer);
		}
		//Dta, kar, p, r, s
	}
}
