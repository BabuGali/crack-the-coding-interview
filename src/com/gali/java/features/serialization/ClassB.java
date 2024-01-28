package com.gali.java.features.serialization;

import java.io.Serializable;

public class ClassB extends ClassA implements Serializable {

	private static final long serialVersionUID = 3036311456191675285L;
	
	public static void main(String[] args) {
		ClassA a = new ClassB();
		System.out.println(a);

	}


}
