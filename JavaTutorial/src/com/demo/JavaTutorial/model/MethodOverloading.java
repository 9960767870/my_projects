 package com.demo.JavaTutorial.model;

public class MethodOverloading {
	
	public void methodOne() {
		System.out.println("inside no argument Method");
	}
	
	public void methodOne(int paraOne) {
		System.out.println("inside single argument Method:"+paraOne);
	}
	public int methodOne(int paraOne,int paraTwo) {
		System.out.println("inside int argument Method:"+paraOne+" "+paraTwo);
		return 0;
	}

	public String methodOne(String paraString,boolean parabool) {
		System.out.println("inside String argument Method:"+paraString+parabool);
		return null;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m1=new MethodOverloading();
		
		m1.methodOne(10);
		
	}
	
	}


