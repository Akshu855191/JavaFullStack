public class Program1 {
  public static void main(String[] args) {
    // 1.Logic by using ASCII value 
/*
    String str = "E@d%u1b!r)i{&d.g+e";
    char ch[] = str.toCharArray();
    for(int i = 0; i <= ch.length-1; i++) {
    if(ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122) {
    System.out.print(ch[i]);
    }
    }
*/

    2. Using replaceAll() method.
/*    
    String str = "E@d%ub!r)i{&d.g+e";
    str = str.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(str);
*/

     3. Using ASCII code
    String str = "E@d%u1b!r)i{&d.g+e";
    char ch[] = str.toCharArray();
    for(int i = 0; i <= ch.length-1; i++) {
    if(ch[i] > 'A' && ch[i] < 'Z' || ch[i] > 'a' && ch[i] < 'z') {
    System.out.print(ch[i]);
  }
}
}
}