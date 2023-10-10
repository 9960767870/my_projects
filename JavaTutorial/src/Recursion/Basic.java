package Recursion;

import java.util.Scanner;

public class Basic {
	
	static int counter = 0;
	static int num = 5;
	
	private static void m1()
	{
		counter++;
		System.out.println(counter*num);
		
		if(counter<10)
		{
			m1();
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		 num = sc.nextInt();
		
		m1();
		

	}

}
