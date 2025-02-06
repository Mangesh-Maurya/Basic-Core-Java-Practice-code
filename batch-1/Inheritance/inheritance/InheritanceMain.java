package com.java.oops.inheritance;

import java.util.Collection;
import java.util.List;

public class InheritanceMain {
	
	//IS-A relationship
	//
	public static void main(String[] args) {
		AcRemote acRemote = new AcRemote();
		acRemote.on="on";
		acRemote.off="";
		
		acRemote.swithOff("AC");
		
		
		
		System.out.println(acRemote.remoteStatusOn());
		System.out.println(acRemote.remoteStatusOff());
	
		Remote tv = new TVRemote();
//		tv.
		acRemote.swithOff("TV");
		
	}
}
