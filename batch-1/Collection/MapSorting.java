package com.java.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		
		//it creates an array of 16 size, each index is called a bucket.
		
		// 0 1 2 3 4 5 6 7 8 9
		//   1   3   5 6
		//   1 3 5 6
		// "amitkumnar"   "ravi"   "amit"
		// "amitkumnar","ravi","amit"
		
		
		Employee employee = new Employee("1", "amit", "javadev","1000");
		Employee employee2 = new Employee("6", "vijay", "php dev","4000");
		Employee employee3 = new Employee("3", "ravi", "python","2000");
		Employee employee4 = new Employee("5", "vicky", "javadev","3000");
		Employee employee5 = new Employee("4", "bunty", "golang","6000");
		Employee employee6 = new Employee("1", "amit kumar", "golang","6000");
		
		map.put(employee.getEmpName(), employee);
		map.put(employee2.getEmpName(), employee2);
		map.put(employee3.getEmpName(), employee3);
		map.put(employee4.getEmpName(), employee4);
		map.put(employee5.getEmpName(), employee5);
		map.put(employee6.getEmpName(), employee6);
		
//		System.out.println("hashMap : "+map);
//		//sort map by key
//		TreeMap<String, Employee> treeMap = new TreeMap<>(map);
//		System.out.println("tree map: "+treeMap);
//		
//		System.out.println("descending: "+treeMap.descendingMap());
		
		//Set<Entry<String,Employee
		System.out.println(map.entrySet());
		List<Entry<String, Employee>> entryList = new ArrayList<>(map.entrySet());
		
//		Collections.sort(entryList, new Comparator<Map.Entry<String, Employee>>() {
//			@Override
//			public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
//				return Integer.parseInt(o1.getValue().getSalary()) - Integer.parseInt(o2.getValue().getSalary());
////				return Integer.compare(Integer.parseInt(o1.getValue().getSalary()), Integer.parseInt(o2.getValue().getSalary()));
////				return o1.getValue().getDesignation().compareTo(o2.getValue().getDesignation());
//			}
//		});
		
//		Collections.sort(entryList, (o1, o2) -> {
//				return Integer.parseInt(o1.getValue().getSalary()) - Integer.parseInt(o2.getValue().getSalary());
////				return Integer.compare(Integer.parseInt(o1.getValue().getSalary()), Integer.parseInt(o2.getValue().getSalary()));
////				return o1.getValue().getDesignation().compareTo(o2.getValue().getDesignation());
//			}
//		);
		
		Collections.sort(entryList, (o1, o2) -> Integer.parseInt(o1.getValue().getSalary()) - Integer.parseInt(o2.getValue().getSalary()));
		System.out.println(entryList);
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
		
		
		
		
		public String getEmpId() {
			return empId;
		}




		public void setEmpId(String empId) {
			this.empId = empId;
		}




		public String getEmpName() {
			return empName;
		}




		public void setEmpName(String empName) {
			this.empName = empName;
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
