package com.java.batch.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetSortingEx {

	public static void main(String[] args) {
		Employee e = new Employee("rajnish", "angular dev", 800);
		Employee e1 = new Employee("rajnish", "angular dev", 800);
		new Employee("rajnish", "angular dev", 800);
		e.equals(e1);
		
		if(e == e1) {
			
		}
		
//		hashcode and equals method
//		if two elements are equal using == operator then it is not necessary that two elements
//		will be equal using equals method.
//		if two elements are equal using equals() method then hashcode of those two elements will be equal.
//		
//		
		
		Set<Employee>  set=new HashSet<>();
		set.add(new Employee("mangesh", "java dev", 500));
		set.add(new Employee("vicky", "sql dev", 200));
		set.add(new Employee("rajnish", "angular dev", 800));
		set.add(new Employee("rajnish", "angular dev", 400));

		System.out.println(set);
		ArrayList<Employee> arrayList = new ArrayList<>(set);
		Collections.sort(arrayList, new SalarySorter());
		System.out.println(arrayList);
		
	}
	
}



class Employee{
	String name;
	String designation;
	int salary;
	
	public Employee(String name, String designation, int salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n[name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		Employee emp = (Employee)obj;
		return this.name.equals(emp.name);
	}
	
	
}


class NameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.name.compareTo(o1.name);
	}
}

class SalarySorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.salary - o1.salary;
	}
}

