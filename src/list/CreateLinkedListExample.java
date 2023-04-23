package list;

import java.util.LinkedList;
import java.util.*;

public class CreateLinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> fruit=new LinkedList<>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		System.out.println("Initail LinkedList's:- "+fruit);
		fruit.add(2, "Watermelon");
		System.out.println("After Add(2 , \"D\") : "+fruit);	
		fruit.addFirst("Strawberry");
		System.out.println("After addfirst(\"Strawberry\") :" + fruit);
		fruit.addLast("Cherry");
		System.out.println("After addLast(\"cherry\"):"+fruit);
		
		List<String> morefruit =new ArrayList<>();
		morefruit.add("grapes");
		morefruit.add("Pyrus");
		
		fruit.addAll(morefruit);
		System.out.println("Afrer Addall(morefruit):"+fruit);
		
	}

}
