package com.demo.JavaTutorial.model;

class Practice  
{

	 void Methodexample() 
	{
		System.out.println("inside the parent class.");
	}
}

class Show extends Practice
{
	 void Methodexample() 
    {
		System.out.println("inside the child class.");
	}

}
public class MethodOverriding 
{

	public static void main(String[] args) {
		Show s = new Show();
		s.Methodexample();
	}
}

//class MethodOverriding {
//	public static void main(String[] args) {
//		Result result = new Result();
//		result.Methodexample();
//	}
