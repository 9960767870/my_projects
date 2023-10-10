package Array;

public class Assint3 {

	public static void main(String[] args) 
	{
		int[] a = {10,30,20,50,40,60};
		
		for (int i = 0; i < a.length; i++)
		{
		
			int min = i;
			for (int j = i+1; j < a.length; j++)
			{
				if((a[i]>a[j]))
				{
			       min = j;
			       
			       int temp = a[i];
			       a[i] = a[min];
			       a[min] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
