package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List -> Arraylist, linkedlist, vector, stack
//		str.length;
//		str.
//		str[99];
		//O(1)
		//
		
		//initial capacity 10
		//maintains insertion order
		//dynamic array
		List<String> list = new ArrayList<>();
		
		list.add("mangesh");
		list.add("amit");
		list.add("vicky");
		list.add("amit");
		list.add("amit");
		list.add("rachit");
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList<>();
		list1.add("mangesh");
		list1.add("amit");
		
		list.removeAll(list1);
		System.out.println(list);
		
//		list.
		
		
		
//		System.out.println("using tradition approach");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("before remove: "+list);
//		list.remove ("amit");
		
//		
		System.out.println();
		System.out.println("using iterator");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String value=iterator.next();
			System.out.println(value);
		}
		
		
//		System.out.println("\n using enhance for loop");
//		//for each loop or enhance loop
//		for(String vall:list) {
//			System.out.println(vall);
//		}
//		
//		
//		String[] str= new String[10];
//		str[0]="mangesh";
//		str[1]="amit";
//		
//		for(int i=0; i<str.length; i++) {
//			String val=str[i];
//		}
//		
//		for(String s:str) {
//			System.out.println(s);
//		}
		
//		list.add(123);
		
//		userList
		

//		System.console()
		
		
	}

}