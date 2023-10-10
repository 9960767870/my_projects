package Exception;

public class Finally {

	public static void main(String[] args) {


		try
		{
		System.out.println("I am try block");
		System.out.println(5/0);
		}
		
		catch (Exception e) {
			
			System.out.println("I am catch block");
		 
			String s = "siufh";
			System.out.println(s.charAt(100));
			
		}
		
		finally {
			
			System.out.println("I am finally block");
		}
	}

}
	