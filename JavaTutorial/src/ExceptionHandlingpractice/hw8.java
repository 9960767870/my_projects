package ExceptionHandlingpractice;

import ExceptionHandling.ArithmaticException;

class Demo
{
    public static int division(int dividend,int divisor)
    {
    	
    	if(divisor==0)
    	throw new ArithmeticException("can not devided zero");
    	
		return dividend/divisor;
    	
    }
}


public class hw8 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result =0;
		try
		{
			result = Demo.division(23, 0);
		}
		catch (Exception e) {
			
			System.out.println("divisor can not be zero");
		}
		finally {
			System.out.println("result is:"+result);
		}

	}

}


