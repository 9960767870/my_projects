package ExceptionHandlingpractice;

public class hw7 {

	public static void main(String[] args) {
		
		System.out.println("in main method");
		m1();
		System.out.println("out the main method");

	}

	private static void m1() {
		
		System.out.println("mehtod m1");
		m2();
		System.out.println("out the m1 method");
		
	}

	private static void m2() {
		
		System.out.println("method m2");
		try
		{
		Thread.sleep(1000);
		}
		catch (Exception e) {
			
		}
		System.out.println("out the m2 method");
		
	}

}
