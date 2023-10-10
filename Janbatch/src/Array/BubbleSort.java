package Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {20,10,40,30,50,60};
		
		for (int i = 0; i < a.length; i++) {
			
//			for (int j =0; j < a.length-1; j++) {
//				
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
			
			int j=i;
			
			while(j<a.length-1 && a[j]>a[j+1])
			{
				 int temp = a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
				 j++;
			}
		} 
		System.out.println(Arrays.toString(a));
	}

}
