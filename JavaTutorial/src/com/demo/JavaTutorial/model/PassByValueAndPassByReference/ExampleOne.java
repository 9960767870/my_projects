 package com.demo.JavaTutorial.model.PassByValueAndPassByReference;

//Example Of PassByValue

public class ExampleOne {

	public static void main(String[] args) {
		
	
	
	byte a=100;
	short b=a;
	int c=b;
	

		
	System.out.println("The value of a,b,c is : " + a + " " + b + " " + c);
    a=105;
	
	System.out.println("The value of a,b,c is : " + a + " " + b + " " + c);
	b=200;
	
	System.out.println("The value of a,b,c is : " + a + " " + b + " " + c);

	}
	

}
