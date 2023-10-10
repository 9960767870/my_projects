import java.util.Arrays;

public class LiddderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,2,8,3,7,4,6,5};
		
		
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;		
		for (int j = i+1; j < a.length; j++)
		{
			
			if(a[i]<a[j])
			{
				count++;
				//break;	
			}
		
		}
			
		if(count==0)
		{
			System.out.println(a[i]);
		}
		}
		
		
		
	}

}
