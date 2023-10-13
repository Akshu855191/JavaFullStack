public class Palindrome{
  public static void main(String[] args) {
     int n = 454;
     int temp, rem, sum = 0; 
     temp = n;
    while(n > 0){
    rem = n % 10;
    sum = (sum * 10)+rem;
    n = n/10;
   }
   if(temp == sum)
   System.out.println("Palindrome numer");
   else
   System.out.println("not Palindrome numer");
    
}
}