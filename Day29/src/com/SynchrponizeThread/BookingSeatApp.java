package com.SynchrponizeThread;

public class BookingSeatApp extends Thread {
	int total_seat = 10;
	
	public void run() {
	
		
	}
	
	public  void bookSeat(int seat) {
		
		if(total_seat >= seat) {
			System.out.println(seat + " Your seat is booked");
			int seat_left = total_seat - seat;
			System.out.println("Seat left : " + seat_left);
		}
		else {
				if(seat != 0) {
					System.out.println("Seats are full no more booking");
					int aval_seat = total_seat - seat;
					System.out.println("Available Seat is : " + aval_seat);
				}
				else {
					System.out.println("Not more booking");
				}
			}
	}
}
	


