package com.demo.JavaTutorial.model;

public class ThisKeyword01 {
	
	int varone;
	int vartwo;
	
	String StringExample;
	char[]charArray;
	
	public ThisKeyword01(int varone, int vartwo) {
		// TODO Auto-generated constructor stub
		
	this.varone=varone;
	this.vartwo=vartwo;
	}
	
	public void methodExample(String StringExample,char[]charArray) {
		
		this.StringExample=StringExample;
		this.charArray=charArray;
	}
	
	public static void main(String[] args) {
		
		ThisKeyword01 obj=new ThisKeyword01(10,20);
		
		char[] charLocalArray= {  'H','e','l','l','o'};
		String StringLocal="welcome";
		
		obj.methodExample(StringLocal,charLocalArray);
		
		System.out.println("the value of varone:"+obj.varone);
		System.out.println("the value of vartwo:"+obj.vartwo);
		System.out.println("the value of String is:"+obj.StringExample);
		System.out.println("the value of charArray       :");
		
		for(char a:obj.charArray) {
			System.out.print(a+ "\t");
		
		
		
		
		
	}
	
	
		
	}

}
