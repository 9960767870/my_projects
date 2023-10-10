package Recursion;

import java.util.Arrays;

public class uniqueArray {
	
	public static void main(String[] args) {

        int[] a = {11,22,33,44,55,22,33};
        int count = 0;
       // int i=0;
        
       count = loopi(a,count,0);
       System.out.println(count);
        
        int[] b = new int[a.length-count];
        int index = 0;
        secoundloop(0,index,a,b);
        
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);
      
	}


	private static int loopi(int[] a, int count, int i) {
		
		if(i<a.length)
		{
			int j=i+1;
			count = loopj(j,i,a,count);
			
			return count = loopi(a, count, i+1);
		}
		return count;
		
	}


	private static int loopj(int j, int i, int[] a,int count) {
		
	if(j<a.length)
	{
		if(a[i]==a[j])
		{
			count++;
			return count;
		}
		return count = loopj(j+1, i, a, count);
	}
	return count;
	}


	private static void secoundloop(int i, int index, int[] a, int[] b) {
 
		if(i<a.length)
		{
			int counter = 0;
			counter = loopj(0,i,counter,a,b);
			
			if(counter==0)
			{
				b[index++]=a[i];
			}
			secoundloop(i+1, index, a, b);
		}
		
	}


	

	private static int loopj(int i, int j, int counter, int[] a, int[] b) {

		if(i<b.length)
		{
			if(a[i]==b[j])
			{
			counter++;
		}
		
		return counter = loopj(i, j+1, counter, a, b);
	}

		return counter;
	}

	
}
