package com.java.oops.encapsulation.methodhiding;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator.OfInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapeBuilder {
	
	
	public void draw(Shape shape) {
		Rectangle rect = (Rectangle)shape;
		
	}
	
	public static void main(String[] args) {
		ShapeBuilder sp = new ShapeBuilder();
		sp.draw(new Rectangle());
		sp.draw(new Circle());
		
		
		
//		Shape shape = new Shape();
//		shape.display();
//		
//		Rectangle rect = new Rectangle();
//		rect.display();
		
//		Circle circle = new Circle();
//		circle.display();
		
		int[] numbers = {-12, 34, 23, 54, 39, 23};
		OfInt s = Arrays.spliterator(numbers);
//		System.out.println();
		System.out.println(Arrays.toString(numbers));
		 List<Integer> resp = Arrays.stream(numbers).mapToObj(map -> String.valueOf(map))
		.map(map -> {
			boolean isNegative=false;
			if(map.startsWith("-")) {
				map=map.substring(1);
				isNegative=!isNegative;
			}
			if(map.length() == 1) {
				if(isNegative) {
					return Integer.parseInt("-"+ String.valueOf(map)); 
				}
				return Integer.parseInt(String.valueOf(map));
			}
			if(isNegative) {
				return Integer.sum(Integer.valueOf(String.valueOf("-"+map.charAt(0))), Integer.parseInt(String.valueOf(map.charAt(1))));
			}
			return Integer.sum(Integer.parseInt(String.valueOf(map.charAt(0))), Integer.parseInt(String.valueOf(map.charAt(1))));
		}).toList();
//		.forEach(System.out::println);
		System.out.println(resp);
		
//		List<int[]> list = Arrays.asList();
//		System.out.println(list);
//		List<int[]> list = Stream.of(numbers).collect(Collectors.toList());
//		List<Person> list=Stream.of(new Person("amit", 6,List.of(new Person.Child("amitc"))), 
//				new Person("emit",7, List.of(new Person.Child("zmitc"))),
//				new Person("dmit",10, List.of(new Person.Child("gmitc")))).collect(Collectors.toList());
//		
//		List<Person> sort = list.parallelStream().sorted((o1,o2) -> {
//			return Double.compare(o1.getNum(), o2.getNum());
//		}).toList();
//		
//		System.out.println(sort);
		
		
	}
}

class Person{
	
	String name;
	int num;
	List<Child> childList;
	
	public Person(String name, int num, List<Child> childList) {
		this.name = name;
		this.num = num;
		this.childList = childList;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Child> getChildList() {
		return childList;
	}


	public void setChildList(List<Child> childList) {
		this.childList = childList;
	}

	

	



	@Override
	public String toString() {
		return "Person [name=" + name + ", num=" + num + ", childList=" + childList + "]";
	}







	static class Child{
		String name;

		public Child(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Child [name=" + name + "]";
		}
		
		
	}
}
