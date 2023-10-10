package ExceptionHandling;

class Myownexception extends Exception
{
	public Myownexception(String s) {
		
		super(s);
	}
	
}

public class CustomException {

	public static void main(String[] args) throws Myownexception {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		
		if(b==0)
		{
			throw new Myownexception("you can not try the 10/0");
		}
		System.out.println(a/b);
		
	}

}
