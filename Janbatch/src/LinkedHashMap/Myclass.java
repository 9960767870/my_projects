package LinkedHashMap;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mylinkedhashmap<Integer, String> obj = new Mylinkedhashmap<Integer, String>();
		
		obj.add(10, "rushi1");
		obj.add(130, "rushi2");
		obj.add(104, "rushi3");
		obj.add(105, "rushi4");
		obj.add(100, "rushi5");
		obj.add(200, "rushi6");
		obj.add(500, "rushi7");
		
		System.out.println(obj.get(500));
		System.out.println(obj.size());
		System.out.println(obj.containsvalue("rushi"));
		
		obj.replace(10, "dos");
		
		//System.out.println(obj);
		
		obj.print();

	}

}
