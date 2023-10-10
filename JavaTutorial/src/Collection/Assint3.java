package Collection;

import java.util.LinkedList;

public class Assint3 {

	public static void main(String[] args) {
		 
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.addFirst(100);
		l.addLast(200);

		System.out.println(l.element());
		System.out.println(l);
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
	}

}
