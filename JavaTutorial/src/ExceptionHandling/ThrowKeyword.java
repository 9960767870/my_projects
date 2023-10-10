package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int a = 10;
		int b= 0;
		
		if(b==0)
		{
			throw new Exception("can't devided by zero");
		}
		System.out.println(a/b);
	}

}
