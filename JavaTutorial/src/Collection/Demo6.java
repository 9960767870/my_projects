package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		for(int i=0;i<5;i++) {
			l.add(i);
		}
		System.out.println(l);
 
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			 Integer i = (Integer) li.next();
			 if(i.equals(2)) {
				 li.remove();
				 System.out.println(l);
			 }
		}
	}

}
