package Linkedlist12;

import java.util.Arrays;

public class Myclass {

	public static void main(String[] args) 
	{
		
		List<Integer> l = new List<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		System.out.println(l.indexof(40));
		
		System.out.println(l.lastindexof(50));
		
		System.out.println(l.contains(60));
		
		System.out.println(l.size());
		
		System.out.println(l.get(4));
		
		System.out.println(l);
		
		System.out.println(Arrays.toString(l.toarray()));
		
		l.remove(5);
		
		l.print();
	}

}
