package com.java.batch.relations;


//SINGLE RESPONSIBILITY PRICIPLE

class Address{
	String houseNo;
	String locality;
	String pincode;
	String landmark;
	
	public Address(String houseNo, String locality, String pincode, String landmark) {
		this.houseNo = houseNo;
		this.locality = locality;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	
	public String getAddress() {
		return houseNo+" "+locality+" "+landmark+" "+pincode;
	}
	
	public String getFullAddress() {
		StringBuilder sb=new StringBuilder();
		return sb.toString();
	}
	
}

//h.w.
class Manager{
	
}


class Employee{
	private String name;
	private String designation;
	private String jobLevel;
	private String phone;
	private Address address;//has-a relation
	
	
	public Employee(String name, String designation, String jobLevel, String phone, Address address) {
		this.name = name;
		this.designation = designation;
		this.jobLevel = jobLevel;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}
	
}


public class HasRelation {

	public static void main(String[] args) {
		Address address = new Address("12", "noida", "212325", "near xyz");
		Employee employee = new Employee("rachit", "java dev", "sd-1", "95689", address);
		Address a2 = employee.getAddress();
		String finalAdd = a2.getAddress();
		System.out.println("emp address: "+finalAdd);
		
	}

}
