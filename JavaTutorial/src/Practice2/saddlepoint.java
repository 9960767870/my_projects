package Practice2;

public class saddlepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { 
			       {6,3,1},
			       {9,7,8},
			       {2,4,5},  
	            };
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				boolean issmallestrow = true;
				for (int l = 0; l < a.length; l++) {
					if(a[i][l]<a[i][j])
					{
						 issmallestrow = false;
					}
					
				}
				
				boolean islargestcol = true;
				for (int k = 0; k < a.length; k++) {
					if(a[k][i]>a[i][j])
					{
						islargestcol = false;
					}
				}
				
				if(issmallestrow == true && islargestcol==true)
				{
					System.out.println(a[i][j]);
				}
				
			}
		}
	}

}
