package com.java.batch.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		//Exception -> aiob, np, nf, ae
		String name=null;
		
		
//		test();
		
		//try catch block
		
		try {
			//code
			System.out.println(name.toUpperCase());
			System.out.println("name printed.");
			System.out.println("performing database operation");
//			int num=10/0;
//			System.out.println(num);
//			
			System.out.println("closing connection");
			String value="123#";
			Integer.parseInt(value);
		} catch(NullPointerException e) {
			//code
			e.printStackTrace();
		} catch(ArithmeticException | NumberFormatException a) {
			a.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("closing connection");
			System.out.println("executing finally");
			name="abc";
		}
		
		//
		//
		//finally block
		//finally executes always whether the exception handles or not.
		
		System.out.println("lowercase: "+name.toLowerCase());
		
		//code
		int a=1, b=2;
		System.out.println("addition "+(a+b));
	}
	
	
	public static void test() {
		System.out.println("testing going on.");
		test();
	}
}
