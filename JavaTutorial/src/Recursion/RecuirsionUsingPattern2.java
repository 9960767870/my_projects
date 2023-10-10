package Recursion;

public class RecuirsionUsingPattern2 {

	static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern(0);
	}

	private static void pattern(int i) {
		
		if(i<5)
		{
			pattern2(j,i);
			System.out.println();
			pattern(i+1);
		}
		
	}

	private static void pattern2(int i, int j) {
	
		//if(j<5)
		//{
		if(j+i<=4)
		{
			System.out.print("*");
			pattern2( i,j+1);
		}
		else {
			System.out.print(" ");
		}
		
	}
	}
	//}

