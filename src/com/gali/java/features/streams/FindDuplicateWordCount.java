package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordCount {

	public static void main(String[] args) {
		
		String str= "hello hi aa hello";
		
		Map<String, Integer> wordsMapWithCount =
				Arrays.asList(str.split(" ")).stream().collect(Collectors.toMap(Function.identity(), a->2 , Math::addExact))
				.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		
		System.out.println(wordsMapWithCount);

	}

}
