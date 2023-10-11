public class Contentequals {
  public static void main(String[] args) {
   String str1 = new String("AKSHAY");
   String str2 = new String("akshay");
   System.out.println(str1.contentEquals(str2));  // Output is False.
  }
}