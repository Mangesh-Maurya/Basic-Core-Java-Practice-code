package com.java.batch.oops.encapsulation;

public class Encapsulation {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		if(name != null) {
			if(name.length() == 0) {
				System.out.println("name cannot be empty.");
			}else {
				this.name=name;
			}
		}else {
			System.out.println("Name is Null.");
		}
	}
	
	public void setAge(int age) {
		if(age > 100) {
			System.out.println("age must be less than or equals to 100.");
		} else if(age < 18){
			System.out.println("age must be atleast 18");
		}else {
			this.age=age;
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
//	public static void main(String[] args) {
//		Encapsulation e = new Encapsulation();
//		e.name="rachit rachit sharma rachit";
//		e.age=1500;
//	}
}
