package com.pgr.java8features;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, String> map1 = new TreeMap<String, String>();
		map1.put("One", "Karma");
		map1.put("Two", "Reddy");
		map1.put("Four", "Dhatrika");
		map1.put("TwoT", "Siva");
		map1.put("TwoT", "Siva");
		map1.put("TwoQ", "Teja");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Three", "Gangi");
		map2.put("Five", "Perla");
		
		map1.putAll(map2);;
		
		ArrayList al = (ArrayList) map1.values().stream().collect(Collectors.toList());
		
		ArrayList al1 = (ArrayList) map1.keySet().stream().collect(Collectors.toList());
		System.out.println(al1);
		
		
		ArrayList<Map.Entry<String, String>> al2 = (ArrayList<Map.Entry<String, String>>) map1.entrySet().stream().collect(Collectors.toList());
		al2.forEach(a -> System.out.println(a.getKey()));
		/*
		 * System.out.println(al2);
		 */		//map1.remove("Five");
		//System.out.println(map1.containsKey("Five"));
		//System.out.println(map1.containsValue("Perla"));
		//System.out.println("size "+map.size());
		//System.out.println(map.get("One"));//getting a value using get()
	/*	Collection<String> mapCollection = map.values();
		Iterator<String> itr = mapCollection.iterator();
		ArrayList<String> list = new ArrayList<String>();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			list.add(type);
		}
		System.out.println(list);*/
		
		//System.out.println(map);
		//set of keys
		/*Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			System.out.println(type);
		}*/
		
		/*
		 * Set<Map.Entry<String,String>> entrySet = map1.entrySet();
		 * ArrayList<Map.Entry<String, String>> mapList = new
		 * ArrayList<Map.Entry<String,String>>(entrySet);
		 * 
		 * Iterator<Map.Entry<String, String>> itr = mapList.iterator(); while
		 * (itr.hasNext()) { Map.Entry<String, String> entry = (Map.Entry<String,
		 * String>) itr .next();
		 * System.out.println("Key : "+entry.getKey()+", value : "+entry.getValue());
		 * 
		 * }
		 */
	}

}
