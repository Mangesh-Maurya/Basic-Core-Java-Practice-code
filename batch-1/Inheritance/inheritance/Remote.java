package com.java.oops.inheritance;

public class Remote {

	
	String on;
	String off;
	
	public void swithOn(String remoteType) {
		System.out.println("switch on the "+remoteType);
	}
	
	public void swithOff(String remoteType) {
		System.out.println("switch off the "+remoteType);
	}
	
	public String remoteStatusOn() {
		return on;
	}
	
	public String remoteStatusOff() {
		return off;
	}
	
	
}
