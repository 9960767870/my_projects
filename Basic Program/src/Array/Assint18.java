package Array;

public class Assint18 {

	public static void main(String[] args) 
	{
	
		int[][] a = {
				      {1,2,3},
				      {4,5,6},
				      {7,9,8},
		           };
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
		 for (int j = 0; j < a.length; j++) 
		 {
		
			 if(a[i][j]>max)
			 {
				     max=a[i][j];
		     }
			
		}
		}
		
		System.out.println(max);

	}

}