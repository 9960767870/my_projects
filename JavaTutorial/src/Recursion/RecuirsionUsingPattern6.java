package Recursion;

public class RecuirsionUsingPattern6 {

	static int i=0;
	static int j = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 0;
		pattern(0);
	}
	private static void pattern(int i) {
		
		if(i<5)
		{
			pattern2(i,0);
			System.out.println();
			pattern(i+1);
		}
		
		
	}
	private static void pattern2(int i,int j ) {
		if(j<5) {
		if(j-i>=0)
		{
		
		
			System.out.print("*");
			
			
		}
		else {
			System.out.print(" ");
		}
		pattern2(i,j+1);
	}
	}
}

