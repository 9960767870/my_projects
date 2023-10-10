package com.demo.JavaTutorial.model;

public class MethodOverloadingFour {
	
	public void area() {
		System.out.println("no valued entered");
	}
	public int area(int paraOne) {
		int result=paraOne*paraOne;          //area of square =side*side
		System.out.println("area of square is:"+result);
		return 0;
		
	}
	
	public int area(int paraOne,int paraTwo) {
		int result=paraOne*paraTwo;          //area of rectangle=length*breath
		System.out.println("area of rectangle is:"+result);
		return 0;
		
	}
	
	float area(float paraOne) {
		float result=3.14f*paraOne*paraOne;   //area of circle=pi*radius*radius
		System.out.println("area of circle is:"+result);
		return 0.0f;
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingFour m1=new MethodOverloadingFour();
		 
		m1.area();
	}
		
}
