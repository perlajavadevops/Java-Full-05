package com.roshmi;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
	/*	stack.add("Perla");//101
		stack.add("Roshmi");//102
		stack.add("Dhatrika");
		stack.add("Siri");
		stack.add("Karthik");*/
		
		stack.push("Perla");//101 //perla, roshmi, dhatrika, siri, karthik
		stack.push("Roshmi");//102
		stack.push("Dhatrika");
		stack.push("Siri");
		stack.push("Karthik");
		
		if(!stack.isEmpty()){//
			System.out.println(stack.peek());
		}else{
			System.out.println("Stack is empty");
		}
		//System.out.println(stack.peek());
		System.out.println(stack.search("Perla"));
	/*	System.out.println("=====================");
		Iterator<String>  itr = stack.iterator();
		while (itr.hasNext()) {
			String integer = (String) itr.next();
			System.out.println(integer);
		}*/
	}
}
