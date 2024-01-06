package com.Collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm =new TreeMap<>();
		
		tm.put("cat", 3);
		tm.put("bat", 5);
		tm.put("apple", 1);
		tm.put("xmas", 0);
		
		System.out.println(tm);
		
		Set<Entry<String, Integer>> treemap = tm.entrySet();
		Iterator itr = treemap.iterator();
		
		while(itr.hasNext()) {
		Map.Entry<String,Integer> map =(Entry<String, Integer>) itr.next();
			System.out.println("key is: "+map.getKey()+" & "+"value is:"+map.getValue());
		}
		
		
	}

}
