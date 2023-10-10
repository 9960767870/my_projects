package Array;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {67,43,21,36,12,58};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
			
		}
		System.out.println();

		for (int i = 1; i < a.length; i++) {
			int j=i-1;
			for (; j>=0;j--) {
				if(a[j]<a[i]) {
					int temp = a[i];
					for(int k=i;k>=j+2;k--) {
						a[k]=a[k-1];
					}
					a[j+1]=temp;
					break;
				
			}
			}
			
			if(j==-1) {
				int temp = a[i];
				
				for(int m=i;m>=j+2;m--) {
					a[m]=a[m-1];
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
