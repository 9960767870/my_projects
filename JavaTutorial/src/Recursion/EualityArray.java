package Recursion;

public class EualityArray {
 
	static int[] a = {10,20,30,40,50};
	static int[] b = {10,20,30,40,50};
	static int diffcount = 0;
	public static void main(String[] args) {
         
		equal(0);
       
		if(diffcount==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}

	}

	private static void equal(int i) {

      if(i<a.length)
      {
    	  if(a[i]!=b[i])
    	  {
    		  diffcount++;
    	  }
    	  equal(i+1);
      }
		
	}

}
