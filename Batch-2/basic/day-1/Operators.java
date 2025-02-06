package com.java.batch.test;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arithmetic operators
		// + - * / %
		
		String name="neeru";
		
		System.out.println(name);
		
		int a = 5;
		
		int b = 7;
		
		// 1.4
		// 2
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b % a);
		
		
		//Assignment operators
		// =, +=, -=, *=, /=, %=
		System.out.println("---------");
		a=a+12;
		System.out.println(a);
		a+=12;
		System.out.println(a);
		
		
		//comparison operators
		// ==, !=, <, >, <=, >=
		b=29;
		
		boolean isEqual = a == b;
		System.out.println("isEqual: "+isEqual);

		boolean isNotEqual = a != b;
		System.out.println("isNotEqual: "+isNotEqual);
		
		
		//Logical Operators
		// && (and), || (or),  !(not)
		
		boolean notEqual=!isEqual;
		System.out.println("not operator: "+notEqual);
		
		
		boolean bothTrue = isEqual && isNotEqual;
		System.out.println("bothTrue: "+bothTrue);
		
		name="mangesh";
		int age=17;
		
		boolean isApplicable = name.equals("mangesh") && age > 18;
		System.out.println("isApplicable: "+isApplicable);
		
		isApplicable = name.equals("mangesh") || age > 18;
		System.out.println("(or operator)isApplicable: "+isApplicable);
		
		
		
		
		//instanceof operator
		System.out.println("----------------------------");
		name="amit";
		Object obj=12;
		
		//it always check for true condition.
		if(obj instanceof String) {
			System.out.println(obj.toString().toUpperCase());
		}else if(obj instanceof Integer) {
			int div=(int)obj / 12;
			System.out.println("obj is integer: "+div);
		}else if(obj instanceof Character) {//wrapper
			System.out.println("obj is character: "+obj);
		}
		
		
		
		if(obj instanceof String) {
			System.out.println(obj.toString().toUpperCase());
		}else if(obj instanceof Integer) {
			int div=(int)obj / 12;
			System.out.println("obj is integer: "+div);
		} /*
			 * else { System.out.println("obj is character: "+obj); }
			 */
		
//		else if(obj instanceof Character) {//wrapper
			System.out.println("obj is character: "+obj);
//		}
		
		
			
			String s="Virender"; 
			
			System.out.println("equalcase: " +s.equals("Virender"));
			System.out.println("ignorecase: " +s.equalsIgnoreCase("virender"));
		 
		
		
	}

}
