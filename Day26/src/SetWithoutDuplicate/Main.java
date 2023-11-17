package SetWithoutDuplicate;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(101L, "Akshay", 250000, "Thane", Cdepartment.BACKUSER));
		list.add(new Customer(102L, "Sachu", 250000, "Thane", Cdepartment.BACKUSER));
		list.add(new Customer(103L, "Bhushan", 250000, "Thane", Cdepartment.BACKUSER));
		list.add(new Customer(104L, "Vijay", 250000, "Thane", Cdepartment.BACKUSER));
		
		for(Customer c : list) {
			System.out.println(c);
		}
	}

}
