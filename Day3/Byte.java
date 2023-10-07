

//1. by using static variable
/*
public class Byte{
    static byte num = 10;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/

//2. by using instance variable
/*
public class Byte{
     byte num = 10;                     //instance variable which is accessible outside class also.
  public static void main (String args[]){
     Byte c = new Byte();
    System.out.println(c.num);                  //need to create an object. Without object program is not run.
 }
} 
*/

//3. by using local variable
/*
public class Byte{
                                        //We can't declare local variable outside the main method.
  public static void main (String args[]){
     byte num = 10;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
} 
*/

// Type coversion or type castig
//1. Char to Byte
/*
public class Byte{
    static char c = 'D';                                    
  public static void main (String args[]){
    byte b = (byte)c;                            //covertig char data type in byte
    System.out.println(b);                 
 }
} 
*/


//2. Short to Byte
/*
public class Byte{
    static short num = 197;                                    
  public static void main (String args[]){
     byte c = (byte)num;                         //covertig short data type in byte.  
    System.out.println(num);
}
}
*/

//3. Int to Byte
/*
public class Byte{
    static int num = 19997;                                    
  public static void main (String args[]){
     byte c = (byte)num;                         //covertig int data type in byte.  
    System.out.println(num);
}
}
*/

//4. Long to Byte
/*
public class Byte{
    static long num = 19854997;                                    
  public static void main (String args[]){
     byte c = (byte)num;                         //covertig long data type in byte.  
    System.out.println(num);
}
}
*/

//5. Float to Byte
/*
public class Byte{
    static float num = 198.256f;                                    
  public static void main (String args[]){
     byte c = (byte)num;                         //covertig float data type in byte.  
    System.out.println(num);
}
}
*/

//6. Double to Byte
/*
public class Byte{
    static double num = 18512498.256784565d;                                    
  public static void main (String args[]){
     byte c = (byte)num;                         //covertig double data type in byte.  
    System.out.println(num);
}
}
*/









