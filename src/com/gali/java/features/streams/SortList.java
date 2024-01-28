package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Shenzhen", "Brussels", "Taipei", "Buenos Aires", "Sydney", "Bristol");

		Collections.sort(cities, Collections.reverseOrder());
		cities.forEach(a -> System.out.println(a));
		String[] cityArray = (String[]) cities.toArray();
		Arrays.sort(cityArray);
		
		System.out.println(cityArray);


	}

}
