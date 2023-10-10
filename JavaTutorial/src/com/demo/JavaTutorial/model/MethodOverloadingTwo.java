package com.demo.JavaTutorial.model;

public class MethodOverloadingTwo {
	
	int age;
	int rollno;
	String firstname,lastname;
	char maleorfemale;
	
	public void methodOne() {
		System.out.println("no data is entered");
	}
	public void methodOne(String StringOne,String StringTwo) {
		firstname=StringOne;
		lastname=StringTwo;
		System.out.println("name of Student is:"+firstname+" "+lastname);
		
	}
	
	public void methodOne(String StringOne,String StringTwo,int paraAge,char charpara) {
		firstname=StringOne;
		lastname=StringTwo;
		age=paraAge;
		maleorfemale=charpara;
		
		System.out.println("name of Student is:"+firstname+" "+lastname);
		System.out.println("Student of age is:"+age);
		System.out.println("Student is maleorfemale:"+(maleorfemale));
		
	}
   
	

	public static void main(String[] args) {
		
		MethodOverloadingTwo m1=new MethodOverloadingTwo();
		m1.methodOne("rushi","bhosale",21,'M');
	}
} 