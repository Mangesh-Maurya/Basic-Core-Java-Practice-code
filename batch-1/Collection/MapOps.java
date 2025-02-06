package com.java.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOps {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("1", "amit", "javadev","1000"));
		empList.add(new Employee("6", "vijay", "php dev","4000"));
		empList.add(new Employee("3", "ravi", "python","2000"));
		empList.add(new Employee("5", "vicky", "javadev","3000"));
		empList.add(new Employee("4", "bunty", "golang","6000"));
		empList.add(new Employee("1", "amit kumar", "golang","6000"));
		
		
		Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(key -> key.getDesignation(), Collectors.toList()));
		System.out.println("collection java 8: "+collect);
		
		Map<String, List<Employee>> empMap=new HashMap<>();
		for(Employee emp:empList) {
			if(!empMap.containsKey(emp.getDesignation())) {
				List<Employee> list = new ArrayList<>();
				list.add(emp);
				empMap.put(emp.getDesignation(), list);
			}else {
				List<Employee> list = empMap.get(emp.getDesignation());
				list.add(emp);
			}
		}
		
		for( Entry<String, List<Employee>> emp:empMap.entrySet()) {
			System.out.println(emp);
		}
		
	}
	
	public static class Employee{
		String empId;
		String empName;
		String designation;
		String salary;
		
		public Employee(String empId, String empName, String designation, String salary) {
			this.empId = empId;
			this.empName = empName;
			this.designation = designation;
			this.salary = salary;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
					+ salary + "]";
		}
		
		
		
	}
}
