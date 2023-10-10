package ExceptionHandlingpractice;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println(5/0);
		}
		finally {
			System.out.println("can not devided zero");
		}
		
	}

}
