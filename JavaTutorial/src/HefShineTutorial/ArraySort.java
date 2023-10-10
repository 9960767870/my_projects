package HefShineTutorial;

import java.util.Scanner;

public class ArraySort {
  
	void arrayinput(){
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the element");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
			
		}
		
		arrayoutput( array , size);
	}
	
	void arrayoutput(int[] array, int size) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);

			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort a = new ArraySort();
		a.arrayinput();
		
		

	}

}


