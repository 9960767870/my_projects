package ExceptionHandlingpractice;

public class pra3 {

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
		System.out.println("in out m1");
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("in m2");
		try
		{
		Thread.sleep(100);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("in out m2");
		
	}

}
