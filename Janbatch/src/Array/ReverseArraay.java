package Array;

import java.util.Arrays;

public class ReverseArraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11,22,33,44,55};
		
//		for (int i = a.length-1; i>=0; i--) 
//		{
//			System.out.println(a[i]);
//			
//		}
		int i = 0;
		int j=a.length-1;
		
		while(j>i)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	
	}

}
