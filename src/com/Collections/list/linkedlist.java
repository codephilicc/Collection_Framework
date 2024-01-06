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
		
		lt.add(1, "vinay");
		
		lt.forEach(n->System.out.println("Names are: "+n));
		
		
		Iterator<String> itr = lt.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

/*
Names are: raju
Names are: vinay
Names are: amit
Names are: vivek
Names are: aman
raju
vinay
amit
vivek
aman
 */
