package Practice2;

import java.util.Arrays;

public class Assint16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,0,1,0,1,0,1};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
