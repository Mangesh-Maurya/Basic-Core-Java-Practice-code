package com.java.batch.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("neeru");
		list.add("mangesh");
		list.add("golu");
		list.add("narendra");
		list.add("narendra");
		list.add("golu");
		
		Collections.sort(list);
		
//		System.out.println(list);
		Set<String> llist = new HashSet<>();
		llist.add("neeru");
		llist.add("mangesh");
		llist.add("golu");
		llist.add("narendra");
		llist.add("narendra");
		llist.add("golu");

//		System.out.println(llist);
		
		Set<String> lhlist = new LinkedHashSet<>();
		lhlist.add("neeru");
		lhlist.add("mangesh");
		lhlist.add("golu");
		lhlist.add("narendra");
		lhlist.add("narendra");
		lhlist.add("golu");

//		System.out.println(lhlist);
		
		Set<String> tSet = new TreeSet<>();
		tSet.add("neeru");
		tSet.add("mangesh");
		tSet.add("golu");
		tSet.add("narendra");
		tSet.add("narendra");
		tSet.add("golu");

//		System.out.println(tSet);
		
		
		
		//Custom Sorting
		List<Student> list1 = new ArrayList<>();
//		Student s1 = new Student("mangesh", "5", "MCA");
//		Student s2 = new Student("mangesh", "5", "MCA");
//		s1.compareTo(s2);
		
		list1.add(new Student("mangesh", "5", "MCA"));
		list1.add(new Student("vicky", "1", "BCA"));
		list1.add(new Student("neeru", "8", "B.Tech"));
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
	}
	
	
}

//both comparable and comparator are interfaces
// Comparable
// it provide one way sorting.
// it affect the whole class
// it provides compareTo(Object obj) method
// it is present in java.lang

// Comparator
// provides multiple ways of sorting.
// it doesn't modify the whole class.
// it provides compare(Object 1, object 2) method
// it is present in java.util

class Student implements Comparable<Student>{
	String name;
	String rollNo;
	String course;
	
	public Student(String name, String rollNo, String course) {
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", rollNo=" + rollNo + ", course=" + course;
	}

	@Override
	public int compareTo(Student o) {
		return o.name.compareTo(this.name);
	}
	
	
	
	
}