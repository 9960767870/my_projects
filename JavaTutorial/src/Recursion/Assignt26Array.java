package Recursion;

import java.util.Arrays;

public class Assignt26Array {
	
	static char[] s1 = {'R','S','I','E'};
	static char[] s2 = {'U','H','K','S','H'};
	
	static char[] s3 = new char[s1.length+s2.length];
	
	static int s3index = 0;

	public static void main(String[] args) {

       loopi(0);

       System.out.println(Arrays.toString(s3));
	}

	private static void loopi(int i) {

         if(i<s3.length)
         {
        	  if(i<s1.length)
        	  {
        		     s3[s3index++]=s1[i];
        	  }
        	  if(i<s2.length)
        	  {
        		     s3[s3index++]=s2[i];
        		     loopi(i+1);
        	  }


         }
		
	}

}
