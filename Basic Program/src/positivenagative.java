
public class positivenagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,-1,3,-2,4,-4,5};
		
		for (int i = 0; i < a.length; i++) 
		{
		  for (int j = i+1; j < a.length; j++) 
		{
			  
			if(a[i]>=0 && a[j]<=0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			

	}

}
