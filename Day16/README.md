
						Day16 20-10-22


OOPS
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
package Hello.World;
public class Hello_World {
void sum(int a,long b)
{ 
System.out.println(a+b);
}
void sum(int a,int b,int c)
{ 
System.out.println(a+b+c);
}
public static void main(String[] args) {
Hello_World obj=new Hello_World();
obj.sum(50,50);
obj.sum(50,50,50);
}
}


package Hello.World;
public class Hello_World {
void sum(int a,int b)
{ 
System.out.println(a+b);
}
void sum(long a,long b)
{ 
System.out.println(a+b);
}
public static void main(String[] args) {
Hello_World obj=new Hello_World();
obj.sum(50,50);
obj.sum(50,50);
}
list

3. Swapping argument data type : It is allowed within the class given that the order of the data type variables are not 
the same.
Example : max(int, float) // 1
st
int & 2
nd
float
max(float, int) // 1
st
float & 2
nd
int
First method is having argument list as (int, float) and second is having (float, int). Both the methods have different 
sequence of data type in argument list

package Hello.World;
public class Hello_World {
void sum(int a,double b)
{ 
System.out.println(a+b);
}
void sum(double b,int a)
{ 
System.out.println(a+b);
}
public static void main(String[] args) { 
Hello_World obj=new Hello_World();
obj.sum(50,50.0);
obj.sum(50.0,50);
}
}

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
package Hello.World;
//Creating a parent class. 
class Books{
//defining a method 
void run()
{
System.out.println("Book not in stock");
}
}
//Creating a child class
public class Hello_World extends Books{
void run()
{
System.out.println("Book is available");
}
public static void main(String[] args) {
Hello_World obj = new Hello_World(); //creating object 
obj.run(); //calling method
}
}
	
