package com.Collections.map;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(2, "vivek");
		map.put(8, "aman");
		map.put(5, "bob");
		map.put(0, "ricky");

		System.out.println(map.size());
		System.out.println(map.get(2));
		System.out.println(map.containsKey(7));

		map.put(0, "aman");
		map.put(8, "aman");
		map.put(7, "aman");

		System.out.println(map);

		if (map.containsKey(8)) {
			String s = map.get(8);
			System.out.println("value for key " + "\"8\" is: " + s);
		}

	}

}

/*
 4
vivek
false
{0=aman, 2=vivek, 5=bob, 7=aman, 8=aman}
value for key "8" is: aman

 */


