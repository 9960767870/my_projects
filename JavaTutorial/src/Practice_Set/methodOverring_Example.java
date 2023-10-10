   package Practice_Set;
 
  class Parent{
	  public void meta1() {
		  System.out.println("This is spartaaa");
	  }
	  
  }  
   class Child extends Parent{
	   public void meta1() {
		   System.out.println("This is rushikesh");
	   }
   
   }

  public class methodOverring_Example {
	  
	  public static void main(String[] args) {
		
		  Parent p = new Child();
		   
		  p.meta1();
			  
		  }
	}
	  
	  
  
  
  
