package ExceptionHandlingpractice;

public class Assint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("in main");
		m1();
		System.out.println("in out");
	}

	private static void m1() {
		System.out.println("in m1");
		m2();
		System.out.println("m1 out");
		
	}

	private static void m2() {
		System.out.println("in m2");
		System.out.println(5/0);
		System.out.println("m2 out");
		
	}

}
