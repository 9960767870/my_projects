package Recursion;

public class reverseArray {
	
	static int[] a = {10,20,30,40,50};
	
	static int i=0;
	static int j = a.length-1;
	static int temp = 0;
	

	public static void main(String[] args) {
		
		reverse(0,j,temp);
		print(i,temp);
		
	}

	private static void reverse(int i, int j, int temp) {

      if(j>i)
      {
   
    	   temp = a[i];
    	  a[i] = a[j];
    	  a[j] = temp;
    	  j--;
    	  print(i,temp);
    	  reverse(i, j,temp);  
      }
  	
	}


	private static void print(int i,int temp) {

      if(i<a.length)
      {
    	  System.out.println(a[i]);
    	
      }
		
	}

	

}
