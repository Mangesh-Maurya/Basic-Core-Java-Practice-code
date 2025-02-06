package com.java.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {//it throws the exception
//			String name=null;
//			System.out.println(name);
//			name=name.substring(3,6);
//			System.out.println("name: "+name);
//			
//		}catch(NullPointerException e) {
//			System.out.println("inside catch block, handling null pointer");
//			System.err.println("Exception in thread");
//			e.printStackTrace();
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("number: "+(++i));
//		}
		
		
		int[] arr= {1,234,5,6,7,8};
		
		System.out.println("arr[0]: "+arr[0]);
		
		try {
			String name=null;
			name.indexOf(0);
			
			System.out.println("arr[6]: "+arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 6 is not present");
		} catch (Exception e) {
			System.out.println("name is null");
		}
		
		
		System.out.println("arr[1]: "+arr[1]);
		System.out.println("arr[2]: "+arr[2]);
		System.out.println("arr[3]: "+arr[3]);
		
		
		//checked exception
		try {
			Class.forName("com.java.exception.TestClass");
			System.out.println("class loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//nullpointerexception ->
		
		
		int num=1;
		try {
			System.out.println(num/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		//throw
		//throws
	}

}
