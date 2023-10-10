package String;

import java.util.Arrays;

public class Assigntment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "43521";
	
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if(s1[i]<s1[j]) {
					
					char ch = s1[i];
					s1[i] = s1[j];
					s1[j] = ch;
				}
			}
		}
		
		
		String h = String.valueOf(s1);
		System.out.println(h);
		
	}	
        
	
}
