package com.pgr.colle;

public class CountCharsDemo {

	public static void main(String[] args) {
		String s = "abcdefabcghiabcdef";
		int i = 0;
		int count = 0;
	
		while(s.length()>0) {
			char ch = s.charAt(i);
			String str = s.replace(ch+"","");
			//System.out.println(str);
			count = s.length()-str.length();
			System.out.println(ch+" : "+count);
			s = str;
		//	System.out.println(s);
		}
		//database drivers: odbc-jdbc, native driver, netwrokign, thin driver
	}//CRUD--> CURD->create, update, read, delete
}
