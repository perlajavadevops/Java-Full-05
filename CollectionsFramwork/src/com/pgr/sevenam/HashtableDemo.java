package com.pgr.sevenam;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(1, "Karma");
		hashtable.put(3, "Reddy");
		hashtable.put(10, "Dhatrika");
		hashtable.put(2, "Siva");
		hashtable.put(2, "Confience");//1011
		hashtable.put(9, "Siva");
		hashtable.put(5, "Teja");
		//hashtable.put(null, null);
		
		Set<Map.Entry<Integer, String>> entrySet = hashtable.entrySet();
		Iterator<Map.Entry<Integer, String>> entrySetItr = entrySet.iterator();
		
		while(entrySetItr.hasNext()) {
			Map.Entry<Integer, String> entry = entrySetItr.next();
			//hashtable.put(13, "Gaamika");
			System.out.println(entry.getKey()+" : " +entry.getValue());
		}
		
		System.out.println("==========");
	    Enumeration<String> enu = hashtable.elements();
	    while (enu.hasMoreElements()) {
			String string = (String) enu.nextElement();
			System.out.println(string);
			
		}
	}

}
