package com.Thread;

public class TrainSeatBook extends Thread {
	int total_seat = 10;
	
	public void run() {
	
		
	}
	
	public void bookSeat(int seat) {
		
		if(total_seat >= seat) {
			System.out.println(seat + " Your seat is booked");
			total_seat = total_seat - seat;
			System.out.println("Seats left = " + seat);
		    System.out.println();
			
		}
		else  {
			System.out.println("Seats are not available");
			System.out.println("Only Seats = " + total_seat);
		}
		
	}

}
