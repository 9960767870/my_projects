package com.demo.JavaTutorial.model.PassByValueAndPassByReference;

//Example Of Pass By Value By Using Reference Variable

public class ExampleThree {
	
	public static void main(String[] args) {
	
	
	ExampleThree objOne=new ExampleThree();       //First object
    ExampleThree objTwo=objOne;                   //no object create
    ExampleThree objThree=new ExampleThree();     //Second object
    
    System.out.println("Hashcode of objOne Reference Variable :"+objOne.hashCode());
    System.out.println("Hashcode of objTwo Reference Variable :"+objTwo.hashCode());
    System.out.println("Hashcode of objThree Reference Variable :"+objThree.hashCode());
     
    objOne=new ExampleThree();        //Third object
    System.out.println("Hashcode of objOne Reference Variable :"+objOne.hashCode());
    System.out.println("Hashcode of objTwo Reference Variable :"+objTwo.hashCode());
    
}

  		
	} 
	


