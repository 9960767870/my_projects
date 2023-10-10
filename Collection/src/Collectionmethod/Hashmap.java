package Collectionmethod;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) 
	{
		
       HashMap< Integer, String> h = new HashMap<Integer, String>();
       
       h.put(10, "rushi");
       h.put(20, "sachin");
       h.put(40, "varad");
       h.put(50, "don");
       h.put(60, "megha");
       
       System.out.println(h);
       
       System.out.println(h.get(10));
       
      System.out.println(h.entrySet());
      
      System.out.println(h.keySet());
      
     System.out.println(h.merge(100, null, null));
       
       
	}

}
