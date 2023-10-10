package ExceptionHandlingpractice;

public class Assint8 {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		catch (Exception e) {
			System.out.println("can not found zero");
		}
		
		if(b==0)
		{
		throw new ArithmeticException("not found");
		
		}
		
		

	}

}
