package Array;

import java.util.Iterator;

public class Assint6 {

	public static void main(String[] args) 
	{
		int sum=0;
		int[][] a = {
				      {1,2,3},
				      {4,5,6},
				      {7,8,9},
		             };
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				sum = sum+a[i][j];
				
			}
			
		}
		System.out.println(sum);
		}

	}

