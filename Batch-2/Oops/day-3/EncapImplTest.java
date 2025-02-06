package com.java.batch.oops.encapsulation;

public class EncapImplTest {

	public static void main(String[] args) {
			
		Encapsulation e = new Encapsulation();
//		e.name="rachit rachit sharma rachit";
//		e.age=1500;
		
		e.setName("rachit\nsharma");
		e.setAge(20);
		
		System.out.println(e.getAge() + " "+e.getName());
		
		
	}

}
