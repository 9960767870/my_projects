
public class Assin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
			      {1,2},
			      {4,5},
			      {7,8},
	            };
		
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length-1; j++) 
			{
				if(j>i)
				{
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
