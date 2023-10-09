//(++)Incrementing a value by one[Postincrement] :- Increment after 
/*
public class Unary{
  public static void main (String args[]){
    int num = 10;             // Here num=10
    int a = num++;            // Here a=10 till now value of a is 10. value is updated after finishing...
    System.out.println(a);    // If we print a variable value is 10. at that stage value is not increment.
    System.out.println(num);  // It increment after printig the num variable.  
                                        
 }
}
*/


//(++)Incrementing a value by one[Prestincrement] :- Increment first
/*
public class Unary{
  public static void main (String args[]){
    int num = 10;             // Here num=10
    int a = ++num;            // Here value if a increment first by 1.
    System.out.println(a);    // If we print a variable value is increasing by 1 i.e (11).
    System.out.println(num);  // It increment first.
                                        
 }
}
*/


//(--)Decrement a value by one[Postdecrement] :- Decrement after 
/*
public class Unary{
  public static void main (String args[]){
    int num = 10;             // Here num=10
    int a = num--;            // Here a=10 till now value of a is 10. 
    System.out.println(a);    // If we print a variable value is 10. at that stage value is not decrement.
    System.out.println(num);  // It decrement after printig the num variable.  
                                        
 }
}
*/


//(--)Incrementing a value by one[Prestincrement] :- Decrement first
/*
public class Unary{
  public static void main (String args[]){
    int num = 10;             // Here num=10
    int a = --num;            // Here value if a decrement first by 1. i.e 9
    System.out.println(a);    // If we print a variable value is decreasing by 1 i.e (9).
    System.out.println(num);  // It decrement first. i.e num is (9).
                                        
 }
}
*/


//(!) Negative an expression :- Only work for boolean data type. If value is true after negatition it will False.
/*
public class Unary{
  public static void main (String args[]){
    boolean a = true;       // Value is true
    System.out.println(!a); // After negatition it is false.
 }
} 
*/

//(~) Inverting the value of a boolean :- Invertion means converting value into positive to negative 
                                          //and negative to positive with decrement value by 1.
/*  
public class Unary{
  public static void main (String args[]){
    int num = 10;             // Here num=10
    System.out.println(~num);  // Here value is inverting in (-) means decresing by 1. i.e -11
    int n = -10;             // Here n=-10
    System.out.println(~n);  // Here value is inverting in (+) means decresing by 1. i.e 9
    //Final output is -11 and 9.
 }
}
*/
                                        

              