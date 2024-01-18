package com.pgr.sevenam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CustomObjectTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> empSet = new TreeSet<>();
		//ArrayList<Employee> empSet = new ArrayList<>();

		
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,6000.5f);
		Employee emp3 = new Employee(100,"Confience",9090909090L,1000.5f);
		Employee emp4 = new Employee(104,"PerlaReddy",606060606060L,9000.5f);
		Employee emp5 = new Employee(103,"Roshmi",5050505050L,8000.5f);
		Employee emp6 = new Employee(105,"Karnav",777777777L,5000.5f);
		Employee emp7 = new Employee(105,"Karnav",777777777L,5000.5f);
		
		System.out.println(emp6.hashCode());

		System.out.println(emp7.hashCode());
		
		empSet.add(emp2);
		empSet.add(emp1);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		empSet.add(emp2);
		empSet.add(emp6);
		empSet.add(emp7);
		
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
	}
}
