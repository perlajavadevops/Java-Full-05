package com.pgr.eightpm.inner;

public class EnumDemo {

	public static void main(String[] args) {
		String name = Weeks.SUNDAY.name();
		
		Weeks[]  weeks = Weeks.values();
		
		//System.out.println(Weeks.valueOf();
		for(Weeks q: weeks) {
			System.out.println(q);
		}
		System.out.println(name);
	}
}
