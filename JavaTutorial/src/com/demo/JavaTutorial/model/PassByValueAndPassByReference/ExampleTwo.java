package com.demo.JavaTutorial.model.PassByValueAndPassByReference;
   
 //Example Of CallByValue

public class ExampleTwo {
	
	void incrementMethod(int a,int b) {
		
		a=a+10;
		b=b+20;
		
	System.out.println("The value of a is the increment method is : "+a);
	System.out.println("The value of b is the increment method is : "+b);
	
	}
    
	public static void main(String[] args) {
		
	int x=5;
	int y=10;
	
	ExampleTwo obj=new ExampleTwo(); 
	obj.incrementMethod(x,y);
	System.out.println("The value of x is the main method is : "+x);
	System.out.println("The value of y is the main method is : "+y);
	}
}
