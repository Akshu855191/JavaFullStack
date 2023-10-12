public class Valueof{
  public static void main(String[] args) {
    // Int to String
    int i = 10;
    String s = String.valueOf(i);
    System.out.println(s + 10);  // true.

    // boolean to string
    boolean a = true;
    boolean c = false;
    String s1 = String.valueOf(a);
    String s2 = String.valueOf(c);
    System.out.println(s1);
    System.out.println(s2);
 }
}