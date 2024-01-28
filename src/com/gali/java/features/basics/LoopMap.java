package com.gali.java.features.basics;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {

		Map<String,String> map = new  HashMap<>();
		map.put("name", "babu");
		// using for Each on map
		map.forEach((key,value)-> System.out.println(key +"="+value));
		
		// using for each on entry set
		
		map.entrySet().forEach(e->System.out.println(e.getValue()));
		
		System.out.println(map.getOrDefault("name1","ss"));
	}

}
