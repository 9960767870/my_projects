package Practice_Set;

import java.util.*;

public class Swap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> mylist = new ArrayList<String>();
	
	mylist.add("rushi");
	mylist.add("megha");
	mylist.add("jeet");
	mylist.add("shiv");
	
	
	System.out.println("Orignal list :\n " + mylist);

    // Swap items at indexes 1 and 2
	Collections.swap(mylist,1,2);
	
	System.out.println("\nAfter swap 1,2 : \n" + mylist);

    // Swap items at indexes 1 and 3
	Collections.swap(mylist,3,1);
	
	System.out.println("\nAfter swap 3,1 : \n" + mylist);
	
	
	}

}
