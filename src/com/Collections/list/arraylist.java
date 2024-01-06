package com.Collections.list;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {

		List<String> ll = new ArrayList<>();

		ll.add("kho-kho");
		ll.add("kabaddi");
		ll.add("crikcet");
		ll.add("hockey");
		
		ll.forEach(x->System.out.println("games are: "+x));
		
	}

}
