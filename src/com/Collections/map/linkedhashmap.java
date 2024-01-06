package com.Collections.map;

import java.util.LinkedHashMap;

public class linkedhashmap {

	public static void main(String[] args) {

		LinkedHashMap<String,Integer> hmap = new LinkedHashMap<>();
 		
		hmap.put("phy", 70);
		hmap.put("eng", 60);
		hmap.put("maths",90);
		hmap.put("hindi", 55);
		
		System.out.println(hmap);
		
	}

}
