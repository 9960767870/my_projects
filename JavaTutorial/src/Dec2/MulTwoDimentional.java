package Dec2;

public class MulTwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				      {1,2},
				      {3,4},
				      {5,6},
		};
		
		int[][] b = { 
				      {1,2,3},
				      {4,5,6},
				      
		};
		
		int[][] c = new int[a.length][b[0].length];
		
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j <a.length; j++) {
				for (int k = 0; k <b.length; k++) {
					c[i][j] = c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}
	}


