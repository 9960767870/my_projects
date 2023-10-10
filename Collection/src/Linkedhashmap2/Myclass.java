package Linkedhashmap2;

public class Myclass {

	public static void main(String[] args) {
		
		Linkedhashmap l = new Linkedhashmap();
		
		l.put(1, "rushi");
		l.put(4, "varad");
		l.put(5, "sachin");
		l.put(2,"shiva");
		l.put(3, "megha");
		l.put(6, "don");

		System.out.println(l.get(1));
		
		l.print();
	}

}
