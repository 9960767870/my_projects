package HefShineTutorial;

import java.util.Scanner;

public class TestArray {
	
	//left element rotated;
	
	void InputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Find the  count of rotation");
		int count = sc.nextInt();
		arrayrotated(a,size,count);
	}
	
	void arrayrotated(int[] a,int size,int count) {
		
		       
			for(int i=0;i<a.length;i++) {
				System.out.print(" "+a[i]);
			}
			
			for(int i = 0;i<count;i++)
			{
			
			int j,firstElement;
			firstElement = a[0];
			
			for(j =0;j<a.length-1;j++)
			{
				a[j] = a[j+1];
			}
			a[j] = firstElement;
			display(a, size, count);
			}
			
		}
	
	void display(int [] a,int size,int count) {
		System.out.println("After rotation of"+count+"time:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		
    TestArray t = new TestArray();
    t.InputArray();
	}

}
