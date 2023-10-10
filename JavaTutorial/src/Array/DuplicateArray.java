package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {
	
	public void inputArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter the element");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		
		display(a, size);
	}
	
	public void display(int[] a,int size) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println("duplicate element");
					System.out.println(a[j]+" ");
				}
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateArray a = new DuplicateArray();
		a.inputArray();
	}

}
