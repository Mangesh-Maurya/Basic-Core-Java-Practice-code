package com.java.batch.oops.statics;

import com.java.batch.oops.statics.Employee.Setter;

public class TestingStatic {

	public static void main(String[] args) {
		//builder design pattern.
		
//		Employee employee = new Employee();
//		System.out.println("get: "+employee.getName());
		
//		Setter setter = new Employee().new Setter("abc", "delhi");
		Setter setter = new Employee.Setter("abc", "delhi");
		Employee properties = setter.getProperties();
		
		System.out.println(properties.getName()+" "+properties.getAddress());
		
	}

}
