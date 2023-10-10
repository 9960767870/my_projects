package Recuirtion;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { 
			       {6,3,1},
			       {9,7,8},
			       {2,4,5},  
	            };
		
		loopi(0,a);
		
		
		
	
		
		}
	

	private static void loopi(int i, int[][] a) {
	
		if(i<a.length)
		{
			int j=0;
			loopj(i,j,a);
			
			loopi(i+1, a);
		}
		
	}

	private static void loopj(int i, int j, int[][] a) {
		boolean isSmallestinrow=true; 
		if(j<a.length)
		{
			int l=0;
			loopl(i,j,l,isSmallestinrow,a);
			
			
			loopj(i, j+1, a);
		}
		
		
	}

	private static void loopl(int i, int j, int l, boolean isSmallestinrow, int[][] a) {
		
		if(l<a.length)
		{
			if(a[i][l]<a[i][j])
			{
				isSmallestinrow=false;
			}
			int k=0;
			loopk(i,j,k,isSmallestinrow,a);
			
			loopl(i, j, l+1, isSmallestinrow, a);
		}
		
		
	}

	private static void loopk(int i, int j, int k,boolean isSmallestinrow, int[][] a) {
		boolean isLargestincol=true;
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
			{
				isLargestincol=false;
			}
			
			
			loopk(i, j, k+1, isSmallestinrow, a);
		}
		if(isSmallestinrow==true && isLargestincol==true)
			System.out.println(a[i][j]);
		
	}



		
	}
	
	
		
	
	
	


