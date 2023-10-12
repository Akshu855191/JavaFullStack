public class Copyvalueof{
  public static void main(String[] args) {
    char [] ch = {'H', 'e', 'l', 'l', 'o'};
    String s = "";
    s = s.copyValueOf(ch, 0, 5);
    System.out.println(s);  // Hello.
}
}