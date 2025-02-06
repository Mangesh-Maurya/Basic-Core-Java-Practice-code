package com.java.batch.relations.coupling;


class Rectangle1 extends Shape1{
	@Override
	public void createShape() {
		System.out.println("rectangle created.");
	}
}

class Triangle1 extends Shape1{
	@Override
	public void createShape() {
		System.out.println("triangle created");
	}
}

class Shape1{
	public void createShape() {
		System.out.println("default shape created.");
	}
}


class ShapeCreator {
	Shape1 shape;
	
	public ShapeCreator(Shape1 shape){
		this.shape=shape;
	}
	
	public void draw() {
		this.shape.createShape();
	}
	
}

public class LooseCouple {

	public static void main(String[] args) {
		Rectangle1 rectangle = new Rectangle1();
		Triangle1 triangle1 = new Triangle1();
		ShapeCreator shapeCreator = new ShapeCreator(triangle1);
		ShapeCreator rect = new ShapeCreator(rectangle);
		
		shapeCreator.draw();
		rect.draw();

	}

}
