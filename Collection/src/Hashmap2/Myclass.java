package Hashmap2;

public class Myclass {

	public static void main(String[] args) 
	{
		List<Integer, String> l = new List<Integer, String>();
		
		l.add(4, "rushi");
		l.add(1, "bhosale");
		l.add(5, "sachin");
		l.add(3, "varad");
		l.add(6, "omkar");
		l.add(2, "raje");
		
		System.out.println(l.contains(5));
		
		System.out.println(l.containsvalue("rushi"));
		
		System.out.println(l.size());
		
		System.out.println(l);
		
		String s = l.get(4);
		System.out.println(s);
		
		
		l.print();

	}

}
