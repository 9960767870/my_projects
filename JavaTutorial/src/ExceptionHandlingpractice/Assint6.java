package ExceptionHandlingpractice;

public class Assint6 {

	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		try
		{
		Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("sfi");
		}
		throw new Exception("wait a sec");
	}

}
