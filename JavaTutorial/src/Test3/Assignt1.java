package Test3;

import java.util.Arrays;

public class Assignt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bubble sort
		int[] a = {1,4,3,5,2,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
