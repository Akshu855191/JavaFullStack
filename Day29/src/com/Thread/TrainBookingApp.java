package com.Thread;

public class TrainBookingApp {
   

	public static void main(String[] args) {
		TrainSeatBook customer = new TrainSeatBook();
		customer.bookSeat(4);
		customer.bookSeat(2);
		customer.bookSeat(3);
		customer.start();
		
	}

}
