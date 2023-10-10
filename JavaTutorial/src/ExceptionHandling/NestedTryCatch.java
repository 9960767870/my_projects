package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		String s = "abcd";
		
		int a = 5;
		int b = 0;
		
		try
		{
			try
			{
				System.out.println(a/b);
			}
			catch (Exception e) 
			{
				System.out.println("can't devided by zero");
			}
			
			try
			{
				System.out.println(s.charAt(10));
			}
			catch (Exception e) 
			{
				System.out.println("String out of bound ");
			}
			
			
		}
		catch (Exception e) 
		{
			
			System.out.println("some time issue");
		}

	}

}
