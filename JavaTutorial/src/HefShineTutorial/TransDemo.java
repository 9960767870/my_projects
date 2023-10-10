package HefShineTutorial;

import java.util.Scanner;

public class TransDemo {
	void matrixinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of matrix:");
		int rowsize = sc.nextInt();
		
		System.out.println("Enter the col size of matrix:");
		int colsize = sc.nextInt();
		
		int array[][] = new int[rowsize][colsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		transpose(array,rowsize,colsize);
	}
	
	void transpose(int[][] array,int rowsize,int colsize) {
		
		int array2[][] = new int[rowsize][colsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				array2[i][j]=array[i][j];
			}
		}
		display(array,array2,rowsize,colsize);
	}
	
	void display(int[][] array,int[][] array2,int rowsize,int colsize) {

		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				System.out.print(" "+array2[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     TransDemo t = new TransDemo();
     t.matrixinput();
	}

}
