package Practice_Set;

import java.util.Scanner;

class MyExceptionw extends Exception {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am toString()";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "We gate getmessage()";

	}
	

	public MyExceptionw() {
		super();
	}

}

public class RdB {
	public static void main(String[] args) {
		int a = 10;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The value of a is ");

		a = sc.nextInt();

		try {
			if (a < 9) {
				 new MyExceptionw();
			}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());

				e.printStackTrace();
				// System.out.println(e.getStackTrace());
			}
		}
	}

