package com.java.oops.abstraction.interfaces;

public class FunctionTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FunctionTest f = new FunctionTest();
		//lambda expression
		
		
//		System.out.println(func.calculate(2, 4));
		
		
//		System.out.println(new FunctionTest().calculate(2, 5));
		sum(4, 6);
		multiply(2, 2);
	}

	public static void sum(int x, int y) {
		FunctionalFirst func=(a, b) -> {
			System.out.println("using lambda expression");
			return a+b;
		};
		System.out.println("summing two nums: "+func.calculate(x, y));
	}
	
	
	public static void multiply(int x, int y) {
		FunctionalFirst func=(a, b) -> {
			System.out.println("using lambda expression");
			return a*b;
		};
		System.out.println("multiplying two nums: "+func.calculate(x, y));
	}
	
//	@Override
//	public int calculate(int a, int b) {
//		
//		return a+b;
//	}
	
	
	

	
	

}
