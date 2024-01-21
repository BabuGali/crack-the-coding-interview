package com.gali.java.features.lamda;

public class AddLambdaExpression {

	public static void main(String[] args) {
		
		AddFuncationalInterface fi = (int a , int b) -> {return a+b;};
		int sum = fi.add(10, 20);
		System.out.println(sum);
	    fi.printHelloMessage();
	    System.out.println(fi.hashCode());

	}

}
