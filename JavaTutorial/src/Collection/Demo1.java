package Collection;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.add("Rushi");
		l.add(2);
		l.add(200);
		l.add(300);
		System.out.println(l);
		
		l.addFirst(1);
		System.out.println(l);
		
		l.addLast(400);
		System.out.println(l);
		
		l.element();
		System.out.println(l);
		
		
		System.out.println(l.get(2));
		
		
		l.set(0, 1);
		System.out.println(l);
		
		
		
		
	
		

	}

}
