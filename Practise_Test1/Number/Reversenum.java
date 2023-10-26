import java.util.Scanner;
public class   {
  public static void main(String[] args) {
   int rem = 0;
   System.out.print("Please enter the range");
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   System.out.print("Reverse order is ");
   while(num > 0){
   rem = num % 10;
   System.out.print(rem);
   num = num / 10;
  
   }

}
}