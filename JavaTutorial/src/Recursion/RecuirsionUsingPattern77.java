package Recursion;

public class RecuirsionUsingPattern77 {

	public static void main(String[] args) {

       int count = 1;
       loopi(count,0);

	}

	private static void loopi(int count, int i) {

     if(i<5)
     {
    	 int abc = count;
    	 int inc=4;
    	 loopj(abc,inc,i,0);
    	 count++;
    	 System.out.println();
    	 loopi(count, i+1);
     }
		
	}

	private static void loopj(int abc, int inc, int i, int j) {

     if(j<5)
     {
    	 if(j-i<=0)
    	 {
    		 System.out.print(abc+" ");
    		 abc=abc+inc;
    		 inc--;
    	 }
    	 loopj(abc, inc, i, j+1);
     }
		
	}

}
