								Day14     18-10-23

H.W
# Package :-
- Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.
- Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in  the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package   only.
- package in Java is used to group related classes. 
- Packages can be considered as data encapsulation (or data-hiding).
- We use packages to avoid name conflicts, and to write a better maintainable code. 
- Package is a kind of bundle or container or library, where we put one or more Java classes, 
  interfaces, and other related entities/information.
- It means bundling the multiple related program files at one place. Package is the first statement of any
  Java program.
- Packages can be categorized into two categories, the built in package and user defined package.
1. Built-in packages: The already predefined package by the java compiler is known as built-in packages.
- Some of the commonly used built-in packages in java are as follows:
- java.lang: It contains language support classes.
- java.util: It contains utility classes such as vectors, lists, hash tables, etc.
- java.awt: It contains classes for the graphic user interface.
- java.applet: It contains a set of classes for applets.
- java.net: It contains a set of network classes.
- java.io: It contains classes for input and output operation.
2. User defined packages : These are the packages that are defined by the user. Now we will see how the 
packages are created and used in java.
- How to create the packages in java is shown in the figure given below :
- Select a suitable name for the package to be created.
- Name of the package must be same as the directory under which this file is saved.
- Declare the name of the package with the “package” keyword.
- Define a public class inside that package.


# Import :-

- Import is a java keyword
- It is declare in java class
- Used * character to declare all the classess starting to the package.
- Import is used to import a package, class or interface.
- Java Programs start with the statement having import keyword.
- Syntax :- import java package.JavaClass;
            import package.*;
            import java.util.Scanner;
            import java.util.*;

Access modifier :-
- Java access modifiers are used to provide access control in java.
- Access modifiers are used with Classes as well as Class variables and methods.
- It is allowed to use only public or default access modifiers with java classes.
- Java provides three types of access control through Keywords
1. Private
2. Protected
3. Public
- Access modifier is a keyword that we use to set the visibility or scope or define the boundary of
variable, method, and class.
- This is also known as specifier.
- Default is the default access modifier when we do not write any modifier with class declaration.
- Default modifier makes a class accessible within the same package

1. java Access Modifiers: Private
- If a class member is “private” then it will be accessible only inside the same class. This is the most restricted
access and the class member will not be visible to the outer world.
- Example:
         public class ExampleTest {
	 public void MethodEx() {
	 private String firstName = “India”;
	 }
	 public static void main(String[] args)
	 {
	 ExampleTest exampleTest = new ExampleTest();
	 exampleTest.firstName = “Bharat”; // we cannot access this private variable in main method.
	 } 
	 }
- Variable, method, and class declared private will be accessible only with the block {}.
- For example, if a private variable declares within a method, then that can only be accessible within the 
method body
- In the above program will generate compilation error since we are trying to access a private member of the 
method firstName inside the main method

2. Java Access Modifiers: Public
- If a class member is “public” then it can be accessed from anywhere. Also member variable or method is 
accessed globally.
- Example:
Save by foo.java
package jack;
public class foo{
public void msg(){System.out.println(“India");}
}
package mack;
import jack.*;
class moo{
public static void
main(String
args[]){
foo obj = new foo();
obj.msg();
}
}
- Public modifier makes everything public. The variable, method, and class declared with public modifier can be 
accessible to any class and method.
- There is no restriction and boundary defined for public
The foo class of jack package is public, so can be accessed from outside the package.
- Also msg method of this package is declared as public, so it can be accessed from outside.


3. Java Access Modifiers: Protected
- If class member is “protected” then it will be accessible only to the classes in the same package and to 
the subclasses.
- Example:
Class ParentClass
package foo.example.moo;
public class ParentClass {
protected String cityName = “Mumbai”;
protected String districtName = “CSMT”;
}
Class ChildClass
package foo.example.moo;
public class ChildClass extends ParentClass {
public static void main(String[] args) {
ChildClass childClass = new ChildClass(); 
System.out.println(childClass.cityName); 
System.out.println(childClass.districtName);
} }
- Access modifier Protected is in between private and public.
- It allows access to all classes within the same package and classes that are subclasses of other classes.
- Here, derived or subclass means protected will allow to inherit the properties from base class or parent class.
- In the above example, ParentClass has two protected variables cityName and districtName
However, by using inheritance, when we inherit a class using the extends keyword, that inherited class 
exposes all its variables and methods to the derived class.
- This creates a relationship between two classes, as in the real-world we have a relation with our father, and 
we do have rights to access the assets belonging to our father.
Lab Activity:
Trainer will ask the participants to refer to the participant’s guide and complete the given exercise.
Exercise 15:
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

- The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
- We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
- There are four types of access specifier in java
  1. default
  2. private
  3. protected
  4. public.
- Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
  Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. 
           If you do not specify any access level, it will be the default.
  Protected: The access level of a protected modifier is within the package and outside the package through child class. 
             If you do not make the child class, it cannot be accessed from outside the package.
  Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
