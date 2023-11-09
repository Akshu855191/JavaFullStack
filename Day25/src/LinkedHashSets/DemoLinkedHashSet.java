package LinkedHashSets;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
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
