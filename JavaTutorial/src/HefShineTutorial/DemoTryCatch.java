package HefShineTutorial;

import java.util.Scanner;

public class DemoTryCatch {
	
//	void method1() {
//		int number1,number2,result=0;
//		
//		Scanner sc = new Scanner(System.in);
//		 
//		System.out.println("Enter the value of number1");
//		number1 = sc.nextInt();
//		
//		System.out.println("Enter the value of number2");
//		number2 = sc.nextInt();
//		
//		result = number1/number2;
//		System.out.println(result);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DemoTryCatch obj = new DemoTryCatch();
//		try {
//			obj.method1();
//		}
//		catch(ArithmeticException e) {
//			
//			System.out.println("Result is:infinite");
//		}
//
//	}
		
		
		int a = 100;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Result is:infinite");
		}

	}
}
