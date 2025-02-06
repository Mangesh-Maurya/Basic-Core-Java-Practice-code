package com.java.batch.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	
	public static void main(String[] args) {
		
		//searching operation
		// arraylist and linkedlist
		// 
		
		
		//use of insertion and deletion operation
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		list.add(0, 1);
		
		System.out.println(list);
		
		List<Integer> subList = list.subList(2, 5);
		System.out.println(subList);
		
	}

}
