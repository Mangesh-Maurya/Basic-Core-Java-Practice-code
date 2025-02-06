package com.java.batch.array;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark;
		//int, long, short -> 0
		//String -> null;
		//float, double -> 0.0
		//
//		System.out.println(mark);
		
		
		//1 dimensional array
		//2 dimensional array
		
		
		
		// 0 0 0
		// 0 0 0
		// 0 0 0
		
		//new -> used to create objects in java.
		int[] marks=new int[10];
		System.out.println(marks);
		System.out.println(Arrays.toString(marks));
//		System.out.println("0 index marks: "+marks[0]);
		marks[0]=25;
//		System.out.println("0 index marks: "+marks[0]);
		marks[1]=55;
		marks[2]=50;
		marks[3]=20;
		marks[4]=30;
		
		System.out.println(Arrays.toString(marks));
		
		System.out.println("----------------------------------");
		
		//
		int[] mark1= {25,55,20,30,20,25};
		System.out.println("submit");
		System.out.println(Arrays.toString(mark1));

		
		//for-each loop/ enhance loop
		for(int i=0; i <= mark1.length-1; i++) {
			System.out.println("traversing marks: "+mark1[i]);
		}
		
		System.out.println(" ---------------------------------- ");
		
		for(int m : mark1) {
			System.out.println("using foreach: "+m);
		}
		
		
		String[] str=new String[10];
		str[0]="asb";
		str[1]="";
		
		
		Object[] obj=new Object[10];
		obj[0]="sdfs";
		obj[1]=1;
		obj[2]=1.0f;
		
		
		
	}

}
