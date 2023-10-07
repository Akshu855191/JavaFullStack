// 1. by using static variable
/*
public class Char{
    static char ch ='A';                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(ch);                  // Automatically inhoke class object no need to create an object.
 }
}
*/

//2. by using instance variable
/*
public class Char{
     char ch = 'C';                     //instance variable which is accessible outside class also.
  public static void main (String args[]){
     Char c = new Char();
    System.out.println(c.ch);                  //need to create an object. Without object program is not run.
 }
} 
*/

//3. by using local variable
/*
public class Char{
                                        //We can't declare local variable outside the main method.
  public static void main (String args[]){
     char ch = 'D';                     //local variable which is accessible within main method only.  
    System.out.println(ch);                 
 }
} 
*/

// Type coversion or type castig
//1. Byte to Char
/*
public class Char{
    static byte num = 97;                                    
  public static void main (String args[]){
    char ch = (char)num;                            //covertig char data type in byte
    System.out.println(ch);                 
 }
}
*/ 


//2. Short to Char
/*
public class Char{
    static short num = 24;                                    
  public static void main (String args[]){
     char ch = (char)num;                         //covertig short data type in byte.  
    System.out.println(ch);
}
}
/*



