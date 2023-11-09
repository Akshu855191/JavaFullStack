package Exception;

public class Exceptionhanding2 {

	public void getData(int a, int b) {
		
	try {
		System.out.println("Hello");
		int result = a / b;
	    System.out.println(result);
	} 
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	public static void main(String[] args) {
		Exceptionhanding2 EX = new Exceptionhanding2();
		EX.getData(10, 0);
	}
	}
	

