package java_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection <String> fruitcolor =new ArrayList<>();
		
		fruitcolor.add("Apple");
		fruitcolor.add("Banana");
		fruitcolor.add("orange");
		fruitcolor.add("coconut");
		System.out.println(fruitcolor);
		
		fruitcolor.remove("orange");
		System.out.println(fruitcolor);
		
		System.out.println(fruitcolor.contains("pink"));
		
		fruitcolor.forEach((element)->{
			System.out.println(element);
		});
		
		fruitcolor.clear();
		System.out.println(fruitcolor);

		
	}

}
