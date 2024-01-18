package com.pgr.sevenam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class CustomObjectTreeMap {

	public static void main(String[] args) {
		
		Employee2 emp1 = new Employee2(101,"Reddy",8080808080L,3030.00F);
		Employee2 emp2 = new Employee2(102,"Dhatrika",707070707070L,6000.5f);
		Employee2 emp3 = new Employee2(100,"Confience",9090909090L,1000.5f);
		Employee2 emp4 = new Employee2(104,"PerlaReddy",606060606060L,9000.5f);
		Employee2 emp5 = new Employee2(103,"Roshmi",5050505050L,8000.5f);
		Employee2 emp6 = new Employee2(105,"Karnav",777777777L,5000.5f);
		Employee2 emp7 = new Employee2(105,"Karnav",777777777L,5000.5f);
		
		TreeMap<Employee2,String>  map = new TreeMap<Employee2,String>();
		
		map.put(emp1,"One");
		map.put(emp2,"Two");
		map.put(emp3,"Three");
		map.put(emp4,"Four");
		map.put(emp5,"Five");
		map.put(emp6,"Six");
		map.put(emp7,"Seven");
	/*	map.put("One", emp1);
		map.put("Two", emp2);
		map.put("Four", emp4);
		map.put("Four", emp5);
		map.put("TwoT", emp3);
		map.put("Three", emp3);//101
		map.put("Three", emp4);*///101
		
		System.out.println("Using Iterator ");
		Set<Entry<Employee2,String>> set = map.entrySet();//it will convert map to Set

		Iterator<Entry<Employee2,String>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Employee2,String> entries = itr.next();
			System.out.print(entries.getKey()+" : ");
			System.out.println(entries.getValue().toString());
			//entries.getValue().displayEmplyee();
		}
		
	}
}
