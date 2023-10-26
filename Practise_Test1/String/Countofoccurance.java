import java.util.Scanner;

public class 
 {
    
  public static void main(String[] args) {
      String str = new String();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter String");
      str = sc.nextLine();
     
      int totalcount = str.length();
      int totalcountafterremove = str.replace("a", "").length();
      int count = totalcount - totalcountafterremove;
      System.out.println("number of count occurance of a is:" + count);
      }
}