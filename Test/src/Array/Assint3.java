package Array;

public class Assint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,1,2,2,3,4};
		int[] n = {1,2,4};
		
		for (int i = 0; i < n.length; i++) 
		{
			      int neww =n[i];
			      int count=0;
	  for (int j = 0; j < a.length; j++) 
	  {
		    if(a[j]==neww)
		    	count++;
		
	  }
	  if(count>2)
		  count = 2;
	  
	  int[] sa = new int[a.length-count];
	  int index=0;
	  count=0;
	  
	  for (int j = 0; j < a.length; j++) 
	  {
		  if(a[j]==neww && count<2)
			  count++;
		  else
			         sa[index++]=a[j];
		
	}
	   a=sa;
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}
