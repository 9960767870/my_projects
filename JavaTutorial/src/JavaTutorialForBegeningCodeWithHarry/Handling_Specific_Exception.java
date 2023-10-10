package JavaTutorialForBegeningCodeWithHarry;

import java.util.Scanner;

public class Handling_Specific_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks = new int[3];
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 40;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the array of index ");
		int ind = sc.nextInt();
		
		System.out.println("Enter the number we want devided the value with");
		int num = sc.nextInt();
		
		try {
			System.out.println("The value of array index enterded is : " + marks[ind]);
			System.out.println("The value of array value/number is : " + marks[ind]/num);
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException occured");
			System.out.println(e);
		}
		
        catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException occured");
			System.out.println(e);
		}
		
       catch(Exception e) {
			
			System.out.println("Some other exception occured");
			System.out.println(e);
		}

	}

}
