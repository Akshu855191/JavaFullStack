package com.RunnableInterface;

public class RunnableDemo implements Runnable {
    public static void main(String[] args) {
		RunnableDemo RD = new RunnableDemo();
		Thread t1 = new Thread(RD);
		t1.start();
		
	}

	@Override
	public void run() {
		System.out.println("RunnableThread is starting....");
		
	}

}


