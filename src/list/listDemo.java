package list;

import java.util.List;
import java.util.ArrayList;

public class listDemo {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element3");
		System.out.println(list);
		
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element4");
		list.add("element5");
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		
	}

}
