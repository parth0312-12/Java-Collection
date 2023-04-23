package set_hashset;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CreateHashSetExample {
	
	public static void main(String args[]) {
		
//		Set<String> daysofweek=new HashSet<>();
//		
//		daysofweek.add("Monday");
//		daysofweek.add("Tuesday");
//		daysofweek.add("Wednesday");
//		daysofweek.add("Thrusday");
//		daysofweek.add("Friday");
//		daysofweek.add("saturday");
//		daysofweek.add("Sunday");
//		daysofweek.add("Monday");
//		System.out.println(daysofweek);
//		
//		LinkedHashSet<String> days=new LinkedHashSet<>();
//		days.add("Monday");
//		days.add("Tuesday");
//		days.add("Wednesday");
//		days.add("THrusday");
//		days.add("Friday");
//		days.add("Saturday");
//		days.add("Sunday");
//		days.add("Monday");
//		
//		System.out.println(days);
		
		TreeSet<String> fruit=new TreeSet<>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Organe");
		fruit.add("coconut");
		
		System.out.println("Fruit Set:-"+fruit);
		fruit.add("Apple");
		System.out.println("After Adding duplicate element \"Apple\":- "+fruit);
		
		fruit.add("banana");
		System.out.println(fruit);
		
	}
	

}
