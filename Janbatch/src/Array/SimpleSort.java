package Array;

import java.util.Arrays;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {22,20,50,40,30,11};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				if(i<j && a[i]>a[j]) 
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
