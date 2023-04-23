package set_hashset;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Parth");
		hm.put(2, "Arun");
		hm.put(1, "Mehta");
		System.out.println(hm);
	}

}
