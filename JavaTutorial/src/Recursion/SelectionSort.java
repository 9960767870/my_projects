package Recursion;

import java.util.Arrays;

public class SelectionSort {

	static int[] a = {20,40,10,50,60,30};
	static int min;
    static int temp = 0;
   // static int j;
	public static void main(String[] args) {
       
		loopi(0);
      
    System.out.println(Arrays.toString(a));
 
	}

	private static void loopi(int i) {

		if(i<a.length)
		{
			
			min=i;
			loopj(i,i+1);
			loopi(i+1);
		}
		   
		
	}

	private static void loopj(int i, int j) {


    if(j<a.length)
    {
    	if(a[i]>a[j])
    	{
    		min = j;
    		
    		temp = a[i];
    		a[i] = a[min];
    		a[min] = temp;
    	}
    		loopj(i, j+1);
    	        
    	}
    	
    }
		
	}


