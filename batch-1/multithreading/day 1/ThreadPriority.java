package com.java.multithreading;

import java.util.Random;

public class ThreadPriority extends Thread{

	
	int index;
	
	ThreadPriority(int index){
		this.index=index;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread: "+Thread.currentThread().getName() +" index: "+index);
		for (int i=0; i< 20; i++) {
			System.out.println("Thread: "+Thread.currentThread().getName() +" index: "+index+" sub index: "+i);
		}
	}

	public static void main(String[] args) {
		ThreadPriority[] ta=new ThreadPriority[50];
				
		for(int i=0; i<50; i++) {
			ThreadPriority thread = new ThreadPriority(i);
//			if(i > 2  && i < 8) {
				//0-10
				//3 4 5 6 7
				//7 6 5 4 3
			int nextInt = new Random(1).nextInt(10);
//			System.out.println(nextInt);
				thread.setPriority(nextInt);
//			}
			ta[i]=thread;
		}
		
		for(int i=0; i<ta.length; i++) {
			ta[i].start();
		}
//		thread.start();
		
	}

}
