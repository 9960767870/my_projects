package Practice2;

public class Assing28 {

	public static void main(String[] args) {
		
		int[] a = { 1,1,1,1,1,2,2,3,4};
		
		int[] n = {1,2,4};
		
		for (int i = 0; i < n.length; i++) {
			
           int b=n[i];
		    int count = 0;
		    
		    for (int j = 0; j < a.length; j++) {
				
		    	if(a[j]==b)
		    	
		    		count++;
		    	
			}
		    if(count>2)
		    	count=2;
		
		
		int[] x = new int[a.length-count];
		count=0;
		int index = 0;
		
		for (int j = 0; j < a.length; j++) {
			
			if(a[j]==b && count<2)
			{
				count++;
			}
			else
			{
				  x[index++]=a[j];
			}
			
		}
		a=x;

	}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
