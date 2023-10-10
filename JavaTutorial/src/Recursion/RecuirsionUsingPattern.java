package Recursion;

public class RecuirsionUsingPattern {

	public static void main(String[] args) {
	
		pattern(0);

	}
	private static void pattern(int i) {
		
		if(i<4)
		{
			pattern2(0);
			
			System.out.println();
			pattern(i+1);
			
			}
			
			}
	private static void pattern2(int j) {
	
		if(j<4)
		{
			
			System.out.print("*");
			pattern2(j+1);
			
			}
		
	}
		
		}
		
	

	
	
	


