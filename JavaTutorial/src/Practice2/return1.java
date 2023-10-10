package Practice2;

public class return1 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,4,2};
		
		int i=0;
		int count=0;
		
		count=loopi(a,i,count);
     System.out.println(count);
	}

	private static int loopi(int[] a, int i, int count) {
 
		int j = i+1;
   if(i<a.length)
   {
	   count =loopj(i,j,count,a);
	   return loopi(a,i+1,count);
   }
   return count;
		
	}

	private static int loopj(int i,int j,int count,int[] a) {

      if(j<a.length)
      {
    	  if(a[i]==a[j])
    	  {
    		  count++;
    		  
    	  }
    	  
    	  return loopj(i,j+1,count,a);
      
      }
      return count;
		
	}

}
