package Linkedlist;

import java.util.Arrays;

public class Myclass {

	public static void main(String[] args) 
	{
		Mylinkedlist<Integer> a = new Mylinkedlist<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.print();
		
		System.out.println(a);
		
		System.out.println(a.indexof(40));
		
		System.out.println(a.lastindexof(50));
		
		System.out.println(a.contains(40));
		
		System.out.println(a.size());
		
		a.remove(2);
		
		a.set(1, 100);
		System.out.println(a);
		
		System.out.println(Arrays.toString(a.toarray()));
			

	}

}
