package com.java.multithreading;

import java.util.Random;

public class MultiThreadDemo extends Thread{

	int index;
	
	
	
	public MultiThreadDemo(int index) {
		this.index = index;
	}

	@Override
	public void run() {
		try {
			
//			int milli=new Random().nextInt(index+5000);
//			System.out.println("thread: "+Thread.currentThread().getName()+" sleep time: "+milli);
			Thread.sleep(0);
			for(int i=0; i<10; i++) {
				System.out.println("Thread: "+Thread.currentThread().getName()+ " index: "+index + " innerindex: "+i);
			}
			
			System.out.println("=========================");

			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//1. extend Thread class
		//2. implements Runnable
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("main: "+Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.println("index: "+i);
			MultiThreadDemo multiThreadDemo = new MultiThreadDemo(i);
//			multiThreadDemo.run();
			multiThreadDemo.start();
		}

	}
	//Thread priorities (3 - 6)
	//
	//
	
	
	// new MultiThreadDemo() -> new -> start -> Runnable run() -> running -> thread execution will be ended or 
	// we can put our thread into sleep or waiting state. -> dead/terminated.
	// 10 -> 2sec -> 20sec
	// 10 -> 2sec -> 2sec
	

}
