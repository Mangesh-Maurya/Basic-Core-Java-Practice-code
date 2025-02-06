package com.java.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEX {

	public static void main(String[] args) {
		
		
		//Arraylist -> size + size/2;
		//arraylist is preferable while doing  search operation.
		//it maintains insertion order.
		//arraylist uses dynamic array to store the element
		
		//linkedlist -> size * 2;
		//linkedlist is preferable while doing insertion and deletion in between.
		//it also maintains insertion order.
		//linked list uses doubly linked list to store the elements
		
		
		List<String> list = new LinkedList<>();
		list.add("e");
		list.add("b");
		list.add("r");
		list.add("j");
		list.add("w");
		list.add("b");
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(4, "bunty");
		System.out.println(list);
		
//		list.
		System.out.println(list.isEmpty());

	}

}
