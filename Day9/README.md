
                                           Day9   13-10-23


#Enum
- Enum is a one of the special data types to declare the list of constants that enable for a variable, which have
  similar meaning. For example, we create enum to manage the list of months, name of days, and other similar
  kind of values.
- We declare enum with the help of enum keyword and since this holds the constant value, the constraint is to
  write the value in capital letters.
- In a common real-life scenario, we can understand enum such as a short form of code word, which has a
  meaning.
- In programming, when we want to hide the actual data from the end users, we prefer to use enums.
- For example, in our program we want the user to enter a number so that 0 represents Sunday and 7
  represents Saturday. But when we are setting the enum for those numbers, we will set with the name of the
  day instead of sequence 0 or 1, that will be Sunday, Monday, and so on and we further use the same in our
  program for evaluation.
- This way, we also mislead the hackers to identify what value is being used in the program and they cannot
  easily hack the program written using enum.
- We may also use the enum contact with values for mathematical formulas or assign a unique value for that
  constant.
- We can also declare a class as type enum, which has a different meaning in Java programming and at the time
  of compiling, the compiler implicitly adds some additional features to that call.
- An enum class can have methods and fields
  Public class EnumImpl {
  public enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
  FRIDAY, SATURDAY, SUNDAY
}
  public static void main(String[] args) { 
  System.out.println(Day.MONDAY);
} }


#Control flow statements
- Control flows are the sections of a code that gets executed in sequence as they appear in the program, but 
  before execution.
- It checks for the condition and when the given condition becomes true, only then the section of code gets 
  executed.
- Now, we will study and practice the use of different control flows of Java programming such as if, if-then, if-
  then-else, and switch.
- Using these statements, we manage executing flow of the program and make the decision at runtime 
  regarding what flow is going to be executed next in the program.
- We will also learn about loops; loops are statements using the ones we can repeat a block of code several 
  times based on the condition or expression.
- Until the expression returns true, the loop will keep repeating the execution of that same block of code, which 
  is written in the body of loop.
- We will see the types of loops available in Java programming and how to implement those in the program.

#JAVA Control flow - if Statement
- An if statement is a powerful statement, which we use to decide in a program and execute a code block when 
  the given condition becomes true.
- This is also called if-then statement.
  For example: if(course==“JAVA”) { 
  system.out.println(“Course is JAVA.”);
}


#JAVA Control flow – if-then-else Statement
- If the condition which is given in the IF statement is not true, then the block of code that is written inside the if 
  block will not get executed, and to handle the false condition, we write an else statement block of code that 
  gets executed in place of the if statement.
  For example:
  if(course==“JAVA”) { 
  System.out.println(“Course is JAVA.”);
} else {
  System.out.println(“Color is not red.”);
 }

-For example:
  if(marks>= 60) {
  system.out.println(“You passed with first grade.”);
} else if(marks >=45 || marks < 60) {
system.out.println(“You passed with second grade.”);
} else if(marks >=33 || marks < 45) {
system.out.println(“You passed with third grade.”);
} else {
system.out.println(“Sorry, you are fail.”);
}

