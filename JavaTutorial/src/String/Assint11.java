package String;

import java.util.Arrays;

public class Assint11 {

	public static void main(String[] args) {
		
		String s = "rushi";
	
		
		
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			
		       s1[i]= s.charAt(i);	   
		}
	        	   
		System.out.println(Arrays.toString(s1));

	}

}
