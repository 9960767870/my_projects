package Second;

import java.util.Scanner;

public class Method {
	
	public static int addition() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		return c;
		
	}
	
	public  void add() {
		int a = 10;
		int b = 10;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = addition();
		System.out.println(num);
		Method m = new Method();
		m.add();
	}
	
	

}
