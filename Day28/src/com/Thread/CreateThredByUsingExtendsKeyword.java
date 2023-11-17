package com.Thread;

public class CreateThredByUsingExtendsKeyword extends Thread{

	public static void main(String[] args) {
		CreateThredByUsingExtendsKeyword t1 = new CreateThredByUsingExtendsKeyword();
		t1.start();
		
	}
	
	public void run() {
		System.out.println("Thread is starting.....");
	}

}
