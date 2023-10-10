package Collectionmethod;

import java.util.ArrayList;
import java.util.Arrays;

public class removemethod {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(50);
		a.add(30);
		a.add(40);
		
//		a.remove(2);
//		System.out.println(a);
		
//		a.clone();
//		
//		System.out.println(a);
		
//		Object b = a.clone();
//		System.out.println(b);
		
		a.toArray();
		System.out.println(Arrays.toString(a.toArray()));
		
		System.out.println(a.contains(40));
		
		System.out.println(a.indexOf(10));
		
		System.out.println(a.lastIndexOf(10));
		
		
//		a.clear();
//		System.out.println(a);
		
		System.out.println(a);
		
		a.remove(0);
		
		a.add(4, 10);
		System.out.println(a);
		

	}

}
