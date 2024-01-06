package com.Collections.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("A");
		lhs.add("E");
		lhs.add("B");
		lhs.add("O");
		lhs.add("H");

//	again adding

		lhs.add("B");
		lhs.add("O");
		lhs.add("C");

		lhs.forEach(n -> System.out.println(n));

//		removing
		System.out.println(lhs.remove("E"));
		System.out.println(lhs.remove("D"));

		lhs.forEach(n -> System.out.println("after removing: " + n));

		System.out.println(lhs.size());
		System.out.println("Iscontain D: "+lhs.contains("D"));
		System.out.println("Iscontain A: "+lhs.contains("A"));
		
		System.out.println("update linkedhashset: "+lhs);
		
//	Iterating
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println("each element is: "+itr.next());
		}
		
//		calling element by enhanced for loop
		for(String s : lhs) {
			System.out.println(s);
			
		}
		
		
	}

}
