package ExceptionHandling;

public class ExceptionPropagationhanddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//unchecked exception
		
		System.out.println("in main");
		
		m1();
		
		
		System.out.println("out main");
		
		
	}

	private static void m1() {
		System.out.println("in m1");
		
		m2();
		
		System.out.println("out m1");
		
	}

	private static void m2() {
		System.out.println("in m2");
		try
		{
		System.out.println(5/0);
		}
		catch (Exception e) {
			System.out.println("something issue");
		}
		
		System.out.println("out m2");
		
	}

}
