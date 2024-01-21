package com.gali.java.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersInArray {

	public static void main(String[] args) {
		
		Integer[] ints=new Integer[]{1,2,3,4,5,6,7,8,9,0};
		List<Integer> nums= Arrays.asList(ints).stream().filter(a-> a%2==0?true:false).collect(Collectors.toList());
		nums.forEach(a->System.out.println(a));
		

	}

}
