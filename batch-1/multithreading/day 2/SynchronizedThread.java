package com.java.multithreading.syncronized;

public class SynchronizedThread implements Runnable{

	CheckSeatAvailability checkSeatAvailability;
	
	PrintTable printTable;
	int tableNo;
	String user;
	
	public SynchronizedThread(CheckSeatAvailability checkSeatAvailability) {
		this.checkSeatAvailability = checkSeatAvailability;
	}
	
	

	public SynchronizedThread(PrintTable printTable, int tableNo, String user) {
		this.printTable = printTable;
		this.tableNo=tableNo;
		this.user=user;
	}



//	@Override
//	public void run() {
////		System.out.println("Thread: "+Thread.currentThread().getName());
//		//eating
////		System.out.println(checkSeatAvailability.isSeatAvailable(Thread.currentThread().getName()));
//		//driving
//		//office
//		//sleep
////		System.out.println("seat booked for thread: "+Thread.currentThread().getName());
//		
//		
//		//sync block -----------------------------------------------------------------------------
////		System.out.println("seat booked for thread: "+Thread.currentThread().getName());
//		
//	}
	
	
	@Override
	public void run() {
//		System.out.println("Thread: "+Thread.currentThread().getName());
		
		printTable.printTable(tableNo, Thread.currentThread().getName(), user);
//		System.out.println("thread: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//sync method
		
//		CheckSeatAvailability c=new CheckSeatAvailability();
//		Thread t1 = new Thread(new SynchronizedThread(c));
//		Thread t2 = new Thread(new SynchronizedThread(c));
//		Thread t3 = new Thread(new SynchronizedThread(c));
//		Thread t4 = new Thread(new SynchronizedThread(c));
//		Thread t5 = new Thread(new SynchronizedThread(c));
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
		
		
		
		
		
		//sync block
		PrintTable c=new PrintTable();
		Thread t1 = new Thread(new SynchronizedThread(c, 5, "mangesh"));
		Thread t2 = new Thread(new SynchronizedThread(c, 6, "aditya"));
		Thread t3 = new Thread(new SynchronizedThread(c, 7, "amit"));
		Thread t4 = new Thread(new SynchronizedThread(c, 8, "manish"));
		Thread t5 = new Thread(new SynchronizedThread(c, 3, "abc"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}


}
