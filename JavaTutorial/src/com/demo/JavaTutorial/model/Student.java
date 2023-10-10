package com.demo.JavaTutorial.model;

 class Student {
	 
	 int age;
	 int rollno;
	 int id;
	 char maleorfemale;
	 
	 String name;

	 public static void main(String[] args) {
		 
		 
		  Student s1=new Student ();
		  
		   
		  s1.age = 20;
		  s1.rollno = 118;
		  s1.id = 99;
		  s1.maleorfemale = 'M';
		  s1. name = "Rushi"; 
		  
		    System.out.println("age of Student is : "+s1.age);
		    System.out.println("rollno of Student is : "+s1.rollno);
		    System.out.println("id of Student is : "+s1.age);
		    System.out.println("male or female is : "+s1.maleorfemale);
            System.out.println("name of Student is : "+s1.name);
}
}
 