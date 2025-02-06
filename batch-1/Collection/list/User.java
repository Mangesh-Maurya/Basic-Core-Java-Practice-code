package com.java.collection.list;

public class User implements Comparable<User>{
	
	int id;
	String name;
	String address;
	
	public User() {}
	
	public User(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "\nUser [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
	@Override
	public int compareTo(User o) {
		
		
		return this.name.compareTo(o.getName());
//		if(this.id == o.getId()) {
//			return 0;
//		}
//		if(this.id > o.getId()) {
//			return 1;
//		}
//		
//		return -1;
	}
	
}
