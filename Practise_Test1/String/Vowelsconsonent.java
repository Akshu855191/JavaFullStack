import java.util.Scanner;
public class Vowelsconsonent {
    
  public static void main(String[] args) {

    
    int i, vol = 0, con = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.nextLine();
    str = str.toUpperCase();
    
   for(i = 0; i < str.length(); i++){
    char c = str.charAt(i);
    if(c != ' '){
        if(c == 'A' || c == 'E' || c =='I' ||c =='O' || c=='U')
           vol++;
        else
         con++;
}
}
System.out.println(" Vowels = "  + vol  + " Consonent = "  + con);
}
}
    