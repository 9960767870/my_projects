package com.demo.JavaTutorial.model;


public class JavaTutorials {
	
	int a ;
	String b;
	
	public JavaTutorials() {
		super();
	}

	public JavaTutorials(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "JavaTutorials [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		
		JavaTutorials a = new JavaTutorials(1,"wevsdf");
		System.out.println(a.toString());
	}

}                       
 