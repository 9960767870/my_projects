package Collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList a = new ArrayList();
		 
		 a.add("Rushikesh");
		 a.add(100);
		 a.add('c');
		 a.add(9999);
		 
		 a.add("rushi");
		 a.add(100000);
		 a.add('r');
		 System.out.println("a:"+a);
		 
//		 a.addAll(a);
//		 System.out.println(a);
		 
		 ArrayList b = new ArrayList();
		 
		 b.add("Bhosale");
		 b.add(243);
		 b.add('c');
		 b.add(100);
		 System.out.println("b:"+b);
		 
//
//		 b.addAll(a);
//	 System.out.println(b);
		 
		 
		 
//		 b.remove(2);
//		 System.out.println(b);
		 
//		 a.retainAll(b);
//		 System.out.println(a);
		 
//	 
//	 b.retainAll(a);
//	 System.out.println(b);
	 
    System.out.println(a.contains("Rushikesh"));
    System.out.println(a.hashCode());
    System.out.println(b.indexOf(100));
	 
	 
	}

}
