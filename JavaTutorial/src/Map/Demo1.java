package Map;

import java.util.HashMap;

public class Demo1 {

	// Do not synchronized
	
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		h.put(101, "Rushi");
		h.put(102, "Shiva");
        h.put(103, "Megha");
        h.put(104, "Jeet");
        h.put(105, "Rushi");
        System.out.println(h);
        
        System.out.println(h.containsKey(101));
        System.out.println(h.containsValue("Rushi"));
        System.out.println(h.get(101));
        h.entrySet();
        System.out.println(h);
        h.putAll(h);
        System.out.println(h);
        h.clear();
        System.out.println(h);
	}

}
