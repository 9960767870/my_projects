package ExceptionHandlingpractice;


class CustomException extends Exception{
	
	public CustomException(String s) {
		// TODO Auto-generated constructor stub
		
		super(s);
	}
}

public class pra6 {

	public static void main(String[] args) throws CustomException  {
	
		int a = 5;
		int b= 5;
		
		if(b>0)
		{
			try {
		throw new  CustomException("exception is handdle");
			}
			catch(CustomException e)
			{
				System.out.println(e);
			}
		}
		System.out.println(a/b);

	}

}
