package com.java.demo;

public class Recursion {
	
	
	public static void main(String[] args) {
		//recursion
		//1
		//System.out.println(sum(1));	
		//5
		//
		//5x4x3x2x1
		System.out.println(fact(5));
	}
	
	static int fact(int val) {
		if(val == 0) {
			return 1;
		}
		
		return val * fact(val - 1);
	}
	
	//fact(5); 5x4
	//fact(4); 4x3
	//fact(3); 3x2
	//fact(2); 2x1
	//fact(1); 1x1
	//fact(0); x
	//
	
	
	public static int sum(int a) {
		System.out.println("sum: "+a);
		if(a == -10) {
			return a;
		}
		int num=sum(a+1);
		return num;
	}
	
	//sum(1)
	//sum(2)
	//sum(3)
	//sum(4)
	//sum(10)
	//
	
	
}
