package com.karnav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.manasi.Employee;

public class CustomeObjectsDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,6000.5f);
		Employee emp3 = new Employee(100,"Confience",9090909090L,1000.5f);
		Employee emp4 = new Employee(104,"PerlaReddy",606060606060L,9000.5f);
		Employee emp5 = new Employee(103,"Roshmi",5050505050L,8000.5f);
		Employee emp6 = new Employee(105,"Karnav",777777777L,5000.5f);
		Employee emp7 = new Employee(105,"Karnav",777777777L,5000.5f);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp2);
		employeeList.add(emp1);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp2);
		employeeList.add(emp6);
		employeeList.add(emp7);
		Collections.sort(employeeList);
		Iterator<Employee> empItr = employeeList.iterator();
		while (empItr.hasNext()) {
			Employee employee = empItr.next();
			System.out.println(employee.toString());
			
		}
	}
}
