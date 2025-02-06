package com.java.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CustomSetImp {

	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "mangesh", "java developer");
		Employee emp2 = new Employee(1, "mangesh", "java developer");
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
//		String s="abc";
//		
//		s.equals(s);
//		//equals(Object obj){
//		//	this == obj
//		//  
//		//}
		
		Set<Employee> set = new LinkedHashSet<>();
		set.add(new Employee(1, "mangesh", "java developer"));
		set.add(new Employee(1, "aditya", "java developer"));
		set.add(new Employee(4, "aditya", "phyton developer"));
		set.add(new Employee(3, "bunty", "c developer"));
		set.add(new Employee(3, "navneet", "c developer"));
		set.add(new Employee(2, "rajnish", "Ui developer"));
		
		System.out.println(set);
		
		
	}

}
