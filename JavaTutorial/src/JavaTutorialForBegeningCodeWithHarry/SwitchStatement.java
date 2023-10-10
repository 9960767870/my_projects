package JavaTutorialForBegeningCodeWithHarry;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int age;
		System.out.println("Enter your age:");
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch(age) {
		
		case 20:
			System.out.println("Hi iam rushikesh");
			break;
		 
		case 30:
			System.out.println("Hee iam don");
			break;
			
		case 40:
			System.out.println("hi iam robot");
			break;
			
		default:
			System.out.println("Enjoy your life");
		
		}
	}
     
}
