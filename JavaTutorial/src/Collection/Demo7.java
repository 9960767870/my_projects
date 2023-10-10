package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Mycomparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer t1 = (Integer) o1;
		Integer t2 = (Integer) o2;
		
		if(t1<12) {
			return -1;
		}
		
		else if(t1>t2) {
			return +1;
		}
		
		else {
		return 0;
	}
	}
}

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new Mycomparator());
		t.add(50);
		t.add(34);
		t.add(56);
		t.add(23);
		t.add(78);
		t.add(10);
		
		System.out.println(t);
	
		
//		
//		System.out.println(t.first());
//		System.out.println(t.last());
//		
//		System.out.println(t.headSet(34));
//		System.out.println(t.tailSet(56));
//		
//		System.out.println(t.pollFirst());
//		System.out.println(t.pollLast());

	}

}


