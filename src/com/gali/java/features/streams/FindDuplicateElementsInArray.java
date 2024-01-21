package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {

	public static void main(String args[]) {

		Integer[] array = new Integer[] { 2, 3, 3 };
		Set<Integer> integerSet = new HashSet<>();
		List<Integer> finalList = Arrays.asList(array).stream().filter(n -> !integerSet.add(n))
				.collect(Collectors.toList());
		finalList.forEach(a -> System.out.println(a));
		integerSet.forEach(a -> System.out.println(a));

	}

}
