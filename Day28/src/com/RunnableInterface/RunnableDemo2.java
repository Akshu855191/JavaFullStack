package com.RunnableInterface;

public class RunnableDemo2 implements Runnable {

	public static void main(String[] args) {
		RunnableDemo2 Rd = new RunnableDemo2();
		Thread t1 = new Thread(Rd);
		t1.start();
		
	}
 
	Thread t1 = new Thread();
	@Override
	public void run() {
		for(int i = 65; i < 150; i++) {
			
				
			try {
				t1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
		
			System.out.println(i);
		
		}
		
	}

}


