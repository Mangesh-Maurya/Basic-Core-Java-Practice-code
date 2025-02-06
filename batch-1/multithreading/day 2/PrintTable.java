package com.java.multithreading.syncronized;

public class PrintTable {
	
	
	public void printTable(Integer n, String threadName, String userName) {
		System.out.println("Thread: "+threadName+" n: "+n);
		
//		for(String  index="0", c=userName.substring(Integer.valueOf(index)); Integer.valueOf(index) < userName.length(); index=(Integer.valueOf(index)+1)+"") {
//			System.out.println(c);
//		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (String.class) {
			System.out.println(threadName);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int i=1; i<=n; i++) {
				System.out.println(n*i);
			}
		}
		
		System.out.println("thread: "+threadName+" execution completed.");
		
	}
	
	
//	public void m1() {
//		String s="";
//		s.split("");
//	}
	
}
