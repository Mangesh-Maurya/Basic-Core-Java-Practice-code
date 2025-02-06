package com.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee("1", "amit", "javadev","1000");
		Employee employee1 = new Employee("6", "vijay", "php dev","4000");
		Employee employee2 = new Employee("3", "ravi", "python","2000");
		Employee employee3 = new Employee("5", "vicky", "javadev","3000");
		Employee employee4 = new Employee("4", "bunty", "golang","6000");
		Employee employee5 = new Employee("1", "amit kumar", "golang","6000");
		
//		Map<String, Employee> map = new HashMap<>(); 
		//it doesn't maintain insertion order of keys
//		Map<String, Employee> map = new LinkedHashMap<>();
		//it maintains insertion order of the keys
//		Map<String, Employee> map = new TreeMap<>();
		// it sorts the map in ascending order by default
		Map<String, Employee> map = new ConcurrentHashMap<String, Employee>();
		//it is used when we want to add/remove data while iteration/traversing of map.
		map.put(employee.getEmpId(), employee);
		map.put(employee1.getEmpId(), employee1);
		map.put(employee2.getEmpId(), employee2);
		map.put(employee3.getEmpId(), employee3);
		map.put(employee4.getEmpId(), employee4);
		map.put(employee5.getEmpId(), employee5);
		
		
		if(map.containsKey("7")) {
			Employee emp = map.get("7");
			System.out.println(emp.getEmpId());
		}
		
		System.out.println("key 1: "+map.get("1"));
		
		System.out.println("all keys: "+map.keySet());
		System.out.println("all values: "+map.values());
		
//		map.remove("1");
		
		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(map.get(key));
//		}
		
		
//		Employee emp = map.get("1");
//		System.out.println(emp.getEmpName()+" "+emp.getSalary());
		
//		Set<Object> hashSet = new HashSet<>();
		
		Set<Entry<String, Employee>> entrySet = map.entrySet();
		Iterator<Entry<String, Employee>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Employee> entry = iterator.next();
			System.out.println(entry.getKey() +" |  "+entry.getValue());
			map.put("7", employee5);
		}
		
		for(Entry<String, Employee> entry:map.entrySet()) {
			map.remove("1");
			Employee value = entry.getValue();
			value.setDesignation(value.getDesignation().toUpperCase());
			map.put("7", value);
		}
		
		System.out.println(map.keySet());
		
//		System.out.println(map);
//		map.entrySet().iterator();
		
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
