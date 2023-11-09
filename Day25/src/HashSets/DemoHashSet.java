package HashSets;
import java.util.HashSet;
public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(24);
		hs.add(98);
		hs.add(1258);
		hs.add(60);
		for(Integer ss: hs) {
			System.out.println(ss);
		}
		
		
	}

}
