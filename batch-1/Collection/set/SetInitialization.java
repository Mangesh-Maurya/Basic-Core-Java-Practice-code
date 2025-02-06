package com.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInitialization {

	public static void main(String[] args) {
		//Collection -> Set ---- Interface
		// HashSet, LinkedHashSet, TreeSet
		
		// 1. it's an unordered collection interface. it doen't maintains insertion order.
		// 2. it removes duplicate elements
		// 3. 
		
		//
		List<String> list=new ArrayList<>();	
		list.add("bunty");
		list.add("bunty");
		list.add("mangesh");
		list.add("aditya");
		list.add("aditya");
		list.add("rajnish");
		System.out.println("list: "+list);
		
		//it removes duplicates but doesn't maintain insertion order.
		Set<String> set = new HashSet<>();
		set.add("bunty");
		set.add("bunty");
		set.add("mangesh");
		set.add("aditya");
		set.add("aditya");
		set.add("rajnish");
		set.add("navneet");
		
		System.out.println("hashset: "+set);
		
		//linkedhashset
		//it removes duplicates but maintains insertion order.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("bunty");
		linkedHashSet.add("bunty");
		linkedHashSet.add("mangesh");
		linkedHashSet.add("aditya");
		linkedHashSet.add("aditya");
		linkedHashSet.add("rajnish");
		linkedHashSet.add("navneet");
		
		System.out.println("linkedhashset: "+linkedHashSet);
		
		//it sorts the elements in ascending order.
		//it also removes duplicates
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("bunty");
		treeSet.add("bunty");
		treeSet.add("mangesh");
		treeSet.add("aditya");
		treeSet.add("aditya");
		treeSet.add("rajnish");
		treeSet.add("rajnish");
		treeSet.add("navneet");
		NavigableSet<String> tree = treeSet.descendingSet();
		System.out.println("desc treeset: "+tree);
		System.out.println("treeset: "+treeSet);
		
		
		list=new ArrayList<>();	
		list.add("bunty");
		list.add("bunty");
		list.add("mangesh");
		list.add("aditya");
		list.add("aditya");
		list.add("rajnish");
		list.add("rajnish");
		list.add("navneet");
		System.out.println("list: "+list);
		
		//find the duplicates
//		findDuplicates(list);
//		List<String> recordFromDb = getRecordFromDb();
		
//		findDuplicatesWithoutSet(list);
		setBulkOps();
	}
	
	
	public static void findDuplicates(List<String> list) {
		HashSet<String> dup = new HashSet<>();
		HashSet<String> unique = new HashSet<>();
		for(String s:list) {
			if(!dup.add(s)) {
				unique.add(s);
			}
		} 
		System.out.println("duplicate elements: "+unique);
	}
	
	
	public static void findDuplicatesWithoutSet(List<String> list) {
		HashSet<String> unique = new HashSet<>(list);
		System.out.println("unique elem: "+unique);
		
//		System.out.println("duplicate elements: "+unique);
	}
	
	
	public static List<String> getRecordFromDb() {
		List<String> list = new ArrayList<>();	
		list.add("bunty");
		list.add("bunty");
		list.add("mangesh");
		list.add("aditya");
		list.add("aditya");
		list.add("rajnish");
		list.add("rajnish");
		list.add("navneet");
		
		return list;
	}
	
	
	public static  void setBulkOps() {
		Set<String> set = new HashSet<>();
		set.add("bunty");
		set.add("bunty");
		set.add("mangesh");
		set.add("aditya");
		set.add("aditya");
		set.add("rajnish");
		set.add("navneet");
//		set.add("abc");
		
		Set<String> set1 = new HashSet<>();
//		set1.add("bunty");
//		set1.add("bunty");
//		set1.add("mangesh");
//		set1.add("aditya");
//		set1.add("aditya");
//		set1.add("rajnish");
		set1.add("abc");
		set1.add("navneet");
//		set1.add("rajnish");
//		set1.add("mangesh");
		
		
		System.out.println("isSubset: "+set.containsAll(set1));
//		System.out.println("union: "+set.addAll(set1));
		System.out.println("union set: "+set);
//		System.out.println("intersection operation: "+set.retainAll(set1));
//		System.out.println("common: "+set);
		System.out.println("remove: "+set.removeAll(set1));
		System.out.println("removed data: "+set);
		
//		System.out.println("hashset: "+set1);
		
		
		
		 
		
	}

}
