package com.roshmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ComparableDemo {

	public static void main(String[] args) {
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("Perla");//101
		list.add("Roshmi");//102
		list.add("Dhatrika");
		list.add("Siri");
		list.add("Karthik");	
		
		
		System.out.println("=========Before Sorting===========");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		Collections.sort(list);
		
		System.out.println("=========After Sorting===========");
		Iterator<String> itr1 = list.iterator();
		while (itr1.hasNext()) {
			String string = (String) itr1.next();
			System.out.println(string);
		}*/
		
		
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,4000.5f);
		Employee emp3 = new Employee(100,"Confience",9090909090L,2000.5f);
		Employee emp4 = new Employee(104,"PerlaReddy",606060606060L,9000.5f);
		Employee emp5 = new Employee(103,"Roshmi",5050505050L,8000.5f);

		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(emp2);
		list.add(emp1);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		//list.add(emp2);
		
	/*	System.out.println("=========Before Sorting===========");
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()){
			Employee employee = itr.next();
			//employee.displayEmplyee();
			System.out.println(employee.toString());
		}*/
		
		Collections.sort(list);
		
		System.out.println("=========After Sorting===========");
		Iterator<Employee> itr1 = list.iterator();
		while(itr1.hasNext()){
			Employee employee = itr1.next();
			//employee.displayEmplyee();
			System.out.println(employee.toString());
		}
		
	}
}
