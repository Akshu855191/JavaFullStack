package Abstractclass;

public abstract class Abstractclass {
	
	public abstract void Demo();    // Abstract method
	
	public int getData(int a) {    // Concurrit method.
		int b = 20;
		a = 20;
		System.out.println(a+b);
		return a+b;
	}

}
