package JavaTutorialForBegeningCodeWithHarry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(8);
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(0, 10);
		list.add(0, 1);
		
		list.addAll(list2);
		
		list.set(1, 566);
		
		list.ensureCapacity(1);
		
		
		System.out.println(list.contains(10));
		
		System.out.println(list.indexOf(15));
		
		System.out.println(list.lastIndexOf(20));
		
     
		
		
		
		for(Integer a : list) {
			System.out.println( a);
			
			//System.out.println(",");
		}

		
	}

}
