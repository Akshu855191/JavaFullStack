public class Primenumber {
	 static int number = 16;
         static int divisor = 2 ;
     static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            System.out.println("Prime numbers are greater than 1.");
            return false;
        }
        if (n == 2) {
            return true; // 2 is prime
        }
        if (divisor * divisor > n) {
            return true; // No smaller divisors found
        }
       if (n % divisor == 0) {
            return false; // Divisible by divisor, not prime
        }
       return isPrime(n, divisor + 1);
    }
   public static void main(String[] args) {
    //int number = 17; // Change this to the number you want to check
    if (isPrime(number, 2)) {
    System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
        }
		

	}

}
