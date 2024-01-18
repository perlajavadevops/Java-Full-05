package com.pgr.sevenam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		//ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();

		map1.put(1, "Karma");
		map1.put(3, "Reddy");
		map1.put(10, "Dhatrika");
		map1.put(2, "Siva");
		map1.put(2, "Confience");//1011
		map1.put(9, "Siva");
		map1.put(5, "Teja");
		//map1.put(null, null);
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(11, "Dhruvika");
		map2.put(3, "Siri");
		map2.put(12, "Vidhya");
		
		map1.putAll(map2);
		
		//System.out.println(map1.size());
		//map1.clear();
		//System.out.println(map1.size());
		//System.out.println(map1);
		//map1.put(null, null);
		
		//map1.remove(null);
		
		//System.out.println(map1.containsValue("Teja1"));
		
		/*
		 * HashSet<Integer> hashSet = new HashSet<>(); //getting keys seperately
		 * Set<Integer> keySetValues = map1.keySet(); Iterator<Integer> itr =
		 * keySetValues.iterator(); while(itr.hasNext()){ hashSet.add(itr.next());
		 * //System.out.println(itr.next()); }
		 * 
		 * ArrayList<String> arraLyst = new ArrayList<String>(); Collection<String>
		 * values = map1.values();
		 * 
		 * for(String s: values) { arraLyst.add(s); }
		 */
		
		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
		Iterator<Map.Entry<Integer, String>> entrySetItr = entrySet.iterator();
		
		while(entrySetItr.hasNext()) {
			Map.Entry<Integer, String> entry = entrySetItr.next();
			map1.put(13, "Gaamika");
			System.out.println(entry.getKey()+" : " +entry.getValue());
		}
		//System.out.println(values);
		
		/*
		 * for (int i = 0; i < map1.size(); i++) { System.out.println(map1.get(i)); }
		 */
		
		

	}
}
