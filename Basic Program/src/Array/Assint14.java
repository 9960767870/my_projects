package Array;

public class Assint14 {

	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		
		int i =0;
		int j = a.length-1;
		
		while(j>i)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]);
		}

	}

}
