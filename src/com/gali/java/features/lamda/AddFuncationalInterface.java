package com.gali.java.features.lamda;

public interface AddFuncationalInterface {
	
	public int add(int a, int b);
	
	default int hashcode(){
		return 20;
	}
	
	default void printHelloMessage() {
		System.out.println("Hello !..");
	}

}
