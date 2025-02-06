package com.java.batch.oops.polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		//polymorphism
		//types of polymorphism
		//compiletime / static binding/ early binding
			//Method overloading
		//runtime / dynamic binding / late binding
		
		
		//method overloading
		PolyExample.multiply(1,2);
		PolyExample.multiply(1.2f,2.5f);
		
		
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

	public static float multiply(int a, float b) {
		return a*b;
	}
	
	public static double multiply(float a, int b) {
		return a*b;
	}
	
	
	public static int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public static float multiply(float a, float b) {
		return a*b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
	}

}
