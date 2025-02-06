package com.java.batch.string;

import java.util.Arrays;

public class StringTest {
	
	public static void main(String[] args) {
//		Note: String alway stored value in character form hence 
//		it keeps values in character array object char[].
		// String s="abc";
		// char [] ch={'a','b','c'};		
		
		// compare to method
		// java keeps positive(+) values always at top of the vertical group of elements
		//  "     "   negative(-)  "       "     " bottom .......   
			
		
		String s="mangesh maurya man";// constant pool
		String ss="anil"; 
		String sn=new String("neeru");//heap //constant pool
		
		int length = ss.length();
		char charAt = ss.charAt(0);
		char[] charArray = ss.toCharArray();
//		String substring = ss.substring(0,5);
		
		String name=s + " " + "";
		System.out.println("by concat: "+s.concat(ss));
//		s.concat(s);
		System.out.println("contains: "+s.contains("i"));
		// "        abc     ";
		s.trim();
		
		
//		s.endsWith("maurya");
//		System.out.println("index: "+s.indexOf(s.indexOf(charAt)));
		
		System.out.println("compare: "+(s.compareTo(ss))); //to compare between two strings whether one is greater or not than other.
		System.out.println("length: "+length);
		System.out.println("charAt "+charAt);
		System.out.println("charArray "+Arrays.toString(charArray));
//		System.out.println("substring "+substring);
		
		
		String address="houseno., street, ghaziabad, uttarpradesh, 201206";
		String[] addrArr = address.split(", ");
		
		String city = addrArr[2];
		
		
		
		String pin = address.substring(address.lastIndexOf(", a ")+4);
		
		System.out.println("pin: "+pin);
		//starting index will always be included.
		//end index will "     "      " excluded.
		
		
		
//		System.out.println(s == sn.intern());
//		System.out.println(s.equals(sn));
//		
//		System.out.println(s == ss);
//		System.out.println(s.equals(ss));
		
		
		
		
		
	}
}
