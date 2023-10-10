package ExceptionHandling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("in main");
		m1();
		System.out.println("out main");

	}

	private static void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("in m1");
		m2();
		System.out.println("out m1");
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("in m2");
		System.out.println(5/0);
		System.out.println("out m2");
		
	}

}
