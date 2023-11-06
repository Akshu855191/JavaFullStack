
					Day 10   14-10-23

 # Nested if-else

- Nested if-else is used to perform multiple if-then-else-if conditions in a program.
- We need this when we must handle or check multiple conditions in a program on the same or different 
patterns.
- Using the if statement, we can test and compare a single value and range of values
- For example:
  if(marks>= 60) {
  system.out.println(“You passed with first grade.”);
  } else if(marks >=45 || marks < 60) {
  system.out.println(“You passed with second grade.”);
  } else if(marks >=33 || marks < 45) {
  system.out.println(“You passed with third grade.”);
  } else {
  system.out.println(“Sorry, you are fail.”);
  }


JAVA Switch Statement
- Switch case is another way of making decisions and executing a block of code written under that case.
- This is like nested if-else.
- We use the switch keyword to create a switch statement in the code and pass a variable as an argument
- In the body of switch statement we declare cases with possible values to check and a default case to
handle the flow if there is no case matched with the given expression.
- The body of switch statement is called switch block
Example:
switch(expression){
case
value1:
//code to be
executed break;
case
value2:
//code to be
executed
b
r
e
a
k;
....
.. 
de
fa
ult
:
//execute if all cases are not
matched
}
- The general syntax of how switch case is implemented is as follows:
- We can have any number of case statements.
- Values must be of same type of expression.
- Break statement is optional.
- Case labels always end with a colon ( : ).
- Default statement is used when none of the cases condition is true.
- No break statement is needed in the default case.
- Duplicate case values are not allowed.

package Hello.World;
public class Hello_World {
public static void main(String[]
args) {
int a=3;
//Switch
expression switch(a){
//Case statements
case 1: System.out.println("I am @ Home");
break;
case 2: System.out.println("I am @ Office");
break;
case 3: System.out.println("I am @ school");
break;
//Default case statement
default:System.out.println("Not @ Home, Office, or school");
}
}
}


 