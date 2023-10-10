package BasicProgram;

import java.util.Arrays;

public class Assint1 {

	public static void main(String[] args) {
		
		int[] a = {8,2,7,5,6};
		int[] b = {9,1,3,4,a.length};
		
	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				
				if(b[i]>b[j])
				{
				int temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(b));

	}

}
