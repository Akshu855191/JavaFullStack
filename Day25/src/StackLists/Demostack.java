package StackLists;
import java.util.Stack;
public class Demostack {

	public static void main(String[] args) {
		Stack employee1 = new Stack<>();
		employee1.push(75849);
		employee1.push("123");
		employee1.push("Akshay");
		employee1.push("Java Trainer");
		employee1.push("Thane Maharastra");
		employee1.push("Edubridge");
		
//		System.out.println(employee1.pop());
//		System.out.println(employee1.pop());
//		System.out.println(employee1.pop());
         System.out.println(employee1);
      // System.out.println(employee1.search("Edubridge"));
      //System.out.println(employee1.pop());
      // System.out.println(employee1.peek());
       
       for (Object emp : employee1) {
    	   System.out.println(emp);
       }
	}

}
