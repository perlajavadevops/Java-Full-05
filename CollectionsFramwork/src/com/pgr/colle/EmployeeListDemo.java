package com.pgr.colle;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeListDemo {

	public static List<Employee> getEmployeeList(){
		
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,4000.5f);
		Employee emp3 = new Employee(100,"Confience",9090909090L,2000.5f);
		Employee emp4 = new Employee(104,"PerlaReddy",606060606060L,9000.5f);
		Employee emp5 = new Employee(103,"Roshmi",5050505050L,8000.5f);

		//List<Employee> al = new ArrayList<Employee>(); 
		LinkedList<Employee> al = new LinkedList<Employee>();
		al.add(emp2);
		al.add(emp1);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		al.add(emp2);
		
		return al;
		
	}
	
	public static void main(String[] args) {
		List<Employee> employees = getEmployeeList();
		Collections.sort(employees);
		Iterator<Employee> itr = employees.iterator();
		while(itr.hasNext()){
			Employee employee = itr.next();
			//employee.displayEmplyee();
			System.out.println(employee.toString());
		}
	}
}
