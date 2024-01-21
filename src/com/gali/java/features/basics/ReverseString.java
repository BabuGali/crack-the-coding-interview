package com.gali.java.features.basics;

public class ReverseString {

	public static void main(String[] args) throws Exception {

		String str = "INDIA";

		String reverseString = null;
		reverseString = reverseStringUsingChar(str);
		System.out.println(reverseString + "  is reverse of " + str);

	}

	private static String reverseStringUsingChar(String str) throws Exception {
		if (str == null) {
			throw new Exception("String should not be null");
		}
		char[] charArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int index = charArr.length-1; index >= 0; index--) {
			sb.append(charArr[index]);
		}
		return sb.toString();
	}

}
