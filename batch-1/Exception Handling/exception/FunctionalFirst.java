package com.java.oops.abstraction.interfaces;


@FunctionalInterface
public interface FunctionalFirst {
	
	// anonymous interface is also called functional interface.
	// which have only one abstract method.
	// functional interface can be implemented anonymously using lambda expression.
	public int  calculate(int a, int b);

	
	default void m1() {
		
	}
	
	static void m2() {
		
	}
	
	
	
	
}
