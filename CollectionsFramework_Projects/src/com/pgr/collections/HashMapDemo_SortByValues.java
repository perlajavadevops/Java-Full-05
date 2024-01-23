package com.pgr.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo_SortByValues {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TreeMap<String, String> map1 = new TreeMap<String, String>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("One", "Karma");
		map1.put("Two", "Reddy");
		map1.put("Four", "Dhatrika");
		map1.put("TwoT", "Siva");
		map1.put("TwoT", "Siva ");
		map1.put("TwoQ", "Teja");
		// map1.put(null, null);

		ArrayList<String> values = new ArrayList<String>();
		Collection<String> coll = map1.values();
		Iterator<String> itr = coll.iterator();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			values.add(type);
			// System.out.println(type);
		}
//		/System.out.println("before sorting "+values);
		values.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		/*
		 * Collections.sort(values, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * }
		 * 
		 * });
		 */

		// System.out.println("after sorting "+values);

		LinkedHashMap<String, String> map3 = new LinkedHashMap<String, String>();

		Set<Map.Entry<String, String>> set = map1.entrySet();

		for (String val : values) {

			for (Map.Entry<String, String> ent : map1.entrySet()) {
				if (ent.getValue().equals(val)) {
					map3.put(ent.getKey(), val);
				}
			}
		}

		System.out.println(map3);

	}
}
