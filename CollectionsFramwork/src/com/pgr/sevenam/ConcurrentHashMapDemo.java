package com.pgr.sevenam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		//HashMap<Integer, String> map1 = new HashMap<>();
		ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();

		map1.put(1, "Karma");
		map1.put(3, "Reddy");
		map1.put(10, "Dhatrika");
		map1.put(2, "Siva");
		map1.put(2, "Confience");//1011
		map1.put(9, "Siva");
		map1.put(5, "Teja");
		//map1.put(null, null);
		
		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
		Iterator<Map.Entry<Integer, String>> entrySetItr = entrySet.iterator();
		
		while(entrySetItr.hasNext()) {
			Map.Entry<Integer, String> entry = entrySetItr.next();
			map1.put(13, "Gaamika");
			System.out.println(entry.getKey()+" : " +entry.getValue());
		}
	}
}
