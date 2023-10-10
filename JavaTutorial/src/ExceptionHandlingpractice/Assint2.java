package ExceptionHandlingpractice;

public class Assint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		catch (Exception e) {
			
			System.out.println("can not devided by zero");
		}
	}

}
