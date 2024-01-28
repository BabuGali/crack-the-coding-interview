package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapUsingStreams {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Shenzhen", "Brussels", "Taipei", "Buenos Aires", "Sydney", "Bristol");

		Map<Object, String> map = cities.stream().collect(Collectors.toMap(str->str,str->str));
		System.out.println(cities.stream().count());
		
		map.entrySet().stream().forEach(a-> {System.out.println(a);});
	}

}
