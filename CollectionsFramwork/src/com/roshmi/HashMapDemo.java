package com.roshmi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		// Adding elements to map
		map.put(1, "Amit");// 1 entry
		map.put(5, "Rahul");// 2nd entry
		map.put(2, "Jai");// bucket alogorithm
		map.put(6, "Amit");
		map.put(7, "Amit");
		map.put(7, "Manasi");
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(8, "Reddy");
		map1.put(9, "Roshmi");
		map1.put(4, "Siri");

		map.putAll(map1);
		//map.remove(7);
		//System.out.println(map.containsKey(6));//false
	//	System.out.println(map.containsValue("Perla"));//true
		//System.out.println(map.get(1));
		// Traversing Map
		//System.out.println(map);
		
		//converting map keys into set of keys
		/*Set<Integer> setOfKeys = map.keySet();//will all map keys into a set
		Iterator<Integer> keys = setOfKeys.iterator();
		while (keys.hasNext()) {
			Integer integer = (Integer) keys.next();
			System.out.println(integer);
		}*/
		
		/*HashSet<String> collection =(HashSet<String>) map.values();
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String integer = (String) itr.next();
			System.out.println(integer);
		}*/
		
		
		Set<Map.Entry<Integer, String>> setOfEntries = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> entriesItr = setOfEntries.iterator();
		
		while (entriesItr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) entriesItr.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
			
		}
		
	}
}
