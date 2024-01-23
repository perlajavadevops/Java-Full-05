package com.pgr.collections;

import java.util.LinkedHashMap;

public class CountCharsDemo {

	public static void main(String[] args) {
		String s = "abcabcad";
		char[] ch = s.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
	}
}
