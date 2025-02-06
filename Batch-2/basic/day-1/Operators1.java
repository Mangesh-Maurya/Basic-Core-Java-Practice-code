package com.java.batch.test;

public class Operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="password";
		String c="p";
		
//		if(c.equals("a")) {
//			System.out.println("aaaaaaaaaa");
//		}else if(c.equals("b")) {
//			System.out.println("bbbbbbbbbbb");
//		}else if(c.equals("c")) {
//			System.out.println("ccccccccccccccccccccc");
//		}else if(c.equals("d")) {
//			System.out.println("dddddddddddddddddddddddddd");
//		}
		
		
//		c="e";
		
		switch(c) {
			case "a":
				System.out.println("value is a");
				break;
			case "b":
				System.out.println("value is b");
				break;
			case "c":
				System.out.println("value is c");
				break;
			case "d":
				System.out.println("value is d");
				break;
			case "e":
				System.out.println("value is e");
				break;
			default: 
				System.out.println("invalid character.");
				
		}
		
		
		// loops
		// for, while, do while, enhanced for loop.
		//0 -> 1 2 3 4  5 6 7 8 9
		
		for(int i=0; i<10; i+=3) {
//			System.out.println("count: "+(i+1));
		}
		
		int total=10;
		int initialval=1;
		
		while(initialval < total) {
			System.out.println("value: "+initialval);
			initialval++;
		}
		
		int totalNum=5;
		int batch=5;
		int currentCnt=0;
		do {
			if(totalNum > batch) {
				currentCnt+=batch;
			}else {
				currentCnt=totalNum;
			}
			System.out.println("currentCnt: "+currentCnt);
		}while(currentCnt < totalNum);
		
		
		
		
		
//		int num=1;
//		int num1=2;
//		int num2=3;
//		int num3=4;
//		int num4=5;
//		int num5=6;
		
		
	}

}
