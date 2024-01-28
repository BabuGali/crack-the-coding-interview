package com.gali.java.features.inheritance;

public class SubClass extends SuperClass {

	int age= 20;
	//Integer integer=20;
	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		SubClass sub=new SubClass();
		
		//System.out.println("age="+sup.inteager);
		//System.out.println("integer="+sub.integer);
		sup.method();

	}
	
	
	public void subMethod() {
		System.out.println("sub method");
	}

	public void method() {
		System.out.println("sub method");
	}
}
