public class Armstrong {

	public static void main(String[] args) {
		
	      int n = 153;
	      int temp = n;
	      int r,sum = 0;
	      while(n > 0)
	      {
	       r = n % 10;
	       n  = n / 10;
	       sum = sum + r*r*r;
	      }
	      if(temp == sum)
	      System.out.println("Its an armstrong number");
	      else
	      System.out.println("not an armstrong number");
	      
	 }
	}
		
		
		
		/*int n = 153; // Change this to the number you want to check
	    int temp = n;
	    int sum = 0;
	    int numDigits = (int) Math.log10(n) + 1;
	    sum = calculateArmstrongSum(n, temp, numDigits);
	    if (temp == sum) {
	        System.out.println("It's an Armstrong number");
	    } 
	    else {
	        System.out.println("Not an Armstrong number");
	        }
	    }
	    // Recursive function to calculate the Armstrong sum
	    static int calculateArmstrongSum(int n, int temp, int numDigits) {
	    if (n == 0) {
	        return 0;
	        } 
	    else {
	        int digit = n % 10;
	        return (int) (Math.pow(digit, numDigits) + calculateArmstrongSum(n / 10, temp, numDigits));
	        }
	        */
	    
	

	


