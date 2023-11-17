package MiniProjectWithoutDatabase;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Employee> list = new LinkedList<>();
		list.push(new Employee(101l, "Akshay", 20000, "Thane", Department.IT));
		list.push(new Employee(102l, "Sachin", 20000, "Thane", Department.IT));
		list.push(new Employee(103l, "Ajay", 20000, "Thane", Department.IT));
		list.push(new Employee(104l, "Vijay", 20000, "Thane", Department.IT));
	
	   for(Employee em: list) {
		   System.out.println(em);
	   }

	}

}
