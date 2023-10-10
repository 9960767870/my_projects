package Second;

import java.util.Scanner;

public class Method2 {
	
	public static void add1(int a,int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	
	public static int add2(int a,int b,int c,int d) {
		
		int sum = a+b+c+d;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		//add1(10, 10);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int pqr = add2(num1, num2, num3, num4);
		System.out.println(pqr);
		
	}

}
