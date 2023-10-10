package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class MyDemo implements Comparator{
	public MyDemo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) {
		
	String s = (String) o1;
	String s1 = (String) o2;
	
         
		
		return s.compareTo(s1);
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new MyDemo());
		t.add( "Rushi");
		t.add( "Shiv");
		t.add( "Don");
		t.add( "Jeet");
		System.out.println(t);

	}

}
