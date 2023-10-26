import java.util.Scanner;
public class Armstrong{
  public static void main(String[] args) {
      int rem,sum = 0;
      System.out.println("Please eter the numer");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int temp = num; 
      while(num > 0)
      {
       rem = num % 10;
       num  = num / 10;
       sum = sum + (rem*rem*rem);
      }
     
      if(temp == sum)
      System.out.println("Its an armstrong number");
      else
      System.out.println("not an armstrong number");
      
 }
}
    