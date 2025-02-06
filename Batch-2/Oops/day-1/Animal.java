package com.java.batch.oops;

public class Animal {
	
//	public Animal() {
//		
//	}
	
	//properties, fields
	String name;
	String action;
	String color;
	
	//METHOD
	public String sound(String sound) {
		return sound;
	}
	
	public static void main(String[] args) {
		Animal an = new Animal();
		an.name="dog";
		an.action="wag";
		an.color="red";
		
		String s = an.sound("bark");
		
		System.out.println(an.name+" "+an.action+" "+an.color+" "+s);
		
		Animal an1 = new Animal();
		an1.name="lion";
		an1.action="jump";
		an1.color="yellow";
		String s1 = an1.sound("roar");
		
		System.out.println(an1.name+" "+an1.action+" "+an1.color+" "+s1);
		
	}

}
