			
                                              Day7 10-10-23

  String module objective

- String in Java
- Create String in java
- String concatenation in java
- String method
- Java String Buffer class
- Enum.

# String in java
- Java String is basically an array of characters.
 e.g."Hello" is a string of 5 character.
- It is an immutable object.
- When we create a string in java, it actually create an object of type String.
- Java String class provides a lot of methods to perform operations on string such as
  compare(), concat(), equals(), split(), length(), replace(), compareTo(),intern(), substring etc.

# Create String in java
- There are two ways to create a String in java
  1. String literal
  2. Using new keyword.
  
1. String literal :-
- Java String literals create y using "" quotes.
- Example :- String s = "Akshay";
- String oject are stored in a special memory area kown as the "String constant pool".
- This is the more common way to creating the string.

2. Using new keyword:
- String object can be created using new operator like java class.
- Example :- String s = new String(“king”);
- It creates two objects in String pool and in heap
- Also one reference variable ‘s’ is created that will refer to the object in the heap.
Java String Pool: Java String pool refers to collection of Strings which are stored in heap memory. So whenever a new 
                  object is created. It will check whether the new object is already present in the pool or not. 
                  If it is present, then same reference is returned to the variable else new object will be created 
                  in the String pool and the respective reference will be returned.
 
# String concatenation in JAVA

- String concatenation means joining of two or more strings.
- We have two strings str1 = “Core” and str2 = “JAVA”
- If we add these two strings, we should have a result as str3= “CoreJAVA”.
- There are two methods to perform string concatenation.
- First is by using arithmetic “+” operator and second is using “concat” method of String class.
- Both method will results in the same output.
- How to perform string concatenation in java
- First example is by using arithmetic “+” operator and second is using “concat” method of String class.
- string concatenation by operator (+) method.
- Exaple1 :-  String str3 = “Core” + “JAVA”;
- String concatenation by concat() method :
- Example2:  String str3 = str1.concat(str2);

# String Methods

-List of the some important methods available in the Java String are as follows:
1. Length() :
- It returns the length of the string object.
- Example :-  String s = “Core JAVA";
               s.length()
               Output : 9

2. getChars() :
- It is used to populate a character array from the string object as source.
- syntax : getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
- Where :
- srcBegin − index of the first character in the string to copy
- srcEnd − index after the last character in the string to copy.
- dst − the destination array.
- dstBegin − the start offset in the destination array.
- Example :- The Java String class getChars() method copies the content of this string into a specified char array. 
            There are four arguments passed in the getChars() method.
- Example :- String s1 = "JAVA";
             char[] dest=new char[4]; 
             s1.getChars(0,4,dest,0) 
             System.out.println(Arrays.toString(dest));
             Output : [J, A, V, A]
3. toCharArray(): 
- This method returns a new character array created from the string characters.
- The java string toCharArray() method converts this string into character array. It returns a newly 
  created character array, its length is similar to this string and its contents are initialized with the 
  characters of this string.
- Example :- String str1 = new String("AKSHAY");
            char ch[] = str1.toCharArray();   //toCharArray() method is used to store string in char array..
            for(int i = ch.length-1; i >= 0; i--) {
            System.out.print(" "+ ch[i]);
             } // Output Y A H S K A

4. compareTo() :-
- compareTo() method is used to compare two compare strings lexicographically.
- Example :String str1 = new String("Akshay");
           String str2 = new String("Skshay");
           System.out.println(str1.compareTo(str2));  // Output is 0.
- It compare through ASCII character and gives the result accordig to ASCII value.

5.compareToIgnoreCase() :-
- The compareToIgnoreCase() method is similar to compareTo() method also
  performs the lexicographical comparison only it ignore case.
- Example :"Java".compareTo("Java") //Output : 0
           "Java".compareToIgnoreCase("JAVA")  //Output : 0

6. isEmpty() :-
- isEmpty() method returns true if the string is empty.
- Example :- String emptyStr = " ";
             emptyStr.isEmpty() // Output:false 
             

7. isBlank() :-
- isBlank() method returns true if the string is empty or contains only whitespace characters like spaces
  and tabs.
- Example :- String emptyStr = " ";
             emptyStr.isBlank() //Output: true


8.charAt(int index) :
- This method returns the character at the given index.
  Example :- String s = "Java"; 
             s.charAt(3) //Output: ‘a’

9.startsWith() :
- These methods are used to check if the string has given prefix or suffix strings or not.
  Example :- "Coking".startsWith("king") //Output : false 
             

10.endsWith():-
- These methods are used to check if the string has given prefix or suffix strings or not.
- Example:- Coking".endsWith("king") //Output : true

11.toLowerCase()
- These method are used to create lowercase strings.
- Example: "jAVa".toLowerCase(); //Output : "java"

12.toUpperCase()
- These method are used to create upercase strings.
- Example: "Java".toUpperCase(); //Output : "JAVA" 

13.contentEquals():-
- It compare two strings with content means sequence of string
- If it is same than return true or false. 
- It is case sensitive
- Output gives in true or false.
- Example :-   String str1 = new String("AKSHAY");
               String str2 = new String("akshay");
               System.out.println(str1.contentEquals(str2));  // Output is False.

14.replace() :-
- This method is used to replace the string.
- Example :- String str1 = new String("Saurabh");
             String str2 = new String("Santosh");
             System.out.println(str1.replace(str1,str2));  //output Santosh.

15.split() :-
- The string split() method reaks a given string around matches of the given regular expression.

16.repeat() :
- This method returns a new string whose value is the concatenation of this string given number of times.
- Example:- String s = "Java"
            s.repeat(2);  //Output: "JavaJava"


13.trim(), strip(), stripLeading(), and stripTrailing() :
- trim() : It trim all the leading and trailing whitespaces from a string.
- strip(): This method uses Character.isWhitespace()
- method to remove leading and trailing whitespaces from a string.
- The stripLeading() and stripTrailing() methods also remove leading and trailing whitespaces.
- Example: String s = " Java "
           s.trim();  //Output : "Java"


* Wrapper class and String are the final classess in java.

Interface of String :-
implements java.io.
1. Serializable, 
2. Comparable<String>, 
3. CharSequence,
4. Constable, 
5. ConstantDesc

