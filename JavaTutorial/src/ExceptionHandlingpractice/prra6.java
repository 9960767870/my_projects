package ExceptionHandlingpractice;

public class prra6 {

	public static void main(String[] args) throws Myownexception {
		// TODO Auto-generated method stub

		int a = 9;
		int b = 9;
		
		if(b==0)
		{
			throw new Myownexception("handdle in exception");
		}
		System.out.println(a/b);
		
	}

}

class Myownexception extends Exception
{
	public Myownexception(String s) {
		// TODO Auto-generated constructor stub
		
		super(s);
	}
}
