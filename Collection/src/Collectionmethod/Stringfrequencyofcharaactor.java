package Collectionmethod;

import java.util.HashMap;

public class Stringfrequencyofcharaactor {

	public static void main(String[] args) {
		
		String s = "abcdabdcbassc";
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			
			if(!m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i), 1);
				
			}
			else
			{
				m.put(s.charAt(i), m.get(s.charAt(i)));
			}
		}
		System.out.println(m);

	}

}
