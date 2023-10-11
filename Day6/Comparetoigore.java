public class Comparetoigore {
  public static void main(String[] args) {
   String str1 = new String("AKSHAY");
   String str2 = new String("akshay");
   System.out.println(str1.compareToIgnoreCase(str2));  // Output is 0.
  }
}