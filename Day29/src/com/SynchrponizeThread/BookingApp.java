package com.SynchrponizeThread;
import java.util.Thread;
import com.Thread.TrainSeatBook;

public class BookingApp {
	public static void main(String[] args) {
		BookingSeatApp customer1 = new BookingSeatApp();
		customer1.bookSeat(4);
		
		BookingSeatApp customer2 = new BookingSeatApp();
		customer2.bookSeat(3);
		
		BookingSeatApp customer3 = new BookingSeatApp();
		customer3.bookSeat(2);;
		
		customer1.start();
		customer2.start();
		customer3.start();
		
		try {
			customer1.join();
			customer2.join();
			customer3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
