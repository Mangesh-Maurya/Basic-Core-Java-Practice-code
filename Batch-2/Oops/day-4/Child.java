package com.java.batch.oops.inheritance;

public class Child extends Parent{
	
	//this -> refers the current class instance data
	//super -> refers the parent class instance data, constructor, methods/behaviour
	public Child() {
		super();
		System.out.println("child constructor called.");
	}
	
	public String nickName;
	
	public void childProp() {
		System.out.println("childprop method called."); 
	}
	
	@Override
	public void doAction() {
		super.doAction();
		System.out.println("child rides motorcycle with name: "+name);
	}

	public static void main(String[] args) {
//		Child child = new Child();
//		child.name="mangesh";
//		child.doAction();
//		child.childProp();
		
		Parent child = new Child();
		child.name="mangesh";
		child.doAction();
//		child.childProp();
//		child.nickN
//		Parent.caller();
		
		
	}
}
