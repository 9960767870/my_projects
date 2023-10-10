package ExceptionHandling;

public class checkedException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("in main");
		m1();
		System.out.println("out main");

	}

	private static void m1() throws Exception {
	 
		System.out.println("in m1");
		m2();
		System.out.println("m1 out");
		
	}

	private static void m2() throws Exception {
		
		System.out.println("in m2");
		Thread.sleep(1000);
		System.out.println("m2 out");
		
	}

}
