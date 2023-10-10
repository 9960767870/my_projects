package DubliLinkedlist;

import java.util.Arrays;

public class Myclass {

	public static void main(String[] args) {
	
		Dubli<Integer> d = new Dubli<Integer>();
		
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		
		System.out.println(d.indexof(20));
		
		System.out.println(d.lastindexof(50));
		
		System.out.println(d.contains(40));
		
		System.out.println(d.get(2));
		
		System.out.println(d.size());
		
		//d.set(0, 100);
		//d.remove(0);
		
		System.out.println(d);
		
		System.out.println(Arrays.toString(d.toarray()));
		
		d.print();

	}

}
