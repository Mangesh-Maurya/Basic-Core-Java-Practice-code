package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.setEmpId(2);
		emp.setEmpName("mangesh");
		emp.setSalary(10000);
		
		Employee emp1=new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("bunty");
		emp1.setSalary(50000);

		Employee emp2=new Employee();
		emp2.setEmpId(3);
		emp2.setEmpName("aditya");
		emp2.setSalary(40000);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
		System.out.println(empList);
		System.out.println();
		
		Comparator<Employee> idSorter = new IdSorter();
		Collections.sort(empList, idSorter);
		System.out.println("sorted by id: "+empList);
		
		Collections.sort(empList, new NameSorter());
		System.out.println("sorted by name: "+empList);
		
		
		
		
		
	}

}
