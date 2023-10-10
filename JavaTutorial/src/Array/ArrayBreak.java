package Array;

import java.util.Scanner;

public class ArrayBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,10,30,10,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The num");
		int num = sc.nextInt();
		int index = -1;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num && index==-1) {
				
				index=i;
				System.out.println("Array of index is "+index);
				break;
				
			}
		
			
			else {
				System.out.println("not found");
				
					
			}
		}
		
		
		
	}

}
