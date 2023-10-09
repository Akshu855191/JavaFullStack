// 1. (>>) Signed right shift operator :- It is workig in binary formate. Used shift the bits
/*			binary numers and values upto 15.
                 	   16  8  4  2  1
                               0  0  0  1
                               0  0  1  0
                               0  0  1  1
                               0  1  0  0
                               0  1  0  1
                               0  1  1  0
                               0  1  1  1
                               1  0  0  0
                               1  0  0  1
                               1  0  1  0
                               1  0  1  1
                               1  1  0  0
                               1  1  0  1
                               1  1  1  0
                               1  1  1  1
                               

public class Shift{
  public static void main (String args[]){
    int num1 = 10;          // binary value of 10 is 1010
    int num2 = num1>>1;    // Shifting value by 1. After shifting it shift to right 0101 i.e 5.        
    System.out.println(num2); //Output is 5
  }
}
*/


// 2.(<<) Signed left shift operator
/*
public class Shift{
  public static void main (String args[]){
    int num1 = 10;          // binary value of 10 is 1010
    int num2 = num1<<1;    // Shifting value by 1. After shifting it shift to left 10100 i.e 20.        
    System.out.println(num2); //Output is 20
  }
}
*/

//3.(>>>) Unsigned right shift operator 
/*
public class Shift{
  public static void main (String args[]){
    int num1 = 10;          // binary value of 10 is 1010
    int num2 = -10;    // For negative its, the signed and unsigned right shift provides different results.        
    System.out.println(num2 >>> 1); 
    System.out.println(num1 >>> 1); // Shifting value by 1. After shifting it shift to right 0101 i.e 5.
  }
}
*/

//4.(<<<) Unsigned right shift operator :-
//Unlike unsigned right shift, there is no "<<<" operator in java beacause the logical(<<) and arithematic
  left-shift (<<<) operations are identical.
