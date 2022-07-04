package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put("Juhi", new Student(926179,"Juhi","Hazipuria"));
		map.put("Vikash", new Student(891113,"Vikash","Hyderabad"));
		map.put("Moni", new Student(926179,"Juhi","Danapur"));
		
		
		Set<String> keys = map.keySet();
		for(String k : keys){
			System.out.println(k);
		}
		
		Set<Map.Entry<String, Student>> entries =  map.entrySet();
		
		for(Map.Entry<String, Student> e : entries) {
			System.out.print(" key "+e.getKey()+", ");
			System.out.println(" val "+e.getValue().mobileNo);
		}
		
		System.out.println(map.get("Vikash").address);
	}
}
