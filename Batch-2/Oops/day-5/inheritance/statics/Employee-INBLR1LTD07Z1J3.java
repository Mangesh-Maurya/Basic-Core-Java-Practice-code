package com.java.batch.oops.statics;

public class Employee {
	
	String name;
	String address;
	
	public Employee() {}
	
	private Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static class Setter{
		private String name;
		private String address;
		
		public Setter(String name, String address) {
			this.name = name;
			this.address = address;
		} 
		
		public Employee getProperties() {
			return new Employee(this.name, this.address);
		}
		
	}
	
}
