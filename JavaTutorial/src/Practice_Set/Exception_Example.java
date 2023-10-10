 package Practice_Set;

import java.util.Scanner;

class MyException extends Exception{
	 
	public String toString() {
		return "toString";
	}
	
	public String getMessage() {
		return "getMessage";
		
	}
 }
 
 public class Exception_Example { 
	
	 public static void main(String[] args) {
		 
		 int a;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("The value of a is :");
		  a = sc.nextInt();
		  
		  if(a<9) {
			  
			  try {
				    throw new MyException();
			  }   
				    
			 catch(Exception e) {
				 System.out.println(e.toString());
				 System.out.println(e.getMessage());
				 System.out.println(e);
				 
			 }
				    
		  }
		  
	 }
		 
	}
	
		  
