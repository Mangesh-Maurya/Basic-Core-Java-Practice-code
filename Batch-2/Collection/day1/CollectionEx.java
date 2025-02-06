package com.java.batch.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
		//Collection -> parent/top most interface
		// Collection increases the size of container/array dynamically.
		//3 sub interface which extends Collection interface
		// All 3 Interface used to store group of similar or differect types of data as a single unit.
		// List interface ->  ArrayList, LinkedList (Stack, Vector) 
		// ArrayList
		// 1. It increases array size by 50% of total size (totalsize + (totalsize /2))
		// 2. in case searching elements arraylist is preferred
		// LinkedList
		// 1. It increases array size by 100% ((totalsize * 2))
		// 2. in case insertion/deletion of elements, linkedlist is preferred 
		// whenever we store elements into list
		// it allows duplicate eliments into it.
		// it maintains the insertion order of elements.
		
		//, Set interface -> 
		// Map interface -> it is a part collection framework but not a collection.
		
		//Classes which all inherits List Interface
		
		
		int[] a=new int[] {2,3,5,6,7,8};
		int[] b=new int[] {9,10,11};
		int[] c=new int[a.length+b.length];
		
//		a[2]=4;
//		a[0]=1;
		System.out.println(Arrays.toString(a));
		
//		List arrayList = new ArrayList<>();//Object type list
		List<Integer> list = new ArrayList<>();//Object type list
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		List<Integer> list1 = new ArrayList<>();//Object type list
		list.add(9);
		list.add(10);
		list.add(11);
		
		
		
		System.out.println(list);
		list.add(2, 4);
		System.out.println(list);
		list.addAll(list1);
//		list.remove(2);
		System.out.println(list);
		
		
		Iterator<Integer> iterator = list.iterator();
		//
		// 2
		// -> 3
		//null
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		
//		for(Integer lst:list) {
//			System.out.println(lst);
//		}
		
	}

}
