package Practice2;

import java.util.Arrays;

public class removearrayelement {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		int num = 6;
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num)
			{
				count++;
			}
		}
		
		int[] b = new int[a.length-count];
		
		int indexb = 0;
		//int count1 = 0;
		for (int i = 0; i < b.length; i++) {
			
			if(i<b.length)
			{
				     b[i]= a[indexb++];
				//count1++;
			}
			
		}
		System.out.println(Arrays.toString(b));
		

	}

}
