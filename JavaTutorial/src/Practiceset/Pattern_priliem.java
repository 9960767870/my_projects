package Practiceset;

public class Pattern_priliem {

	public static void main(String[] args) {
		
		int[][] a = new int[5][5];
		int counter = 1;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
			
				if(j+i>=4)
				{
					a[i][j] = counter++;
				}
				else
				{
					a[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if(i%2!=0)
			{
				int k=4;
				int j=4-i;
				
				while(j<k)
				{
					int temp = a[i][j];
					a[i][j] = a[i][k];
					a[i][k] = temp;
					
					j++;
					k--;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i][j]==0)
					System.out.print(" ");
				
				else
					System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
