package HefShineTutorial;

import java.util.Scanner;

public class multidimentionalArray {

	void inputElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Dimentonal Array:");
		
		
		System.out.println("Enter the row");
		int row = sc.nextInt();
		
		System.out.println("Enter the col");
		int col = sc.nextInt();
		
		System.out.println("Enter the element of matrix a:");
		int array[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the element of matrix b:");
		int array1[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 array1[i][j] = sc.nextInt();
	}
		}
		sum(array,row,col,array1);
	}
	
	
	void sum(int[][] array, int row, int col, int[][] array1) {
		System.out.println("Enter the element of matrix c:");
		int array2[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array2[i][j] = array[i][j] + array1[i][j];
			}
		}
		print(array2,row,col);
		
	}

	void print(int array2[][],int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(array2[i][j]);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multidimentionalArray m = new multidimentionalArray();
		m.inputElement();

	}

}
