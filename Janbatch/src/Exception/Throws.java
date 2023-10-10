package Exception;

public class Throws {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hiiii");
		
		Thread.sleep(2000);
		
		try
		{
		System.out.println(5/0);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Hello");

	}

}
