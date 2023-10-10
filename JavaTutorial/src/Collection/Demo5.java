package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		
		for(int i=0;i<5;i++) {
			a.add(i);
		}
		System.out.println(a);
		
		Iterator b = a.iterator();
		
		while(b.hasNext()) {
			System.out.println(b.next());
			
			Integer i = (Integer) b.next();
			if(i%2 == 0) {
				System.out.println(i);
			}
			else {
				b.remove();
			}
		}
		System.out.println(a);
	}
	

}
