package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindWordCount {

	public static void main(String[] args) {
		
		String str= "hello hi aa hello";
		
		Map<String, Integer> wordsMapWithCount =
				Arrays.asList(str.split(" ")).stream().collect(Collectors.toMap(Function.identity(), a->1 , Math::addExact));
		
		System.out.println(wordsMapWithCount);

	}

}
