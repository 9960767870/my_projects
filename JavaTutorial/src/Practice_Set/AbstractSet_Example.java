package Practice_Set;

import java.util.AbstractSet;
import java.util.TreeSet;

public class AbstractSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// Creating object of AbstractSet<Integer>
			AbstractSet<Integer> abs = new TreeSet<Integer>();
			
			// Populating abs_set
			abs.add(10);
			abs.add(20);
			abs.add(30);
			abs.add(40);
			abs.add(50);
			
			// print abs_set
			System.out.println("AbstrsctSet : \n " + abs);
		}
		
		catch(Exception e) {
			System.out.println(e);
		
		}

	}

}
