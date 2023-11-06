
public class Nestedifelse {
  public static void main(String[] args) {
    float mark = 75.5f;
    if(mark >= 35 && mark <= 45) {
    System.out.println("D");
    }
    else if(mark >= 45 && mark <=65) {
    System.out.println("c");
    }
    else if(mark >= 65 && mark <= 75) {
    System.out.println("b");
    }
    else if(mark >= 75 && mark <= 95) {
    System.out.println("A");
    }
    else {
    System.out.println("Fail");
         }
   }
}