package Dec3;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				      {1,2,3},
				      {4,5,6},
				      {7,8,9},
		};
		
		int[][] b = new int[a[0].length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[j][i]=a[i][j];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		}
	}


