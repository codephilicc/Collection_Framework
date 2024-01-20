package com.Collections.map;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class linkedhashmap_extra {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		map.put("1-bedroom", 25000);
		map.put("2-bedroom", 50000);
		map.put("1-bedroom and hall", 65000);
		map.put("2-bedroom and hall", 85000);

		Set<Entry<String, Integer>> set = map.entrySet();

		for (Map.Entry<String, Integer> mp : set) {
			System.out.println("before change value: " + mp.getKey() + " value is " + mp.getValue());

			double rate = Math.random() * 100000;
			int r1 = (int) Math.round(rate);
//			set the value r1 in map
			mp.setValue(r1);

			System.out.println("after change value: " + mp.getKey() + " value is " + mp.getValue());

		}

	}

}

/*
before change value: 1-bedroom value is 25000
after change value: 1-bedroom value is 98514
before change value: 2-bedroom value is 50000
after change value: 2-bedroom value is 58263
before change value: 1-bedroom and hall value is 65000
after change value: 1-bedroom and hall value is 43061
before change value: 2-bedroom and hall value is 85000
after change value: 2-bedroom and hall value is 60054

 */
