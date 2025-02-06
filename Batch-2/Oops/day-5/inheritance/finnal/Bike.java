package com.java.batch.oops.finnal;

public class Bike extends Vehicle{

	//final(keyword) -> class, method, field/variable;
	//class -> if I use final keyword with class then no class will be able to inherit/extends my class.
	//method -> no class will be allowed to override that method
	//field -> once initialized no one can change the value of that variable.
	
	
//	@Override
	public static void setVehicleName(String name) {
		System.out.println("modified vehicle name. "+name);
	}
	
	public void printTattoo() {
		System.out.println("tattoo printed.");
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setVehicleName("abc");
	}

}
