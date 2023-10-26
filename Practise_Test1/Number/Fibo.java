import java.util.Scanner;
public class Fibo  {
  public static void main(String[] args) {
   int a = 0, c = 1, count ;
   System.out.println("Please enter the range");
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   for(int i = 0; i <= num; i++){
   System.out.print(a + " ");
   count = a + c;
   a = c;
   c = count;
}
}
}