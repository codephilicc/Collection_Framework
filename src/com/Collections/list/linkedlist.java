package com.Collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {

		LinkedList<String> lt = new LinkedList<>();
		lt.add("raju");
		lt.add("amit");
		lt.add("vivek");
		lt.add("aman");
		
		lt.forEach(n->System.out.println("Names are: "+n));
		
		
		Iterator<String> itr = lt.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}