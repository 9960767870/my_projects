package ExceptionHandling;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			System.out.println(a/b);
		}
		catch (Exception e) {
		   
			System.out.println("you can't the divided by zero");
		
		}
	}

}
