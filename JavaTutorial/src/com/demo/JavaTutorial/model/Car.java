package com.demo.JavaTutorial.model;

public class Car {

	int seats;
	
	public static void main(String[] args) {
	
	Car maruthi=new Car();
	Car Toyota=new Car();
	
	maruthi.seats=10;
	Toyota.seats=20;
	
	System.out.println("number of seat : "+maruthi.seats);
	System.out.println("number of seats : "+Toyota.seats);
}
}
