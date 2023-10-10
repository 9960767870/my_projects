package Array;

import java.util.Arrays;

public class Assint8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,4,2,3,5,6};
		
		for (int i =0; i < a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				int  temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}