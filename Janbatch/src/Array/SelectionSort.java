package Array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10,40,30,50,20,60};
		
		int j=0;
	   for (int i = 0; i < a.length; i++) {
		 int min=i;
		 
		 while(j<a.length-1)
		 {
			 if(a[min]>a[j])
			 {
				 min=j;
			 }
			 j++;
		 }
		 int temp=a[j];
		 a[j]=a[min];
		 a[min]=temp;
	}
	   System.out.println(Arrays.toString(a));
	}

}
