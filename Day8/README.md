
                                       Day 8 12-10-22   

 *Today is 2hrs of guest lecture o stress management

Q. Write a program to print sequence of character from given string.
-> input :- E@d%ub!r)i{&d.g+e
   1.Logic :- 1. We have to print Eduridge from give sequece of character.
            2. Aaysis Output. Output is in character of sequece
            3. We used here ASCII values. To print character one by one in char array.
             String str = "E@d%u1b!r)i{&d.g+e";   //Input
             char ch[] = str.toCharArray();    //copied given input in char array. It is store i char array one by one.
             for(int i = 0; i <= ch.length-1; i++) {  // We have to from index 0 to length-1
             if(ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122) { // We used ASCII values and &&, || operator.
             System.out.print(ch[i]); // Eduridge.

   2.Logic :- 2. by using replaceAll method.
            String str = "E@d%ub!r)i{&d.g+e";
	    str = str.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(str);

   3.Logic :- 3. Using ASCII code
              String str = "E@d%u1b!r)i{&d.g+e";
              char ch[] = str.toCharArray();
              for(int i = 0; i <= ch.length-1; i++) {
              if(ch[i] > 'A' && ch[i] < 'Z' || ch[i] > 'a' && ch[i] < 'z') {
              System.out.print(ch[i]);
               }
               }
   Output :- Edubridge


# String Buffer class

- Java StringBuffer class is used to create mutable string.
- StringBuffer represents growable and writable character sequences.
- StringBuffer may have characters and substrings inserted in the middle or appended to the end.
- StringBuffer( ): It reserves space for sixteen characters without reallocation.
  Example : StringBuffer s=new StringBuffer();
- StringBuffer( int size): It accepts a whole number argument that explicitly sets the scale of the buffer.
- Example: StringBuffer s=new StringBuffer(30);
- StringBuffer(String str): It reserves area for sixteen characters while not reallocation and accepts a String 
  argument that sets the initial contents of StringBuffer object.
- Example: StringBuffer s=new StringBuffer(“IoT");
