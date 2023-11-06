package com.day13;

public class Constructor {
	public Constructor() {                             //Default Constructor
		System.out.println("no args constructor ");
	}
	{                                                         // non static Block
		int a = 10;
		int b = 20;
		System.out.println("Non static block :" +(a+b));
	}
	void instananceMethod() {
	   System.out.println("Instance method");
	}
	static{
		int a = 50;
		int b = 50;
		int c = a+b;
		System.out.println("Static block is:" + c);
	}
	static public void staticMethod(){
		System.out.println("Static method call");
	}

	public Constructor(int a) {                        // Parameteries Constructor
		System.out.println("args constructor");
	}
	static {
		System.out.println("Hello pappa");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method called");
		
		//staticMethod();
		Constructor c = new Constructor();
		staticMethod();
		c.instananceMethod();
	}
}
		
		

	/*static {
		int a = 50;
		int b = 50;
		System.out.println(a+b);
	}
   public static void main(String args[]) {
	   
   }
}
*/