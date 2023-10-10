package Recursion;

import java.util.Arrays;

public class BubbleSort {

	static int[] a = {40,50,20,30,10,60};
	static int temp = 0;
	public static void main(String[] args) {

         loopi(0,0);
         System.out.println(Arrays.toString(a));

	}

	private static void loopi(int i, int j) {

     if(i<a.length)
     {
    	 loopj(i,j);
    	 loopi(i+1,j);
     }


	}

	private static void loopj(int i, int j) {

     if(j<a.length-1)
     {
    	 if(a[j]>a[j+1])
    	 {
    		temp = a[j];
    		a[j] = a[j+1];
    		a[j+1] = temp;

    	 }
    	 loopj(i, j+1);


     }
		
	}

}
