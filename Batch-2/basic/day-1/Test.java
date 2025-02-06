package com.java.batch.test;

//public abstract and final keywords are allowed only.
public class Test {
	
	static short tt=32767;//instance variable
	
	public static void main(String[] args) {
		
		Load.main(args);
		Load.main(args);
		
		//Variables
		//local, instance and static
		//data types
		//byte, short, int, long, float, double, boolean, char
		//byte, short, int, long, float, double -> these variables hold numeric data
		//byte -> 1 byte
		
		//10
		
		//local variables
		short lc=tt;
		lc=(short)(lc+1);
		
		short sh=32767;
		int in=587569598;
		long l=956784222222222222l;
		float f=1575757488.5569785254554f;
		double d=12434.4545d;
		
		String s="as234561232@#$$";
		
		boolean b=false;
		
		char c='I';
		
		
	}
	
	
	public void test() {
		System.out.println(tt);
		Load.main(null);
	}
	
	
//	short temp=lc;
	
}
