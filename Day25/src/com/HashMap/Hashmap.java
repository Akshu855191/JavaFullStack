package com.HashMap;
import java.util.*;
import java.util.Map.Entry;
// Map is a not a part of collection. Beacause map can contain the values in the form of key and value pair.
// Shorted map, Navigated map, Tree map
// Sequence is 1.Map --> 2.Sorted map -->  3. Navigated map ---> 4. Tree map.
// Another type of is Hash Map. 
// Other type is LinkedHash map.
public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "Akshay");
		hm.put(1, null);
		hm.put(9, "Ajay");
		hm.put(4, "Ganesh");
		hm.put(6,  "Rajesh");
//		System.out.println(hm);
		// It takes only 1 key. And take multiple value pair. It is for Integer type only     

		for(Entry<Integer, String> str : hm.entrySet()) {
			
			System.out.println(str);
		}
		
		System.out.println();
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("Ykshay", 1);
		hm1.put("Sachin", 10);
		hm1.put(null, 5);
		hm1.put("Ajay", 6);
		hm1.put("vijay", 7);
		hm1.put("Akshay", 2);
//      System.out.println(hm1);
		
		// It takes multiple key and take multiple value pair. It is for String type only.  
		
		
		
		for(Entry<String, Integer> str : hm1.entrySet()) {
			
			System.out.println(str);
// In HashMap if we gives key to the integer only integer type of value is gives in sorted order.
// and if we give the key to the String that not gives the value in sorted it not take sorting order. T
		}
		
	}
	
	
}
