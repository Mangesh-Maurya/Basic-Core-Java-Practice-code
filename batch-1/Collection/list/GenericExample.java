package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("abc");
		list.add("sdfsd");
		list.add("sdfs");
		new CustomIterator<String>().printData(list);
		System.out.println();
		System.out.println();
		List<Integer> listInt=new ArrayList<>();
		listInt.add(3);
		listInt.add(45);
		listInt.add(56);
		new CustomIterator<Integer>().printData(listInt);
		
		
		//Type parameters
		//T - Type
		//E - Element
		//K - Key
		//N - Number
		//V - Value
	}
	
	

}

class CustomIterator<E>{
	
	
	public void printData(List<E> s) {
		for(E e:s) {
			System.out.println("element: "+e);
		}
	}
	
	
}
