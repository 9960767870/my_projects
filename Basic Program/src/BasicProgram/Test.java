package BasicProgram;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "19,7,6,4,19,23,3,19,5,8,6,7,3,17";
		
	     
		
		// char[] s1 = s.toCharArray();
	
		int count=0;
		String s1="";
	for (int i = 0; i < s.length(); i++) {
		
		for (int j = i+1; j < s.length(); j++) {
			
			if(s.charAt(i)==s.charAt(j))
			{
				  count++;
				  s1=s1+s.charAt(i);
				  break;
				  
			}
		}
	
		
	}
	System.out.println(s1);
	System.out.println(count);
			
		}
	
		  
		  
		  
		
	}


