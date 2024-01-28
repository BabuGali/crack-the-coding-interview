package com.gali.java.features.basics;

import java.util.Arrays;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {

		
		int[] arr = { 3, 6, 2, 9, 7 };
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
