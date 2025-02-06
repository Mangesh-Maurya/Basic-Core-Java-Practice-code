package com.java.batch.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		//Map
		//key-value
		ArrayList<String> mca = new ArrayList<>();
		ArrayList<String> btech = new ArrayList<>();
		ArrayList<String> bca = new ArrayList<>();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("mangesh", "bca"));
		list.add(new Student("mangesh", "mca"));
		list.add(new Student("rajnish", "btech"));
		list.add(new Student("neeru", "btech"));
		list.add(new Student("vicky", "bca"));
		
		System.out.println(list);
//		for(Student st:list) {
//			if(st.course.equals("bca")) {
//				bca.add(st.name);
//			}
//		}
		
//		Map
//		hashmap, linked hashmap, treemap
		//
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name", "mangesh");
		hashMap.put("city", "delhi");
		hashMap.put("designation", "sales manager");
		
		String string = hashMap.get("name");
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
//		System.out.println(string);
		
	}

	static class Student{
		String name;
		String course;
		
		public Student(String name, String course) {
			this.name = name;
			this.course = course;
		}

		@Override
		public String toString() {
			return "\n[name=" + name + ", course=" + course + "]";
		}
		
	}
}


