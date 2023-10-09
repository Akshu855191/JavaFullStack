					
		                          Day 3     5-3-23


 Byte

- In java, the smallest intger typeis a byte that reserve only 1-byte space memory.
- The range of byte variable is from-128 to 127 and is a signed 8 bit type.
- Its dafault value is 0
-  We can alsouse it with single character (ASCII up to 127). It is mostly used when you are sure that numbers would be in the limit      128 to 127
- Example : byte b = 119

------------------------------------------------------------------------------------------------------

Int

- The programmers can use 10 digit number with int type.
- It occupies 4 bytes of memory.
- The range of integer lies between 2,147,483,648 to 2,147,483,647.
- Its default value is 0.
- Example : int a = 2828

------------------------------------------------------------------------------------------------------

Long

- An integer can store 10digit values but if we want a value bigger than this range, we can use the long data type which can store upto 19 digit number.
- Thelong value needs to incluse the letter "l" or "L" in its suffix.
-  The long data type takes 8 byte of memory.
-  The range lies between 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
-  It's default value is 0.
-  Example:- long a = 7972684489l;


------------------------------------------------------------------------------------------------------

Float

- Decimal number is a number which contain decimal point(.), for example 66.7, 89.8 etc
- In java there are twofloating data type which can be used to store a decimal value.
   1. Float
   2. Double
- Decimalvalues are useful beacause they allow more accuracy and precision.

Float
- The float primitive data types are used to store decimal numbers.
- Sufficientfor holding 6 to 7 decimal digits.
- It occupies 4 byte of memory.
- Declared float value should end with a "f".
 
double
- Double is preferred over a float in regular programing beacause it is sufficient for holding 15 decimal digit size.
- The double data type is a default choice when it comes to decdimal, as it is double precision 64 bit.
- It occupies 8 byte of memory.
- Double require more space than float.
- It is good practise to end valu with a "d".
- Its value range is unlimited.
- Example : double d = -4251785.9d;


-----------------------------------------------------------------------------------------------------

 Character

- Char data type is used tostore a single character.
- The value must be surrounded by single quotes.
- We can also use ASCII value as character variable value.
- Char data type is single 165-bit Unicode character.
- The range of char is 0 to 65536.
- Example : char b = 'H'

------------------------------------------------------------------------------------------------------

Boolean

- It occupies 1 bit of memory
- Data type booleancan have only true or false values.
- It specifies one bit of information.
- Boolean data type is used in condition testing.
- Default value is false.
- Example: boolean b = true

--------------------------------------------------------------------------------------------------

Non- Primitive data types

- Non primitive data types are derived from primitive data types.
- Example String data type, it is a group of character data type.
- Non primitive data types are called reference types beacuse they refer toobjects.
- Non primitive types starts with an uppercase letter.
- Default value of this data type is null.
- Some widely used non primitive data types in java are String,Arrays, Classess, Interface, etc.

---------------------------------------------------------------------------------------------------

String

- It is used to store group of character known as string.
- The value must be surrounded by double quote.
-They are immutable, i.e they cannot be changeds once created.
- The java.lang.String class is used to create String object.
- For example String s = "Hello World"

----------------------------------------------------------------------------------------------------

Arrays

- An array in java is an object which is used to store multiple variable.
- It stores the similar elements.
- First elemens of the array is stored at index 0;
- Example: ina[]; / int[] a;
- There are 2 types of array supported in java
   1. Single Dimentional Array
   2. Multi Dimentional Array
e.g int arr[] = {1,2,3,4,5};
     int arr[][] = {{1,2,3,4},{5,6,7,8}};

   Dynamic array 
   int[] arr = newq int[size];

---------------------------------------------------------------------------------------------------

Interface

- The interface is a blueprint of the class.
- Allow different objects to interact easily.
- It specifies a set of methods that the calss has to implement.
- Interfaces are declare by specifying a keyword "interface".
- A class canimplement more that one interface.
- Usewd for updatiuon of website and method overridden.

---------------------------------------------------------------------------------------------------
