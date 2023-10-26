import java.util.Scanner;
public class Evenoddsum{
  public static void main(String[] args) {
      int sum = 0;
      System.out.println("Please enter the num"); 
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      if(num % 2 == 0){
      for(int i = 0; i <= num; i= i + 2){
      sum = sum + i;
      }
      System.out.println("Sum of even is : " + sum);
      }
      else{
      for(int i = 1; i <= num; i= i + 2){
       sum = sum + i;
      }
      System.out.println("Sum of odd is : " + sum);
      }
}
}