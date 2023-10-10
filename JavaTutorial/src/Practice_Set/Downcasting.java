 package Practice_Set;
  
 import java.io.*;

 class Vahicles{
	 
	 
 }
 
 class Car extends Vahicles{
		
	    static void method(Vahicles v) {
				 
		 if(v instanceof Car) {
			 
		// Downcasting	 
		 Car c = (Car)v;
		 
		 System.out.println("Downcasting method");
				 }
				 
			 }
		}


  public class Downcasting {
	
  
     public static void main(String[] args) {

         // Creating an object of Vehicle class
         // and referring it to Car class
    	 Vahicles v = new Car();
    	 
    	 Car.method(v);
		
	}
	}


