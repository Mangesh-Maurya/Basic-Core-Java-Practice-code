package com.java.batch.relations.coupling;


class Rectangle{
	public void create() {
		System.out.println("rectangle created.");
	}
}

class Triangle{
	
	
	public void create() {
		System.out.println("triangle created.");
	}
}

class Shape{
	//tight coupling
	private Triangle tri;
	
	public Shape(Triangle tri) {
		this.tri=tri;
	}
	
	public void create() {
		tri.create();
//		System.out.println();
	}
}



public class TightCoupling {

	public static void main(String[] args) {
		
		Shape shape = new Shape(new Triangle());
		shape.create();
		
	}

}
