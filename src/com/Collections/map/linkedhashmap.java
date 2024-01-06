package com.Collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {

//		linkedhashmap follows insertion order
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();

		hmap.put("phy", 70);
		hmap.put("eng", 60);
		hmap.put("maths", 90);
		hmap.put("hindi", 55);

		System.out.println(hmap);

		Set<Entry<String, Integer>> set = hmap.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Integer> map = (Entry<String, Integer>) itr.next();
			System.out.println(map.getKey() + " : " + map.getValue());
		}

	}

}


/*
 {phy=70, eng=60, maths=90, hindi=55}
phy : 70
eng : 60
maths : 90
hindi : 55
 */
