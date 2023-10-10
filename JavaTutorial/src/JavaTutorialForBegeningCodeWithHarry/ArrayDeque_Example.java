 package JavaTutorialForBegeningCodeWithHarry;
 
   import java.util.ArrayDeque;

  public class ArrayDeque_Example {
	  
	  public static void main(String[] args) {
		
		  ArrayDeque<Integer> sc = new ArrayDeque<Integer>();
		  
		  sc.add(4);
		  sc.add(5);
		  sc.add(6);
		  sc.add(7);
		  sc.add(8);                          
		  
		//  sc.addFirst(20);
		  
		  System.out.println(sc.getFirst());
		  System.out.println(sc.getLast());
		  
		//  for(Integer a : sc ) {
			//  System.out.println(a);
		 
		  }
	}

   
