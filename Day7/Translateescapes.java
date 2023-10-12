public class Translateescapes{
  public static void main(String[] args) {
    String s = new String("This is tab \t, next line \n, next backspace \b, next Single Quotes \', Double Quotes \" ");
    //String s1 = new String("Akshay");
    System.out.println(s.translateEscapes());  // This is tab     , next line, next backspace, next Single Quotes ', Double Quotes "
}
}