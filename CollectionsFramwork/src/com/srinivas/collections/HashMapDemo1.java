package com.srinivas.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Srinivas");
		map.put(2, "Perla Reddy");
		map.put(3, "Dhatrika");
		map.put(4, "Alka");
		map.put(1, "Sri");
		
		//System.out.println(map.get(4));
		//System.out.println(map.size());
		//System.out.println(map.isEmpty());
		//map.replace(2, "Rddy");
		
		//map.remove(2);
		//System.out.println(map);
		System.out.println(map.containsValue("Alkad"));
		
		/*  */
	/*	Set<Integer> setOfKeys = map.keySet();
		Iterator<Integer> itr = setOfKeys.iterator();
		while (itr.hasNext()) {
			Integer integer = itr.next();
			System.out.println(integer);
		}
		
		
		Collection<String> values= map.values();
		Iterator<String> valuesItr = values.iterator();
		while (valuesItr.hasNext()) {
			String string = (String) valuesItr.next();
			System.out.println(string);
			
		}
		for (String string : values) {
			System.out.println(string);
		}*/
		
		Set<Map.Entry<Integer, String>> setOfEntries= map.entrySet();		
		Iterator<Map.Entry<Integer, String>> itr = setOfEntries.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+", "+entry.getValue());
			
			
		}
	}
}
