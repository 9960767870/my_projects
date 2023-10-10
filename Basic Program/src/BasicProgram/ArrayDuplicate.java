package BasicProgram;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,1,23,2,3,3,3,3,3,3,4,5,2,2,2};
		
		String  s = " " ; 
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
		int cnd = 0;
		
			for (int j = i+1; j < a.length; j++)
			{
			     if(a[i]==a[j])
			     {
			    	 count++;
			    	 cnd++;
			   
			     
			    s = s+a[j]+" ";
			    	 
			     break;
			     }
			     
			}
			if(cnd==0)
				System.out.println(a[i]);
		
		}
		
	
		System.out.println();
		
		System.out.println(s);
		
		System.out.println("Duplicate count:"+count);
		
		
	}

}
