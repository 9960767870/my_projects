package BasicProgram;

import java.util.Scanner;

public class Studentparcentage 
{
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Sub Marks");
		
		System.out.println("Enter the sub1 marks");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter the sub2 marks");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter the sub3 marks");
		int sub3 = sc.nextInt();
		
		System.out.println("Enter the sub4 marks");
		int sub4 = sc.nextInt();
		
		System.out.println("Enter the sub5 marks");
		int sub5 = sc.nextInt();
		
		double sum = sub1+sub2+sub3+sub4+sub5;
		System.out.println(sum);
		double parcentage = sum*100/500;
		System.out.println(parcentage);
			
	}

}
