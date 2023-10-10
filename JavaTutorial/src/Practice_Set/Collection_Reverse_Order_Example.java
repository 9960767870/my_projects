package Practice_Set;

import java.util.ArrayList;
import java.util.Collections;

 //Collection of reverseOrder Example;

public class Collection_Reverse_Order_Example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(34);
		ar.add(2);
		ar.add(60);
		ar.add(10);
		
		 /* Collections.sort method is sorting the
        elements of ArrayList in descending order. */
		
		Collections.sort(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		
		
		// Let us print the sorted list
   System.out.println("List after the use of Collection.reverseOrder(): " + "Collection.sort() \n" + ar);
	}

}


     //Returns a comparator that imposes the reverse of 
    //the natural ordering on a collection of objects
    //that implement the Comparable interface. 
   //The natural ordering is the ordering imposed by 
  //the objects' own compareTo method

 
