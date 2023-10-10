  package JavaTutorialForBegeningCodeWithHarry;

 abstract class Parent2{
	
	public Parent2() {
		System.out.println("This is parent class");
		
	}
	
	public void Student() {
		System.out.println("I am rushi");
		
	}
	
	abstract public void Cool();  
		
   }

  
  class Child2 extends Parent2{   
	 
	 public void Cool() {
		 
		 System.out.println("Rushi is cool");
		 
		 
	 }
	   
	 
   abstract class Child3 extends Parent2{
		 
		 public void Sh() {
			 System.out.println("Good afternoon");
		 }
	 }
	 
 }

     public class AbstractClass_And_AbstractMethod { 
    	 
    	 public static void main(String[] args) {
    		 
    		 //  Parent P = new Parent();
    		   
    		   Child2  C = new Child2();
    		   
    		  // Child3 CD = new Child3();
    	 }
			
		}
    		 
    	 
     


