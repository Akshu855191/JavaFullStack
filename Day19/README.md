					30-10-23

Q. Difference between Abstract class and interface

Abstract class :-
• A class that is declared using “abstract” keyword is known as abstract class.
• An Abstract class is a class that contains abstract as well as concrete methods.
• We cannot create the object of an abstract class.
• An abstract class can have static methods and constructors.
• A class derived from the abstract class must implement all those methods that are declared as abstract
in the parent class.
• An abstract class can have an abstract and non abstract method.
• A class can not be declared with both final and abstract keywords, because final keyword is used to
prevent overriding whereas abstract methods need to be overridden.
• An abstract method does not have implementation and body.
It defines only the signature of the method.
• Abstract classes must be declared with an abstract keyword.
• We can not create an object of abstract classes. It can only be used as a reference.
• To use an abstract class, we need to create another class which extends this class.
• An abstract method is a method that has only the method definition.
• An abstract method does not have implementation and body. It defines only the signature of the method
- 


Interface
• Interface looks like a class but it is not a class.
• An interface can have methods and variables just like the class but the methods declared in interface are by
default abstract means only method syntax is defined not body.
• Interfaces are declared by specifying a keyword “interface”.
• All the interface methods are by default abstract and public.
• Variable names conflicts can be resolved by interface name.
• Defining an interface is similar to defining a class, but a class describes the attributes and behaviors of an
object, and an interface contains behaviors that a class implements.
• An interface is not extended by a class it is implemented by a class.
• An interface can extend multiple interfaces.
• A class uses the implements keyword to implement an interface.
• An interface can extend another interface in the same way that a class can extend another class.
The extends keyword is used to extend an interface.
• Java Interfaces are used to achieve abstraction.

Polymorphism
• It is the process of representing one form in multiple forms known as Polymorphism, in simple words it is the
OOPs feature that allows to perform a single action but in different ways.
• Polymorphism is derived from two greek words poly and morphs.
• The word “poly” means many and “morphs” means forms.
• So polymorphism means many forms.
• Let’s understand the concept of Polymorphism in Java with a real time example
• Life cycle is the developmental stages that occur during an organism’s life time.
• The major stages of the human life cycle include pregnancy, infancy, the toddler years, childhood, teenager,
adulthood, middle age, and the senior years i.e. old age, Here one person present in different different
behaviors.
• so it means having many forms, therefore polymorphism can be defined as a mechanism for getting different
characteristics of the same instance.
• Polymorphism is not a programming concept but it is one of the principal of objects oriented programming
language.
• For many objects oriented programming language polymorphism principle is common but implementations
are varying from one objects oriented programming language to another object oriented programming
language.
• There are mainly two types of polymorphism in Java as shown below:
- compile-time polymorphism
- Runtime polymorphism

• Compile time polymorphism is also known as static polymorphism or early binding.
• Static polymorphism in java is achieved by method or function or operator overloading.
• When there are multiple functions with same name but different arguments then these functions are said to
be overloaded.
• In order to overload a method, the argument lists of the methods must differ in either of the following:
• Method Overloading allows to have more than one method having the same name, if the arguments of
methods are different in number, sequence and data types of parameters.
• In the following example, we have three definitions of the same method max().
• So the max method would be determined by its arguments at the compile time that’s why it is known
as Compile Time Polymorphism.


Method overriding & overridden
• Declaring a method in sub class which is already present in parent class is known as method overriding.
• Overriding is done so that a child class can give its own implementation to a method which is already provided
by the parent class.
• In this case the method in parent class is called overridden method and the method in child class is called
overriding method.
• A method declared in child class but it is already present in the parent class is known as method overriding.
• The method declared in the parent class is called overridden method and the method in the child class is
called the overriding method.
• Method overriding is used for runtime polymorphism.
• A method declared static cannot be overridden but can be redeclared.

Method Overloading
• It allows the class to have more than one method having the same name, if their argument lists are different.
• It is not possible by changing the return type of methods.
• In order to overload a method, the argument lists of the methods must differ in either of the following:
1. Number of argument :
It is allowed within the class given that the number of arguments are not the same.
Example : max(int, int) // 2 argument
max (int, int, int) // 3 argument
2. Data type of argument:
It is allowed within the class given that at least one pair of arguments are of different data type.
Example : max (int, int) // same data type
max(int, float) // different data type
Data type of argument : We have two methods with the name max(), one with argument of int type
and another method with the argument of int & float type.


