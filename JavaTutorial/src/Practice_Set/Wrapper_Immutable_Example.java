package Practice_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Wrapper_Immutable_Example {
	public static void main(String[] args) {
		  
		int[] arr = new int[4];
		
		Integer i = new Integer(12);
		System.out.println(i);
		modify(i);
		System.out.println(i);
		String s = "abc";
		System.out.println(s);
		Set<String> str = new HashSet<String>();
		str.add(";akjdf");
		str.add(";akjdf");
		str.add(";akjdf");
		str.add(";akjdfSADHAPPY");
		System.out.println(str);
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "abc");
		map.put(1, "abcw");
		map.put(3, "abc");
		map.put(4, "abcs");
		System.out.println(map);
	}

	private static void modify(Integer i) {
		
		i = i+i; 
		
	}

}
