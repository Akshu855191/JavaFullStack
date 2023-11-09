package VectorLists;

import java.util.Vector;

public class Vectorlists {

	public static void main(String[] args) {
		 Vector list = new Vector();
		 list.add(123);
		 list.add("Akshay");
		 list.add("Thane Maharastra");
		 list.add("Java Developer");
		 list.add("Akshayshelke7066@gmail.com");
		 list.add(79748);
		 System.out.println(list);
		 System.out.println(list.size());
		 System.out.println(list.isEmpty());
		 System.out.println(list.removeAll(list));
		 System.out.println(list.isEmpty());

	}

}
