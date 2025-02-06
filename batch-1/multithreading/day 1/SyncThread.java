package com.java.multithreading;

public class SyncThread extends Thread {

	//use of join method
	//join method wait for the thread to complete its execution.
	
	
	int index;
	
	SyncThread(int index){
		this.index=index;
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName() + "index: "+index);
//		super.run();
		for (int i=0; i< 10; i++) {
			System.out.println("Thread: "+Thread.currentThread().getName() +" index: "+index+" sub index: "+i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			try {
				SyncThread t = new SyncThread(i);
				t.start();
				t.join();
//				t.start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	

}
