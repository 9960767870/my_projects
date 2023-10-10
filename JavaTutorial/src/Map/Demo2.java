package Map;

import java.util.Hashtable;

public class Demo2 {
	
	//it is synchronized

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		h.put(101, "Rushi");
		h.put(102, "Shiva");
        h.put(103, "Megha");
        h.put(104, "Jeet");
        h.put(105, "Rushi");
        h.put(101, "Rushi");
        
        System.out.println(h);
        System.out.println(h.containsKey(101));
        System.out.println(h.containsValue("Rushi"));
        System.out.println(h.get(101));
        h.entrySet();
        System.out.println(h);
	}

}
