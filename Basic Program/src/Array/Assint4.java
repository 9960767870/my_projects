package Array;

public class Assint4 {

	public static void main(String[] args) {
		
		int[] a = {1,-2,3,-3,4,-4};
		
		for (int i = 0; i < a.length; i++) 
		{
		
			for (int j =i+1; j < a.length; j++) {
				
				if(a[i]<0 &&a[j]>0)
				{
					int temp =a[i];
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
