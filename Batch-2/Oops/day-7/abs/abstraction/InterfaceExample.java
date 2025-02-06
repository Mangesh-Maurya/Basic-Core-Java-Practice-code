package com.java.batch.oops.abstraction;



public interface InterfaceExample {
	
	String name="abc";
	
	// variables are (public static final) bydefault  in interface
	// all methods are abstract by default
	// since java 9 we can create default and static methods now.
	// we don't need to put abstract before every method.
	
	public void test();
}
