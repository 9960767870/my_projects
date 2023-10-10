package MapPractice;

public class Myclass {

	public static void main(String[] args) {
		
		MyTree m = new MyTree();
		
		m.add(4, "somu");
		m.add(3, "gomu");
		m.add(2, "tomu");
		m.add(5, "somya");
		m.add(1, "gomya");
		
		m.print();
		
		String s = m.get(5);
		System.out.println(s);
		
	}

}
