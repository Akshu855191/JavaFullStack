// 1. by using static variable
/*
public class Double{
    static double num = 797.854d;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/



//2. by using instance variable
/*
public class Double{
    double num = 85417.8500d;                     //instance variable which is accessible outside class also
  public static void main (String args[]){
     Double d = new Double();
    System.out.println(d.num);                  //need to create an object. Without object program is not run.
 }
}
*/



//3. by using local variable

public class Double{
                                                  //We can't declare local variable outside the main method
public static void main (String args[]){
     double num = 84875.258764f;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
}
 