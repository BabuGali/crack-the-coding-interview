package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {

	public static void main(String args[]) {
		String str = "Babu";
		Set<Character> set = new HashSet<>();
		List<char[]> duplicte = Arrays.asList(str.toCharArray()).stream().filter(a -> !(set.add(Character.valueOf(a))))
				.collect(Collectors.toList());
		System.out.println(duplicte);

	}

}
