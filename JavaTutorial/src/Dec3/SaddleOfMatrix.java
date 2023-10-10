package Dec3;

public class SaddleOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { 
				       {6,3,1},
				       {9,7,8},
				       {2,4,5},  
		            };
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				boolean isSmallestInRow = true;
				for (int l = 0;  l< a.length; l++)
				{
					if(a[i][l]<a[i][j]) {
						
						isSmallestInRow = false;
				      }
				}
					boolean isLaergestIncol = true;
					for (int k = 0; k < a.length; k++)
					{
						if(a[k][j]>a[i][j]) {
							isLaergestIncol = false;
						}
					}
						
					if(isSmallestInRow==true && isLaergestIncol==true)
					{
						System.out.println(a[i][j]);
					}
					}
			}
		}

		}

	


