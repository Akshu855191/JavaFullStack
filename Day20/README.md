						31-10-23
Exception Handling
• An Exception is an unwanted event that interrupts the normal flow of the program.
• Errors are generated while writing a programming code.
• So these errors are displayed at compile time.
• Some of these errors do not show up at compile time but interrupts the normal flow of execution at run time.
• These errors are known as Exceptions in programming.
• An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
• This is something that every programmer faces at any point of coding. They can occur from different kind of
scenarios like entering the wrong data by user, hardware failure, network failure, class not found, out of
memory, etc.
• Exception Handling is a mechanism to handle runtime errors.
• The main advantage of exception handling is to maintain the normal flow of the application.
• All exception and errors types are sub classes of class Throwable.
• Suppose if an exception is not handled, it may lead to a system failure. That is why handling an exception is
very important.
• Java provides specific keywords for exception handling like throw, throws, try, catch, finally.
What is Java Exception ?
Let’s discuss with an example. Mr. Foo is going for a interview; suddenly, he saw a big wall


   Exceptionsin JAVA						 Errors in JAVA
1. Occurs at compile time or run
time
								1. Occurs at runtime
2. Possible to recover when
exception occurs
								2. Impossible to recpover when
error occurs
3. Type of exception may be either
checked and unchecked
							        3. Error are of type unchecked
4. An exception is caused because of
the code.
								4. An error is caused due to lack of
system resources.
5. Example : Out of memeory, etc. 				5. Example : Class not found


Types of Java Exceptions :
• There are mainly two types of exceptions: checked and unchecked.
• According to oracle an error is also considered as the type of exception, but error is also considered as the
unchecked exception, there are three types of exceptions:
1. Checked Exception
2. Unchecked Exception
3. Error

A]Checked Exception
• A checked exception is an exception that is checked by the compiler at the time of compilation, these are also
called as compile time exceptions.
• Checked exception are directly sub class of java.lang.Exception class.
• These exceptions occur at compile time and without handling them, the program cannot be executed.
• Example: IOException, ClassNotFoundException, etc.

B]Unchecked Exception
• An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime
Exceptions.
• Unchecked exceptions are extended from the java.lang.RuntimeException class.
• Java Virtual Machine (JVM) handles such exceptions.
• Example : ArithmeticException, ArrayIndexOutOfBoundsException, etc.

C]Error
• Errors in Java are normally overlooked.
• They are irrecoverable.
• They occur due to some scarcity of system resources.
• Error is also one type of unchecked exception.
• They are usually created in response to catastrophic failure
• Example: Hardware error, NoSuchMethodError, OutOfMemoryError, etc

Java Exception Keywords
• Below 5 keywords are used to handle exceptions in Java.
1. try
2. catch
3. finally
4. throw
5. throws

Java Exception Keyword: try
• try:
The “try” keyword is a block where we put exception code. The “try” block cannot be used alone. A try block
must be followed by catch blocks or finally block or both.
Syntax :
try{
//statements which cause an exception
}

Java Exception Keyword: catch
• Catch :
It must be used along with “try” block. It is used to handle the exception. Multiple catch blocks are possible in Java to
handle multiple types of exceptions. The catch block catches the exception thrown by the try block.
Syntax :
try {
// statements which cause an exception
}
catch (exception(type) e(object))
{
//code for handling error
}

Example :-
package Hello.World;
public class Hello_World{
public static void main(String[] args) {
try
{
}
int[] numbers = {1, 2, 3};
System.out.println(numbers[50]);
catch (Exception e)
{
System.out.println("Some Error in code.");
}
}
}

