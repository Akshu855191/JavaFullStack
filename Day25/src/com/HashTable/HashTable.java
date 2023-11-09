package com.HashTable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		
Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
		hm.put(5, "Akshay");
		hm.put(1, "Sachu");
		hm.put(9, "Ajay");
		hm.put(4, "Ganesh");
		hm.put(1,  "Rajesh");
//		System.out.println(hm);
		// It takes only 1 key. And take multiple value pair. It is for Integer type only 
		// It doesn't take any null value.

		for(Entry<Integer, String> str : hm.entrySet()) {
			
			System.out.println(str);
		}
		
		System.out.println();
		
		Hashtable<String, Integer> hm1 = new Hashtable<>();
		hm1.put("Ykshay", 1);
		hm1.put("ajay", 10);
		hm1.put("Ganesh", 5);
		hm1.put("ajay", 6);
		hm1.put("vijay", 7);
		hm1.put("Akshay", 2);
//      System.out.println(hm1);
		// It takes only 1 key. And take multiple value pair. It is for Integer type only 
				// It doesn't take any null value.
		
		for(Entry<String, Integer> str : hm1.entrySet()) {
			
			System.out.println(str);
// In HashMap if we gives key to the integer only integer type of value is gives in sorted order.
// and if we give the key to the String that not gives the value in sorted it not take sorting order. T
		}
		
	}

	}


