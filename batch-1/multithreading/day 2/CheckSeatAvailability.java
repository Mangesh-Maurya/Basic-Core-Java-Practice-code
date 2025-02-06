package com.java.multithreading.syncronized;

public class CheckSeatAvailability {
	
	private final static int totalSeats=10;
	private static int seatOccupied=5;
	
	public synchronized boolean isSeatAvailable(String threadName) {
		System.out.println(threadName);
		System.out.println("available seats: "+(totalSeats - seatOccupied));
		if(totalSeats - seatOccupied > 0) {
//			seatOccupied++;
			bookSeat();
			return true;
		}else {
			return false;
		}
	}
	
	
	public void bookSeat() {
		seatOccupied++;
	}
	
}
