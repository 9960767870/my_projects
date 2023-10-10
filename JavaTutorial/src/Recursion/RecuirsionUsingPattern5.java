package Recursion;

public class RecuirsionUsingPattern5 {
 
	static int i=0;
	static int j = 0;
	public static void main(String[] args) {
		
		pattern(0);

	}

	private static void pattern(int i) {
		
		if(i<9)
		{
		  pattern2(i,j);
		System.out.println();
		pattern(i+1);
		
	}

	}

	private static void pattern2(int i,int j) {
	
		if(j<5)
		{
			if(j+i<=4 || j-i<=-4)
			{
		    System.out.print("*");	
		    pattern2(i,j+1);
		}
		else {
			System.out.print(" ");
		}
		}	
	}
}