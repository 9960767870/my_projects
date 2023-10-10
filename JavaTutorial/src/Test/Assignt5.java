 package Test;

import java.util.Scanner;

public class Assignt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the array of element");
		int ele = sc.nextInt();
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int index = Integer.MIN_VALUE;
		int[] a = new int[size];
		
		for (int i = 0; i <size; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num) {
				a[index]=a[i];
			}
		}
			if(index==-2) {
				System.out.println("not found index");
			}
			else {
				System.out.println("find the index at:"+index);
			}
			
		}
			
			
			
		}

	


