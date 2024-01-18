package com.pgr.sevenam;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<Integer, String>();
		map1.put(1, "Karma");
		map1.put(3, "Reddy");
		map1.put(10, "Dhatrika");
		map1.put(2, "Siva");
		map1.put(2, "Confience");//1011
		map1.put(9, "Siva");
		map1.put(5, "Teja");
		/*map1.put(null, null);
		map1.put(null, null);
		*/
	//	map1.values();
		
		//map1.remove(2);
		//map1.clear();
		
		//Collections.synchronizedMap(map1);
	/*	System.out.println(map1.size());
		System.out.println(map1.containsKey(23));
		System.out.println(map1.containsValue("abc"));*/
		System.out.println(map1);
		/*LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(4, "Gangi");
		map2.put(8, "Perla");*/
		
		/*map1.putAll(map2);*/
		
		//System.out.println(map1.get(2));

		//map1.replace(4, "Reddy");
	//	System.out.println(map1.get(4));
		//map1.remove(9);
		//map1.clear();
		//System.out.println(map1.size());
		//System.out.println(map1.containsKey(10));
		//System.out.println(map1.containsValue("Perla"));
		
		/*Collection<String> mapCollection = map1.values();
		Iterator<String> itr = mapCollection.iterator();
		ArrayList<String> list = new ArrayList<String>();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			System.out.println(type);
			list.add(type);//
		}*/
		//System.out.println(list);	
	/*	Iterator<String> itr2 = list.iterator();
		while (itr2.hasNext()) {
			String type = (String) itr2.next();
			System.out.println(type);
		}
		*/
		/*Set<Integer> set = map1.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer type = (Integer) itr.next();
			System.out.println(type);
		}*/
		
		/*Set<Map.Entry<Integer,String>>  entrySet1 = map1.entrySet();
	
		ArrayList<Map.Entry<Integer, String>>  mapList = new ArrayList<Map.Entry<Integer,String>>(entrySet1);
		
		Iterator<Map.Entry<Integer, String>> itr = mapList.iterator();
	
		while (itr.hasNext()) {
			
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr
					.next();
			System.out.println("Key : "+entry.getKey()+", value : "+entry.getValue());
		}*/
	}
}
