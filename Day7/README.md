
                               Day7 11-10-23
 String Method :-
- We can perform operations on string such as trimming, concatenating, converting, comparing
  replacing string etc. with the help of these methods.
- Like this way there are many important string method such as.

  getByte(), equals(), hashCode(), equalsignoreCase(), indexOf() and lastIndexOf(), substring(),
  subSequece(), matches(), replace(), replaceFirst(), replaceAll(), split(), lines(), indent(),
  transform(), format(), intern(), valueOf(), copyValueOf(), repeat(), describeConstable() and 
  resolveConstantDesc(), formatted(), stripindet(), and translateEscapes(), etc.

1. getBytes() :- 
- This method retuns the byte code of the String.
- Example :- String s = new String("Akshay");
             System.out.println(s.getBytes()); //Output :-[B@372f7a8d

2. equals() :-
- This method retuns the true if both String is equal. Else it return False
- This method is Case-Sesitive.
- Example :-  String s = new String("Akshay");
              String s1 = new String("Akshay");
              System.out.println(s.equals(s1)); // True.

3. equalsIgnoreCase() :-
-  This method retuns the true if both String is equal. Else it return False.
-  This method is not Case-Sesitive.
-  Example :- String s = new String("Akshay");
              String s1 = new String("aKSHAY");
              System.out.println(s.equalsIgnoreCase(s1)); // true it ignore the case

4. hashCode() :-
-  This method retuns the Hash code of given String.
- Example :- String s = new String("Akshay");
             System.out.println(s.hashCode()); // 1963240599

5. indexOf() :-
- This method retuns the 0 if both String is equal. Else return -1.
- It always comapir with first character.
- Example :- String s = new String("Akshay");
             String s1 = new String("Akshay");
             System.out.println(s.indexOf(s1));  //0

6. lastIndexOf() :- 
This method retuns the 0 if both String is equal. Else return -1.
- It always comapir with first character from last idex.
- Example :- String s = new String("Akshay");
             String s1 = new String("Akshay");
             System.out.println(s.lastIndexOf(s1)); //0

7. substring() :- 
- This method retuns the substring. if we return 2 in method it skip the first two string and print remaining string.
- Example :- String s = new String("Akshay");
             System.out.println(s.substring(2));  // shay.


8. subSequece() :-
- This method retuns the string in range startng rang is and end range.
- Example :-   String s = new String("Akshay");
               System.out.println(s.subSequence(2, 5));   // sha.

9. matches() :-
-  This method retuns the true if both String is equal. Else it return False.
-  This method is Case-Sesitive. 
-  Example :-   String s = new String("Akshay");
                String s1 = new String("Akshay");
                System.out.println(s.matches(s1));

10. replace() :-
- The replace method searches a string for a specified character, and return where the specified character are replaced.
- It replace old character or string with new one.
- Example :-  String s = new String("Akshay");
              String s1 = new String("Sachin");
              System.out.println(s.replace('s', 'a')); output :- Akahay
              System.out.println(s.replace(s , "Vijay")); output :- Vijay
              System.out.println(s.replace(s, s1)); Output :- Sachin

11.replaceFirst() :-
- This method replace the first sustring of this string that matches the given replacement.
- Example :- String s = new String("aaccddee");
             System.out.println(s.replaceFirst("aa", "zz"));   Output :- zzccddee

12. lines() :- 
- Java string method returns the stream of lies from the string.
- Example :-  String s = new String("Akshay");
            System.out.println(s.lines());  // java.util.stream.ReferencePipeline$Head@4f023edb

13. indent() :-
- This method is useful to add or remove white spaces from the starting of the lines to adjust indentation for each string line.
- Example :-  String s = new String("Akshay");
              System.out.println(s.indent(3));

14. format() :-
- It return the formatted string y give locale, format and arguments.
- If you don't specify the locale in String.format() method, it uses default locale.
- The format() method of java language is like sprintf() function in c language and printf() method of java language.
- Example :- String s = new String("Akshay");
             String s1 = String.format("name is %s", s);
             String s2 = String.format("value is %f", 32.33434);
             String s3 = String.format("value is %32.12f", 32.33434);
             System.out.println(s1);  // name is Akshay
             System.out.println(s2);  // value is 32.334340
             System.out.println(s3);  // value is                  32.334340000000

15. intern() :-
- It create a exact copy of a String oject in the heap memory and stores it in the String constant pool.
- Example :- String s = "Sachin";
             String s1 = new String("Akshay");
             System.out.println(s1.intern()); 

16. valueOf() :- 
- The valueOf() is convert differnt types of value into string. with the help of valueOf()., you can convert
  int to String, long to String, etc.
- It is an static method.
- Example :-   int i = 10;
               String s = String.valueOf(i);
               System.out.println(s + 10);

17. copyValueOf() :-
- The copyValueOf() method returns a String that represent the character of a char array.
- This method return new string array and copies the character into it.
- Example :-  char [] ch = {'H', 'e', 'l', 'l', 'o'};
              String s = "";
              s = s.copyValueOf(ch, 0, 5);
              System.out.println(s);  // Hello. 

18. stripIndent() :- 
- This method removes the whitespaces from the start and end of a string line.
- It does ot remove whitespace in the middle of the string.
- Example :- 

19. formatted() :-
- The formatted method is used to formate the string and replace it with argument
- Example:- System.out.println(("1. %s 2. %s 3. %s "). formatted("one", "two", "three"));

20. translateEscapes() :-
- translateEscapes() method returns a new string which traslate the escape character ito a string literal.
- Escape character are tab \t, new line \n
- Example :- 

21. replaceAll() :- 
- It return a String replacing all the sequence of character matching regex ad replacement string.
- Example :-  String s = new String("Hello World");
              System.out.println(s.replaceAll("l", "a"));  // Heaao Worad




















