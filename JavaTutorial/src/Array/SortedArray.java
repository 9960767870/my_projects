package Array;

import java.util.Arrays;

public class SortedArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bubble sorting
		
		int[] a = {10,40,30,20,50,60};
		System.out.println("after sorted array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("before sorted array");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					 
					int temp = a[i];
					a[i] = a[j]; 
					a[j] = temp;
				}
				
			}
			
		}
//		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
