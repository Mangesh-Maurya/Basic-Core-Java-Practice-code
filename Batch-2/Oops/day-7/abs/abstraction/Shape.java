package com.java.batch.oops.abstraction;

class Circle extends Shape{
	int radius;
	
	@Override
	public void draw() {
		System.out.println("drawing circle with radius: "+radius);
	}
}


class Triangle extends Shape{
	int sides;
	
	@Override
	public void draw() {
		System.out.println("drawing circle with sides: "+sides);
	}
}


class ShapeBuilder{
	private Shape shape;
	
	ShapeBuilder(Shape shape){
		this.shape=shape;
	}
	
	public Shape getShape() {
		return shape;
	}
	
}



class User{
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius=5;
		
		ShapeBuilder shapeBuilder = new ShapeBuilder(circle);
		Shape shape = shapeBuilder.getShape();
		shape.draw();
		
		
		Triangle triangle = new Triangle();
		triangle.sides=3;
		shapeBuilder = new ShapeBuilder(triangle);
		Shape shape2 = shapeBuilder.getShape();
		shape2.draw();
		
	}
}
//we cannot create a object of an abstract class using new keyword.
public abstract class Shape {
	String name;
	//0 to 100%
	//if we just declare a method then we call it an abstract method.
	abstract public void draw();
	
}



