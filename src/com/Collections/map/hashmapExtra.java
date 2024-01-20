package com.Collections.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapExtra {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("india", 7);
		map.put("russia", 1);
		map.put("brazil", 5);
		map.put("america", 6);
		System.out.println(map);
		System.out.println(map.hashCode());

		HashMap<String, Integer> map1 = new HashMap<>(map);
		map1.put("usa", 3);
		System.out.println(map1);
		System.out.println(map1.hashCode());

		Iterator itr = map1.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry mapElements = (Map.Entry) itr.next();
			System.out.println(mapElements);
		}

		map1.forEach((k, v) -> System.out.println(k + " " + v));

		for (Map.Entry<String, Integer> m : map1.entrySet()) {
			System.out.println("Key: " + m.getKey() + "|| Values: " + m.getValue());
		}
	}
}

/*
 {brazil=5, russia=1, india=7, america=6}
1205539547
{usa=3, brazil=5, russia=1, india=7, america=6}
1205655643
usa=3
brazil=5
russia=1
india=7
america=6
usa 3
brazil 5
russia 1
india 7
america 6
Key: usa|| Values: 3
Key: brazil|| Values: 5
Key: russia|| Values: 1
Key: india|| Values: 7
Key: america|| Values: 6
 */


