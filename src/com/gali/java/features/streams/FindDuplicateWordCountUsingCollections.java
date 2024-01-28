package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateWordCountUsingCollections {

	public static void main(String[] args) {
		
		String str= "hello hi aa hello";
		
		Map<String, Integer> wordsMapWithCount = new  HashMap<>();
		List<String> stringList = Arrays.asList(str.split(" "));
		
		for (String word : stringList) {
			
			wordsMapWithCount.put(word, Collections.frequency(stringList, word));
		}
		
		System.out.println(wordsMapWithCount);

	}

}
