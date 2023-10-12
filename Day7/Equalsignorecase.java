public class Equalsignorecase{
  public static void main(String[] args) {
    String s = new String("Akshay");
    String s1 = new String("aKSHAY");
    System.out.println(s.equalsIgnoreCase(s1)); // True.
}
}