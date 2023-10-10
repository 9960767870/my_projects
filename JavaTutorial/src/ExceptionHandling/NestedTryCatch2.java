package ExceptionHandling;

public class NestedTryCatch2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String s = "abcd";
		int[] a = {1,2,3,4};
		
		int x = 5;
		int y = 0;
		
		try
		{
			System.out.println(s.charAt(1));
			System.out.println(a[1]);
			System.out.println(x/y);
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("String out of bound");
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array out of bound");
		}
		
		catch ( ArithmeticException e) 
		{
			System.out.println("can't devide by zero");
		}
		
		catch (Exception e) 
		{
			System.out.println("Sometime issue");
		}
		
		
		
		
	}

}
