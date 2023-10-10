package Exception;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args)throws Exception {
	
//		int a=150;
//		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num");
		int a = sc.nextInt();
		int b = sc.nextInt();
		print(a,b);
		

	}

	private static void print(int a, int b)  {
		
		if(a<1 || b>99)
		{
			
			throw new ArithmeticException("no num less than 1 and greather than 99");
		}
		else
			System.out.println(a/b);
		
	}

}
