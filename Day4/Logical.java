//1. (&&) logical operator AND :- both condition is satisfied or are true. If one condition is false than result is false.
/*
public class Logical{
  public static void main (String args[]){
    int num1 = 10;          
    int num2 = 20; 
    int num3 = 20;
    int num4 = 0;
    if((num1 < num2) && (num2 == num2)){
    num4 = num1+num2+num3;
    System.out.println(num4); 
    }
    else{
    System.out.println("False Condition");
   }
  }
}
*/

//2. (||) logical operator OR :- any one condition is satisfied or are true. If both condition is false than result is false.
public class Logical{
  public static void main (String args[]){
    int num1 = 10;          
    int num2 = 20; 
    int num3 = 30;
    int num4 = 0;
    if((num1 > num2) || (num2 == num3)){
    num4 = num1+num2+num3;
    System.out.println(num4); 
    }
    else{
    System.out.println("False Condition");
   }
  }
}