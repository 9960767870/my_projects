package Array;

import java.util.Arrays;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//selection sort;
		
		int[] a = {40,20,30,50,10};
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[min])
					min=j;
			}
			
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	for (int i= 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
	}
	}

}
