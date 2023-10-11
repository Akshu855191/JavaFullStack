import java.lang.String;
public class Split{
  public static void main(String[] args) {
   //String str1 = new String("A:C:D:E");
   //System.out.println(str1.split("::"));

/*
    String str = "Hello I am java developer";
    String str1[] = str.split("\\s");  // Here it split string in (Hello I am java developer).
    for(int i = 0; i <= str1.length/2; i++) {  //5 / 2 = 1
    String s1 = str1[i];  // 
    str1[i] = str1[str1.length - i - 1];
    str1[str1.length-i-1] = s1;
    }
    for(int j=0; j <= str1.length; j++) {
    System.out.println(str1[j]);
    }
*/
     String str = "Akshay Dilip Shelke";
     String[] words = str.split("\\s");
     for(String w:words){
     System.out.println(w);
}

  }
}
