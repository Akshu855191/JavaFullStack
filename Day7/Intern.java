public class Intern{
  public static void main(String[] args) {
    String s = "Sachin";
    String s1 = new String("Akshay");
    System.out.println(s1.intern());  // true.
}
}