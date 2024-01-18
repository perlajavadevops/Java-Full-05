package com.pgr.sevenam;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo2 {

	public static <K, V extends Comparable<V>> Map<K,V> sortByValues(Map<K, V> map){
		
		System.out.println(map);
		Comparator<K> valueComp = new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				
				int val = map.get(o1).compareTo( map.get(o2));
				
				if(val ==0 )
					return 1;
				else
					return val;
			}
		};
		
		Map<K, V> map2 = new TreeMap<K, V>(valueComp);
		map2.putAll(map);
		return map2;
		
	}
	public static void main(String[] args) {
		//LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "Karma");
		map1.put(3, "Reddy");
		map1.put(10, "Dhatrika");
		map1.put(2, "Siva");
		map1.put(2, "Confience");//1011
		map1.put(9, "Siva");
		map1.put(5, "Teja");
		//map1.put(null, null);
		//System.out.println(map1);
		//map1.put(null, null);
		
		Map map = sortByValues(map1);
		System.out.println(map);
		
		
	}
}
