package StringHW;

import java.util.Arrays;

public class Assingnt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "are you lucy";
		
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			    String s2=s1[i];
			 
	
			char[] c = s.toCharArray();
			
			int p =0;
			int q = c.length-1;
			
			while(p<q) {
			char ch = c[p];
			c[p] = c[q];
			c[q] = ch;
			p++;
			q--;	
			
		}
			String s5 = new String(c);
			     s1[i]=s5;
		}
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		

	}

}
