package com.gali.java.features.basics;

import java.util.Arrays;
import java.util.Spliterator;

public class IteratorVsSplitIterator {

	public static void main(String[] args) {

		String[] alphabets = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
				"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		
		//Arrays.asList(alphabets).iterator().forEachRemaining(a->System.out.println(a));
		//Arrays.asList(alphabets).spliterator().forEachRemaining(a->System.out.println(a));
		//Arrays.asList(alphabets).spliterator().tryAdvance(a->System.out.println(a));
		//Spliterator<String> si= Arrays.asList(alphabets).spliterator();
		//si.tryAdvance(a->System.out.println(a));
		//si.forEachRemaining(a->System.out.println(a));
		Spliterator<String> trysi =Arrays.asList(alphabets).spliterator().trySplit();
		
		trysi.forEachRemaining(a->System.out.println(a));
		System.err.println("=============");
		trysi.tryAdvance(a->System.out.println(a));

	}

}
	