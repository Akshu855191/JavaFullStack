public class Reversestring {
  public static void main(String[] args) {
    String str1 = new String("AKSHAY");
    //for(int i = str1.length()-1; i >= 0; i--) {
    //System.out.print(str1.charAt(i));
    //}
           //OR

    char ch[] = str1.toCharArray();   //toCharArray() method is used to store string in char array..
    for(int i = ch.length-1; i >= 0; i--) {
    System.out.print(" "+ ch[i]);
    }
  }
}