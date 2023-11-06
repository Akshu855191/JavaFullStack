
					Day15   19-10-23
Constructor
• Constructor is a special type of method with the same name as the class name.
• Constructor is used in various ways to declare the default variable and load or make available the 
prerequisites of a program so that our program can execute smoothly.
• It contains a collection of statements that are executed at the time of object creation.
• The constructor is not mandatory for a programmer to write it for a class, but for the ease of program and 
security purposes, we make constructors.
• Let us discuss more on the type of constructors
• There are three types of constructors in Java:
1. Default constructor
2. No argument constructor
3. Parameterized constructor.


1.Default Constructor
• A constructor with no parameter is treated as the default constructor.
• Every time we create an object of a class using the new keyword, we initialize the default constructor.
• After this, the system implicitly calls the constructor with no parameter written in the program
• If we don't write constructor then java compiler will create one by default, This constructor is known as 
default constructor.
• If you implement any constructor then you no longer receive a default constructor from Java compiler.
package Hello.World;
public class Hello_World{ 
Hello_World()
{
System.out.println("Creating a default constructor");
}
public static void main(String[] args) {
//calling a default constructor
Hello_World skillking = new Hello_World();
}
}


2. No Argument Constructor
• Constructor with no arguments is known as no argument constructor.
• Syntax of no argument constructor is the same as default constructor, but the body can have any code, unlike 
default constructor.
• Example:
package Hello.World;
public class Hello_World{ 
int i; 
Hello_World()
{
i=10;
System.out.println("Creating a No Argument constructor"); 
System.out.println("i = " + i);
}
public static void main(String[] args) {
Hello_World skillking = new Hello_World();
}
}


3. Parameterized Constructor
• The constructor with parameters is called a parameterized constructor.
• This is also known as constructor overloading.
• A constructor that is not identical but different in number of parameters, type of parameters, and sequence of 
parameters can be declared.
• We overload the constructor for different purposes and initialize the things based on the parameter or input 
received.
• Here, we will see in Example how to create a parameterized constructor.
class ParentClass{
int a = 10;
public int b = 20; 
protected int c = 30; 
private int d = 40;
void showData() {
System.out.println("Inside ParentClass"); 
System.out.println("a = " + a);
System.out.println("b = " + b); 
System.out.println("c = " + c); 
System.out.println("d = " + d);
}
}
class ChildClass extends ParentClass{
void accessData() {
System.out.println("Inside ChildClass"); 
System.out.println("a = " + a); 
System.out.println("b = " + b); 
System.out.println("c = " + c);
//System.out.println("d = " + d);// private member can't be accessed
}
}
public class AccessModifiersExample {
public static void main(String[] args) { 
ChildClass obj = new ChildClass();
obj.showData();
obj.accessData();
}
}


# Super keyword
• The super() keyword should always be the first statement of the constructor.
• The super keyword is used to call the constructor from a super class.
• This super() will call the default constructor from the super class.
public class SuperMethod extends SuperClass {
public SuperMethod() {
super(“Java”);
}
public static void main(String[] args) {
SuperMethod superMethod = new
SuperMethod();
} }
class SuperClass {
SuperClass(String name) {
System.out.println(“This constructor received name 
argument ” + name);
} }
Output
This constructor received name argument Java
• In this program, we have two classes - one is SuperMethod and another is SuperClass is the parent class of the
SuperMethod class.
• Both the classes have a constructor.
• SuperClass has a parameterized constructor, which is expecting an argument string to be called. On the other 
hand, SuperMethod has a default constructor.
• The above program will throw compile time exception since there is no default constructor in the parent class, 
but has a parameterized constructor, which we need to call explicitly.
• To fix this compilation error, call the parent class parameterized constructor with Super() keyword


# this keyword
• The this keyword represents the members (for example, variables or methods) from same class.
• this works in a similar manner as super keyword.
• In the constructor, we use the this() keyword to call or refer a constructor, which is defined within the same 
class. this should be the first statement of a constructor. If you write this() as second
statement or later, then the system will generate a compilation error.
• A class can have any number of constructors and with the help of the this() keyword, a constructor can 
communicate with other constructors within the class.
• this keyword works in a similar manner as super key
• this should be the first statement of a constructor.
Example
public class ConstructorThis{ 
ConstructorThis()
{ this(2); System.out.println("Default Constructor.");} 
ConstructorThis(int i)
{ this(2,3); System.out.println("Constructor with one argument."); } 
ConstructorThis(int i, int j)
{ this(2,3,4); System.out.println("Constructor with two arguments.");}
ConstructorThis(int i, int j, int k)
{ System.out.println("Constructor with three arguments.");}
public static void main(String[] args) {
ConstructorThis constructorThis = new ConstructorThis();} }
Output
Constructor with three arguments. 
Constructor with two arguments. 
Constructor with one argument. 
Default Constructor