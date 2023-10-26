import java.util.Scanner;

public class Countvowels {
    
  public static void main(String[] args) {
      String str = new String();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter String");
      str = sc.nextLine();
      str = str.toUpperCase();
      int count = 0;
      for(int i = 0; i < str.length(); i++){
     char ch = str.charAt(i);
     if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
     count++;
     }
     }
     System.out.println(count);
   }
}