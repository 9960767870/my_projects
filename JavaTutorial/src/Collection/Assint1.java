package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Spliterator;

public class Assint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		ArrayList<String> b = new ArrayList<String>();
		
		a.add(10);
		a.add(20);
		a.add(70);
		a.add(30);
		a.add(50);
		
		b.add("rushi");
		b.add("sachin");
		b.add("varad");
		b.add("megha");
		b.add("shiva");
		
		
		
		
		a.add(1, 100);
		
	//	a.addAll(4, a);
		
		//a.clear();
		
		System.out.println(a.contains(50));
		
		System.out.println(a.containsAll(a));
		
	    System.out.println(a.equals(a));
	    
	    System.out.println(a.get(1));
	    
	    System.out.println(a.hashCode());
	    
	    System.out.println(a.indexOf(50));
	    
	    System.out.println(a.lastIndexOf(50));
	    
	    System.out.println(a.isEmpty());
	    
	   // System.out.println(b.retainAll(a));
	    
	    a.remove(1);
	    
	    a.set(1, 60);
	    
	   System.out.println(a.size());
	   
	System.out.println(a.toString());
	
	 System.out.println(Arrays.toString(a.toArray()));
	 
	 a.trimToSize();
	 
	 
	 Collections.sort(a);
	 
	//System.out.println(a.stream());
	
	//System.out.println(a.spliterator());
	   
		
	 
	 b.add(1, "don");
	 
	 Collections.sort(b);
	 
	 
		System.out.println(a);
		
		System.out.println(b);

		
	}

}
