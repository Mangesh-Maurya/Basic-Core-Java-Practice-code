package com.java.batch.oops.polymorphism;



class A{
	public void test() {
		System.out.println("A called.");
	}
}

class B extends A {
	@Override
	public void test() {
		System.out.println("B called.");
	}
}
//using method overriding, we do achieve runtime polymorphism. 
public class RuntimePoly {

	public static void main(String[] args) {
		B b = new B();
		b.test();
	}

}
