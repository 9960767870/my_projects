package Array;

import java.util.Arrays;

public class Spaceficnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		int num = 30;
		int count =0;
		
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num) {
				count++;
			}
		}
		
		int[] b = new int[a.length-count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]!=num) {
				b[index]=a[i];
				index++;
			}
		}  
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}
		

	}

}
