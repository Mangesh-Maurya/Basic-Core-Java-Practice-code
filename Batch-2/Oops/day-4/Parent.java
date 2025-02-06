package com.java.batch.oops.inheritance;

public class Parent {
	
	public Parent() {
		System.out.println("parent constructor called.");
	}
	
	public String name;
	
	public void doAction() {
		System.out.println("parent ride bicycle with name: "+name);
	}
	
	protected static void m1() {
		System.out.println("this is my private method.");
	}
	
	public static void caller() {
		m1();
	}
	
	
}
