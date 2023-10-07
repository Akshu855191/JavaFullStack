// 1. by using static variable
/*
public class Int{
    static int num = 75486;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/


//2. by using instance variable
/*
public class Int{
    int num = 17500;                     //instance variable which is accessible outside class also
  public static void main (String args[]){
     Int i = new Int();
    System.out.println(i.num);                  //need to create an object. Without object program is not run.
 }
}
*/


//3. by using local variable
/*
public class Int{
                                          //We can't declare local variable outside the main method
public static void main (String args[]){
     int num = 85410;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
} 
*/


// Type coversion or type castig

//1. Long to Int
/*
public class Int{
    static long num = 7972684489l;                                    
  public static void main (String args[]){
     int i = (int)num;                         //covertig long data type in short 
    System.out.println(num);
}
}
*/



//2. Float to Int
/*
public class Int{
    static float num = 87547.232f;                                    
  public static void main (String args[]){
     int i = (int)num;                         //covertig float data type in short.  
    System.out.println(num);
}
}
*/


//3. Double to Int
/*
public class Int{
    static double num = 5987.2546d;                                    
  public static void main (String args[]){
     int i = (int)num;                         //covertig double data type in short.  
    System.out.println(num);
}
}
*/




