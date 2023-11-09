package TreeMap;
import java.util.Map.Entry;
import java.util.TreeMap;
public class DemoTreeMap {

	public static void main(String[] args) {
		/*-
		 TreeMap<Integer, String> tm = new TreeMap<>();
		 tm.put(1, "Mithu");
		 tm.put(2, "Sachin");
		 tm.put(3, "Akshay");
		 tm.put(4, "Yogesh");
		 tm.put(5, "Naresh");
		 
		 for(Entry<Integer, String> obj: tm.entrySet()){
			 System.out.println(obj.getValue());
//			 System.out.println(obj.getKey());
*/		 
			 //putAll() method
		
		 TreeMap<Integer, String> tm = new TreeMap<>();
		 tm.put(1, "Mithu");
		 tm.put(2, "Sachin");
		 tm.put(3, "Akshay");
		 tm.put(4, "Yogesh");
		 tm.put(5, "Naresh");
		 
		 
		 TreeMap<Integer, String> tm1 = new TreeMap<>();
		 tm1.put(1, "Mithu");
		 tm1.put(2, "Sachin");
		 tm1.put(3, "Akshay");
		 tm1.put(4, "Yogesh");
		 tm1.put(5, "Naresh");
		 
		 TreeMap<Integer, String> tm3 = new TreeMap<>();
		 tm3.putAll(tm1);
		 System.out.println(tm);
		 }
    
	}


