package Array;

public class Assint17 {

	public static void main(String[] args)
	{
	int[] a = {10,20,50,60,30,40};
	
	int max = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]>max)
		{
			 max=a[i];
		}
	}
	
	for (int i = 0; i < a.length; i++) 
	{
	
		if(a[i]!=max && a[i]>max2)
		{
			 max2=a[i];
		}
	}
	
	System.out.println(max);
	
	
	System.out.println(max2);
	

	}

}
