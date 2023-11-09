package com.day16;

public class Construcrtoroverloading {
	 public Construcrtoroverloading() {   // Non Parametries constructor.
	    	System.out.println("Non Paranmetries constructor");
	    	
	    }
	    public Construcrtoroverloading(int a) {  // Parameteries constructor.
	    	this("Akshay" , 10);
	    	System.out.println("Single Number Constructor");
	    	
	    }
	    public Construcrtoroverloading(int a, int b) {    // Number of arguments must be different.
	    	System.out.println("2 numbers of argument");
	    }
	    public Construcrtoroverloading(String a, int c) {   // Type of arguments must be different.
	    	System.out.println("2 type of argument");

	    	
	    }
	    public Construcrtoroverloading(short s, byte b1) {   // Sequence of argument must be different.
	    	System.out.println("2 sequence of argument");

	    	
	    }
	    
	    public static void main(String args[]) {
	    	Construcrtoroverloading cl = new Construcrtoroverloading(10);

	   }

}
