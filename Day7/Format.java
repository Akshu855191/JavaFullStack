public class Format{
  public static void main(String[] args) {
    String s = new String("Akshay");
    String s1 = String.format("name is %s", s);
    String s2 = String.format("value is %f", 32.33434);
    String s3 = String.format("value is %32.12f", 32.33434);
    System.out.println(s1);  // name is Akshay
    System.out.println(s2);  // value is 32.334340
    System.out.println(s3);  // value is                  32.334340000000
}
}