package com.Collections.list;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("virat");
		hs.add("rohit");
		hs.add("sachin");
		hs.add("jadeja");
		hs.add("gill");

		hs.forEach(x->System.out.println("players name: "+x));
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
