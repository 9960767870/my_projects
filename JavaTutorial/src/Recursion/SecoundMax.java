package Recursion;

public class SecoundMax {
static int[] a = {10,20,30,40,50};
     
	 static int i=0;
	 static int j=0;
	static int max = Integer.MIN_VALUE;
	static int max2 = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
       
        check(i);
        check2(i);
        System.out.println(max);
        System.out.println(max2);
        

	}

	private static void check(int i) {
        
		 if(i<a.length)
		 {
		
          if(a[i]>max)
          {           
        	       
        	       max=a[i];
        	       i++;
        	       check(i);
          }
         
		 }
	}

	private static void check2(int i) {
		
		if(i<a.length)
		{

        if(a[i]!=max && a[i]>max2 )
        {
        	     max2 = a[i];
        	     i++;
        	     check2(i); 
        }
        
		}
	}

}
