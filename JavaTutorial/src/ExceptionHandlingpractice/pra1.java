package ExceptionHandlingpractice;

public class pra1 {
	static void add(String s)
	{
		System.out.println(s.codePointAt(0));
	}
	
	
	public static void main(String[] args) {
		
		
		int a= 10;
		int b = 0;
		
		int[] aa = {1,2,3,4};
		
		String z = "rushi";
		
		String d = null;
		
		try
		{
			System.out.println(a/b);
		}
       catch (Exception e) {
		
    	   System.out.println("handdle in exception");
	}
		
		try
		{
			System.out.println(aa[8]);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("array is handdle");
		}
		
		try
		{
			System.out.println(z.charAt(7));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("String is handdle");
		}
		
		try
		{
			 add(null);
		}
		catch (Exception e) {
			
			System.out.println("null is handdle");
		}
		
		
		
	}

}
