package Practice2;

public class max2array {
  
	static int[] a = {10,20,30,40};
	static int max = Integer.MIN_VALUE;
	static int max2 = Integer.MIN_VALUE;
	static int i=0;
	public static void main(String[] args) {
   
		 loopi(i);
		 loopj(i,i);
        
        System.out.println(max);
        System.out.println(max2);
	}

	private static void loopi(int i) {

        if(i<a.length)
        {
        	if(a[i]>max)
        	{
        		loopj(0,0);
        		max=a[i];
        		i++;
        	}
        	loopi(i+1);
        }
		
	}

	private static void loopj(int i, int j) {

        if(j<a.length)
        {
        	if(a[i]!=max && a[j]>max2)
        	{
        		max2=a[j];
        		i++;
        		
        	}
        	loopj(i, j+1);
        }
		
	}

}
