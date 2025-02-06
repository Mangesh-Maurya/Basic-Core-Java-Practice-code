package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCustomSort {

	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setName("rachit");
		user.setAddress("ghaziabad");
		
		
		
		User user1=new User();
		user1.setId(3);
		user1.setName("mangesh");
		user1.setAddress("delhi");

//		user.compareTo(user1);
		
		User user2=new User();
		user2.setId(2);
		user2.setName("abhishek");
		user2.setAddress("jaipur");
		
		List<User> userList=new ArrayList<>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		
		System.out.println(userList);
		Collections.sort(userList);
		System.out.println(userList);
		
		//comparable
		//single sorting way
		//modify the current class
		//compareTo() method
		//java.lang
		
		//comparator
		//provides multiple sorting
		//doesn't modify/affect current class.
		//compare()
		//java.util
		
		
		
		
		
	}

}
