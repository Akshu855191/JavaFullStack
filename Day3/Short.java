// 1. by using static variable
/*
public class Short{
    static short num = 10000;                     //Static variable which is accessible outside class also.
  public static void main (String args[]){
    System.out.println(num);                  // Automatically inhoke class object no need to create an object.
 }
}
*/

//2. by using instance variable
/*
public class Short{
    short num = 17500;                     //instance variable which is accessible outside class also
  public static void main (String args[]){
     Short s = new Short();
    System.out.println(s.num);                  //need to create an object. Without object program is not run.
 }
}
*/

//3. by using local variable
/*
public class Short{
                                          //We can't declare local variable outside the main method
public static void main (String args[]){
     short num = 10;                     //local variable which is accessible within main method only.  
    System.out.println(num);                 
 }
} 
*/

// Type coversion or type castig
//1. Char to Short
/*
public class Short{
    static short num = 9927;                                    
  public static void main (String args[]){
    char ch = (char)num;                            //covertig char data type in short.
    System.out.println(ch);                 
 }
} 
*/

//2. Int to Short
/*
public class Short{
    static int num = 785462;                                    
  public static void main (String args[]){
     short s = (short)num;                         //covertig int data type in short  
    System.out.println(num);
}
}
*/


//3. Long to Short
/*
public class Short{
    static long num = 12345678;                                    
  public static void main (String args[]){
     short s = (short)num;                         //covertig long data type in short 
    System.out.println(num);
}
}
*/


//4. Float to Short
/*
public class Short{
    static float num = 547.232f;                                    
  public static void main (String args[]){
     short s = (short)num;                         //covertig float data type in short.  
    System.out.println(num);
}
}
*/

//5. Double to Short

public class Short{
    static double num = 8754.3659d;                                    
  public static void main (String args[]){
     short c = (short)num;                         //covertig double data type in short.  
    System.out.println(num);
}
}


