package Recursion;

public class ArrayIndexOf {

	static int[] a = {10,20,30,40,50};
	
	static int index = -1;
	static int num = 50;
	public static void main(String[] args) {
      
		findindex(0);
		
			System.out.println("fount at index:"+index);
	
	}
	private static void findindex(int i) {

       if(i<a.length)
       {
    	   if(a[i]==num)
    	   {
    		     index=i;
    	   }
    	   findindex(i+1);
       }
		 
		
	}

}
