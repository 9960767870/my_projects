package Array;

import java.util.Scanner;

public class ArrayOfIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,60};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num");
		int Num = sc.nextInt();
		
		int index = -1;
		
		for(int i = 0;i<a.length;i++) {
			
			if(a[i]==Num) {
				
				index = i;
			}
		}
		
		if(index==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at index "+" "+index);
		}

	}

}
