package Recursion;

public class RecuirsionUsingPattern14 {

	static int i=0;
	static int j=0;
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
	private static void pattern2(int i, int j) {

     if(j<5)
     {
    	 if(j-i>=0 || j+i>=38)
    	 {
    		 System.out.print("*");
    	 }
    	 else
    	 {
    		 System.out.print(" ");
    	 }
    	 pattern2(i, j+1);
    	 
     }
		
	}

}
