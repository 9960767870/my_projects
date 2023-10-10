package ArrayPractice;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				      {1,2,3},
				      {4,5,6},
				      {7,8,9},
		};
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				boolean issmallestinrow = true;
				
				for (int l = 0; l < a.length; l++) {
					
					if(a[i][l]<a[i][j])
					{
						 issmallestinrow = false;
				}
			}
				
				boolean islargestincol = true;
				for (int k = 0; k < a.length; k++) {
					
					if(a[k][j]>a[i][j])
					{
						islargestincol = false;
					}
				
				}
				
				if(issmallestinrow==true && islargestincol==true)
				{
					System.out.println(a[i][j]);
				}
				
				
		}
		}

	}

}
