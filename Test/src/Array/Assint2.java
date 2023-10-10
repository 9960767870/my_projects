package Array;

public class Assint2 {

	public static void main(String[] args) {
		
		int[] a = {1,1,1,1,1,2,2,3,4};
		int[] n = {1,2,4};
		
		for (int i = 0; i < n.length; i++) 
		{
			    int nNum = n[i];
			    int count=0;
			    
			    for (int j = 0; j < a.length; j++) 
			    {
						
			  if(nNum==a[j])
				  count++;
			  
		}
		if(count>2)
			count=2;
		
		int[] sa = new int[a.length-count];
		 count=0;
		int index=0;
		
		for (int k = 0; k < a.length; k++) 
		{
			if(a[k]==nNum && count<2)
			
				count++;
			
			else
			    sa[index++]=a[k];	         
		}	 
			 a=sa;
	}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
			
		}

}
}
