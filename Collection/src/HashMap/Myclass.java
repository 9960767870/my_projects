package HashMap;

public class Myclass {

	public static void main(String[] args) {
	
		Myhashmap<Integer, String> m = new Myhashmap<Integer, String>();
		
		m.add(11, "rushi");
		m.add(4,"bhosale");
		m.add(5, "sachin");
		m.add(3, "varad");
		m.add(12, "omkar");
		m.add(8, "don");
		m.add(7, "man");
		m.add(6, "rushikesh");
		
		System.out.println(m.size());
		
		System.out.println(m.contains(4));
		
		System.out.println(m.containsvalue("omkar"));
		
		Object s =  m.get(4);
		
		System.out.println(s);
		
		System.out.println(m);
		
		m.print();

	}

}
