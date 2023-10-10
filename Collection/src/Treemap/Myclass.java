package Treemap;

public class Myclass {

	public static void main(String[] args) {
		
		Mytreemap m = new Mytreemap();
		
		m.add(4, "bablya");
		m.add(2, "sachya");
		m.add(3, "bhadyanya");
		m.add(5, "damya");
		m.add(1, "rushya");
		
		m.print();
		
		String s = m.get(1);
		System.out.println(s);
		
		System.out.println(m);

	}

}
