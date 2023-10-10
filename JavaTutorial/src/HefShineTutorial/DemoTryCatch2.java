package HefShineTutorial;

import java.io.IOException;
import java.util.Scanner;

public class DemoTryCatch2 {
		void method1() {
		int number1,number2,result=0;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the value of number1");
		number1 = sc.nextInt();
		
		System.out.println("Enter the value of number2");
		number2 = sc.nextInt();
		
		int a[] = new int[3];
		
		try {
		result = number1/number2;
		System.out.println(a[0]);
		System.out.println("Hello");
		
		}
		
		catch(ArithmeticException as) {
			System.out.println("ArithmeticException");
		}
		
		
		catch(ArrayIndexOutOfBoundsException qw) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		finally{
			System.out.println(result);
		}
		}
		
		
	void method2(){
			int number11,number21,result1=0;
			
			Scanner bc = new Scanner(System.in);
			 
			System.out.println("Enter the value of number11");
			number11 = bc.nextInt();
			
			System.out.println("Enter the value of number21");
			number21 = bc.nextInt();
			
			int b[] = new int[3];
			
			
			try {
			result1 = number11/number21;
			System.out.println(b[0]);
			System.out.println("Hello");
			
			}
			
			catch(ArithmeticException as) {
				System.out.println("ArithmeticException");
			}
			
			
			catch(ArrayIndexOutOfBoundsException qw) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			
			catch(NullPointerException sa) {
				System.out.println("NullPointerException");
			}
			
			catch(Exception e ) {
				System.out.println(e);
			}
			
			
			System.out.println(result1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		DemoTryCatch2 d = new DemoTryCatch2();
//		d.method1();
		
	d.method2();		
	}

}
