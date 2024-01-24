package com.pgr.java8features;

import java.util.stream.Stream;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Hi";
		String s3 = "wellcome";
		String s4 = new String("Hi");
		
		//System.out.println(s3.contains("c"));//true
		
		/*System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s3.equals(s2));// false
*/		//System.out.println(s4.equals(s1));//true
		
		/*System.out.println(s1==s2);//true
		System.out.println(s3==s1);//false
*/		
		//System.out.println(s4==s1);//false
		
		//System.out.println(s4.equalsIgnoreCase(s1));//true
		//System.out.println(s4.equalsIgnoreCase(s3));//true
		
		//0 +positive, -negative
		/*System.out.println(s1.compareTo(s4));//0 ASCII 
		System.out.println(s1.compareTo(s3));//72-119=-47 == both are not equal
		System.out.println(s3.compareTo(s2));//119-72 = 47 -== both are nto 119-72
		*/
		//System.out.println(s1.isEmpty());//false
		String username = null;
		String password = "xyx@123"; //8
		//System.out.println(password.length());//7
		
		/*char[] chArr = password.toCharArray();//{'x','y'..}
		for(int i = 0; i< chArr.length; i++){
			System.out.println(chArr[i]);//0
		}
		*/
		
		String space = "ASCII stands for American Standard Code for Information Interchange";
		
		  //space = String.join(space, "Hello");
		  
		 // System.out.println(space);
		 
		
		Stream.of(space).forEachOrdered(a ->System.out.println(a));
		
	   // space = space.concat("Java");
		//System.out.println(space);
		//space = space.replace('y', 'i');
		/*System.out.println(space.substring(6,9));
		System.out.println(space.substring(17).trim());*/
		
		
		//System.out.println(space1);
		/*String[] strArr = space.split(" ");//converting string arr based space.
		System.out.println(strArr.length);//
		for (String string : strArr) {
			System.out.println(string);
		}*/
		
		
		/*boolean val = true;
		String value = String.valueOf(val);//"true"
		System.out.println(value);
		*/
	    
	    
		
		/*byte[] by = value.getBytes();//IO-
		System.out.println(by.length);//
		
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);
		}*/
		/*System.out.println("Before removing spaces : "+space);
		System.out.println("After removing spaces : "+space.trim());
		*/
			//false       && nothing
		/*if(username!=null && !username.isEmpty()){
			System.out.println("login success");
		}else{
			System.out.println("Login Failed");
		}*/
		/*System.out.println(s3.toUpperCase());
		System.out.println(s1.toLowerCase());*/
		
		/*
		 * System.out.println(s3.startsWith("W"));//false
		 * System.out.println(s3.endsWith("e"));//
		 */		
	}
}
