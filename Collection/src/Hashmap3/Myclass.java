package Hashmap3;

public class Myclass {

	public static void main(String[] args) {
		
		List<Integer,String> l = new List<Integer, String>();
		
		l.add(2, "rushi");
		l.add(1, "bhosale");
		l.add(26, "varad");
		l.add(25, "sachin");
		l.add(22, "don");
		l.add(32, "rushikesh");

		System.out.println(l.contains(2));
		
		System.out.println(l.containsvalue("rushi"));
		
		System.out.println(l.size());
		
		String s = l.get(22);
		System.out.println(s);
		
		System.out.println(l);
		
		l.print();
	}

}
