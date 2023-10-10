package Recursion;

public class SaddlePoint {

	static int count = 0;
	public static void main(String[] args) {
		
		int[][] a = {
			         {5,2,0},
			         {8,6,7},
			         {1,3,4},
		            };
		
		loopi(a,0);
		if(count==0)
			System.out.println("not fount");
		
	}
		

	private static void loopi(int[][] a, int i) {
		
		if(i<a.length)
		{
			loopj(a,i,0);
			loopi(a,i+1);
	
	}
	
	}

	private static void loopj(int[][] a, int i, int j) {
	
		if(j<a[i].length)
		{
			
			
		 boolean isSmallestInRow = true;
			boolean isLargestInColumn = true;
			
		 isSmallestInRow = cheakInRow(a, i, j, isSmallestInRow, 0);
		 isLargestInColumn = cheakInColumn(a, i, j, isLargestInColumn, 0);
		 
		 if(isSmallestInRow && isLargestInColumn)
		 {
			 System.out.println(a[i][j]);
			 count++;
		 }
		 loopj(a,i,j+1);
	}

	}


	private static boolean cheakInRow(int[][] a, int i, int j, boolean isSmallestInRow, int k) {
		
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
			{
				isSmallestInRow = false;
			 return	isSmallestInRow;
			}
			return cheakInRow(a,i,j,isSmallestInRow,k+1);
		}
	
		else 
			return isSmallestInRow;
		
	}


	private static boolean cheakInColumn(int[][] a, int i, int j, boolean isLargestInColumn, int k) {
		
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
			{
				isLargestInColumn = false;
			 return	isLargestInColumn;
			}
			return cheakInColumn(a,i,j,isLargestInColumn,k+1);
		}
	
		else 
			return isLargestInColumn;
	}
	

}
