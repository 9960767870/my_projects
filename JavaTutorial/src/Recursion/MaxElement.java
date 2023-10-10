package Recursion;

public class MaxElement {
	
	static int[] a = {10,20,30,40,50};
	
	static int max = Integer.MIN_VALUE;
	static int i=0;
	
	
private static void check() {
		
	if(i<a.length)
	{
	
	if(a[i]>max)
	{
		
		   max=a[i];
		   
		   i++;
		   check();
	}	   
	}
	
	}
	

	public static void main(String[] args) {
		
		check();
		System.out.println(max);

	}

	

}
