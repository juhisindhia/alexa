package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CalculateDistinctChar {

	public static void main(String[] args) {
		String s = "aabccabcdaejzzzzzzzzz";

		HashMap<Character, Integer> map = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Set<Character> keys = map.keySet();
			if (keys.contains(c)) {
				// if exists
				int curr = map.get(c);
				map.put(c, curr + 1);

			} else {
				// do not exists
				map.put(c, 1);
			}
		}

		System.out.println(map);
		
		/*
		 * Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		 * 
		 * for (Map.Entry<Character, Integer> e : entries) { System.out.print(" key " +
		 * e.getKey() + ", "); System.out.println(" val " + e.getValue()); }
		 */

	}
}
