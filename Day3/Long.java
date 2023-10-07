// 1. by using static variable
/*
public class Long{
    static long num = 7972684489l;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/



//2. by using instance variable
/*
public class Long{
    long num = 178500;                     //instance variable which is accessible outside class also
  public static void main (String args[]){
     Long l = new Long();
    System.out.println(l.num);                  //need to create an object. Without object program is not run.
 }
}
*/


//3. by using local variable
/*
public class Long{
                                                  //We can't declare local variable outside the main method
public static void main (String args[]){
     long num = 84875695245410l;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
} 
*/


// Type coversion or type castig

//1. Float to Long
/*
public class Long{
    static float num = 8747.232f;                                    
  public static void main (String args[]){
     long i = (long)num;                         //covertig float data type in Long.
    System.out.println(num);
}
}
*/


//2. Double to Long

public class Long{
    static double num = 5987.2546d;                                    
  public static void main (String args[]){
     long i = (long)num;                         //covertig double data type in Long  
    System.out.println(num);
}
}



