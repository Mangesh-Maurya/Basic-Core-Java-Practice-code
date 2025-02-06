package com.java.batch.oops.finnal;

public  class Vehicle {
	
	private static String name;
	final String abc="sdf";
//	public final void setVehicleName(String name) {
//		this.name=name;
//	}
	
	//static methods cannot be overriden
	public static void setVehicleName(String namee) {
		
		name=namee;
		System.out.println("vehicle method");
	}
	
	public void doStart() {
		//abc="erww";
		System.out.println(name +" started.");
	}
	
}
