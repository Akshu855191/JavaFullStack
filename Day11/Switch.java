public class Switch {
	static int choose = 3;
	public static void main(String[] args) {
		//int choose;
		switch (choose) {
		  case 1:
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
		      break;
		      
		  case 2:
			  int n1 = 10; // Change this to the number of Fibonacci numbers you want to print
			    if (n1 >= 1) {
			        System.out.print("Fibonacci Series: 0 ");
			     }
			    if (n1 >= 2) {
			        System.out.print("1 ");
			     }
			    int a = 0, b = 1, count = 2;
			    if (n1 >= 3) {
			    while (count < n1) {
			    int next = a + b;
			    System.out.print(next + " ");
			    a = b;
			    b = next;
			    count++;
			    }
			   }
			     System.out.println();
			     break;
			    
		case 3: 
			 int num = 454;
		     int temp1, rem, sum1 = 0; 
		     temp1 = num;
		    while(num > 0){
		    rem = num % 10;
		    sum1 = (sum1 * 10)+rem;
		    num = num/10;
		   }
		   if(temp1 == sum1)
		   System.out.println("Palindrome numer");
		   else
		   System.out.println("not Palindrome numer");
		   
		case 4:
		    break;
	}
}
}

		
		    
		   
		
		   
		

	   
	
	          
	       
		
	


