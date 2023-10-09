/*Truth table
   X   Y  X|Y  X&Y
   T  F   T   F
   F  T   T   F
   T  T   T   T
   F  F   F   F
*/
//1. Bitwise OR operator (|) :- True + false is true if false + false than only false
/*                              // 1 + 0 is 1 if 0 + 0 than only 0.
public class Bitwise{
  public static void main (String args[]){
    int num1 = 5;         // Here num1 is 0101 
    int num2 = 7;         // Here num2 is 0111 
                                     //| ------
                                     //   0111
    System.out.println(num1 | num2); ////Is num1 | num2 i.e 5 | 7 no. So output is 7.
  }
}
*/

//2. Bitwise AND operator (&):- It retur only if two true + true is true otherwise it is false 0
/*                                // 1 + 1 is 1 if 1 + 0 than always false i.e 0.
public class Bitwise{
  public static void main (String args[]){
    int num1 = 5;         // Here num1 is 0101 
    int num2 = 7;         // Here num2 is 0111 
                                     //| ------
                                     //   0101
    System.out.println(num1 & num2); ////Is num1 & num2 i.e 5 & 7 no. So output is 5.
  }
}
*/

//3. Bitwise XOR operator (^):- If corresspondig bits are different, it gives 1, else 0.
/*
public class Bitwise{
  public static void main (String args[]){
    int num1 = 5;         // Here num1 is 0101 
    int num2 = 7;         // Here num2 is 0111 
                                     //| ------
                                     //   0010
    System.out.println(num1 ^ num2); ////Is num1 ^ num2 i.e 5 ^ 7 no. So output is 2.
  }
}
*/

//4. Bitwise Complement operator (~) :- It makes every 0 to 1 and 1 to 0.
public class Bitwise{
  public static void main (String args[]){
    int num1 = 5;         // Here num1 is 0101 1010
    System.out.println(~num1); // i.e ~5 no. So output is -6
  }
}

