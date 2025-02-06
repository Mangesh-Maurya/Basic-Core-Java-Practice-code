package com.java.multithreading;

public class RunnableExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName());
		
	}

	
	public static void main(String[] args) {
		RunnableExample runnableExample = new RunnableExample();
//		runnableExample.run();
		Thread thread = new Thread(runnableExample);
		thread.start();
		
		
	}
}
