package Recursion;

public class CopyArray {
  
	 //static int i=0;
	static int[] a = {1,2,3,4};
	static int[] b = new int[a.length];
	
	public static void main(String[] args) {

      loopi(0);
      loop2(0);
		

	}


	private static void loop2(int i) {

	    if(i<b.length)
	    {
	    	System.out.print(b[i]+" ");
	    	loop2(i+1);
	    }
			
		}
		private static void loopi(int i) {
	 
			if(i<a.length)
			{
				{
				b[i]=a[i];
				
				loopi(i+1);
				  
			}

			}
		}



}
