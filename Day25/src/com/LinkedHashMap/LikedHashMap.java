package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LikedHashMap {
public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(0, "Akshay");
		hm.put(1, "Sachin");
		hm.put(5,  "Vijay");
		hm.put(7, "Vijay");
		hm.put(4, "Ganesh");
		hm.put(6,  "Rajesh");
		// It takes only 1 key. And take multiple value pair. It is for Integer type.
		
		for(Entry<Integer, String> str : hm.entrySet()) {
			
			System.out.println(str);
		}
		
		System.out.println();
		
LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		
        hm1.put("Ykshay", 1);
        hm1.put("Sachin", 10);
        hm1.put("Vijay", 5);
        hm1.put("Sachin", 6);
        hm1.put("Ganesh", 7);
        hm1.put("Akshay", 2);
		
		for(Entry<String, Integer> str : hm1.entrySet()) {
			
			System.out.println(str);
// In linkedHashMap it gives as it is value to both Integer and String key.
		}
// It takes only 1 key. And take multiple value pair. It is for String type.
		
	}

}
