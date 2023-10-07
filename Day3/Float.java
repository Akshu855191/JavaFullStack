// 1. by using static variable
/*
public class Float{
    static float num = 797.854f;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/



//2. by using instance variable
/*
public class Float{
    float num = 17.8500f;                     //instance variable which is accessible outside class also
  public static void main (String args[]){
     Float f = new Float();
    System.out.println(f.num);                  //need to create an object. Without object program is not run.
 }
}
*/


//3. by using local variable
/*
public class Float{
                                                  //We can't declare local variable outside the main method
public static void main (String args[]){
     float num = 84875.258764f;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
}
*/ 

// Type coversion or type casting
//1. Double to Float
/*
public class Float{
    static double num = 598754987.2586972548697546d;                                    
  public static void main (String args[]){
     float i = (float)num;                         //covertig double data type in Long  
    System.out.println(num);
}
}
*/

