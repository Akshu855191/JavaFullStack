					
						16-10-22

#Topics
- Switch Case vs if statement
- Looping 
   1. do- while loop
   2. while loop


# Switch Case Vs If Statement
• Where we can use nested if or switch case both for evaluation, then we must think on actual 
requirements and later, decide the right method.
• If we are using nested if, then the program will execute all if conditions to find the exact evaluation, but this
is not the case of a switch.
• Switch directly jumps to the matching case and does not evaluate or check the other cases from the case.
• So, this way, we make our system faster and navigate to the right block of code instead of checking
every condition.


# Loops in Java
• loops are used to execute a set of instructions/ functions repeatedly.
• When the condition is true loops are executed.
• There are three types of loops available in Java for performing a task such as
1. do while
2. While
3. for loops


1. While loop in Java
• While loop first checks the body of the loop then it will be executed.
• Syntax :
while (condition)
{
loop statements...
}
• The while statement is used to iterate/repeat a block of code until the given condition remains true.
• The while statement returns Boolean value true or false after execution of expression.
• When it returns true, the cursor will go inside the body of the while block and executes the statements.
• When it returns it will not execute the code from the while block
Example  :-
           public class WhileLoop {
           public static void main(String[] args) {
           int a = 2;
           while(a<=4) {
           System.out.println(“Current value of a is “+a);
           a++;
            } } }

Output:
Current value of a is 2
Current value of a is 3
Current value of a is 4
• While loop is continuously executed if the condition becomes true, until the condition becomes false to end 
the loop
• It can be considered as a repeating if statement.
• When it returns true, the cursor will go inside the body of the while block and executes the statements.
• When it returns it will not execute the code from the while block
Prog :- 
           package Hello.World;
           public class Hello_World {
           public static void main(String[] args) {
           int i = 1;
           while (i <= 10) {
           System.out.println("Skillking IoT Student " + i);
           i++;
           }
           }
           }


2.do while loop in Java
• do while is like the while loop and is used for the same looping purpose.
• The only difference between while and do while is that in do while, we check the condition later and in while, 
we check the condition at the first point.
• The cursor moves inside the do while block and executes the statements written under the do block and later 
it checks the condition. Hence, the do while block will always execute do part at least once, whether a 
condition become true or false.
• And then, it executes the while to check the condition; if the condition returns true, then program will repeat 
and execute the do statement again and again until it remains true; otherwise, the program will exit
• The do while loop executes a part of the programs at least once and execution depends upon the given 
condition.
• Syntax :
             do
          {
            loop statement.......
          }
          while (condition);

example :-
          public class DoWhileLoop {
          public static void main(String[] args) {
           int a = 2;
          do {
          System.out.println(“Current executing index :”+a);
             a++;
          } while(a<=1);
          } }

Output:
         Current executing index :2

• The above program will get executed and execute the do statement and block of code written under the do 
statement.
• Then at the end, it will check the condition.
• Since the initial value of variable a was 2, and in the do block, we have initialize the value of a with 1, no 
• Hence, the condition will become and this program will no further execute the do statement
         package Hello.World;
         public class Hello_World {
         public static void main(String[] args) {
         int i=1;
        do{
         System.out.println("Skillking IoT Student" + i);
         i++;
         }while(i<=10);
         }
         }