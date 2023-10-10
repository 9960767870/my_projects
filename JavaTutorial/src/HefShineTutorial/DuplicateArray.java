package HefShineTutorial;

import java.util.Scanner;

public class DuplicateArray {
 
	void arrayinput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		System.out.println("Enter element");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		duplicate(a,size);
	}
	
	void duplicate(int[] a,int size) {
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Element:");
					System.out.println(a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateArray d = new DuplicateArray();
		d.arrayinput();

	}

}
