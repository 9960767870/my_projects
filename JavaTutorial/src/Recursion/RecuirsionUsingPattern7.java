package Recursion;

public class RecuirsionUsingPattern7 {

	static int i=0;
	static int j=0;
	public static void main(String[] args) {
		
		pattern(0);

	}

	private static void pattern(int i) {
		
		if(i<5)
		{
			pattern(i,j);
			System.out.println();
			pattern(i+1);
		}
		
	}

	private static void pattern(int i, int j) {
		
		if(j<5)
		{
			if(j+i>=4)
			{
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
			pattern(i,j+1);
		}
		
	}

}
