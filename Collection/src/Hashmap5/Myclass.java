package Hashmap5;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m = new Map<Integer, String>();
		
		m.add(1,"rushi");
		m.add(4,"megha");
		m.add(2,"sachin");
		m.add(4,"shiva");
		m.add(5, "don");
		
		System.out.println(m.size());
		
		System.out.println(m.contains(4));
		
		System.out.println(m.containsvalue("rushi"));
		
		System.out.println(m.get(1));
		
		System.out.println(m);
		
		m.print();
	}

}
