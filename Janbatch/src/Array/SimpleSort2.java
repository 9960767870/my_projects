package Array;

import java.util.Arrays;

public class SimpleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,10,60,50,40,30};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
