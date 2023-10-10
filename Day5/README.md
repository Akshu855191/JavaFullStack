				n  b =	
						Day5  7-10-23

# Arrays in Java :-

- An array is a collection of similar types of elements.
- A array is container that holds data of one single type. For example, you can create
  a array that can hold 100 values of int type.
- The first element of an array is store in 0th index, secound element of the array is
  stored at 1st index and so on.

* Array Syntax :- 

- In java, an array is an oject of a dyamically generated class.
- Once array is created, its length is fixed.
- Syntax:- data type [] array name;
- Example :- int[]num;
             num = new int[10];
- Here, num array can hold 10 values of data type int.

* Array Declaration :-
 
Example :- int[] num = new int[10];
- Operator "new" is used to initialize an array.
Declaratio array :-  int[] num ={10,20,30,40,50}
- The elemets are number as 0,1,2.....,n-1. These number are called as indices.
- These numbers are used to locate the position of elements within the array.
- The data type of an array must be specified by an int value and not long or short.

* Array Types :-

- There are two types of array in java
  1. Single Dimentional Array.
  2. Multi Dimentional Array.

1. Single Dimentional Array :-
- It is an array in which each element is accessed by using only index number. These index number
  represents the position of the element in the array.
- Syntax :- data type[] array name;
                   or
            data type array name[];
- Example:- int[] num = new int[10];

2. Multi Dimentional Array.
- A multi dimentional array is much more simillar to a single dimentioal array. It can have multiple
  rows and coloms unlike single dimentional array, which can have one full row or one full colomn.
- In java, a jagged array means to have a multi dimentional array with uneven size of rows in it.
- Syntax :- data type [][] array name;
                    or
            data type array name[][];
- Example:- int[][]num = new int[row 10][colomn 10]
- For both row and colomn i.e. [][] the index begins from 0. 
- Multidimentional array is also called as jagged array.

* Cloning of Arrays
   
Cloning creates copies that are clones of the original elements or reference elements.
- Cloning arrays are of two types shallow copy and deep copy in Java.
In a single-dimensional array, a deep copy creates the clones of the original elements or reference elements.
- In a multi-dimensional array, a shallow copy is created, which means both arrays are pointing to the same 
memory address.
- Cloning shallow copy and deep copy in Java are the ways of copying the attributes of one object into another of 
the same type.
- Deep copy means a variable would have a copy of the original array in a different memory location.
- Shallow copy means both arrays are pointing to the same memory address. Whenever you modify one of 
these arrays, you will be modifying both arrays.

* Array Deep Copy
  
- Deep copy means a variable would have a copy of the original array in a different memory location.
- Example : int array1[] = {1,2,3,4,5};
int array2[] = array1.clone();

*Array Shallow Copy

- Shallow copy means both arrays are pointing to the same memory address. If any one of these array is 
modified other array get auto reflected.
- Example : int array1[][] = {{1,2,3},{4,5}};
int array2[][] = array1.clone();

*Array Advantages :

- Code Optimization: It makes the code optimized.
- Random access: Data located at the index position.
* Disadvantages :
  
- Size Limit: We can store only the fixed size of elements in the array.

